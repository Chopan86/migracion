package cl.tchile.app.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import cl.tchile.app.constant.Constantes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import cl.tchile.vo.RutClienteVO;

/**
 * The Class ConsultaClienteRutLineaCHelper.
 */
@Component
public class ConsultaClienteRutLineaCHelper {

	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutLineaCHelper.class);
	
    /**
     * Crear salida response.
     *
     * @param response the response
     * @param rut the rut
     */
    public void crearSalidaResponse(String response, String rut) {
   	 try {
            String ruta = System.getenv("RUTA_SALIDA_DATOS")+rut+ Constantes.EXTENCION_TXT;
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(response);
            bw.close();
            LOGGER.info("SE CREAR SALIDA PARA EL CLIENTE RUT : "+rut);
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
    
    
    /**
     * Obtiene rut cliente desde fichero.
     *
     * @return the list
     */
    public List<RutClienteVO> obtieneRutClienteDesdeFichero() {
  	  File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      List<RutClienteVO> listaRutCliente = new ArrayList<RutClienteVO>();
      RutClienteVO rutCliente = null;
      try {
         archivo = new File ("C:/rut.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null) {
        	 rutCliente = new RutClienteVO();
        	 rutCliente.setRut(linea.substring(0, linea.length() - 1));
        	 rutCliente.setDv(linea.substring(linea.length() - 1));
        	 listaRutCliente.add(rutCliente);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
      return listaRutCliente;
    }
}
