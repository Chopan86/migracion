/**
 * 
 */
package cl.tchile.app.helper;

import javax.xml.bind.JAXBException;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.response.awmlip8i.awliw8co.ProgramInterface;
import com.response.awmlip8i.awliw8co.ProgramInterface.Awlip8CoSalida;

import cl.tchile.app.vo.ListaPsLineaV8ResponseVO;

/**
 * 
 *
 */
@Component
public class ListaPsLineaV8Helper {
	
	public ProgramInterface setResponseListaPsLineaV8() throws JAXBException{
		ProgramInterface pInterface = new ProgramInterface();
//		String xmlR ="";
		String xmlR ="<ns2:awlip8co_o_numregistros>4</ns2:awlip8co_o_numregistros>\r\n"
				+ "<ns2:awlip8co_o_sec_tit>5</ns2:awlip8co_o_sec_tit>";
		Awlip8CoSalida salida = new Awlip8CoSalida();
		try {
			xmlR = xmlR.replace("resp", "");
			JSONObject soapDatainJsonObject = XML.toJSONObject(xmlR);
			ListaPsLineaV8ResponseVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), ListaPsLineaV8ResponseVO.class);
			salida.setAwlip8CoOFinpaginacion(rBD.getAwlip8Co_o_finpaginacion());
			salida.setAwlip8CoONumregistros(rBD.getAwlip8Co_o_numregistros());
			salida.setAwlip8CoONomPag(rBD.getAwlip8Co_o_nom_pag());
			salida.setAwlip8CoOApe1Pag(rBD.getAwlip8Co_o_ape1_pag());
			salida.setAwlip8CoOApe2Pag(rBD.getAwlip8Co_o_ape2_pag());
			salida.setAwlip8CoONomTit(rBD.getAwlip8Co_o_nom_tit());
			salida.setAwlip8CoOApe1Tit(rBD.getAwlip8Co_o_ape1_tit());
			salida.setAwlip8CoOApe2Tit(rBD.getAwlip8Co_o_ape2_tit());
			salida.setAwlip8CoORutTit(rBD.getAwlip8Co_o_rut_tit());
			salida.setAwlip8CoODvfTit(rBD.getAwlip8Co_o_dvf_tit());
			salida.setAwlip8CoOSecTit(rBD.getAwlip8Co_o_sec_tit());
			//continuar
			
			
			salida.setAwlip8CoOCodRet(rBD.getAwlip8Co_o_cod_ret());
			salida.setAwlip8CoODescCodRet(rBD.getAwlip8Co_o_desc_cod_ret());
			pInterface.setAwlip8CoSalida(salida);
		}catch(Exception e) {
			System.out.println();
		}
		return pInterface;
	}
}
