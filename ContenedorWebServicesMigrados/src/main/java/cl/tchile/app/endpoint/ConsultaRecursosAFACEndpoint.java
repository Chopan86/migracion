package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.wspms.apelafac.ProgramInterface;
import com.response.wspms.apelafac.ObjectFactory;

import cl.tchile.app.helper.ConsultaRecursosAFACHelper;


/**
 * The Class ConsultaRecursosAFACEndpoint.
 */
@Endpoint
public class ConsultaRecursosAFACEndpoint {
	
	/** ConsultaRecursosAFACHelper */
	@Autowired
	ConsultaRecursosAFACHelper consultaRecursosAFACHelper;
	
	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.APELAFAC.WSPMS.Request.com";
	
	/**
	 * Consulta recursos AFAC.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "APELAFACOperation")
	@ResponsePayload
	public JAXBElement<com.response.wspms.apelafac.ProgramInterface> consultaRecursosAFAC(@RequestPayload ProgramInterface request) throws JAXBException {
		System.out.println(request.getApelAfacPmsI().getDatain());
		com.response.wspms.apelafac.ProgramInterface response = consultaRecursosAFACHelper.setResponseConsultaRecursosAFAC();
		ObjectFactory factory = new ObjectFactory();
		return factory.createAPELAFACOperationResponse(response);
	}
}
