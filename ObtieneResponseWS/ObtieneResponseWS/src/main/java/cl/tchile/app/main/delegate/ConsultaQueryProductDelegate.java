package cl.tchile.app.main.delegate;

import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.midrange.queryproductService.types.QueryproductRequest;
import com.telefonica.midrange.queryproductService.types.QueryproductResponse;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.CallEndpointHelper;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.exception.ObtenerResponseException;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import cl.tchile.vo.MigracionVO;

/**
 * ConsultaPsPrincipalesLineas
 */
@Component
public class ConsultaQueryProductDelegate {

    private static final Logger LOGGER = LogManager.getLogger(ConsultaQueryProductDelegate.class);

    @Autowired
    SaveFilesOracle saveFilesOracle;

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
        "http://esb1.ctc.cl:4453/QueryProductWEB/services/queryproduct",
        Constantes.TIMEOUT15,
        "com.telefonica.midrange.queryproductService.QueryproductServiceLocator"
    );
    
    public void consultaQueryProduct() throws SQLException, ClassNotFoundException {
//    	bot = new EchoBot();
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA QueryProducts ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSQUERYPRODUCTS;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAQUERYPRODUCTS;
//        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        List<ClienteVO> listaClientes = generalHelper.obtenerDatosDesdeExcel(
                ConstantesRutas.FICHEROPSPORLINEAREAD, "Generico");
        int indexLista = 0;
        
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            saveFilesOracle.reiniciarConexion(indexLista);
//            int resto = indexLista % 100;
//            if (resto == 0) {
//            	bot.enviarMensaje("6114130269", "Progreso "+ indexLista +" de "+listaClientes.size());
//            }
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaQueryProducts(clienteVO, endPointDataVO, String.valueOf(Constantes.cCOD_ZERO));
        }
//        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    public void callConsultaQueryProducts(ClienteVO clienteVO, EndPointDataVO endPointDataVO, String cod) throws SQLException {
//        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
    	String fonoCompleto = generalHelper.quitarNumerosIzquierda(clienteVO.getArea()) + generalHelper.quitarNumerosIzquierda(clienteVO.getFono());
        try {
            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_QUERY_PRODUCTS");
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: {}", fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                QueryproductResponse salida;
                QueryproductRequest entrada = fillRequestIn(clienteVO, cod);
                salida = callEndpointHelper
                    .callEndPointSoapStubQueryProducts(endPointDataVO).consultaQueryProduct(entrada);
                if (null != salida && !salida.getResponseMsj().getCodError().equalsIgnoreCase("000")) {
                    throw new ObtenerResponseException(
                        salida.getResponseMsj().getCodError() + " | " + salida.getResponseMsj().getMsgError());
                }
                StringWriter sw = new StringWriter();
                JAXB.marshal(salida, sw);
                String xmlString = sw.toString();

                int codBD = saveFilesOracle.saveResponseInBD(setMigracionVO(fonoCompleto, xmlString));

                if (codBD == 0) {
                    System.out.println(fonoCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
                }

//                consultaClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_QUERY_PRODUCTS");
            }

        } catch (Exception e) {
        	if( !(e instanceof ObtenerResponseException)) {      	        
//        	    bot.enviarMensaje("6114130269", "Linea: "+ fonoCompleto +" - ERROR! SE CIERRA CONEXION BD. "+e);
        		LOGGER.info("ERROR - SE CIERRA CONEXION BD");
        		saveFilesOracle.closeConnection();
        	}
//        	bot.enviarMensaje("6114130269", "Linea: "+ fonoCompleto +" - "+e);
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

    private MigracionVO setMigracionVO(String fonoCompleto, String xmlString) {
        MigracionVO vo = new MigracionVO();
        vo.setServicio("queryproduct");
        vo.setLinea(fonoCompleto);
        vo.setSalida(xmlString);
        return vo;
    }

    private QueryproductRequest fillRequestIn(ClienteVO clienteVO, String cod) {
        QueryproductRequest entrada = new QueryproductRequest();
        entrada.setIdType(Constantes.idTypeQueryProducts);
        entrada.setId(generalHelper.rellenarCadenaPorIzquierda(clienteVO.getIdFono(), 24, Constantes.cCOD_ZERO));
        return entrada;
    }
}

