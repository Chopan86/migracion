package cl.tchile.app.helper;

import cl.tchile.app.constant.Constantes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * The Class GeneralHelper.
 */
@Component
public class GeneralHelper {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LogManager.getLogger(GeneralHelper.class);
	
	/**
     * Rellenar cadena por izquierda.
     *
     * @param cadena the cadena
     * @param nuevoLargo the nuevo largo
     * @param relleno the relleno
     * @return the string
     */
    public String rellenarCadenaPorIzquierda(String cadena, int nuevoLargo, char relleno) {
    	LOGGER.info("RELLENAR CADENA POR IZQUIERDA");

		if(cadena.isEmpty()) return "";
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

	public String validarFonoCompleto(String area, String fono){
		if(Boolean.FALSE.equals(validarArea2Fono(area))){
			fono = fono.substring(1);
		}
		return fono;
	}

	public String formatearFono(String area, String fono){
		if(area.isEmpty()){
			return fono;
		}
		fono = validarFonoCompleto(area, fono);
		fono = rellenarCadenaPorIzquierda(fono,8,Constantes.cCOD_ZERO);
		return fono;
	}

	public Boolean validarArea2Fono(String area) {
		if(!area.substring(0,1).equalsIgnoreCase("2")) return false;
		return true;
	}

	public String validarAreaFono(String area){
		Boolean isArea2Fono = validarArea2Fono(area);
		if(Boolean.FALSE.equals(isArea2Fono)) return area;
		return "2";
	}

	public String formatearAreaFono(String area){
		if(area.isEmpty()){
			return area;
		}
		area = validarAreaFono(area);
		area = rellenarCadenaPorIzquierda(area,3, Constantes.cCOD_ZERO);
		return area;
	}

	public String progressPercent(int actual, int total){
		String progreso = "";
		progreso+= "Progreso "+actual+" / "+total+" - %";
		Float porcentajeTotal = ((float) actual)/((float)total)*100;
		progreso+= String.format("%.2f", porcentajeTotal);
		return progreso;
	}
	/**
	 * isRepeatRut
	 *
	 * @param rut String
	 * @return boolean
	 */
	public Boolean isRepeatValue(String rut, String rutaSalidaDatos){
		String ruta = System.getenv(rutaSalidaDatos) + rut + Constantes.EXTENCION_TXT;
		File file = new File(ruta);
		return file.exists();
	}

	/**
	 *
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
	 *
	 * @param listRepeat List<String>
	 */
	public void outputRepeatClients(List<String> listRepeat, String path) {
		LOGGER.info("****************** Inicio escritura clientes repetidos ******************");
		AtomicInteger indexListaRutClientes = new AtomicInteger();
		try {
			List<String> clearDuplicatesList = deleteDuplicatedElements(listRepeat);
			clearDuplicatesList.stream().forEach( obj -> {
				indexListaRutClientes.getAndIncrement();
				LOGGER.info(progressPercent(indexListaRutClientes.get(), clearDuplicatesList.size()));
				writeRutsOnFile(obj,path);
			});
			LOGGER.info("****************** Escritura clientes repetidos Finalizada ******************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 * @param list List<RutClienteVO>
	 * @return List<RutClienteVO>
	 */
	public List<String> deleteDuplicatedElements(List<String> list){
		return list.stream().distinct().collect(Collectors.toList());
	}

	/**
	 *
	 * @param rut List<String>
	 * @param path BufferedWriter
	 */
	public void writeRutsOnFile(String rut, String path){
			try {
				File file = new File(path);
				if (!file.exists()) file.createNewFile();
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(rut);
				bw.newLine();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
