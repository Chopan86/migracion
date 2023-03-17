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
import com.ProgramInterfaceMsi_acmb7Wsi;
import com.ProgramInterfaceMso_acmb7Wso;
import com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registro;
import com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registroMsi_entrada;
import com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registro;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
public class ConsultaDatosClienteCuentaDelegate {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaDatosClienteCuentaDelegate.class);
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
        "http://esb2.ctc.cl:8080/services/ConsultaDatosClienteCuenta",
        Constantes.TIMEOUT15,
        "com.ACB701WSServiceLocator"
    );

    public void consultaDatosClienteCuenta() {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA consultaDatosClienteCuenta ********");
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTADATOSCUENTACLIENTE;
        ClienteVO clienteVO = new ClienteVO();
        clienteVO.setArea("002");
        clienteVO.setFono("32926350");
        callConsultaDatosClienteCuenta(clienteVO, endPointDataVO);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaDatosClienteCuenta(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono();
        try {

            ProgramInterfaceMso_acmb7Wso salida;
            ProgramInterfaceMsi_acmb7Wsi entrada = fillRequestIn(clienteVO);
            salida = callEndpointHelper
                .callEndPointSoapStubConsultaDatosClienteCuenta(endPointDataVO).ACB701WSOperation(entrada);

            String xmlString;
            StringWriter sw = new StringWriter();
            JAXBContext context = JAXBContext.newInstance(ProgramInterfaceMso_acmb7Wso.class);
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

        } catch (Exception e) {
            LOGGER.error("No se proceso el CLIENTE: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA CLIENTE SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private MigracionVO setMigracionVO(ClienteVO clienteVO, String xmlString) {
        MigracionVO vo = new MigracionVO();
        vo.setServicio("ConsultaDatosClienteCuenta");
        vo.setLinea(clienteVO.getArea()+clienteVO.getFono());
        vo.setSalida(xmlString);
        return vo;
    }

    private ProgramInterfaceMsi_acmb7Wsi fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceMsi_acmb7Wsi entrada = new ProgramInterfaceMsi_acmb7Wsi();
        entrada.setAcmb7Wsi_ac_flag("1");
        entrada.setAcmb7Wsi_ac_area(clienteVO.getArea());
        entrada.setAcmb7Wsi_ac_nu_com(clienteVO.getFono());
        return entrada;
    }
}
