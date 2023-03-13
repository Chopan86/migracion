package cl.tchile.app.helper;

import javax.xml.bind.JAXBException;

import org.json.JSONObject;
import org.json.XML;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.response.wspms.apelafac.ProgramInterface;

import cl.tchile.app.util.Constantes;
import cl.tchile.app.vo.ConsultaRecursosAFACVO;

/**
 * The Class ConsultaRecursosAFACHelper.
 */
@Component
public class ConsultaRecursosAFACHelper {
  
	/** The Constant logger. */
    final static Logger logger = LoggerFactory.getLogger(ConsultaRecursosAFACHelper.class);
    
	/**
	 * Sets the response consulta recursos AFAC.
	 *
	 * @param xmlReturn the xml return
	 * @return the com.response.wspms.apelafac. program interface
	 * @throws JAXBException the JAXB exception
	 */
	public com.response.wspms.apelafac.ProgramInterface setResponseConsultaRecursosAFAC(String xmlReturn) throws JAXBException{
		logger.info("RESPONSE RECUPERADO: \n"+xmlReturn);
		com.response.wspms.apelafac.ProgramInterface response = new com.response.wspms.apelafac.ProgramInterface();
		xmlReturn = xmlReturn.replace(Constantes.REEMPLAZO_CABECERA_AFAC, Constantes.S_EMPTY).replace(Constantes.REEMPLAZO_INI_RESPONSE_AFAC, Constantes.S_EMPTY).replace(Constantes.REEMPLAZO_FIN_RESPONSE_AFAC, Constantes.S_EMPTY);
		JSONObject soapDatainJsonObject = XML.toJSONObject(xmlReturn);
		ConsultaRecursosAFACVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), ConsultaRecursosAFACVO.class);
		ProgramInterface.ApelAfacPmsO salida = new ProgramInterface.ApelAfacPmsO();
		salida.setDataout(rBD.getDataout());
		response.setApelAfacPmsO(salida);
		return response;
	}

}
