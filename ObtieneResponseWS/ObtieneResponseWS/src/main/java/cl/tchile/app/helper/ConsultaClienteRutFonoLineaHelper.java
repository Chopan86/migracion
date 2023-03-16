package cl.tchile.app.helper;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.vo.ClienteVO;
import com.Request.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wi;
import com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

    public boolean isExcelErrorCodeExists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public void crearExcelErrorResponse(String excelName) {
        File file = new File("C:/" + excelName);
        if (!file.exists()) {
            // Create a new Workbook object
            XSSFWorkbook workbook = new XSSFWorkbook();
            // Create a new Sheet object
            XSSFSheet sheet = workbook.createSheet("Sheet1");
            // Create a new row and set cell values
            Row row = sheet.createRow(0);
            Cell cell1 = row.createCell(0);
            cell1.setCellValue("awpsl2Wo_cod_ret");

            Cell cell2 = row.createCell(1);
            cell2.setCellValue("awpsl2Wo_cod_db");

            Cell cell3 = row.createCell(2);
            cell3.setCellValue("awpsl2Wo_desc_ret");

            Cell cell4 = row.createCell(3);
            cell4.setCellValue("awpsl2Wi_area");

            Cell cell5 = row.createCell(4);
            cell5.setCellValue("awpsl2Wi_num_com");

            Cell cell6 = row.createCell(5);
            cell6.setCellValue("awpsl2Wi_fec_ini_li");

            Cell cell7 = row.createCell(6);
            cell7.setCellValue("awpsl2Wi_cod_ps");


            // Write the workbook to a file
            try {
                FileOutputStream fileOut = new FileOutputStream("C:/" + excelName);
                workbook.write(fileOut);
                fileOut.close();
                System.out.println("Excel CREADO EXITOSAMENTE");
            } catch (Exception e) {
                System.out.println("Error Al Crear Excel: " + e.getMessage());
            }
        }
    }

    public void crearSalidaResponseErrorCode(ProgramInterfaceAwpsl2Wo salida, ProgramInterfaceAwpsl2Wi entrada,
        String excelName) {

        try {
            // Abrir archivo que existe
            FileInputStream inputStream = new FileInputStream(new File("C:/"+excelName));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            // Get the last row index
            int lastRowIndex = sheet.getLastRowNum();

            // Create a new row and set the values for each column
            Row row = sheet.createRow(lastRowIndex + 1);
            Cell cell1 = row.createCell(0);
            cell1.setCellValue(salida.getAwpsl2Wo_salida().getAwpsl2Wo_cod_ret());
            Cell cell2 = row.createCell(1);
            cell2.setCellValue(salida.getAwpsl2Wo_salida().getAwpsl2Wo_cod_db());
            Cell cell3 = row.createCell(2);
            cell3.setCellValue(salida.getAwpsl2Wo_salida().getAwpsl2Wo_desc_ret());
            Cell cell4 = row.createCell(3);
            cell4.setCellValue(entrada.getAwpsl2Wi_area());
            Cell cell5 = row.createCell(4);
            cell5.setCellValue(entrada.getAwpsl2Wi_num_com());
            Cell cell6 = row.createCell(5);
            cell6.setCellValue(entrada.getAwpsl2Wi_fec_ini_li());
            Cell cell7 = row.createCell(6);
            cell7.setCellValue(entrada.getAwpsl2Wi_cod_ps());


            // Write the changes back to the Excel file
            FileOutputStream outputStream = new FileOutputStream("C:/"+excelName);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Data de error agregada!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
                    clienteVO = new ClienteVO("", "", "", "");
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

    public List<ClienteVO> obtenerDatosDesdeExcel(String filePath, String nameProcess) {
        List<ClienteVO> clienteVOList = new ArrayList<>();
        try {
            Workbook workbook = WorkbookFactory.create(new File(filePath));
            Sheet sheet = workbook.getSheetAt(0); // assuming first sheet
            boolean isFirstRow = true;
            for (Row row : sheet) {
                if (isFirstRow) {
                    isFirstRow = false;
                    continue;
                }
                // Validar que existe mas data, sino salirse del FOR
                if (row.getCell(0) == null || row.getCell(0).getStringCellValue().trim().isEmpty()) {
                    break;
                }
                // Cada fila es una celda del excel
                if (nameProcess.equalsIgnoreCase("consultaPsPorLinea") || nameProcess.equalsIgnoreCase(
                    "consultaListaPsLineaV8")) {
                    String FP_LINC_AREA = row.getCell(0).getStringCellValue();
                    String FP_LINC_NUM_COM = row.getCell(1).getStringCellValue();
                    String FP_LINC_FEC_INI_VI = row.getCell(2).getStringCellValue();
                    String FP_LINC_FEC_FIN_VI = row.getCell(3).getStringCellValue();
                    String FP_LINC_IND_FACT = row.getCell(4).getStringCellValue();
                    ClienteVO clienteVO = new ClienteVO(FP_LINC_AREA, FP_LINC_NUM_COM, FP_LINC_FEC_INI_VI, "", "", "",
                        "");
                    clienteVOList.add(clienteVO);
                }
                if (nameProcess.equalsIgnoreCase("consultaApelAlturas")) {
                    String CIUDAD = row.getCell(0).getStringCellValue();
                    String CODIGO_CALLE = String.valueOf((int) row.getCell(1).getNumericCellValue());
                    String ALTURA = String.valueOf((int) row.getCell(2).getNumericCellValue());
                    ClienteVO clienteVO =
                        new ClienteVO("", "", "", "", "", "", "", CIUDAD, CODIGO_CALLE, ALTURA);
                    clienteVOList.add(clienteVO);
                }

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
                    clienteVO = new ClienteVO("", "", "", "", "", "", "");
                    if (linea.contains("|")) {
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

    public String[] separarColumnasDeDatos(String linea) {
        String[] result = linea.split("\\|");
        return result;
    }

}

