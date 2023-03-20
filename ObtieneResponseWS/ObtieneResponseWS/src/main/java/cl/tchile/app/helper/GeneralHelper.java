package cl.tchile.app.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.tchile.app.bot.RestTemplateTelegramBot;
import cl.tchile.app.constant.Constantes;
import cl.tchile.vo.ClienteVO;

/**
 * The Class GeneralHelper.
 */
@Component
public class GeneralHelper {

    /**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(GeneralHelper.class);

    private final RestTemplateTelegramBot restTemplateTelegramBot;

    @Autowired
    public GeneralHelper(RestTemplateTelegramBot restTemplateTelegramBot) {
        this.restTemplateTelegramBot = restTemplateTelegramBot;
    }

    /**
     * Rellenar cadena por izquierda.
     *
     * @param cadena     the cadena
     * @param nuevoLargo the nuevo largo
     * @param relleno    the relleno
     * @return the string
     */
    public String rellenarCadenaPorIzquierda(String cadena, int nuevoLargo, char relleno) {
        LOGGER.info("RELLENAR CADENA POR IZQUIERDA");

        if (cadena.isEmpty())
            return "";
        StringBuilder result = new StringBuilder(cadena);
        int numDigActual = result.length();
        if (numDigActual > 0) {
            int numDigFaltantes = nuevoLargo - numDigActual;
            while (numDigFaltantes > 0) {
                result.insert(0, relleno);
                numDigFaltantes--;
            }
        }
        return result.toString();
    }

