package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.awpsl2wi.awpsl2ws.ProgramInterface;
import com.response.awpsl2wi.awpsl2ws.ObjectFactory;
import com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo;
import com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo.Awpsl2WoSalida;


/**
 * The Class ListaPSFrontEndEnPoint.
 */
@Endpoint
public class ListaPSFrontEndEnPoint {

	
	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.AWPSL2WS.AWPSL2WI.Request.com";
	
	/**
	 * Lista PS front end.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AWPSL2WSOperation")
	@ResponsePayload
	public JAXBElement<com.response.awpsl2wi.awpsl2ws.ProgramInterface> listaPSFrontEnd(@RequestPayload ProgramInterface request) throws JAXBException {
		System.out.println(request.getAwpsl2Wi().getAwpsl2WiArea() +  " " + request.getAwpsl2Wi().getAwpsl2WiNumCom());
		com.response.awpsl2wi.awpsl2ws.ProgramInterface response = new com.response.awpsl2wi.awpsl2ws.ProgramInterface();
		Awpsl2WoSalida salida = new Awpsl2WoSalida();
		salida.setAwpsl2WoCodRet("000");
		salida.setAwpsl2WoDescRet("PROCESO EXITOSO");
		Awpsl2Wo contenedorSalida = new Awpsl2Wo();
		contenedorSalida.setAwpsl2WoSalida(salida);
		response.setAwpsl2Wo(contenedorSalida);
		ObjectFactory factory = new ObjectFactory();
		return factory.createAWPSL2WSOperationResponse(response);
	}
	
}
