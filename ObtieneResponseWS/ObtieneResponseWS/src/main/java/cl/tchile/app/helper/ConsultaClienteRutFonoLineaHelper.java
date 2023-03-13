package cl.tchile.app.helper;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.vo.ClienteVO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
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
    public List<ClienteVO> obtieneRutClienteDesdeFichero() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<ClienteVO> clienteVOList = new ArrayList<>();
        ClienteVO clienteVO = null;
        try {
            archivo = new File(ConstantesRutas.LECTURARUTS);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    clienteVO = new ClienteVO("","","","");
                    clienteVO.setRut(linea.substring(0, linea.length() - 1));
                    clienteVO.setDv(linea.substring(linea.length() - 1));
                    clienteVOList.add(clienteVO);
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

        return clienteVOList;
    }

    public List<ClienteVO> obtenerDatosDesdeExcel(String filePath){
        List<ClienteVO> clienteVOList = new ArrayList<>();
        try {
            Workbook workbook = WorkbookFactory.create(new File(filePath));
            Sheet sheet = workbook.getSheetAt(0); // assuming first sheet
            boolean isFirstRow = true;
            for (Row row : sheet) {
                if (isFirstRow){
                    isFirstRow = false;
                    continue;
                }
                // Cada fila es una celda del excel
                String FP_LINC_AREA = row.getCell(0).getStringCellValue();
                String FP_LINC_NUM_COM = row.getCell(1).getStringCellValue();
                String FP_LINC_FEC_INI_VI = row.getCell(2).getStringCellValue();
                String FP_LINC_FEC_FIN_VI = row.getCell(3).getStringCellValue();
                String FP_LINC_IND_FACT = row.getCell(4).getStringCellValue();
                ClienteVO clienteVO = new ClienteVO(FP_LINC_AREA, FP_LINC_NUM_COM, FP_LINC_FEC_INI_VI, "", "", "", "");
                clienteVOList.add(clienteVO);
            }
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
        return clienteVOList;
    }

    /**
     * @return List<ClienteVO> List<ClienteVO>
     */
    public List<ClienteVO> obtenerDatosDesdeFichero() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<ClienteVO> clienteVOList = new ArrayList<>();
        ClienteVO clienteVO = null;
        try {
            archivo = new File(ConstantesRutas.LECTURAFONOS);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    clienteVO = new ClienteVO("","","","","","","");
                    if(linea.contains("|")){
                        String[] partes = separarColumnasDeDatos(linea);
                        clienteVO.setInicioVigencia(partes[1]);
                    }
                    clienteVO.setArea(linea.substring(2, 4));
                    clienteVO.setFono(linea.substring(linea.length() - 8));
                    clienteVO.setIdFono(linea.substring(2));
                    clienteVOList.add(clienteVO);
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

        return clienteVOList;
    }

    public String[] separarColumnasDeDatos(String linea){
        String [] result = linea.split("\\|");
        return result;
    }


}

