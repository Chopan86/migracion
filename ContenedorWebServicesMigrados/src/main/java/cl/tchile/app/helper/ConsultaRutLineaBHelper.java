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
import com.response.awlc01wi.awlc01ws.ProgramInterface;
import com.response.awlc01wi.awlc01ws.ProgramInterface.Awlc01Z3Salida;
import com.response.awlc01wi.awlc01ws.ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas;
import com.response.awlc01wi.awlc01ws.ProgramInterface.Awlc01Z3Salida.Awlc01Z3OLineas.Awlc01Z3ODireccionCob;

import cl.tchile.app.vo.ConsultaLineaRutResponseVO;
import cl.tchile.app.vo.ConsultaLineaRutResponseVO.Awlc01Z3OLineasVO;
import cl.tchile.app.vo.ConsultaLineaRutResponseVO.Awlc01Z3OLineasVO.Awlc01Z3ODireccionCobVO;


/**
 * class ConsultaRutLineaBHelper
 *
 */
 @Component
public class ConsultaRutLineaBHelper {
	 
	 
	 public ProgramInterface setResponseConsultaRutLinea() throws JAXBException{
		 ProgramInterface pInterface = new ProgramInterface();
//		 String xmlReturn = "";
		 String xmlReturn = "<resp:awlc01z3_o_cod_ret>000</resp:awlc01z3_o_cod_ret>\r\n"
		 		+ "            <resp:awlc01z3_o_desc_cod_ret>PROCESO EXITOSO</resp:awlc01z3_o_desc_cod_ret>\r\n"
		 		+ "            <resp:awlc01z3_o_sqlcode>0</resp:awlc01z3_o_sqlcode>\r\n"
		 		+ "            <resp:awlc01z3_o_parrafo/>\r\n"
		 		+ "            <resp:awlc01z3_o_finpaginacion>0</resp:awlc01z3_o_finpaginacion>\r\n"
		 		+ "            <resp:awlc01z3_o_numregistros>1</resp:awlc01z3_o_numregistros>\r\n"
		 		+ "            <resp:awlc01z3_o_nom_pag>FRANCISCO JESUS     ACOSTA</resp:awlc01z3_o_nom_pag>\r\n"
		 		+ "            <resp:awlc01z3_o_ape1_pag/>\r\n"
		 		+ "            <resp:awlc01z3_o_ape2_pag/>\r\n"
		 		+ "            <resp:awlc01z3_o_nom_tit>FRANCISCO JESUS     ACOSTA</resp:awlc01z3_o_nom_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_ape1_tit/>\r\n"
		 		+ "            <resp:awlc01z3_o_ape2_tit/>\r\n"
		 		+ "            <resp:awlc01z3_o_rut_tit>000017579204</resp:awlc01z3_o_rut_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_dvf_tit>K</resp:awlc01z3_o_dvf_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_sec_tit>612862414</resp:awlc01z3_o_sec_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_raz_soc>FRANCISCO JESUS     ACOSTA              MENDEZ</resp:awlc01z3_o_raz_soc>\r\n"
		 		+ "            <resp:awlc01z3_o_nom_fan>FRANCISCO JESUS     ACOSTA</resp:awlc01z3_o_nom_fan>\r\n"
		 		+ "            <resp:awlc01z3_o_cod_giro/>\r\n"
		 		+ "            <resp:awlc01z3_o_tipo_clie>4</resp:awlc01z3_o_tipo_clie>\r\n"
		 		+ "            <resp:awlc01z3_o_tipo_seg/>\r\n"
		 		+ "            <resp:awlc01z3_o_desc_tipo_clie>CLI NO DEFINIDO</resp:awlc01z3_o_desc_tipo_clie>\r\n"
		 		+ "            <resp:awlc01z3_o_cod_seg>4</resp:awlc01z3_o_cod_seg>\r\n"
		 		+ "            <resp:awlc01z3_o_desc_seg>RESIDENCIAL</resp:awlc01z3_o_desc_seg>\r\n"
		 		+ "            <resp:awlc01z3_o_cod_sub_seg>232</resp:awlc01z3_o_cod_sub_seg>\r\n"
		 		+ "            <resp:awlc01z3_o_desc_sub_seg>CLIENTE TOTALIZADO</resp:awlc01z3_o_desc_sub_seg>\r\n"
		 		+ "            <resp:awlc01z3_o_mail_cliente>FJACOSTA@VC.CL</resp:awlc01z3_o_mail_cliente>\r\n"
		 		+ "            <resp:awlc01z3_o_fecha_alt_clte>2016-07-29</resp:awlc01z3_o_fecha_alt_clte>\r\n"
		 		+ "            <resp:awlc01z3_o_area_fax/>\r\n"
		 		+ "            <resp:awlc01z3_o_num_fax/>\r\n"
		 		+ "            <resp:awlc01z3_o_num_celula/>\r\n"
		 		+ "            <resp:awlc01z3_o_pag_web/>\r\n"
		 		+ "            <resp:awlc01z3_o_calle_tit>SIN INFORMACION</resp:awlc01z3_o_calle_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_num_tit>0</resp:awlc01z3_o_num_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_piso_tit/>\r\n"
		 		+ "            <resp:awlc01z3_o_dpto_tit/>\r\n"
		 		+ "            <resp:awlc01z3_o_desc_comun_tit>NO DISPONIBLE</resp:awlc01z3_o_desc_comun_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_desc_ciuda_tit>SIN INFORM</resp:awlc01z3_o_desc_ciuda_tit>\r\n"
		 		+ "            <resp:awlc01z3_o_lineas>\r\n"
		 		+ "               <resp:awlc01z3_o_area>002</resp:awlc01z3_o_area>\r\n"
		 		+ "               <resp:awlc01z3_o_fono>22132712</resp:awlc01z3_o_fono>\r\n"
		 		+ "               <resp:awlc01z3_o_sec_linea>491647643266</resp:awlc01z3_o_sec_linea>\r\n"
		 		+ "               <resp:awlc01z3_o_calle_inst>FRAY CAMILO HENRIQUEZ</resp:awlc01z3_o_calle_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_num_inst>440</resp:awlc01z3_o_num_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_piso_inst>18</resp:awlc01z3_o_piso_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_dpto_inst>1810</resp:awlc01z3_o_dpto_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_cod_post_inst>8330263</resp:awlc01z3_o_cod_post_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_cod_comun>892</resp:awlc01z3_o_cod_comun>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_comun_inst>SANTIAGO</resp:awlc01z3_o_desc_comun_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_ciuda_inst>SANTIAGO</resp:awlc01z3_o_ciuda_inst>\r\n"
		 		+ "               <resp:awlc01z3_o_zona>09</resp:awlc01z3_o_zona>\r\n"
		 		+ "               <resp:awlc01z3_o_central>01</resp:awlc01z3_o_central>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_zona_cent>*ACCESO  AUTORIZADO*</resp:awlc01z3_o_desc_zona_cent>\r\n"
		 		+ "               <resp:awlc01z3_o_pta_comercial>0939</resp:awlc01z3_o_pta_comercial>\r\n"
		 		+ "               <resp:awlc01z3_o_fec_instalacion>2017-04-28</resp:awlc01z3_o_fec_instalacion>\r\n"
		 		+ "               <resp:awlc01z3_o_tipo_linea>8</resp:awlc01z3_o_tipo_linea>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_tipo_linea>TOIP</resp:awlc01z3_o_desc_tipo_linea>\r\n"
		 		+ "               <resp:awlc01z3_o_ind_fact/>\r\n"
		 		+ "               <resp:awlc01z3_o_ind_pagadora>1</resp:awlc01z3_o_ind_pagadora>\r\n"
		 		+ "               <resp:awlc01z3_o_est_linea>CESADO</resp:awlc01z3_o_est_linea>\r\n"
		 		+ "               <resp:awlc01z3_o_cod_agencia>M000</resp:awlc01z3_o_cod_agencia>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_agencia>AG  CENTRO</resp:awlc01z3_o_desc_agencia>\r\n"
		 		+ "               <resp:awlc01z3_o_fec_alta_li>2017-04-28</resp:awlc01z3_o_fec_alta_li>\r\n"
		 		+ "               <resp:awlc01z3_o_fec_fin_vi>9999-01-01</resp:awlc01z3_o_fec_fin_vi>\r\n"
		 		+ "               <resp:awlc01z3_o_clie>612862414</resp:awlc01z3_o_clie>\r\n"
		 		+ "               <resp:awlc01z3_o_num_cuen>1</resp:awlc01z3_o_num_cuen>\r\n"
		 		+ "               <resp:awlc01z3_o_direccion_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_calle_cob>FRAY CAMILO HENRIQUEZ</resp:awlc01z3_o_calle_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_num_cob>440</resp:awlc01z3_o_num_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_dpto_cob>1810</resp:awlc01z3_o_dpto_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_post_cob>8330263</resp:awlc01z3_o_post_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_cod_comun_cob>892</resp:awlc01z3_o_cod_comun_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_desc_comun_cob>SANTIAGO</resp:awlc01z3_o_desc_comun_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_ciuda_cob>SANTIAGO</resp:awlc01z3_o_ciuda_cob>\r\n"
		 		+ "               </resp:awlc01z3_o_direccion_cob>\r\n"
		 		+ "            </resp:awlc01z3_o_lineas>\r\n"
		 		+ "            <resp:awlc01z3_o_lineas>\r\n"
		 		+ "               <resp:awlc01z3_o_area/>\r\n"
		 		+ "               <resp:awlc01z3_o_fono/>\r\n"
		 		+ "               <resp:awlc01z3_o_sec_linea>000000000000</resp:awlc01z3_o_sec_linea>\r\n"
		 		+ "               <resp:awlc01z3_o_calle_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_num_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_piso_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_dpto_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_cod_post_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_cod_comun/>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_comun_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_ciuda_inst/>\r\n"
		 		+ "               <resp:awlc01z3_o_zona/>\r\n"
		 		+ "               <resp:awlc01z3_o_central/>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_zona_cent/>\r\n"
		 		+ "               <resp:awlc01z3_o_pta_comercial/>\r\n"
		 		+ "               <resp:awlc01z3_o_fec_instalacion/>\r\n"
		 		+ "               <resp:awlc01z3_o_tipo_linea/>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_tipo_linea/>\r\n"
		 		+ "               <resp:awlc01z3_o_ind_fact/>\r\n"
		 		+ "               <resp:awlc01z3_o_ind_pagadora/>\r\n"
		 		+ "               <resp:awlc01z3_o_est_linea/>\r\n"
		 		+ "               <resp:awlc01z3_o_cod_agencia/>\r\n"
		 		+ "               <resp:awlc01z3_o_desc_agencia/>\r\n"
		 		+ "               <resp:awlc01z3_o_fec_alta_li/>\r\n"
		 		+ "               <resp:awlc01z3_o_fec_fin_vi/>\r\n"
		 		+ "               <resp:awlc01z3_o_clie>0</resp:awlc01z3_o_clie>\r\n"
		 		+ "               <resp:awlc01z3_o_num_cuen>0</resp:awlc01z3_o_num_cuen>\r\n"
		 		+ "               <resp:awlc01z3_o_direccion_cob>\r\n"
		 		+ "                  <resp:awlc01z3_o_calle_cob/>\r\n"
		 		+ "                  <resp:awlc01z3_o_num_cob/>\r\n"
		 		+ "                  <resp:awlc01z3_o_dpto_cob/>\r\n"
		 		+ "                  <resp:awlc01z3_o_post_cob/>\r\n"
		 		+ "                  <resp:awlc01z3_o_cod_comun_cob/>\r\n"
		 		+ "                  <resp:awlc01z3_o_desc_comun_cob/>\r\n"
		 		+ "                  <resp:awlc01z3_o_ciuda_cob/>\r\n"
		 		+ "               </resp:awlc01z3_o_direccion_cob>\r\n"
		 		+ "            </resp:awlc01z3_o_lineas>";
		 
		 Awlc01Z3Salida salida = new Awlc01Z3Salida();
		 xmlReturn = xmlReturn.replace("resp:", "");
		 JSONObject soapDatainJsonObject = XML.toJSONObject(xmlReturn);
		 
		 ConsultaLineaRutResponseVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), ConsultaLineaRutResponseVO.class);
		 
		 salida.setAwlc01Z3OCodRet(rBD.getAwlc01Z3_o_cod_ret());
		 salida.setAwlc01Z3ODescCodRet(rBD.getAwlc01Z3_o_desc_cod_ret());
		 salida.setAwlc01Z3OSqlcode(rBD.getAwlc01Z3_o_sqlcode());
		 salida.setAwlc01Z3OParrafo(rBD.getAwlc01Z3_o_parrafo());
		 salida.setAwlc01Z3OFinpaginacion(rBD.getAwlc01Z3_o_finpaginacion());
		 salida.setAwlc01Z3ONumregistros(rBD.getAwlc01Z3_o_numregistros());
		 salida.setAwlc01Z3ONomPag(rBD.getAwlc01Z3_o_nom_pag());
		 salida.setAwlc01Z3OApe1Pag(rBD.getAwlc01Z3_o_ape1_pag());
		 salida.setAwlc01Z3OApe2Pag(rBD.getAwlc01Z3_o_ape2_pag());
		 salida.setAwlc01Z3ONomTit(rBD.getAwlc01Z3_o_nom_tit());
		 salida.setAwlc01Z3OApe1Tit(rBD.getAwlc01Z3_o_ape1_tit());
		 salida.setAwlc01Z3OApe2Tit(rBD.getAwlc01Z3_o_ape2_tit());		 
		 salida.setAwlc01Z3ORutTit(rBD.getAwlc01Z3_o_rut_tit());
		 salida.setAwlc01Z3ODvfTit(rBD.getAwlc01Z3_o_dvf_tit());
		 salida.setAwlc01Z3OSecTit(rBD.getAwlc01Z3_o_sec_tit());
		 salida.setAwlc01Z3ORazSoc(rBD.getAwlc01Z3_o_raz_soc());
		 salida.setAwlc01Z3ONomFan(rBD.getAwlc01Z3_o_nom_fan());
		 salida.setAwlc01Z3OCodGiro(rBD.getAwlc01Z3_o_cod_giro());		 
		 salida.setAwlc01Z3OTipoClie(rBD.getAwlc01Z3_o_tipo_clie());
		 salida.setAwlc01Z3OTipoSeg(rBD.getAwlc01Z3_o_tipo_seg());		 
		 salida.setAwlc01Z3ODescTipoClie(rBD.getAwlc01Z3_o_desc_tipo_clie());
		 salida.setAwlc01Z3OCodSeg(rBD.getAwlc01Z3_o_cod_seg());
		 salida.setAwlc01Z3ODescSeg(rBD.getAwlc01Z3_o_desc_seg());
		 salida.setAwlc01Z3OCodSubSeg(rBD.getAwlc01Z3_o_cod_sub_seg());
		 salida.setAwlc01Z3ODescSubSeg(rBD.getAwlc01Z3_o_desc_sub_seg());
		 salida.setAwlc01Z3OMailCliente(rBD.getAwlc01Z3_o_mail_cliente());
		 salida.setAwlc01Z3OFechaAltClte(rBD.getAwlc01Z3_o_fecha_alt_clte());		 
		 salida.setAwlc01Z3OAreaFax(rBD.getAwlc01Z3_o_area_fax());
		 salida.setAwlc01Z3ONumFax(rBD.getAwlc01Z3_o_num_fax());
		 salida.setAwlc01Z3ONumCelula(rBD.getAwlc01Z3_o_num_celula());
		 salida.setAwlc01Z3OPagWeb(rBD.getAwlc01Z3_o_pag_web());	 
		 salida.setAwlc01Z3OCalleTit(rBD.getAwlc01Z3_o_calle_tit());
		 salida.setAwlc01Z3ONumTit(rBD.getAwlc01Z3_o_num_tit());
		 salida.setAwlc01Z3OPisoTit(rBD.getAwlc01Z3_o_piso_tit());	 
		 salida.setAwlc01Z3ODptoTit(rBD.getAwlc01Z3_o_dpto_tit());
		 salida.setAwlc01Z3ODescComunTit(rBD.getAwlc01Z3_o_desc_comun_tit());
		 salida.setAwlc01Z3ODescCiudaTit(rBD.getAwlc01Z3_o_desc_ciuda_tit());
		 
		 List<Awlc01Z3OLineas> listaLineasCliente = new ArrayList<Awlc01Z3OLineas>();
		 Awlc01Z3OLineas lClie = null;
		 if(null != rBD.getAwlc01Z3_o_lineas()) {
			 for(Awlc01Z3OLineasVO linea: rBD.getAwlc01Z3_o_lineas()) {
				 lClie = new Awlc01Z3OLineas();
				 lClie.setAwlc01Z3OArea(linea.getAwlc01Z3_o_area());
				 lClie.setAwlc01Z3OFono(linea.getAwlc01Z3_o_fono());
				 lClie.setAwlc01Z3OSecLinea(linea.getAwlc01Z3_o_sec_linea());
				 lClie.setAwlc01Z3OCalleInst(linea.getAwlc01Z3_o_calle_inst());
				 lClie.setAwlc01Z3ONumInst(linea.getAwlc01Z3_o_num_inst());
				 lClie.setAwlc01Z3OPisoInst(linea.getAwlc01Z3_o_piso_inst());
				 lClie.setAwlc01Z3OCodComun(linea.getAwlc01Z3_o_cod_comun());
				 lClie.setAwlc01Z3ODescComunInst(linea.getAwlc01Z3_o_desc_comun_inst());
				 lClie.setAwlc01Z3OZona(linea.getAwlc01Z3_o_zona());
				 lClie.setAwlc01Z3OCentral(linea.getAwlc01Z3_o_central());
				 lClie.setAwlc01Z3ODescZonaCent(linea.getAwlc01Z3_o_desc_zona_cent());
				 lClie.setAwlc01Z3OPtaComercial(linea.getAwlc01Z3_o_pta_comercial());
				 lClie.setAwlc01Z3OFecInstalacion(linea.getAwlc01Z3_o_fec_instalacion());
				 lClie.setAwlc01Z3OTipoLinea(linea.getAwlc01Z3_o_tipo_linea());
				 lClie.setAwlc01Z3ODescTipoLinea(linea.getAwlc01Z3_o_desc_tipo_linea());
				 lClie.setAwlc01Z3OIndPagadora(linea.getAwlc01Z3_o_ind_pagadora());
				 lClie.setAwlc01Z3OEstLinea(linea.getAwlc01Z3_o_est_linea());
				 lClie.setAwlc01Z3OCodAgencia(linea.getAwlc01Z3_o_cod_agencia());
				 lClie.setAwlc01Z3ODescAgencia(linea.getAwlc01Z3_o_desc_agencia());
				 lClie.setAwlc01Z3OFecAltaLi(linea.getAwlc01Z3_o_fec_alta_li());
				 lClie.setAwlc01Z3OFecFinVi(linea.getAwlc01Z3_o_fec_fin_vi());
				 lClie.setAwlc01Z3OClie(linea.getAwlc01Z3_o_clie());
				 lClie.setAwlc01Z3ONumCuen(linea.getAwlc01Z3_o_num_cuen());
				 
				 
				 Awlc01Z3ODireccionCob dirCobLineaCli = new Awlc01Z3ODireccionCob();
				 Awlc01Z3ODireccionCobVO dirCobVO = linea.getAwlc01Z3_o_direccion_cob();		 
				 if(null != dirCobVO) {
					 dirCobLineaCli.setAwlc01Z3OCalleCob(dirCobVO.getAwlc01Z3_o_calle_cob());
					 dirCobLineaCli.setAwlc01Z3ONumCob(dirCobVO.getAwlc01Z3_o_num_cob());
					 dirCobLineaCli.setAwlc01Z3ODptoCob(dirCobVO.getAwlc01Z3_o_dpto_cob());
					 dirCobLineaCli.setAwlc01Z3OPostCob(dirCobVO.getAwlc01Z3_o_post_cob());
					 dirCobLineaCli.setAwlc01Z3OCodComunCob(dirCobVO.getAwlc01Z3_o_cod_comun_cob());
					 dirCobLineaCli.setAwlc01Z3ODescComunCob(dirCobVO.getAwlc01Z3_o_desc_comun_cob());
					 dirCobLineaCli.setAwlc01Z3OCiudaCob(dirCobVO.getAwlc01Z3_o_ciuda_cob());
				 } 
				 
				 lClie.setAwlc01Z3ODireccionCob(dirCobLineaCli);
				 
				 listaLineasCliente.add(lClie);
			 }
		 }
		 
		 salida.getAwlc01Z3OLineas().addAll(listaLineasCliente);
		 pInterface.setAwlc01Z3Salida(salida);
		 return pInterface;
	 }
}
