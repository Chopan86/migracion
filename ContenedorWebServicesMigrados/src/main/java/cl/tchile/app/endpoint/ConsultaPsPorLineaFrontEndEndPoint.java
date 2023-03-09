package cl.tchile.app.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.awmps02i.awps02co.ProgramInterface;
import com.response.awmps02i.awps02co.ObjectFactory;
import com.response.awmps02i.awps02co.ProgramInterface.Awps02CoSalida;
import com.response.awmps02i.awps02co.ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente;
import com.response.awmps02i.awps02co.ProgramInterface.Awps02CoSalida.Awps02CoOPiCliente.Awps02CoOPiCliente2;

/**
 * The Class ConsultaPsPorLineaFrontEndEndPoint.
 */
@Endpoint
public class ConsultaPsPorLineaFrontEndEndPoint {

	
	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.AWPS02CO.AWMPS02I.Request.com";
	
	/**
	 * Consulta cliente rut linea C.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AWPS02COOperation")
	@ResponsePayload
	public JAXBElement<com.response.awmps02i.awps02co.ProgramInterface> consultaPsPorLinea(@RequestPayload ProgramInterface request) throws JAXBException {
		System.out.println(request.getAwps02CoEntrada().getAwps02CoIArea() + " " + request.getAwps02CoEntrada().getAwps02CoINumCom());
		com.response.awmps02i.awps02co.ProgramInterface response = new com.response.awmps02i.awps02co.ProgramInterface();
		Awps02CoSalida salida = new Awps02CoSalida();
		salida.setAwps02CoOCodRet("000");
		salida.setAwps02CoODescCodRet("PROCESO EXITOSO");
		salida.setAwps02CoOFinpaginacion("1");
		salida.setAwps02CoONumregistros("00");
		List<Awps02CoOPiCliente> listaPiCliente = new ArrayList<Awps02CoOPiCliente>();
		Awps02CoOPiCliente oPICliente = new Awps02CoOPiCliente();
		oPICliente.setAwps02CoOCantPs("5465");
		Awps02CoOPiCliente2 pPidCliente2 = new Awps02CoOPiCliente2();
		pPidCliente2.setAwps02CoOCodCar("123");
		pPidCliente2.setAwps02CoOCodDom("123");
		pPidCliente2.setAwps02CoOSecCar("123");
		pPidCliente2.setAwps02CoOTipDom("123");
		pPidCliente2.setAwps02CoOValorDom("123");
		oPICliente.getAwps02CoOPiCliente2().add(pPidCliente2);
		
		listaPiCliente.add(oPICliente);
		salida.getAwps02CoOPiCliente().add(oPICliente);
		
		
		response.setAwps02CoSalida(salida);
		ObjectFactory factory = new ObjectFactory();
		return factory.createAWPS02COOperationResponse(response);
	}
}
