package cl.tchile.app.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.awps01wi.awps01ws.ProgramInterface;
import com.response.awps01wi.awps01ws.ProgramInterface.Awps01CoSalida;
import com.response.awps01wi.awps01ws.ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente;
import com.response.awps01wi.awps01ws.ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente.Awps01CoOPiCliente2;



/**
 * The Class ConsultaPsPorLineaEndPoint.
 */
@Endpoint
public class ConsultaPsPorLineaEndPoint {

	
	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.AWPS01WS.AWPS01WI.Request.com";
	
	/**
	 * Consulta cliente rut linea C.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "AWPS01WSOperation")
	@ResponsePayload
	public JAXBElement<com.response.awps01wi.awps01ws.ProgramInterface> consultaPsPorLinea(@RequestPayload ProgramInterface request) throws JAXBException {
		System.out.println(request.getAwps01CoEntrada().getAwps01CoIArea() + " " + request.getAwps01CoEntrada().getAwps01CoINumCom());
		com.response.awps01wi.awps01ws.ProgramInterface response = new com.response.awps01wi.awps01ws.ProgramInterface();
		Awps01CoSalida salida = new Awps01CoSalida();
		
		salida.setAwps01CoOCodRet("000");
		salida.setAwps01CoODescCodRet("PROCESO EXITOSO");
		salida.setAwps01CoOFinpaginacion("1");
		salida.setAwps01CoONumregistros("00");
		salida.setAwps01CoOPlanMinuto("111");
		
		
		List<Awps01CoOPiCliente> listaPiClientes = new ArrayList<Awps01CoOPiCliente>();
		Awps01CoOPiCliente oPICliente = new Awps01CoOPiCliente();
		oPICliente.setAwps01CoOCantPs("5465");
		Awps01CoOPiCliente2 pPidCliente2 = new Awps01CoOPiCliente2();
		
		pPidCliente2.setAwps01CoOCodCar("123");
		pPidCliente2.setAwps01CoOCodDom("123");
		pPidCliente2.setAwps01CoOSecCar("123");
		pPidCliente2.setAwps01CoOTipDom("123");
		pPidCliente2.setAwps01CoOValorDom("123");
		
		oPICliente.getAwps01CoOPiCliente2().add(pPidCliente2);
		
		listaPiClientes.add(oPICliente);
		salida.getAwps01CoOPiCliente().add(oPICliente);
		
		
		response.setAwps01CoSalida(salida);
		com.response.awps01wi.awps01ws.ObjectFactory factory = new com.response.awps01wi.awps01ws.ObjectFactory();
		return factory.createAWPS01WSOperationResponse(response);
	}
}
