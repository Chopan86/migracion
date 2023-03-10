/**
 * 
 */
package cl.tchile.app.helper;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.response.awps01wi.awps01ws.ProgramInterface;
import com.response.awps01wi.awps01ws.ProgramInterface.Awps01CoSalida;
import com.response.awps01wi.awps01ws.ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente;
import com.response.awps01wi.awps01ws.ProgramInterface.Awps01CoSalida.Awps01CoOPiCliente.Awps01CoOPiCliente2;

import cl.tchile.app.vo.ConsultaPSPorLineaVO;
import cl.tchile.app.vo.ConsultaPSPorLineaVO.Awps01CoOPiClienteVO;
import cl.tchile.app.vo.ConsultaPSPorLineaVO.Awps01CoOPiClienteVO.Awps01CoSalidaCliente;




/**
 * class ConsultaPsPorLineaHelper
 *
 */
 @Component
public class ConsultaPsPorLineaHelper {
	 
	 
	 public ProgramInterface setResponseConsultaPsPorLinea() throws JAXBException{
		 ProgramInterface pInterface = new ProgramInterface();
//		 String xmlReturn = "";
		 String xmlReturn = "<resp:awps01co_o_cod_ret>000</resp:awps01co_o_cod_ret>\r\n"
		 		+ "            <resp:awps01co_o_desc_cod_ret>PROCESO EXITOSO</resp:awps01co_o_desc_cod_ret>\r\n"
		 		+ "            <resp:awps01co_o_finpaginacion>1</resp:awps01co_o_finpaginacion>\r\n"
		 		+ "            <resp:awps01co_o_numregistros>00</resp:awps01co_o_numregistros>\r\n"
		 		+ "            <resp:awps01co_o_pi_cliente>\r\n"
		 		+ "               <resp:awps01co_o_sec_ps>0101</resp:awps01co_o_sec_ps>\r\n"
		 		+ "               <resp:awps01co_o_cod_ps>1234</resp:awps01co_o_cod_ps>\r\n"		 		
		 		+ "            </resp:awps01co_o_pi_cliente>\r\n"		 		
		 		+ "            <resp:awps01co_o_pi_cliente>\r\n"
		 		+ "               <resp:awps01co_o_sec_ps></resp:awps01co_o_sec_ps>\r\n"
		 		+ "               <resp:awps01co_o_cod_ps></resp:awps01co_o_cod_ps>\r\n"		 		
		 		+ "            </resp:awps01co_o_pi_cliente>\r\n"
		 		+ "            <resp:awps01co_o_plan_minuto>N</resp:awps01co_o_plan_minuto>\r\n";
		 
		Awps01CoSalida salida = new Awps01CoSalida();
		
		xmlReturn = xmlReturn.replace("resp:", "");
		JSONObject soapDatainJsonObject = XML.toJSONObject(xmlReturn);
		ConsultaPSPorLineaVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), ConsultaPSPorLineaVO.class);
		salida.setAwps01CoOCodRet(rBD.getAwps01Co_o_cod_ret());
		salida.setAwps01CoODescCodRet(rBD.getAwps01Co_o_desc_cod_ret());
		salida.setAwps01CoOFinpaginacion(rBD.getAwps01Co_o_finpaginacion());
		salida.setAwps01CoONumregistros(rBD.getAwps01Co_o_numregistros());
		
		List<Awps01CoOPiCliente> listaClientes = new ArrayList<Awps01CoOPiCliente>();
		Awps01CoOPiCliente cliente = null;
		
		for(Awps01CoOPiClienteVO cli : rBD.getAwps01Co_o_pi_cliente()) {
			cliente = new Awps01CoOPiCliente();
			cliente.setAwps01CoOSecPs(cli.getAwps01Co_o_sec_ps());
			cliente.setAwps01CoOCodPs(cli.getAwps01Co_o_cod_ps());
			cliente.setAwps01CoODescPs(cli.getAwps01Co_o_desc_ps());
			cliente.setAwps01CoOCodOp(cli.getAwps01Co_o_cod_op());
			cliente.setAwps01CoODescOp(cli.getAwps01Co_o_desc_op());
			cliente.setAwps01CoOCantPs(cli.getAwps01Co_o_cant_ps());
			cliente.setAwps01CoOTipPs(cli.getAwps01Co_o_tip_ps());
			cliente.setAwps01CoODescTipPs(cli.getAwps01Co_o_desc_tip_ps());
			cliente.setAwps01CoOIndFactPs(cli.getAwps01Co_o_ind_fact_ps());
			cliente.setAwps01CoOEstPs(cli.getAwps01Co_o_est_ps());
			cliente.setAwps01CoOFecAltaPs(cli.getAwps01Co_o_fec_alta_ps());
			cliente.setAwps01CoOFecBajaPs(cli.getAwps01Co_o_fec_baja_ps());
			cliente.setAwps01CoOCodFamilia(cli.getAwps01Co_o_cod_familia());
			cliente.setAwps01CoODescFamilia(cli.getAwps01Co_o_desc_familia());
			cliente.setAwps01CoOValorPs(cli.getAwps01Co_o_valor_ps());
			cliente.setAwps01CoOValorPsRed(cli.getAwps01Co_o_valor_ps_red());
			cliente.setAwps01CoOMoneda(cli.getAwps01Co_o_moneda());
			cliente.setAwps01CoOCodCf(cli.getAwps01Co_o_cod_cf());
			cliente.setAwps01CoOCodConf(cli.getAwps01Co_o_cod_conf());
			cliente.setAwps01CoODescCf(cli.getAwps01Co_o_desc_cf());
			cliente.setAwps01CoOSecPaq(cli.getAwps01Co_o_sec_paq());
			cliente.setAwps01CoOCodPaq(cli.getAwps01Co_o_cod_paq());
			cliente.setAwps01CoONombrePaq(cli.getAwps01Co_o_nombre_paq());
			cliente.setAwps01CoOCodFam(cli.getAwps01Co_o_cod_fam());
			cliente.setAwps01CoODesFam(cli.getAwps01Co_o_des_fam());
			cliente.setAwps01CoOSubg1Cod(cli.getAwps01Co_o_subg1_cod());
			cliente.setAwps01CoODesSubg1(cli.getAwps01Co_o_des_subg1());
			cliente.setAwps01CoOSubg2Cod(cli.getAwps01Co_o_subg2_cod());
			cliente.setAwps01CoODesSubg2(cli.getAwps01Co_o_des_subg2());
			
			cliente.getAwps01CoOPiCliente2();
			List<Awps01CoOPiCliente2> listaClientes2 = new ArrayList<Awps01CoOPiCliente2>();
			Awps01CoOPiCliente2 cliente2 = null;
			
			for(Awps01CoSalidaCliente salCli: cli.getAwps01Co_o_pi_cliente()) {
				cliente2 = new Awps01CoOPiCliente2();
				cliente2.setAwps01CoOSecCar(salCli.getAwps01Co_o_sec_car());
				cliente2.setAwps01CoOCodCar(salCli.getAwps01Co_o_cod_car());
				cliente2.setAwps01CoOCodDom(salCli.getAwps01Co_o_cod_dom());
				cliente2.setAwps01CoOTipDom(salCli.getAwps01Co_o_tip_dom());
				cliente2.setAwps01CoOValorDom(salCli.getAwps01Co_o_valor_dom());
				listaClientes2.add(cliente2);
			}
			cliente.setAwps01CoOPiCliente2(listaClientes2);

			listaClientes.add(cliente);			
		}
		
		salida.getAwps01CoOPiCliente().addAll(listaClientes);
		salida.setAwps01CoOPlanMinuto(rBD.getAwps01Co_o_plan_minuto());
		
		pInterface.setAwps01CoSalida(salida);
		return pInterface;
	 }
}
