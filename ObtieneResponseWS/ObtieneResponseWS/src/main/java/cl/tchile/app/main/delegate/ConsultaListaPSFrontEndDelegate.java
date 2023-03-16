package cl.tchile.app.main.delegate;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import com.Request.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wi;
import com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida;
import com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * ConsultaPsPrincipalesLineas
 */
// TODO: todo
@Component
public class ConsultaListaPSFrontEndDelegate {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaListaPSFrontEndDelegate.class);
    /**
     * The general helper.
     */
    @Autowired
    GeneralHelper generalHelper;

    @Autowired
    CallEndpointHelper callEndpointHelper;

    @Autowired
    ConsultaClienteRutFonoLineaHelper consultaClienteRutFonoLineaHelper;

    @Autowired
    SaveFilesOracle saveFilesOracle;
    /**
     * listClientsNoResponse
     */
    List<String> listClientsNoResponse = new ArrayList<>();
    /**
     * listRepeatClients
     */
    List<String> listRepeatClients = new ArrayList<>();
    /**
     * endPointDataVO
     */
    EndPointDataVO endPointDataVO = new EndPointDataVO(
        "http://esb2.ctc.cl:8080/services/ListaPSFrontEnd",
        "5000",
        "com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSServiceLocator"
    );

    String excelName = "responseErrorsPsForntEnd.xlsx";

    public void consultaPsFrontEnd(){
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA PsFrontEnd ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSPSFRONTEND;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAPSFRONTEND;
//        consultaClienteRutFonoLineaHelper.crearExcelErrorResponse(excelName);
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaPsFrontEnd(clienteVO, endPointDataVO, String.valueOf(Constantes.cCOD_ZERO));
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }


    public void callConsultaPsFrontEnd(ClienteVO clienteVO, EndPointDataVO endPointDataVO, String cod) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);

        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_LINEASPSFRONTEND");
            fonoRepetido = false;
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwpsl2Wo salida;
                ProgramInterfaceAwpsl2Wi entrada = fillRequestIn(clienteVO, cod);
                salida = callEndpointHelper
                    .callEndPointSoapStubLienasPsFrontEnd(endPointDataVO).AWPSL2WSOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwpsl2Wo.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();
                if(!salida.getAwpsl2Wo_salida().getAwpsl2Wo_cod_ret().equalsIgnoreCase("000")){
//                    consultaClienteRutFonoLineaHelper.crearSalidaResponseErrorCode(salida, entrada, excelName);
                } else {

                    int codBD = saveFilesOracle.saveResponseInBD(xmlString, "ListaPSFrontEnd", null,
                        fonoCompleto);

                    if (codBD == 0) {
                        System.out.println(fonoCompleto + " | Error insert BD ");
                        listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
                    }
//                    consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_LINEASPSFRONTEND");
                }

            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceAwpsl2Wi fillRequestIn(ClienteVO clienteVO, String cod) {
        ProgramInterfaceAwpsl2Wi entrada = new ProgramInterfaceAwpsl2Wi();
        entrada.setAwpsl2Wi_area(generalHelper.formatearAreaFono(clienteVO.getArea()));
        entrada.setAwpsl2Wi_num_com(generalHelper.formatearFono(clienteVO.getArea(), clienteVO.getFono()));
        entrada.setAwpsl2Wi_fec_ini_li(clienteVO.getInicioVigencia());
        entrada.setAwpsl2Wi_cod_ps(cod);
        return entrada;
    }


}

