package cl.tchile.app.main.delegate;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import com.Request.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_entrada;
import com.Request.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_entrada;
import com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salida;
import com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salida;
import com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wo;
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
public class ConsultaListaPsLineaV {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaListaPsLineaV.class);
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
        "http://TCHMFPROD.ctc.cl:8080/services/listaPsLineaV8",
        Constantes.TIMEOUT15,
        "com.AWMLIP8I.AWLIW8CO.www.AWLIW8COServiceLocator"
    );

    public void consultaListaPsLineaV8() {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA ListaPsLineaV8 ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSLISTAPSLINEAV8;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTALISTAPSLINEAV8;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeExcel(
            "C:/WorkspaceMigracionMainFrame/psporlinea.xlsx", "consultaListaPsLineaV8");
        int indexLista = 0;
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaListaPsLineaV8(clienteVO, endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaListaPsLineaV8(ClienteVO clienteVO, EndPointDataVO endPointDataVO) {
        String fonoCompleto =
            clienteVO.getArea() + clienteVO.getFono();
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_LISTAPSLINEAV8");
            fonoRepetido = false; //BORRAR
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwlip8Co_salida salida;
                ProgramInterfaceAwlip8Co_entrada entrada = fillRequestIn(clienteVO);
                salida = callEndpointHelper
                    .callEndPointSoapStubConsultaListaPsLineaV8(endPointDataVO).AWLIW8COOperation(entrada);

                StringWriter sw = new StringWriter();
                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwlip8Co_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.setProperty("com.sun.xml.bind.xmlHeaders", "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();
                System.out.println("");

//                //TODO: Ver Formato De Fono 00222456875
//                int codBD = saveFilesOracle.saveResponseInBD(xmlString, "listaPsLineaV8", fonoCompleto,
//                    null);
//
//                if (codBD == 0) {
//                    System.out.println(fonoCompleto + " | Error insert BD ");
//                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
//                }
//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto,
//                    "RUTA_SALIDA_LISTAPSLINEAV8");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private ProgramInterfaceAwlip8Co_entrada fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceAwlip8Co_entrada entrada = new ProgramInterfaceAwlip8Co_entrada();
        entrada.setAwlip8Co_i_area(clienteVO.getArea());
        entrada.setAwlip8Co_i_num_com(clienteVO.getFono());
        entrada.setFiller1("");
        return entrada;
    }
}
