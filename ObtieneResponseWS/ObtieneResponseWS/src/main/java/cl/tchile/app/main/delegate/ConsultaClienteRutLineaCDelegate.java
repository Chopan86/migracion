package cl.tchile.app.main.delegate;

import cl.tchile.app.bot.RestTemplateTelegramBot;
import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import cl.tchile.vo.MigracionVO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Request.AWLC02WI.AWLC02WS.www.ProgramInterfaceAwlc02Wi_entrada;
import com.Response.AWLC02WI.AWLC02WS.www.ProgramInterfaceAwlc02Wo_salida;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import java.io.StringWriter;
import java.sql.SQLException;
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

    @Autowired
    SaveFilesOracle saveFilesOracle;

    private final RestTemplateTelegramBot restTemplateTelegramBot;

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
        "com.AWLC02WI.AWLC02WS.www.AWLC02WSServiceLocator"
    );

    int indexLista = 0;

    @Autowired
    public ConsultaClienteRutLineaCDelegate(RestTemplateTelegramBot restTemplateTelegramBot) {
        this.restTemplateTelegramBot = restTemplateTelegramBot;
    }

    /**
     * Consulta cliente rut linea C impl.
     */
    public void consultaClienteRutLineaCImpl() throws Exception {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA RUT C ********");
        String pathSalidaRepetidos = "C:/rutsCRepetidos.txt";
        String pathSalidaNoResponse = "C:/rutsCNoResponse.txt";
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtieneRutClienteDesdeFichero(
            ConstantesRutas.LECTURARUTSN1);
        indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            saveFilesOracle.reiniciarConexion(indexLista);
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size(),"consultaClienteRutLineaC N1"));
            callConsultaClienteRutLinaC(clienteVO, endPointDataVO);
        }
        restTemplateTelegramBot.peticionHttpGet(String.valueOf(-837310871), "Carga Linea C RUT completada N1");
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void consultaClienteRutlineaCxFono() throws Exception {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        String pathSalidaRepetidos = "C:/telefonosCRepetidos.txt";
        String pathSalidaNoResponse = "C:/telefonosCNoResponse.txt";
        LOGGER.info("******** INICIO PROCESO LINEAS X FONO  ********");
        List<ClienteVO> clienteVOList = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        indexLista = 0;
        for (ClienteVO clienteVO : clienteVOList) {
            indexLista++;
            saveFilesOracle.reiniciarConexion(indexLista);
            LOGGER.info(generalHelper.progressPercent(indexLista, clienteVOList.size(),"consultaClienteRutLineaC"));
            callConsultaClienteRutLinaCxFono(clienteVO, endPointDataVO);
        }
        restTemplateTelegramBot.peticionHttpGet(String.valueOf(-837310871), "Carga Linea C completada");
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaClienteRutLinaCxFono(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
        try {
//            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_FONOSC");
            boolean fonoRepetido = false;
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwlc02Wo_salida salida;
                ProgramInterfaceAwlc02Wi_entrada entrada = fillRequestIn(clienteVO,
                    String.valueOf(Constantes.cCOD_ZERO));
                salida = callEndpointHelper.callEndPointSoapStub(endPointDataVO).AWLC02WSOperation(entrada);

                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwlc02Wo_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();

                int codBD = saveFilesOracle.saveResponseInBD(setMigracionVO("linea", fonoCompleto, xmlString));

                if (codBD == 0) {
                    System.out.println(fonoCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
                }

//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_FONOSC");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private MigracionVO setMigracionVO(String tipo, String valueTipo, String xmlString) {
        MigracionVO vo = new MigracionVO();
        vo.setServicio("consultaClienteRutLineaC");
        if ("rut".equals(tipo)) {
            vo.setRut(valueTipo);
            vo.setSalida(xmlString);
        } else {
            vo.setLinea(valueTipo);
            vo.setSalida(xmlString);
        }
        return vo;
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
    public void callConsultaClienteRutLinaC(ClienteVO clienteVO, EndPointDataVO endPointDataVO) throws Exception {
        String rutCompleto = null;
        try {
            rutCompleto = clienteVO.getRut() + "-" + clienteVO.getDv();
//            boolean rutRepetido = generalHelper.isRepeatValue(rutCompleto, "RUTA_SALIDA_RUT_C");
            boolean rutRepetido = false;//Quitar
            if (rutRepetido) {
                LOGGER.info("SE AGREGA RUT A REPETIDOS: " + rutCompleto);
                listRepeatClients.add(rutCompleto);
            }

            if (!rutRepetido) {
                ProgramInterfaceAwlc02Wo_salida salida;
                ProgramInterfaceAwlc02Wi_entrada entrada = fillRequestIn(clienteVO, (Constantes.sCOD_ONE));
                salida = callEndpointHelper.callEndPointSoapStub(endPointDataVO).AWLC02WSOperation(entrada);

                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwlc02Wo_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();

                int codBD = saveFilesOracle.saveResponseInBD(
                    setMigracionVO("rut", clienteVO.getRut() + clienteVO.getDv(), xmlString));

                if (codBD == 0) {
                    System.out.println(rutCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(rutCompleto + " | Error insert BD ");
                }
//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, rutCompleto, "RUTA_SALIDA_RUT_C");
            }
        } catch (Exception e) {
            String error = rutCompleto + " | " + e + " | Fila:" + indexLista + " | consultaClienteRutLineaC N1";
            restTemplateTelegramBot.peticionHttpGet(String.valueOf(-837310871), error);
            LOGGER.error(String.format("No se proceso el rut: %1$s por la siguiente razón: %2$s", rutCompleto, e));
            LOGGER.info("SE AGREGA A RUT SIN RESPUESTA : {}", rutCompleto);
            listClientsNoResponse.add(rutCompleto + " | " + e);
        }
    }

}
