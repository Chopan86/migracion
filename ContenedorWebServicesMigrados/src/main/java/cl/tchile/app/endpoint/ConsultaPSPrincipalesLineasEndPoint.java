package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.response.accpspwi.accpspws.ProgramInterface;

import cl.tchile.app.helper.ConsultaPSPrincipalesLineasHerlper;


/**
 * The Class ConsultaPSPrincipalesLineasEndPoint.
 */
@Endpoint
public class ConsultaPSPrincipalesLineasEndPoint {

	
	/** The consulta rut linea C heper. */
	@Autowired
	ConsultaPSPrincipalesLineasHerlper consultaPSPrincipalesLineasHerlper;
	
	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.ACCPSPWS.ACCPSPWI.Request.com";
	
	/**
	 * Consulta cliente rut linea C.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ACCPSPWSOperation")
	@ResponsePayload
	public JAXBElement<com.response.accpspwi.accpspws.ProgramInterface> consultaClienteRutLineaC(@RequestPayload com.request.accpspwi.accpspws.ProgramInterface request) throws JAXBException {
		for (com.request.accpspwi.accpspws.ProgramInterface.AccpspwiEntrada.AccpspwiILineas lineasEntrada : request.getAccpspwiEntrada().getAccpspwiILineas()) {
			if(null != lineasEntrada.getAccpspwiIArea() && !lineasEntrada.getAccpspwiIArea().isEmpty()) {
				System.out.println("accpspwi_i_area " + lineasEntrada.getAccpspwiIArea());
				System.out.println("accpspwi_i_num_com " + lineasEntrada.getAccpspwiINumCom());
				System.out.println("accpspwi_i_ini_vi " +lineasEntrada.getAccpspwiIIniVi());
			}
		}
		
		ProgramInterface pInterface = consultaPSPrincipalesLineasHerlper.setResponseConsultaPSPrincipalesLineas();
		com.response.accpspwi.accpspws.ObjectFactory factory = new com.response.accpspwi.accpspws.ObjectFactory();
		return factory.createACCPSPWSOperationResponse(pInterface);
	}
}
