package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.request.wspms.apelafac.ProgramInterface;
import com.response.wspms.apelafac.ObjectFactory;
import com.response.wspms.apelafac.ProgramInterface.ApelAfacPmsO;

import cl.tchile.app.entity.MigradosEntity;
import cl.tchile.app.helper.ConsultaRecursosAFACHelper;
import cl.tchile.app.repository.MigradosRepository;


/**
 * The Class ConsultaRecursosAFACEndpoint.
 */
@Endpoint
public class ConsultaRecursosAFACEndpoint {

	
    /** The Constant logger. */
    final static Logger logger = LoggerFactory.getLogger(ConsultaRecursosAFACEndpoint.class);
    
	/** The Constant NAMESPACE_URI. */
	private static final String NAMESPACE_URI = "http://www.APELAFAC.WSPMS.Request.com";
	
	
	@Autowired
	MigradosRepository repositorio;
	
	@Autowired
	ConsultaRecursosAFACHelper helper;
	
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
		logger.info("Dato entrada: "+ request.getApelAfacPmsI().getDatain());
		MigradosEntity entity = repositorio.SelectByLinea(request.getApelAfacPmsI().getDatain());
		com.response.wspms.apelafac.ProgramInterface response = helper.setResponseConsultaRecursosAFAC(entity.getResponse());
		ObjectFactory factory = new ObjectFactory();
		return factory.createAPELAFACOperationResponse(response);
	}
}
