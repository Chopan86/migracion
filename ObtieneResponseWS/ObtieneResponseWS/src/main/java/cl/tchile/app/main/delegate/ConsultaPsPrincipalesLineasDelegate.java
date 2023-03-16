package cl.tchile.app.main.delegate;

import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import com.Request.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas;
import com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida;
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
public class ConsultaPsPrincipalesLineasDelegate {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaPsPrincipalesLineasDelegate.class);
    /**
     * The general helper.
     */
    @Autowired
    GeneralHelper generalHelper;

    /**
     * The general helper.
     */
    @Autowired
    ConsultaClienteRutFonoLineaHelper consultaClienteRutFonoLineaHelper;

    @Autowired
    CallEndpointHelper callEndpointHelper;
    /**
     * listClientsNoResponse
     */
    List<String> listClientsNoResponse = new ArrayList<>();
    /**
     * listRepeatClients
     */
    List<String> listRepeatClients = new ArrayList<>();

    @Autowired
    SaveFilesOracle saveFilesOracle;
    /**
     * endPointDataVO
     */
    EndPointDataVO endPointDataVO = new EndPointDataVO(
        "http://esb1.ctc.cl:8080/services/ConsultaPSPrincipalesLineas",
        "5000",
        "com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSServiceLocator"
    );

    public void consultaPsPrincipalesLineas() {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA PsPrincipales ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSPSPRINCIPALES;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAPSPRINCIPALES;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaPsPrincipalesLineas(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaPsPrincipalesLineas(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
        try {
//            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_LINEASPSPRIN");
            boolean fonoRepetido = false;
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAccpspwo_salida salida;
                ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[] entrada = fillRequestIn(clienteVO);
                salida = callEndpointHelper
                    .callEndPointSoapStubLineasPrincipales(endPointDataVO).ACCPSPWSOperation(entrada);

                StringWriter sw = new StringWriter();
                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAccpspwo_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();

                int codBD = saveFilesOracle.saveResponseInBD(xmlString, "ConsultaPSPrincipalesLineas", fonoCompleto,
                    null, null);

                if (codBD == 0) {
                    System.out.println(fonoCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
                }

//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto,
//                    "RUTA_SALIDA_LINEASPSPRIN");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[] fillRequestIn(ClienteVO clienteVO) {

        ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[] entrada = new ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[50];
        entrada[0] = new ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas();
        entrada[0].setAccpspwi_i_area(generalHelper.formatearAreaFono(clienteVO.getArea()));
        entrada[0].setAccpspwi_i_num_com(generalHelper.formatearFono(clienteVO.getArea(), clienteVO.getFono()));
        entrada[0].setAccpspwi_i_ini_vi(clienteVO.getInicioVigencia());
        for (int i = 1; i <= entrada.length - 1; i++) {
            entrada[i] = new ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas();
            entrada[i].setAccpspwi_i_area("");
            entrada[i].setAccpspwi_i_num_com("");
            entrada[i].setAccpspwi_i_ini_vi("");
        }
        return entrada;
    }
}
