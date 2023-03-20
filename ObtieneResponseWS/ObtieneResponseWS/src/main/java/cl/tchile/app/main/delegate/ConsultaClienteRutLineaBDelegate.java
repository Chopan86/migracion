package cl.tchile.app.main.delegate;

import java.io.StringWriter;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub;
import com.Request.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_entrada;
import com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida;

import cl.tchile.app.constant.Constantes;
import cl.tchile.app.constant.ConstantesRutas;
import cl.tchile.app.helper.ConsultaClienteRutFonoLineaHelper;
import cl.tchile.app.helper.GeneralHelper;
import cl.tchile.app.helper.SaveFilesOracle;
import cl.tchile.vo.ClienteVO;
import cl.tchile.vo.EndPointDataVO;
import cl.tchile.vo.MigracionVO;

/**
 * The Class ConsultaClienteRutLineaCDelegate.
 */
@Component
public class ConsultaClienteRutLineaBDelegate {

    /**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(ConsultaClienteRutLineaBDelegate.class);

    /**
     * The general helper.
     */
    @Autowired
    GeneralHelper generalHelper;

    @Autowired
    SaveFilesOracle saveFilesOracle;

    /**
     * The general helper.
     */
    @Autowired
    ConsultaClienteRutFonoLineaHelper consultarClienteRutFonoLineaHelper;
    /**
     * Lista clientes repetidos
     */
    List<String> listRepeatClients = new ArrayList<>();
    /**
     * Lista clientes con error
     */
    List<String> listClientsNoResponse = new ArrayList<>();

    EndPointDataVO endPointDataVO = new EndPointDataVO(
        "http://esb2.ctc.cl:8080/services/consultaClienteRutLineaB",
        Constantes.TIMEOUT15,
        "com.AWLC01WI.AWLC01WS.www.AWLC01WSServiceLocator"
    );

