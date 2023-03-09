package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.awmlip8i.awliw8co.ProgramInterface;
import com.response.awmlip8i.awliw8co.ObjectFactory;
import com.response.awmlip8i.awliw8co.ProgramInterface.Awlip8CoSalida;


/**
 * The Class ListaPsLineaV8EndPoint.
 */
@Endpoint
public class ListaPsLineaV8EndPoint {

	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.AWLIW8CO.AWMLIP8I.Request.com";
	
	/**
	 * Lista ps linea V 8.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AWLIW8COOperation")
	@ResponsePayload
	public JAXBElement<com.response.awmlip8i.awliw8co.ProgramInterface> listaPsLineaV8(@RequestPayload ProgramInterface request) throws JAXBException {
		com.response.awmlip8i.awliw8co.ProgramInterface response = new com.response.awmlip8i.awliw8co.ProgramInterface();
		Awlip8CoSalida salida = new Awlip8CoSalida();
		salida.setAwlip8CoOCodRet("000");
		salida.setAwlip8CoODescCodRet("PROCESO EXITOSO");
		response.setAwlip8CoSalida(salida);
		ObjectFactory factory = new ObjectFactory();
		return factory.createAWLIW8COOperationResponse(response);
	}
}
