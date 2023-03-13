package cl.tchile.app.main.delegate;

import cl.movistar.queryproduct.queryproduct.QueryproductRequest;
import cl.movistar.queryproduct.queryproduct.QueryproductResponse;
import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import com.Request.WSPMS.APELAFAC.www.ProgramInterfaceApel_afac_pms_i;
import com.Response.WSPMS.APELAFAC.www.ProgramInterfaceApel_afac_pms_o;
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
@Component
public class ConsultaAFACDelegate {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaAFACDelegate.class);
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
        "http://esb0.ctc.cl:8082/services/ConsultaRecursosAFAC",
        Constantes.TIMEOUT15,
        "com.WSPMS.APELAFAC.www.APELAFACServiceLocator"
    );

    public void consultaAfac(){
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA AFAC ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSAFAC;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAAFAC;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaAfac(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }



    public void callConsultaAfac(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_AFAC");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceApel_afac_pms_o salida;
                ProgramInterfaceApel_afac_pms_i entrada = fillRequestIn(clienteVO);
                salida = callEndpointHelper
                    .callEndPointSoapStubAfac(endPointDataVO).APELAFACOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_AFAC");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceApel_afac_pms_i fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceApel_afac_pms_i entrada = new ProgramInterfaceApel_afac_pms_i();
        String dataInCompleta = generalHelper.formatearAreaFono(clienteVO.getArea()) + generalHelper.formatearFono(clienteVO.getArea(), clienteVO.getFono());
        entrada.setDatain(dataInCompleta);
        return entrada;
    }
}

