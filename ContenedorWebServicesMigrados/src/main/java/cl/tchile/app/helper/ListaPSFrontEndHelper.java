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
import com.response.awpsl2wi.awpsl2ws.ProgramInterface;
import com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo.Awpsl2WoSalida;

import cl.tchile.app.vo.ListaPSFrontEndResponseVO;
import cl.tchile.app.vo.ListaPSFrontEndResponseVO.Awpsl2WoListaPs;
/**
 * 
 * ListaPSFrontEndHelper
 */
@Component
public class ListaPSFrontEndHelper {
	
	/**
	 * 
	 * @return
	 * @throws JAXBException
	 */
	public ProgramInterface setResponseListaPSFrontEnd() throws JAXBException{
		
		ProgramInterface pInterface = new ProgramInterface();
		String xmlR ="<resp:awpsl2wo_salida>\r\n"
				+ "               <resp:awpsl2wo_cod_ret>000</resp:awpsl2wo_cod_ret>\r\n"
				+ "               <resp:awpsl2wo_desc_ret>PROCESO EXITOSO</resp:awpsl2wo_desc_ret>\r\n"
				+ "               <resp:awpsl2wo_cod_db/>\r\n"
				+ "               <resp:awpsl2wo_parrafo/>\r\n"
				+ "               <resp:awpsl2wo_servicio/>\r\n"
				+ "               <resp:awpsl2wo_finpag>1</resp:awpsl2wo_finpag>\r\n"
				+ "               <resp:awpsl2wo_numreg>3</resp:awpsl2wo_numreg>\r\n"
				+ "            </resp:awpsl2wo_salida>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps>000008876</resp:awpsl2wo_cod_ps>\r\n"
				+ "               <resp:awpsl2wo_desc_ps>ROUTER INTERNET DEDICADO TN</resp:awpsl2wo_desc_ps>\r\n"
				+ "               <resp:awpsl2wo_tip_ps>S</resp:awpsl2wo_tip_ps>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps>2019-09-09</resp:awpsl2wo_fec_alta_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_op>000000479</resp:awpsl2wo_cod_op>\r\n"
				+ "               <resp:awpsl2wo_desc_op>ALTA TNEGOCIO</resp:awpsl2wo_desc_op>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam>03</resp:awpsl2wo_cod_fam>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1>00304</resp:awpsl2wo_cod_sg1>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2>30403</resp:awpsl2wo_cod_sg2>\r\n"
				+ "               <resp:awpsl2wo_marca_ps>0</resp:awpsl2wo_marca_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_isp>02</resp:awpsl2wo_cod_isp>\r\n"
				+ "               <resp:awpsl2wo_des_subg1>OTROS SERVICIOS</resp:awpsl2wo_des_subg1>\r\n"
				+ "               <resp:awpsl2wo_des_subg2>Regularizaciones</resp:awpsl2wo_des_subg2>\r\n"
				+ "               <resp:awpsl2wo_est_ps>VIGENTE</resp:awpsl2wo_est_ps>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>1</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps>000008875</resp:awpsl2wo_cod_ps>\r\n"
				+ "               <resp:awpsl2wo_desc_ps>ACCESO INTERNET DEDICADO TN</resp:awpsl2wo_desc_ps>\r\n"
				+ "               <resp:awpsl2wo_tip_ps>S</resp:awpsl2wo_tip_ps>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps>2021-04-30</resp:awpsl2wo_fec_alta_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_op>000000073</resp:awpsl2wo_cod_op>\r\n"
				+ "               <resp:awpsl2wo_desc_op>ALTA 3</resp:awpsl2wo_desc_op>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam>03</resp:awpsl2wo_cod_fam>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1>00304</resp:awpsl2wo_cod_sg1>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2>30403</resp:awpsl2wo_cod_sg2>\r\n"
				+ "               <resp:awpsl2wo_marca_ps>0</resp:awpsl2wo_marca_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_isp>02</resp:awpsl2wo_cod_isp>\r\n"
				+ "               <resp:awpsl2wo_des_subg1>OTROS SERVICIOS</resp:awpsl2wo_des_subg1>\r\n"
				+ "               <resp:awpsl2wo_des_subg2>Regularizaciones</resp:awpsl2wo_des_subg2>\r\n"
				+ "               <resp:awpsl2wo_est_ps>VIGENTE</resp:awpsl2wo_est_ps>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>31</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps>000000174</resp:awpsl2wo_cod_ps>\r\n"
				+ "               <resp:awpsl2wo_desc_ps>LINEA VIRTUAL OTROS SERVICIOS</resp:awpsl2wo_desc_ps>\r\n"
				+ "               <resp:awpsl2wo_tip_ps>S</resp:awpsl2wo_tip_ps>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps>2019-09-09</resp:awpsl2wo_fec_alta_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_op>000000001</resp:awpsl2wo_cod_op>\r\n"
				+ "               <resp:awpsl2wo_desc_op>ALTA</resp:awpsl2wo_desc_op>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam>03</resp:awpsl2wo_cod_fam>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1>00303</resp:awpsl2wo_cod_sg1>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2>30302</resp:awpsl2wo_cod_sg2>\r\n"
				+ "               <resp:awpsl2wo_marca_ps>0</resp:awpsl2wo_marca_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_isp>01</resp:awpsl2wo_cod_isp>\r\n"
				+ "               <resp:awpsl2wo_des_subg1>MARCAS ESPECIALES</resp:awpsl2wo_des_subg1>\r\n"
				+ "               <resp:awpsl2wo_des_subg2>Blindaje</resp:awpsl2wo_des_subg2>\r\n"
				+ "               <resp:awpsl2wo_est_ps>VIGENTE</resp:awpsl2wo_est_ps>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>1</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "            <resp:awpsl2wo_lista_ps>\r\n"
				+ "               <resp:awpsl2wo_cod_ps/>\r\n"
				+ "               <resp:awpsl2wo_desc_ps/>\r\n"
				+ "               <resp:awpsl2wo_tip_ps/>\r\n"
				+ "               <resp:awpsl2wo_fec_alta_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_op/>\r\n"
				+ "               <resp:awpsl2wo_desc_op/>\r\n"
				+ "               <resp:awpsl2wo_cod_paq/>\r\n"
				+ "               <resp:awpsl2wo_nombre_paq/>\r\n"
				+ "               <resp:awpsl2wo_cod_fam/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg1/>\r\n"
				+ "               <resp:awpsl2wo_cod_sg2/>\r\n"
				+ "               <resp:awpsl2wo_marca_ps/>\r\n"
				+ "               <resp:awpsl2wo_cod_isp/>\r\n"
				+ "               <resp:awpsl2wo_des_subg1/>\r\n"
				+ "               <resp:awpsl2wo_des_subg2/>\r\n"
				+ "               <resp:awpsl2wo_est_ps/>\r\n"
				+ "               <resp:awpsl2wo_cant_ps>0</resp:awpsl2wo_cant_ps>\r\n"
				+ "            </resp:awpsl2wo_lista_ps>\r\n"
				+ "";
		
		Awpsl2WoSalida salida = new Awpsl2WoSalida();
		List<com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs> listaPS = new ArrayList<com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs>();
		try {
			xmlR = xmlR.replace("resp:", "");
			JSONObject soapDatainJsonObject = XML.toJSONObject(xmlR);
			ListaPSFrontEndResponseVO rBD = new Gson().fromJson(soapDatainJsonObject.toString(), ListaPSFrontEndResponseVO.class);
			salida.setAwpsl2WoCodRet(rBD.getAwpsl2wo_salida().getAwpsl2wo_cod_ret());
			salida.setAwpsl2WoDescRet(rBD.getAwpsl2wo_salida().getAwpsl2wo_desc_ret());
			salida.setAwpsl2WoCodDb(rBD.getAwpsl2wo_salida().getAwpsl2wo_cod_db());
			salida.setAwpsl2WoParrafo(rBD.getAwpsl2wo_salida().getAwpsl2wo_parrafo());
			salida.setAwpsl2WoServicio(rBD.getAwpsl2wo_salida().getAwpsl2wo_servicio());
			salida.setAwpsl2WoFinpag(rBD.getAwpsl2wo_salida().getAwpsl2wo_finpag());
			salida.setAwpsl2WoNumreg(rBD.getAwpsl2wo_salida().getAwpsl2wo_numreg());
			
			com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs ps = null;
			for(Awpsl2WoListaPs psList: rBD.getAwpsl2wo_lista_ps()) {
				ps = new com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo.Awpsl2WoListaPs();
				ps.setAwpsl2WoCodPs(psList.getAwpsl2wo_cod_ps());
				ps.setAwpsl2WoDescPs(psList.getAwpsl2wo_desc_ps());
				ps.setAwpsl2WoTipPs(psList.getAwpsl2wo_tip_ps());
				ps.setAwpsl2WoFecAltaPs(psList.getAwpsl2wo_fec_alta_ps());
				ps.setAwpsl2WoCodOp(psList.getAwpsl2wo_cod_op());
				ps.setAwpsl2WoDescOp(psList.getAwpsl2wo_desc_op());
				ps.setAwpsl2WoCodPaq(psList.getAwpsl2wo_cod_paq());
				ps.setAwpsl2WoNombrePaq(psList.getAwpsl2wo_nombre_paq());
				ps.setAwpsl2WoCodFam(psList.getAwpsl2wo_cod_fam());
				ps.setAwpsl2WoCodSg1(psList.getAwpsl2wo_cod_sg1());
				ps.setAwpsl2WoCodSg2(psList.getAwpsl2wo_cod_sg2());
				ps.setAwpsl2WoMarcaPs(psList.getAwpsl2wo_marca_ps());
				ps.setAwpsl2WoCodIsp(psList.getAwpsl2wo_cod_isp());
				ps.setAwpsl2WoDesSubg1(psList.getAwpsl2wo_des_subg1());
				ps.setAwpsl2WoDesSubg2(psList.getAwpsl2wo_des_subg2());
				ps.setAwpsl2WoEstPs(psList.getAwpsl2wo_est_ps());
				ps.setAwpsl2WoCantPs(psList.getAwpsl2wo_cant_ps());
				
				listaPS.add(ps);
			}
			
			com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo contenedorSalida = new com.response.awpsl2wi.awpsl2ws.ProgramInterface.Awpsl2Wo();
			contenedorSalida.setAwpsl2WoSalida(salida);
			contenedorSalida.getAwpsl2WoListaPs().addAll(listaPS);
			pInterface.setAwpsl2Wo(contenedorSalida);
		}catch(Exception e) {
			System.out.println();
		}
		
		return pInterface;
	}
}
