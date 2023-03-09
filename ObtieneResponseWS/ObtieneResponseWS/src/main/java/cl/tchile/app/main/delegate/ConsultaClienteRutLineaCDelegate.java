package cl.tchile.app.main.delegate;

import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.vo.EndPointDataVO;
import cl.tchile.vo.FonoClienteVO;
import com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub;
import com.Request.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_entrada;
import com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.tch.unifica.fe.services.consultaclienterutlineac.AWLC02WSHTTPSoapBindingStub;
import cl.tch.unifica.fe.services.consultaclienterutlineac.ProgramInterfaceAwlc02Wi_entrada;
import cl.tch.unifica.fe.services.consultaclienterutlineac.ProgramInterfaceAwlc02Wo_salida;
import cl.tchile.app.constant.Constantes;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.vo.RutClienteVO;

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

    /**
     * Lista clientes repetidos
     */
    List<String> listRepeatClients = new ArrayList<>();
    /**
     * Lista clientes con error
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
        List<RutClienteVO> listaRutClientes = consultaClienteRutFonoLineaHelper.obtieneRutClienteDesdeFichero();
        int indexLista = 0;
        for (RutClienteVO rutClienteVO : listaRutClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaRutClientes.size()));
            callConsultaClienteRutLinaC(rutClienteVO.getRut(), rutClienteVO.getDv(), endPointDataVO);
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
        List<FonoClienteVO> fonoClienteVOS = consultaClienteRutFonoLineaHelper.obtenerFonoClientesDesdeFichero();
        int indexLista = 0;
        for (FonoClienteVO fonoClienteVO : fonoClienteVOS) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, fonoClienteVOS.size()));
            callConsultaClienteRutLinaCxFono(fonoClienteVO.getArea(), fonoClienteVO.getFono(),endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }
    @SuppressWarnings("rawtypes")
    public void callConsultaClienteRutLinaCxFono(String area, String fono, EndPointDataVO endPointDataVO) {
        String fonoCompleto = area + fono.substring(1);
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_FONOSC");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: " + fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwlc02Wo_salida salida = null;
                ProgramInterfaceAwlc02Wi_entrada entrada = new ProgramInterfaceAwlc02Wi_entrada();
                entrada.setAwlc02Wi_i_area(generalHelper.formatearAreaFono(area));
                entrada.setAwlc02Wi_i_num_com(generalHelper.formatearFono(area, fono));
                entrada.setAwlc02Wi_i_rut("");
                entrada.setAwlc02Wi_i_dv("");
                entrada.setAwlc02Wi_i_criterio(Character.toString(Constantes.cCOD_ZERO));
                URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
                String timeOut = endPointDataVO.getTimeOut();
                String servlocator = endPointDataVO.getServLocator();
                Class servicelocator = Class.forName(servlocator);
                org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
                AWLC02WSHTTPSoapBindingStub stub = new AWLC02WSHTTPSoapBindingStub(endpointURL, service);
                stub.setTimeout(Integer.valueOf(timeOut));
                salida = stub.AWLC02WSOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_FONOSC");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razon: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }


    /**
     * Call consulta cliente rut lina C.
     *
     * @param rut the rut
     * @param dv  the dv
     */
    @SuppressWarnings("rawtypes")
    public void callConsultaClienteRutLinaC(String rut, String dv, EndPointDataVO endPointDataVO) {
        String rutCompleto = null;
        try {
            rutCompleto = rut + "-" + dv;
            boolean rutRepetido = generalHelper.isRepeatValue(rutCompleto, "RUTA_SALIDA_RUT_C");
            if (rutRepetido) {
                LOGGER.info("SE AGREGA RUT A REPETIDOS: " + rutCompleto);
                listRepeatClients.add(rutCompleto);
            }

            if (!rutRepetido) {
                ProgramInterfaceAwlc02Wo_salida salida = null;
                ProgramInterfaceAwlc02Wi_entrada entrada = new ProgramInterfaceAwlc02Wi_entrada();
                entrada.setAwlc02Wi_i_area("");
                entrada.setAwlc02Wi_i_num_com("");
                entrada.setAwlc02Wi_i_rut(generalHelper.rellenarCadenaPorIzquierda(rut, 12, Constantes.cCOD_ZERO));
                entrada.setAwlc02Wi_i_dv(dv);
                entrada.setAwlc02Wi_i_criterio(Constantes.sCOD_ONE);
                URL endpointURL = new URL("http://esb0.ctc.cl:8082/services/consultaClienteRutLineaC");
                String timeOut = "15000";
                String servlocator = "cl.tch.unifica.fe.services.consultaclienterutlineac.AWLC02WSServiceLocator";
                Class servicelocator = Class.forName(servlocator);
                org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
                AWLC02WSHTTPSoapBindingStub stub = new AWLC02WSHTTPSoapBindingStub(endpointURL, service);
                stub.setTimeout(Integer.valueOf(timeOut));
                salida = stub.AWLC02WSOperation(entrada);
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();
                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, rutCompleto,"RUTA_SALIDA_RUT_C");
            }
        } catch (Exception e) {
            LOGGER.error(String.format("No se proceso el rut: %1$s por la siguiente razón: %2$s", rutCompleto, e));
            LOGGER.info("SE AGREGA A RUT SIN RESPUESTA : {}", rutCompleto);
            listClientsNoResponse.add(rutCompleto + " | " + e);
        }
    }

}
