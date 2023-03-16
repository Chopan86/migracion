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
        String fonoCompletoBD =
                generalHelper.quitarNumerosIzquierda(clienteVO.getArea()) +
                generalHelper.quitarNumerosIzquierda(clienteVO.getFono());
        String fonoCompleto = fonoCompletoBD+"-"+clienteVO.getInicioVigencia();
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
                
                int codBD = saveFilesOracle.saveResponseInBD(setMigracionVO(fonoCompleto, xmlString, entrada.getAwps01Co_i_fec_ini_li()));

                if (codBD == 0) {
                    System.out.println(fonoCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
                }

//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompletoBD,
//                    "RUTA_SALIDA_PSPORLINEA");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private MigracionVO setMigracionVO(String fonoCompleto, String xmlString, String fechaIniLi) {
    	MigracionVO vo = new MigracionVO();
    	vo.setServicio("consultaPSporLinea");
    	vo.setLinea(fonoCompleto);
    	vo.setSalida(xmlString);
    	vo.setFechaIniLi(fechaIniLi);
		return vo;
	}

	private ProgramInterfaceAwps01Co_entrada fillRequestIn(ClienteVO clienteVO) {
        ProgramInterfaceAwps01Co_entrada entrada = new ProgramInterfaceAwps01Co_entrada();
        entrada.setAwps01Co_i_area(generalHelper.rellenarCadenaPorIzquierda(clienteVO.getArea(),3,Constantes.cCOD_ZERO));
        entrada.setAwps01Co_i_num_com(generalHelper.rellenarCadenaPorIzquierda(clienteVO.getFono(),8,Constantes.cCOD_ZERO));
        entrada.setAwps01Co_i_fec_ini_li(clienteVO.getInicioVigencia());
        entrada.setFiller1("");
        return entrada;
    }
}