    /**
     * consultaClienteRutlineaBxFono X FONO
     */
    public void consultaClienteRutlineaBxFono() throws SQLException, ClassNotFoundException {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        String pathSalidaRepetidos = "C:/telefonosRepetidos.txt";
        String pathSalidaNoResponse = "C:/telefonosNoResponse.txt";
        LOGGER.info("******** INICIO PROCESO LINEAS X FONO  ********");
        List<ClienteVO> clienteVOList = generalHelper.obtenerDatosDesdeExcel(
                ConstantesRutas.FICHEROPSPORLINEAREAD, "Generico");
        int indexLista = 0;
        for (ClienteVO clienteVO : clienteVOList) {
            indexLista++;
            saveFilesOracle.reiniciarConexion(indexLista);
            LOGGER.info(generalHelper.progressPercent(indexLista, clienteVOList.size()));
            callConsultaClienteRutLinaBxFono(clienteVO.getArea(), clienteVO.getFono(), endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    /**
     * Consulta cliente  X RUT
     */
    public void consultaClienteRutLineaBImpl() throws SQLException, ClassNotFoundException {
        listClientsNoResponse = new ArrayList<>();
        listRepeatClients = new ArrayList<>();
        String pathSalidaRepetidos = "C:/clientesRepetidos.txt";
        String pathSalidaNoResponse = "C:/clientesSinRespuesta.txt";
        LOGGER.info("******** INICIO PROCESO ********");
        List<ClienteVO> listaRutClientes = consultarClienteRutFonoLineaHelper.obtieneRutClienteDesdeFichero(ConstantesRutas.LECTURARUTSN1);
        LOGGER.info("Cantidad Total Ruts a Buscar: " + listaRutClientes.size());
        int indexLista = 0;
        for (ClienteVO clienteVO : listaRutClientes) {
            indexLista++;
            saveFilesOracle.reiniciarConexion(indexLista);
            LOGGER.info(generalHelper.progressPercent(indexLista, listaRutClientes.size()));
            callConsultaClienteRutLinaB(clienteVO.getRut(), clienteVO.getDv(), endPointDataVO);
        }
        generalHelper.outputRepeatClients(listRepeatClients, pathSalidaRepetidos);
        generalHelper.outputErrorClients(listClientsNoResponse, pathSalidaNoResponse);
    }

    /**
     * Call consulta cliente rut lina C.
     *
     * @param rut the rut
     * @param dv  the dv
     */
    public void callConsultaClienteRutLinaB(String rut, String dv, EndPointDataVO endPointDataVO) {
        String rutCompleto = null;
        try {
            rutCompleto = rut + "-" + dv;
//            boolean rutRepetido = generalHelper.isRepeatValue(rutCompleto, "RUTA_SALIDA_RUT_B");
            boolean rutRepetido = false;
            if (rutRepetido) {
                LOGGER.info("SE AGREGA RUT A REPETIDOS: {}", rutCompleto);
                listRepeatClients.add(rutCompleto);
            }

            if (!rutRepetido) {
                ProgramInterfaceAwlc01Z3_salida salida = null;
                ProgramInterfaceAwlc01Z3_entrada entrada = new ProgramInterfaceAwlc01Z3_entrada();
                entrada.setAwlc01Z3_i_area("");
                entrada.setAwlc01Z3_i_num_com("");
                entrada.setAwlc01Z3_i_rut(generalHelper.rellenarCadenaPorIzquierda(rut, 12, Constantes.cCOD_ZERO));
                entrada.setAwlc01Z3_i_dv(dv);
                entrada.setAwlc01Z3_i_criterio(Constantes.sCOD_ONE);
                entrada.setFiller1("");
                URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
                String timeOut = endPointDataVO.getTimeOut();
                String servlocator = endPointDataVO.getServLocator();
                Class servicelocator = Class.forName(servlocator);
                org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
                AWLC01WSHTTPSoapBindingStub stub = new AWLC01WSHTTPSoapBindingStub(endpointURL, service);
                stub.setTimeout(Integer.parseInt(timeOut));
                salida = stub.AWLC01WSOperation(entrada);
                StringWriter sw = new StringWriter();

                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwlc01Z3_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();
                
                int codBD = saveFilesOracle.saveResponseInBD(setMigracionVO("rut",rut+dv, xmlString));
                
                if (codBD == 0) {
                    System.out.println(rutCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(rutCompleto + " | Error insert BD ");
                }

                /**
                 *
                 * DESCOMENTAR PARA GUARDAR ARCHIVOS
                 *
                 *
                 * */
//                consultarClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, rutCompleto, "RUTA_SALIDA_RUT_B");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el rut: " + rutCompleto + " por la siguiente razón: " + e);
            LOGGER.info("SE AGREGA A RUT SIN RESPUESTA : " + rutCompleto);
            listClientsNoResponse.add(rutCompleto + " | " + e);
        }
    }

    private MigracionVO setMigracionVO(String tipo, String valueTipo, String xmlString) {
    	MigracionVO vo = new MigracionVO();
    	vo.setServicio("consultaClienteRutLineaB");
    	if("rut".equals(tipo)) {
    		vo.setRut(valueTipo);
    		vo.setSalida(xmlString);
    	}else {
    		vo.setLinea(valueTipo);
    		vo.setSalida(xmlString);
    	}
		return vo;
	}

	public void callConsultaClienteRutLinaBxFono(String area, String fono, EndPointDataVO endPointDataVO) {
//        String fonoCompleto = area + fono.substring(1);
		String fonoCompleto = generalHelper.quitarNumerosIzquierda(area) + generalHelper.quitarNumerosIzquierda(fono);
        try {
//            boolean fonoRepetido = generalHelper.isRepeatValue(fonoCompleto, "RUTA_SALIDA_FONOSB");
            boolean fonoRepetido = false;
            if (fonoRepetido) {
                LOGGER.info("SE AGREGA A FONOS REPETIDOS: " + fonoCompleto);
                listRepeatClients.add(fonoCompleto);
            }
            if (!fonoRepetido) {
                ProgramInterfaceAwlc01Z3_salida salida = null;
                ProgramInterfaceAwlc01Z3_entrada entrada = new ProgramInterfaceAwlc01Z3_entrada();
//                entrada.setAwlc01Z3_i_area(generalHelper.formatearAreaFono(area));
                entrada.setAwlc01Z3_i_area(area);
//                entrada.setAwlc01Z3_i_num_com(generalHelper.formatearFono(area, fono));
                entrada.setAwlc01Z3_i_num_com(fono);
                entrada.setAwlc01Z3_i_rut("");
                entrada.setAwlc01Z3_i_dv("");
                entrada.setAwlc01Z3_i_criterio(Character.toString(Constantes.cCOD_ZERO));
                entrada.setFiller1("");
                URL endpointURL = new URL("http://esb2.ctc.cl:8080/services/consultaClienteRutLineaB");
                String timeOut = "15000";
                String servlocator = "com.AWLC01WI.AWLC01WS.www.AWLC01WSServiceLocator";
                Class servicelocator = Class.forName(servlocator);
                org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
                AWLC01WSHTTPSoapBindingStub stub = new AWLC01WSHTTPSoapBindingStub(endpointURL, service);
                stub.setTimeout(Integer.valueOf(timeOut));
                salida = stub.AWLC01WSOperation(entrada);
                StringWriter sw = new StringWriter();

                JAXBContext context = JAXBContext.newInstance(ProgramInterfaceAwlc01Z3_salida.class);
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                StringWriter stringWriter = new StringWriter();
                marshaller.marshal(salida, stringWriter);
                String xmlString = stringWriter.toString();

                int codBD = saveFilesOracle.saveResponseInBD(setMigracionVO("linea",fonoCompleto, xmlString));

                if (codBD == 0) {
                    System.out.println(fonoCompleto + " | Error insert BD ");
                    listClientsNoResponse.add(fonoCompleto + " | Error insert BD ");
                }
                /**
                 *
                 * DESCOMENTAR PARA GUARDAR ARCHIVOS
                 *
                 *
                 * */
//                consultarClienteRutFonoLineaHelper.crearSalidaResponse(xmlString, fonoCompleto, "RUTA_SALIDA_FONOSB");
            }

        } catch (Exception e) {
            LOGGER.error("No se proceso el fono: " + fonoCompleto + " por la siguiente razon: " + e);
            LOGGER.info("SE AGREGA FONO SIN RESPUESTA : " + fonoCompleto);
            listClientsNoResponse.add(fonoCompleto + " | " + e);
        }
    }

}
