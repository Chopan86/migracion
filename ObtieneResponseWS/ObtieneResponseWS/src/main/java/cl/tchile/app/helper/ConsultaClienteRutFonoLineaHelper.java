package cl.tchile.app.helper;

import cl.tchile.app.constant.Constantes;
import cl.tchile.vo.EndPointDataVO;
import cl.tchile.vo.FonoClienteVO;
import cl.tchile.vo.RutClienteVO;
import com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub;
import com.Request.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_entrada;
import com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class ConsultaClienteRutLineaCHelper.
 */
@Component
public class ConsultaClienteRutFonoLineaHelper {


    /**
     * The general helper.
     */
    @Autowired
    GeneralHelper generalHelper;

    /**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutFonoLineaHelper.class);

    /**
     * Crear salida response.
     *
     * @param response the response
     * @param rut      the rut
     */
    public void crearSalidaResponse(String response, String identificador, String pathGuardado) {
        try {
            String ruta = System.getenv(pathGuardado) + identificador + Constantes.EXTENCION_TXT;
            File file = new File(ruta);
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(response);
            bw.close();
            LOGGER.info("SE CREAR SALIDA PARA EL CLIENTE RUT/FONO: {}", identificador);
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
        List<RutClienteVO> listaRutCliente = new ArrayList<>();
        RutClienteVO rutCliente = null;
        try {
            archivo = new File(System.getenv("RUTA_LECTURA_RUTS"));
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    rutCliente = new RutClienteVO();
                    rutCliente.setRut(linea.substring(0, linea.length() - 1));
                    rutCliente.setDv(linea.substring(linea.length() - 1));
                    listaRutCliente.add(rutCliente);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listaRutCliente;
    }

    /**
     * @return List<FonoClienteVO> List<FonoClienteVO>
     */
    public List<FonoClienteVO> obtenerFonoClientesDesdeFichero() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<FonoClienteVO> fonoClienteVOS = new ArrayList<>();
        FonoClienteVO fonoCliente = null;
        try {
            archivo = new File(System.getenv("RUTA_LECTURA_FONOS"));
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    fonoCliente = new FonoClienteVO();
                    fonoCliente.setArea(linea.substring(2, 4));
                    fonoCliente.setFono(linea.substring(linea.length() - 8));
                    fonoClienteVOS.add(fonoCliente);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return fonoClienteVOS;
    }


}

