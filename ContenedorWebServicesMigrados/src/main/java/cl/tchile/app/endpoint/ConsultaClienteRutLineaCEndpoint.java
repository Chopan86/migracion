package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.response.awlc02wi.awlc02ws.ProgramInterface;

import cl.tchile.app.helper.ConsultaRutLineaCHelper;

/**
 * The Class WebServiceEndpoint.
 */
@Endpoint
public class ConsultaClienteRutLineaCEndpoint {

	/** The consulta rut linea C heper. */
	@Autowired
	ConsultaRutLineaCHelper consultaRutLineaCHeper;
	
	/** The Constant NAMESPACE_URI_CONSULTA_CLIENTE_RUT_LINEA_C. */
	private static final String NAMESPACE_URI = "http://www.AWLC02WS.AWLC02WI.Request.com";
	
	/**
	 * Consulta cliente rut linea C.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AWLC02WSOperation")
	@ResponsePayload
	public JAXBElement<ProgramInterface> consultaClienteRutLineaC(@RequestPayload com.request.awlc02wi.awlc02ws.ProgramInterface request) throws JAXBException {
		System.out.println(request.getAwlc02WiEntrada().getAwlc02WiIRut() + " - " +request.getAwlc02WiEntrada().getAwlc02WiIDv());
		ProgramInterface pInterface = consultaRutLineaCHeper.setResponseConsultaRutLienaC();
		com.response.awlc02wi.awlc02ws.ObjectFactory factory = new com.response.awlc02wi.awlc02ws.ObjectFactory();
		return factory.createAWLC02WSOperationResponse(pInterface);
	}
	
	

}
