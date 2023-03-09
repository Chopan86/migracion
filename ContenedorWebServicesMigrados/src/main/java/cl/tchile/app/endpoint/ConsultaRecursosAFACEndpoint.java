package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.wspms.apelafac.ProgramInterface;
import com.response.wspms.apelafac.ObjectFactory;
import com.response.wspms.apelafac.ProgramInterface.ApelAfacPmsO;


/**
 * The Class ConsultaRecursosAFACEndpoint.
 */
@Endpoint
public class ConsultaRecursosAFACEndpoint {

	
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
		com.response.wspms.apelafac.ProgramInterface response = new com.response.wspms.apelafac.ProgramInterface();
		ApelAfacPmsO salida = new ApelAfacPmsO();
		ObjectFactory factory = new ObjectFactory();
		salida.setDataout("34025106252101SAN FELIPE          05060000000000000009  00  07097     H10097 010400PROCESO EXITOSO");
		response.setApelAfacPmsO(salida);
		return factory.createAPELAFACOperationResponse(response);
	}
}
