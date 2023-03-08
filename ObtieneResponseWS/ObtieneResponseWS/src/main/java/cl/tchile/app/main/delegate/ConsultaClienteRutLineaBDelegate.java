package cl.tchile.app.main.delegate;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.helper.ConsultaClienteRutLineaBHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.vo.FonoClienteVO;
import cl.tchile.vo.RutClienteVO;
import com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub;
import com.Request.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_entrada;
import com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class ConsultaClienteRutLineaCDelegate.
 */
@Component
public class ConsultaClienteRutLineaBDelegate {
	
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutLineaBDelegate.class);

	/** The general helper. */
	@Autowired
	GeneralHelper generalHelper;
	
	/** The general helper. */
	@Autowired
	ConsultaClienteRutLineaBHelper consultarClienteRutLineaBHelper;
	/**
	 * Lista rut clientes repetidos
	 */
	List<String> listRepeatRutClients = new ArrayList<>();
	/**
	 * Lista rut clientes con error
	 */
	List<String> listClientsNoResponse = new ArrayList<>();

	/**
	 * consultaClienteRutlineaBxFono
	 */
	public void consultaClienteRutlineaBxFono(){
		LOGGER.info("******** INICIO PROCESO LINEAS X FONO  ********");
		List<FonoClienteVO> fonoClienteVOS = consultarClienteRutLineaBHelper.obtenerFonoClientesDesdeFichero();
		int indexListaRutClientes = 0;
		for (FonoClienteVO fonoClienteVO : fonoClienteVOS) {
			indexListaRutClientes++;
			LOGGER.info(generalHelper.progressPercent(indexListaRutClientes, fonoClienteVOS.size()));
			callConsultaClienteRutLinaBxFono(fonoClienteVO.getArea(), fonoClienteVO.getFono());
		}
	}

    /**
     * Consulta cliente rut linea B impl.
     */
    public void consultaClienteRutLineaBImpl() {
    	  LOGGER.info("******** INICIO PROCESO ********");
    	  List<RutClienteVO> listaRutClientes = consultarClienteRutLineaBHelper.obtieneRutClienteDesdeFichero();
		  LOGGER.info("Cantidad Total Ruts a Buscar: " + listaRutClientes.size());
		  int indexListaRutClientes = 0;
    	  for (RutClienteVO rutClienteVO : listaRutClientes) {
			  indexListaRutClientes++;
			  LOGGER.info(generalHelper.progressPercent(indexListaRutClientes, listaRutClientes.size()));
			  callConsultaClienteRutLinaB(rutClienteVO.getRut(), rutClienteVO.getDv());
		}
		  generalHelper.outputRepeatClients(listRepeatRutClients);
		  generalHelper.outputErrorRuts(listClientsNoResponse);
    }
    
    
    /**
     * Call consulta cliente rut lina C.
     *
     * @param rut the rut
     * @param dv the dv
     */
	public void callConsultaClienteRutLinaB(String rut,String dv) {
		String rutCompleto = null;
		try {
			rutCompleto = rut + "-" + dv;
			boolean rutRepetido = generalHelper.isRepeatValue(rutCompleto, "RUTA_SALIDA_DATOS");
			if (rutRepetido) {
				LOGGER.info("SE AGREGA RUT A REPETIDOS: " + rutCompleto);
				listRepeatRutClients.add(rutCompleto);
			}

			if (!rutRepetido) {
				ProgramInterfaceAwlc01Z3_salida salida = null;
				ProgramInterfaceAwlc01Z3_entrada entrada = new ProgramInterfaceAwlc01Z3_entrada();
				entrada.setAwlc01Z3_i_area("");
				entrada.setAwlc01Z3_i_num_com("");
				entrada.setAwlc01Z3_i_rut(generalHelper.rellenarCadenaPorIzquierda(rut, 12, Constantes.cCOD_ZERO));
				entrada.setAwlc01Z3_i_dv(dv);
				entrada.setAwlc01Z3_i_criterio(Constantes.sCOD_ONE);
				entrada.setFiller1("");
				URL endpointURL = new URL("http://esb2.ctc.cl:8080/services/consultaClienteRutLineaB");
				String timeOut = "15000";
				String servlocator = "com.AWLC01WI.AWLC01WS.www.AWLC01WSServiceLocator";
				Class servicelocator = Class.forName(servlocator);
				org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
				AWLC01WSHTTPSoapBindingStub stub = new AWLC01WSHTTPSoapBindingStub(endpointURL, service);
				stub.setTimeout(Integer.valueOf(timeOut));
				salida = stub.AWLC01WSOperation(entrada);
				StringWriter sw = new StringWriter();
				JAXB.marshal(salida, sw);
				String xmlString = sw.toString();
				consultarClienteRutLineaBHelper.crearSalidaResponse(xmlString, rutCompleto, "RUTA_SALIDA_DATOS");
			}

		} catch (Exception e) {
			LOGGER.error("No se proceso el rut: " + rutCompleto + " por la siguiente razon: " + e);
			LOGGER.info("SE AGREGA A RUT SIN RESPUESTA : " + rutCompleto);
			listClientsNoResponse.add(rutCompleto + " | " + e);
		}
	}

	public void callConsultaClienteRutLinaBxFono(String area,String fono) {
		String fonoCompleto = area + fono;
		try {
			boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_FONOS");
			if (fonoRepetido) {
				LOGGER.info("SE AGREGA A FONOS REPETIDOS: " + fonoCompleto);
				listRepeatRutClients.add(fonoCompleto);
			}

			if (!fonoRepetido) {
				ProgramInterfaceAwlc01Z3_salida salida = null;
				ProgramInterfaceAwlc01Z3_entrada entrada = new ProgramInterfaceAwlc01Z3_entrada();
				entrada.setAwlc01Z3_i_area(generalHelper.formatearAreaFono(area));
				entrada.setAwlc01Z3_i_num_com(generalHelper.formatearFono(area,fono));
				entrada.setAwlc01Z3_i_rut("");
				entrada.setAwlc01Z3_i_dv("");
				entrada.setAwlc01Z3_i_criterio(Constantes.sCOD_ONE);
				entrada.setFiller1("");
				URL endpointURL = new URL("http://esb2.ctc.cl:8080/services/consultaClienteRutLineaB");
				String timeOut = "15000";
				String servlocator = "com.AWLC01WI.AWLC01WS.www.AWLC01WSServiceLocator";
				Class servicelocator = Class.forName(servlocator);
				org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
				AWLC01WSHTTPSoapBindingStub stub = new AWLC01WSHTTPSoapBindingStub(endpointURL, service);
				stub.setTimeout(Integer.valueOf(timeOut));
				salida = stub.AWLC01WSOperation(entrada);
				StringWriter sw = new StringWriter();
				JAXB.marshal(salida, sw);
				String xmlString = sw.toString();
				consultarClienteRutLineaBHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_FONOS");
			}

		} catch (Exception e) {
			LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razon: " + e);
			LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
			listClientsNoResponse.add(fonoCompleto + " | " + e);
		}
	}

}
