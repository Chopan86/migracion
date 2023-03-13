package cl.tchile.app.main.delegate;

import cl.tch.unifica.services.consultapsprincipaleslineas.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas;
import cl.tch.unifica.services.consultapsprincipaleslineas.ProgramInterfaceAccpspwo_salida;
import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import com.Request.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_entrada;
import com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salida;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
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
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
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
            clienteVO.getArea() + clienteVO.getFono().substring(1) + "-" + clienteVO.getInicioVigencia();
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_PSPORLINEA");
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
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto,
                    "RUTA_SALIDA_PSPORLINEA");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceAwps01Co_entrada fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceAwps01Co_entrada entrada = new ProgramInterfaceAwps01Co_entrada();
        entrada.setAwps01Co_i_area(generalHelper.formatearAreaFono(clienteVO.getArea()));
        entrada.setAwps01Co_i_num_com(generalHelper.formatearFono(clienteVO.getArea(),clienteVO.getFono()));
        entrada.setFiller1("");
        //TODO: cambiar prueba en duro para esta variable
//        entrada.setAwps01Co_i_fec_ini_li(clienteVO.getInicioVigencia());
        entrada.setAwps01Co_i_fec_ini_li("2018-01-01");
        return entrada;
    }
}
