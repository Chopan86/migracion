/**
 * 
 */
package cl.tchile.app.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import cl.tchile.app.ObtieneResponseWSApplication;
import cl.tchile.vo.MigracionVO;

/**
 * @author fsaavedr
 *
 */
@Component
public class SaveFilesOracle {
	
	private Connection conn;
	
	/**
     * The Constant LOGGER.
     */
    private static final Logger LOGGER = LogManager.getLogger(SaveFilesOracle.class);
	
	public int saveResponseInBD(MigracionVO vo) throws ClassNotFoundException, SQLException {
		LOGGER.info("Inicia insert");
		String sql = "INSERT INTO MIGRADOS(RUT, SALIDA, SERVICIO, LINEA, FECHA_INI_LI, CIUDAD, CALLE, ALTURA) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	      PreparedStatement statement = conn.prepareStatement(sql);
	      statement.setString(1, vo.getRut());
	      statement.setString(2, vo.getSalida());
	      statement.setString(3, vo.getServicio());
	      statement.setString(4, vo.getLinea());
	      statement.setString(5, vo.getFechaIniLi());
	      statement.setString(6, vo.getCiudad());
	      statement.setString(7, vo.getCalle());
	      statement.setString(8, vo.getAltura());

	      int codBD = statement.executeUpdate();

	      LOGGER.info("fin insert: "+ codBD);
	      return codBD;
	}
	
	public void setFilesOracle() throws SQLException, IOException, ClassNotFoundException {
		 // Obtener una conexión a la base de datos Oracle
		getConnection();
	      
	      
	      File directorio = new File("C:\\logsYArchivos\\paraGuardarBD");
	      
	      if(directorio.isDirectory()) {
	    	  String[] archivos = directorio.list();

	    	  for(String archivo: archivos) {
		    	  File fileResponse = new File(directorio.getPath() + File.separator + archivo);
		    	  System.out.println(fileResponse.getName());
		      }
	      }
	      
	      
	      
//	      File file = new File("C:\\logsYArchivos\\99587850-K.txt");
//	      BufferedReader reader = new BufferedReader(new FileReader(file));
//	      String text = "";
//	      String line = reader.readLine();
//	      while (line != null) {
//	         text += line;
//	         line = reader.readLine();
//	      }
//	      reader.close();
//	      
//	   
//	      String sql = "INSERT INTO MIGRADOS(RUT, SALIDA, SERVICIO, LINEA) VALUES (?, ?, ?, NULL)";
//	      PreparedStatement statement = conn.prepareStatement(sql);
//	      statement.setString(1, "99587850-K");
//	      statement.setString(2, text);
//	      statement.setString(3, "consultaClienteRutLineaB");
//
//	      statement.executeUpdate();

	      // Cerrar la conexión a la base de datos
	      closeConnection();
	}
	
	
	
	
	public void getConnection() throws ClassNotFoundException, SQLException {
		String dbURL = "jdbc:oracle:thin:@10.186.243.192:1521/cercomp03";
	      String username = "REC_TEC";
	      String password = "RKujz8NK";
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      conn = DriverManager.getConnection(dbURL, username, password);
	}
	
	public void closeConnection() throws SQLException {
		conn.close();
	}
		
	
}
