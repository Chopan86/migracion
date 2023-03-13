/**
 * 
 */
package cl.tchile.app.helper;

import javax.xml.bind.JAXBException;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.response.wspms.apelafac.ProgramInterface;
import com.response.wspms.apelafac.ProgramInterface.ApelAfacPmsO;

import cl.tchile.app.vo.ConsultaRecursosAFACResponseVO;

/**
 * ConsultaRecursosAFACHelper
 *
 */
@Component
public class ConsultaRecursosAFACHelper {
	
	/**
	 * 
	 * @return
	 * @throws JAXBException
	 */
	public ProgramInterface setResponseConsultaRecursosAFAC() throws JAXBException{
		String xmlR ="<resp:dataout>34025106252101SAN FELIPE          05060000000000000009  00  07097     H10097 010400PROCESO EXITOSO</resp:dataout>\r\n"
				+ "";
		ProgramInterface pInterface = new ProgramInterface();
		ApelAfacPmsO salida = new ApelAfacPmsO();
		try {
			xmlR = xmlR.replace("resp:", "");
			JSONObject soapDatainJsonObject = XML.toJSONObject(xmlR);
			ConsultaRecursosAFACResponseVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), ConsultaRecursosAFACResponseVO.class);
			salida.setDataout(rBD.getDataout());
			pInterface.setApelAfacPmsO(salida);
		}catch(Exception e) {
			System.out.println();
		}
		
		
		return pInterface;
	}
}
