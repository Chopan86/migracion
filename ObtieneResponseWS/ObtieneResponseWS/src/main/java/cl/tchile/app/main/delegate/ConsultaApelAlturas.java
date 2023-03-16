package cl.tchile.app.main.delegate;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import cl.tchile.vo.MigracionVO;

import com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registro;
import com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registroMsi_entrada;
import com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registro;
import com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida;

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
 * ApelAlturas
 */
// TODO: todo
@Component
public class ConsultaApelAlturas {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaApelAlturas.class);
    /**
     * The general helper.
     */
    @Autowired
    GeneralHelper generalHelper;

    @Autowired
    SaveFilesOracle saveFilesOracle;

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
        "http://TCHMFPROD.ctc.cl:8080/services/consultaApelAlturas",
        Constantes.TIMEOUT15,
        "com.APEWS16I.APE9016.www.APE9016ServiceLocator"
    );

    public void consultaApelAlturas() {
        ClienteVO defaultResClienteVO = new ClienteVO();
        defaultResClienteVO.setCodAltura("");
        defaultResClienteVO.setCodCiudad("");
        defaultResClienteVO.setCodCalle("");
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA ApelAlturas ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSLISTAAPELALTURAS;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAAPELALTURAS;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeExcel(
            "C:/WorkspaceMigracionMainFrame/ListaRequestConsultaApelAltura.xlsx", "consultaApelAlturas");
        listaClientes.add(defaultResClienteVO);
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaApelAlturas(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaApelAlturas(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String codCiudadCalleAltura =
            clienteVO.getCodCiudad() + "-" + clienteVO.getCodCalle() + "-" + clienteVO.getCodAltura();
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(codCiudadCalleAltura, "RUTA_SALIDA_APELALTURAS");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A CLIENTE REPETIDO: {}", codCiudadCalleAltura);
                listRepeatClients.add(codCiudadCalleAltura);
            }
            if (!fonoRepetido) {
                ProgramInterfaceMso_registro salida;
                ProgramInterfaceMsi_registro entrada = fillRequestIn(clienteVO);
                salida = callEndpointHelper
                    .callEndPointSoapStubConsultaApelAlturas(endPointDataVO).APE9016Operation(entrada);
                String xmlString;
                if (entrada.getMsi_entrada().getMsi_alt().equalsIgnoreCase("")) {
                    salida.getMso_salida().setFiller1("STGO 004028000100");
                }
                StringWriter sw = new StringWriter();
                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceMso_registro.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                xmlString = stringWriter.toString();
                int codBD = saveFilesOracle.saveResponseInBD(setMigracionVO(clienteVO, xmlString));

                if (codBD == 0) {
                    System.out.println(clienteVO.toString() + " | Error insert BD ");
                    listClientsNoResponse.add(clienteVO.toString() + " | Error insert BD ");
                }
//                
//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, codCiudadCalleAltura,
//                    "RUTA_SALIDA_APELALTURAS");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el CLIENTE: " + codCiudadCalleAltura + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA CLIENTE SIN RESPUESTA : " + codCiudadCalleAltura);
            listClientsNoResponse.add(codCiudadCalleAltura + " | " + e);
        }
    }

    private MigracionVO setMigracionVO(ClienteVO clienteVO, String xmlString) {
        MigracionVO vo = new MigracionVO();
        vo.setServicio("consultaApelAlturas");
        vo.setCiudad(clienteVO.getCodCiudad().isEmpty() ? "DEAFULT" : clienteVO.getCodCiudad());
        vo.setCalle(clienteVO.getCodCalle().isEmpty() ? "DEAFULT" : clienteVO.getCodCalle());
        vo.setAltura(clienteVO.getCodAltura().isEmpty() ? "DEAFULT" : clienteVO.getCodAltura());
        vo.setSalida(xmlString);
        return vo;
    }

    private ProgramInterfaceMsi_registro fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceMsi_registro entrada = new ProgramInterfaceMsi_registro();
        ProgramInterfaceMsi_registroMsi_entrada entradaRegistro = new ProgramInterfaceMsi_registroMsi_entrada();
        entradaRegistro.setFiller1("");
        entradaRegistro.setFiller2("");
        entradaRegistro.setMsi_ciu(clienteVO.getCodCiudad());
        entradaRegistro.setMsi_cll(
            generalHelper.rellenarCadenaPorIzquierda(clienteVO.getCodCalle(), 6, Constantes.cCOD_ZERO));
        entradaRegistro.setMsi_alt(
            generalHelper.rellenarCadenaPorIzquierda(clienteVO.getCodAltura(), 6, Constantes.cCOD_ZERO));
        entrada.setMsi_entrada(entradaRegistro);
        return entrada;
    }
}
