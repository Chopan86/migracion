package cl.tchile.app.main.delegate;
import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import com.Request.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_entrada;
import com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salida;
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
 * ConsultaPsPorLiena
 */
// TODO: todo
@Component
public class ConsultaPsPorLiena {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaPsPorLiena.class);
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
        "http://esb2.ctc.cl:8081/services/consultaPSporLinea",
        Constantes.TIMEOUT15,
        "com.AWPS01WI.AWPS01WS.www.AWPS01WSServiceLocator"
    );

    public void consultaPsPorLinea() {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA PsPrincipales ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSPSPORLINEA;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAPSPORLINEA;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeExcel(
            "C:/WorkspaceMigracionMainFrame/psporlineaTest.xlsx", "consultaPsPorLinea");
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaPsPorLinea(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaPsPorLinea(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto =
            clienteVO.getArea() + clienteVO.getFono() + "-" + clienteVO.getInicioVigencia();
        try {
            boolean fonoRepetido = false;
//            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_PSPORLINEA");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwps01Co_salida salida;
                ProgramInterfaceAwps01Co_entrada entrada = fillRequestIn(clienteVO);
                salida = callEndpointHelper
                    .callEndPointSoapStubConsultaPorLinea(endPointDataVO).AWPS01WSOperation(entrada);

                StringWriter sw = new StringWriter();
                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwps01Co_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();
                System.out.println("");
//                int codBD = saveFilesOracle.saveResponseInBD(xmlString, "consultaPSporLinea", clienteVO.getArea() + clienteVO.getFono(),
//                    null, entrada.getAwps01Co_i_fec_ini_li());
//
//                if (codBD == 0) {
//                    System.out.println(fonoCompleto + " | Error insert BD ");
//                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
//                }

//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto,
//                    "RUTA_SALIDA_PSPORLINEA");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceAwps01Co_entrada fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceAwps01Co_entrada entrada = new ProgramInterfaceAwps01Co_entrada();
        entrada.setAwps01Co_i_area(clienteVO.getArea());
        entrada.setAwps01Co_i_num_com(clienteVO.getFono());
        entrada.setAwps01Co_i_fec_ini_li(clienteVO.getInicioVigencia());
        entrada.setFiller1("");
        return entrada;
    }
}
