package cl.tchile.app.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.telefonica.midrange.queryproductservice.types.ObjectFactory;
import com.telefonica.midrange.queryproductservice.types.QueryproductRequest;
import com.telefonica.midrange.queryproductservice.types.QueryproductResponse;
import com.telefonica.midrange.queryproductservice.types.ResponseMsj;

import cl.tchile.app.helper.ConsultaRutLineaCHelper;

/**
 * The Class QueryProductEndPoint.
 */
@Endpoint
public class QueryProductEndPoint {

	
	/** The consulta rut linea C heper. */
	@Autowired
	ConsultaRutLineaCHelper consultaRutLineaCHeper;
	
	/** The Constant NAMESPACE_URI_CONSULTA_CLIENTE_RUT_LINEA_C. */
	private static final String NAMESPACE_URI = "http://midrange.telefonica.com/queryproductService/types";
	
	/**
	 * Consulta cliente rut linea C.
	 *
	 * @param request the request
	 * @return the JAXB element
	 * @throws JAXBException the JAXB exception
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultaQueryProductMsgRequest")
	@ResponsePayload
	public JAXBElement<QueryproductResponse> consultaClienteRutLineaC(@RequestPayload QueryproductRequest request) throws JAXBException {
		QueryproductResponse response = new QueryproductResponse();
		ResponseMsj msj = new ResponseMsj();
		msj.setCodError("000");
		msj.setMsgError("PROCESO EXITOSO");
		response.setResponseMsj(msj);
		ObjectFactory factory = new ObjectFactory();
		return factory.createConsultaQueryProductMsgResponse(response);
	}
	
	
}
