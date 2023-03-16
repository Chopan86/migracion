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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telefonica.midrange.queryproductService.types.QueryproductRequest;
import com.telefonica.midrange.queryproductService.types.QueryproductResponse;

import javax.xml.bind.JAXB;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

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
        "cl.movistar.queryproduct.queryproduct.QueryproductServiceLocator"
    );

    public void consultaQueryProduct(){
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        LOGGER.info("******** INICIO PROCESO CONSULTA QueryProducts ********");
        String pathSalidaRepetidos = ConstantesRutas.REPETIDOSQUERYPRODUCTS;
        String pathSalidaNoResponse = ConstantesRutas.SINRESPUESTAQUERYPRODUCTS;
        List<ClienteVO> listaClientes = consultaClienteRutFonoLineaHelper.obtenerDatosDesdeFichero();
        int indexLista = 0;
//        ClienteVO clienteVO = new ClienteVO();
//        
//        clienteVO.setIdFono("000000000000000228353426");
//        clienteVO.setIdTypeCall("fonoFijo");
        
        for (ClienteVO clienteVO : listaClientes) {
            indexLista++;
            LOGGER.info(generalHelper.progressPercent(indexLista, listaClientes.size()));
            callConsultaQueryProducts(clienteVO, endPointDataVO, String.valueOf(Constantes.cCOD_ZERO));
        }
//        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }



    public void callConsultaQueryProducts(ClienteVO clienteVO, EndPointDataVO endPointDataVO, String cod) {
        String fonoCompleto = clienteVO.getArea() + clienteVO.getFono().substring(1);
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
        entrada.setId(generalHelper.rellenarCadenaPorIzquierda(clienteVO.getIdFono(),24,Constantes.cCOD_ZERO));
        return entrada;
    }
}

