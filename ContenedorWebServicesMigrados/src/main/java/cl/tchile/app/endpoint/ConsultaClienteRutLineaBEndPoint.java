package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.response.awlc01wi.awlc01ws.ObjectFactory;
import com.response.awlc01wi.awlc01ws.ProgramInterface;
import com.response.awlc01wi.awlc01ws.ProgramInterface.Awlc01Z3Salida;

/**
 * The Class ConsultaClienteRutLineaB.
 */
@Endpoint
public class ConsultaClienteRutLineaBEndPoint {

	/** The Constant NAMESPACE_URI_CONSULTA_CLIENTE_RUT_LINEA_B. */
	private static final String NAMESPACE_URI = "http://www.AWLC01WS.AWLC01WI.Request.com";
	
	/**
	 * Consulta cliente rut linea B.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AWLC01WSOperation")
	@ResponsePayload
	public JAXBElement<ProgramInterface> consultaClienteRutLineaB(@RequestPayload com.request.awlc01wi.awlc01ws.ProgramInterface request) throws JAXBException {
		System.out.println(request.getAwlc01Z3Entrada().getAwlc01Z3IRut() + " - " +request.getAwlc01Z3Entrada().getAwlc01Z3IDv());
		ProgramInterface pInterface = new ProgramInterface();
		Awlc01Z3Salida salida = new Awlc01Z3Salida();
		salida.setAwlc01Z3OCodRet("000");
		pInterface.setAwlc01Z3Salida(salida);
		ObjectFactory factory = new ObjectFactory();
		return factory.createAWLC01WSOperationResponse(pInterface);
	}
}
