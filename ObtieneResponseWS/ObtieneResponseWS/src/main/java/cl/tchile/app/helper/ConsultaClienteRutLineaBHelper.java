package cl.tchile.app.helper;

import cl.tchile.app.constant.Constantes;
import cl.tchile.vo.FonoClienteVO;
import cl.tchile.vo.RutClienteVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class ConsultaClienteRutLineaCHelper.
 */
@Component
public class ConsultaClienteRutLineaBHelper {


    /**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutLineaBHelper.class);

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
            LOGGER.info("SE CREA SALIDA PARA EL CLIENTE : " + identificador);
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
            archivo = new File("C:/fonos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    fonoCliente = new FonoClienteVO();
                    //56 22 835342 6
                    //01 23 456789 10
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

