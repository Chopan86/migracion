package cl.tchile.app.main.delegate;

import java.io.StringWriter;
import java.net.URL;
import java.util.List;

import javax.xml.bind.JAXB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.tch.unifica.fe.services.consultaclienterutlineac.AWLC02WSHTTPSoapBindingStub;
import cl.tch.unifica.fe.services.consultaclienterutlineac.ProgramInterfaceAwlc02Wi_entrada;
import cl.tch.unifica.fe.services.consultaclienterutlineac.ProgramInterfaceAwlc02Wo_salida;
import cl.tchile.app.constant.Constantes;
import cl.tchile.app.helper.ConsultaClienteRutLineaCHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.vo.RutClienteVO;

/**
 * The Class ConsultaClienteRutLineaCDelegate.
 */
@Component
public class ConsultaClienteRutLineaCDelegate {
	
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutLineaCDelegate.class);

	/** The general helper. */
	@Autowired
	GeneralHelper generalHelper;
	
	/** The general helper. */
	@Autowired
	ConsultaClienteRutLineaCHelper consultaClienteRutLineaCHelper;
	
    /**
     * Consulta cliente rut linea C impl.
     */
    public void consultaClienteRutLineaCImpl() {
    	  LOGGER.info("******** INICIO PROCESO ********");
    	  List<RutClienteVO> listaRutClientes = consultaClienteRutLineaCHelper.obtieneRutClienteDesdeFichero();
    	  for (RutClienteVO rutClienteVO : listaRutClientes) {
         	 callConsultaClienteRutLinaC(rutClienteVO.getRut(), rutClienteVO.getDv());
		}
    }
    
    
    /**
     * Call consulta cliente rut lina C.
     *
     * @param rut the rut
     * @param dv the dv
     */
    @SuppressWarnings("rawtypes")
	public void callConsultaClienteRutLinaC(String rut,String dv) {
    	try {
    		ProgramInterfaceAwlc02Wo_salida salida = null;
    		ProgramInterfaceAwlc02Wi_entrada entrada = new ProgramInterfaceAwlc02Wi_entrada();
    		entrada.setAwlc02Wi_i_area("");	
    		entrada.setAwlc02Wi_i_num_com("");
    		entrada.setAwlc02Wi_i_rut(generalHelper.rellenarCadenaPorIzquierda(rut,12,Constantes.cCOD_ZERO));
    		entrada.setAwlc02Wi_i_dv(dv);
    		entrada.setAwlc02Wi_i_criterio(Constantes.sCOD_ONE);
			URL endpointURL = new URL("http://esb0.ctc.cl:8082/services/consultaClienteRutLineaC");
			String timeOut = "15000";
			String servlocator = "cl.tch.unifica.fe.services.consultaclienterutlineac.AWLC02WSServiceLocator";
			Class servicelocator = Class.forName(servlocator);			   
			org.apache.axis.client.Service service = (org.apache.axis.client.Service)servicelocator.newInstance();
			AWLC02WSHTTPSoapBindingStub stub = new AWLC02WSHTTPSoapBindingStub(endpointURL,service);
			stub.setTimeout(Integer.valueOf(timeOut));
			salida = stub.AWLC02WSOperation(entrada);
			StringWriter sw = new StringWriter();
			JAXB.marshal(salida, sw);
			String xmlString = sw.toString();
			consultaClienteRutLineaCHelper.crearSalidaResponse(xmlString,  rut + "-"+dv);
		} catch (Exception e) {
		}
    }

}