    public List<ClienteVO> obtieneLineasORutsErroresTxt(String pathBusquedaError) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        List<ClienteVO> clienteVOList = new ArrayList<>();
        ClienteVO clienteVO = null;
        try {
            archivo = new File(pathBusquedaError);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    String lineas[] = linea.split("\\|");
                    clienteVO = new ClienteVO("", "", "", "", "", "", "");
                    clienteVO.setArea(lineas[0].substring(0, 2));
                    clienteVO.setFono(lineas[0].trim().substring(lineas[0].trim().length() - 8));

                    clienteVO.setFono(formatearFono(clienteVO.getArea(), clienteVO.getFono()));
                    clienteVO.setArea(formatearAreaFono(clienteVO.getArea()));

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

    public String validarFonoCompleto(String area, String fono) {
        if (Boolean.FALSE.equals(validarArea2Fono(area))) {
            fono = fono.substring(1);
        }
        return fono;
    }

    public String formatearFono(String area, String fono) {
        if (area.isEmpty()) {
            return fono;
        }
        fono = validarFonoCompleto(area, fono);
        fono = rellenarCadenaPorIzquierda(fono, 8, Constantes.cCOD_ZERO);
        return fono;
    }

    public Boolean validarArea2Fono(String area) {
        if (!area.substring(0, 1).equalsIgnoreCase("2"))
            return false;
        return true;
    }

    public String validarAreaFono(String area) {
        Boolean isArea2Fono = validarArea2Fono(area);
        if (Boolean.FALSE.equals(isArea2Fono))
            return area;
        return "2";
    }

    public String formatearAreaFono(String area) {
        if (area.isEmpty()) {
            return area;
        }
        area = validarAreaFono(area);
        area = rellenarCadenaPorIzquierda(area, 3, Constantes.cCOD_ZERO);
        return area;
    }

    private int ultimoPorcentaje = -10;
    public String progressPercent(int actual, int total, String endPoint) throws Exception {
        String progreso = "";
        progreso += endPoint +" |Progreso " + actual + " / " + total + " - %";
        Float porcentajeTotal = ((float) actual) / ((float) total) * 100;
        progreso += String.format("%.2f", porcentajeTotal);
        int porcentajeTotalEntero = (int) Math.floor(porcentajeTotal);
        if (porcentajeTotalEntero % 10 == 0 && porcentajeTotalEntero != ultimoPorcentaje) {
            //Envia Mensaje Telegram
            restTemplateTelegramBot.peticionHttpGet(String.valueOf(-837310871), progreso + "| "+endPoint);
            ultimoPorcentaje = porcentajeTotalEntero;
        }
        return progreso;
    }

    public String progressPercent(int actual, int total) {
        String progreso = "";
        progreso += "Progreso " + actual + " / " + total + " - %";
        Float porcentajeTotal = ((float) actual) / ((float) total) * 100;
        progreso += String.format("%.2f", porcentajeTotal);
        return progreso;
    }

    /**
     * isRepeatRut
     *
     * @param rut String
     * @return boolean
     */
    public Boolean isRepeatValue(String rut, String rutaSalidaDatos) {
        String ruta = System.getenv(rutaSalidaDatos) + rut + Constantes.EXTENCION_TXT;
        File file = new File(ruta);
        return file.exists();
    }

    /**
     * @param listClientsNoResponse List<String>
     */
    public void outputErrorClients(List<String> listClientsNoResponse, String path) {
        LOGGER.info("****************** Inicio escritura clientes Sin Respuesta ******************");
        AtomicInteger indexListaRutClientes = new AtomicInteger();
        try {
            List<String> clearDuplicatesList = deleteDuplicatedElements(listClientsNoResponse);
            clearDuplicatesList.stream().forEach(obj -> {
                indexListaRutClientes.getAndIncrement();
                LOGGER.info(progressPercent(indexListaRutClientes.get(), clearDuplicatesList.size()));
                writeRutsOnFile(obj, path);
            });
            LOGGER.info("****************** Escritura clientes Sin Respuesta Finalizada ******************");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param listRepeat List<String>
     */
    public void outputRepeatClients(List<String> listRepeat, String path) {
        LOGGER.info("****************** Inicio escritura clientes repetidos ******************");
        AtomicInteger indexListaRutClientes = new AtomicInteger();
        try {
            List<String> clearDuplicatesList = deleteDuplicatedElements(listRepeat);
            clearDuplicatesList.stream().forEach(obj -> {
                indexListaRutClientes.getAndIncrement();
                LOGGER.info(progressPercent(indexListaRutClientes.get(), clearDuplicatesList.size()));
                writeRutsOnFile(obj, path);
            });
            LOGGER.info("****************** Escritura clientes repetidos Finalizada ******************");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param list List<RutClienteVO>
     * @return List<RutClienteVO>
     */
    public List<String> deleteDuplicatedElements(List<String> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    /**
     * @param rut  List<String>
     * @param path BufferedWriter
     */
    public void writeRutsOnFile(String rut, String path) {
        try {
            File file = new File(path);
            if (!file.exists())
                file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(rut);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String quitarNumerosIzquierda(String numero) {
        return numero.replaceFirst("^0+(?!$)", "");
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
                if (row.getCell(0) == null || row.getCell(0).getStringCellValue().trim().isEmpty()
                    && row.getCell(1) == null || row.getCell(1).getStringCellValue().trim().isEmpty()) {
                    break;
                }
                // Cada fila es una celda del excel
                if (nameProcess.equalsIgnoreCase("consultaPsPorLinea") || nameProcess.equalsIgnoreCase(
                    "consultaListaPsLineaV8")) {
                    String FP_LINC_AREA = row.getCell(0) == null ? "" : row.getCell(0).getStringCellValue();
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

                if(nameProcess.equalsIgnoreCase("Generico")){
                	 String FP_LINC_AREA = row.getCell(0) == null ? "" : row.getCell(0).getStringCellValue();
                     String FP_LINC_NUM_COM = row.getCell(1).getStringCellValue();
                     String FP_LINC_FEC_INI_VI = row.getCell(2).getStringCellValue();
                     String FP_LINC_FEC_FIN_VI = row.getCell(3).getStringCellValue();
                     String FP_LINC_IND_FACT = row.getCell(4).getStringCellValue();
                     String ID_FONO = quitarNumerosIzquierda(FP_LINC_AREA)+quitarNumerosIzquierda(FP_LINC_NUM_COM);
                     ClienteVO clienteVO = new ClienteVO(FP_LINC_AREA, FP_LINC_NUM_COM, FP_LINC_FEC_INI_VI, "", "", ID_FONO,
                         "");
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
}
