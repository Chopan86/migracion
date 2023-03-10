package cl.tchile.app.main.delegate;

import cl.tch.unifica.fe.services.consultaclienterutlineac.ProgramInterfaceAwlc02Wi_entrada;
import cl.tch.unifica.fe.services.consultaclienterutlineac.ProgramInterfaceAwlc02Wo_salida;
import cl.tchile.app.constant.Constantes;
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
 * The Class ConsultaClienteRutLineaCDelegate.
 */
@Component
public class ConsultaClienteRutLineaCDelegate {

    /**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutLineaCDelegate.class);

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
     * Listas clientes repetidos
     */
    List<String> listRepeatClients = new ArrayList<>();
    /**
     * Lista cliente con error
     */
    List<String> listClientsNoResponse = new ArrayList<>();

    EndPointDataVO endPointDataVO = new EndPointDataVO(
        "http://esb0.ctc.cl:8082/services/consultaClienteRutLineaC",
        Constantes.TIMEOUT15,
        "cl.tch.unifica.fe.services.consultaclienterutlineac.AWLC02WSServiceLocator"
    );

    /**
     * Consulta cliente rut linea C impl.
     */
    public void consultaClienteRutLineaCImpl() {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA RUT C ********");
        String pathSalidaRepetidos = "C:/rutsCRepetidos.txt";
        String pathSalidaNoResponse = "C:/rutsCNoResponse.txt";
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtieneRutClienteDesdeFichero();
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaClienteRutLinaC(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void consultaClienteRutlineaCxFono() {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        String pathSalidaRepetidos = "C:/telefonosCRepetidos.txt";
        String pathSalidaNoResponse = "C:/telefonosCNoResponse.txt";
        LOGGER.info("******** INICIO PROCESO LINEAS X FONO  ********");
        List<ClienteVO> clienteVOList = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        int indexLista = 0;
        for (ClienteVO clienteVO : clienteVOList) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, clienteVOList.size()));
            callConsultaClienteRutLinaCxFono(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaClienteRutLinaCxFono(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_FONOSC");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwlc02Wo_salida salida;
                ProgramInterfaceAwlc02Wi_entrada entrada = fillRequestIn(clienteVO,
                    String.valueOf(Constantes.cCOD_ZERO));
                salida = callEndpointHelper.callEndPointSoapStub(endPointDataVO).AWLC02WSOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_FONOSC");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente raz??n: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    /**
     * @param clienteVO ClienteVO
     * @param cod       String
     * @return entrada ProgramInterfaceAwlc02Wi_entrada
     */
    private ProgramInterfaceAwlc02Wi_entrada fillRequestIn(ClienteVO clienteVO, String cod) {
        ProgramInterfaceAwlc02Wi_entrada entrada = new ProgramInterfaceAwlc02Wi_entrada();
        entrada.setAwlc02Wi_i_area(generalHelper.formatearAreaFono(clienteVO.getArea()));
        entrada.setAwlc02Wi_i_num_com(generalHelper.formatearFono(clienteVO.getArea(), clienteVO.getFono()));
        entrada.setAwlc02Wi_i_rut(
            generalHelper.rellenarCadenaPorIzquierda(clienteVO.getRut(), 12, Constantes.cCOD_ZERO));
        entrada.setAwlc02Wi_i_dv(clienteVO.getDv());
        entrada.setAwlc02Wi_i_criterio(cod);
        return entrada;
    }

    /**
     * @param clienteVO      ClienteVO
     * @param endPointDataVO EndPointDataVO
     */
    public void callConsultaClienteRutLinaC(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String rutCompleto = null;
        try {
            rutCompleto = clienteVO.getRut() + "-" + clienteVO.getDv();
            boolean rutRepetido = generalHelper.isRepeatValue(rutCompleto, "RUTA_SALIDA_RUT_C");
            if (rutRepetido) {
                LOGGER.info("SE AGREGA RUT A REPETIDOS: " + rutCompleto);
                listRepeatClients.add(rutCompleto);
            }

            if (!rutRepetido) {
                ProgramInterfaceAwlc02Wo_salida salida;
                ProgramInterfaceAwlc02Wi_entrada entrada = fillRequestIn(clienteVO, (Constantes.sCOD_ONE));
                salida = callEndpointHelper.callEndPointSoapStub(endPointDataVO).AWLC02WSOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, rutCompleto, "RUTA_SALIDA_RUT_C");
            }
        } catch (Exception e) {
            LOGGER.error(String.format("No se proceso el rut: %1$s por la siguiente raz??n: %2$s", rutCompleto, e));
            LOGGER.info("SE AGREGA A RUT SIN RESPUESTA : {}", rutCompleto);
            listClientsNoResponse.add(rutCompleto + " | " + e);
        }
    }

}
