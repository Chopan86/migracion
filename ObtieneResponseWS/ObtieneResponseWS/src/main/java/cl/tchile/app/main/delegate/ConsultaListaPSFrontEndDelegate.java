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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
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
        "cl.tch.unifica.services.consultapstaskforce.AWPSL2WSServiceLocator"
    );

    public void consultaPsFrontEnd(){
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA PsPrincipales ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSPSFRONTEND;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAPSFRONTEND;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaPsFrontEnd(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }


    public void callConsultaPsFrontEnd(ClienteVO clienteVO, EndPointDataVO endPointDataVO, String cod) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_LINEASPSPRIN");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwpsl2WoAwpsl2Wo_salida salida;
                ProgramInterfaceAwpsl2Wi entrada = fillRequestIn(clienteVO, cod);
                salida = callEndpointHelper
                    .callEndPointSoapStubLineasPrincipales(endPointDataVO).ACCPSPWSOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_LINEASPSPRIN");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[] fillRequestIn(ClienteVO clienteVO, String cod) {

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

}
