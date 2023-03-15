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

/**
 * @author fsaavedr
 *
 */
public class SaveFilesOracle {
		
	public void setFilesOracle() throws SQLException, IOException, ClassNotFoundException {
		 // Obtener una conexión a la base de datos Oracle
	      String dbURL = "jdbc:oracle:thin:@10.186.218.41:1521:cer02";
	      String username = "ws_portalpagos";
	      String password = "ws#k03pg";
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection conn = DriverManager.getConnection(dbURL, username, password);
	      
	      File file = new File("C:\\logsYArchivos\\99587850-K.txt");
	      BufferedReader reader = new BufferedReader(new FileReader(file));
	      String text = "";
	      String line = reader.readLine();
	      while (line != null) {
	         text += line;
	         line = reader.readLine();
	      }
	      reader.close();
	      
	   
	      String sql = "INSERT INTO MIGRADOS(RUT, SALIDA, SERVICIO, LINEA) VALUES (?, ?, ?, NULL)";
	      PreparedStatement statement = conn.prepareStatement(sql);
	      statement.setString(1, "99587850-K");
	      statement.setString(2, text);
	      statement.setString(3, "consultaClienteRutLineaB");

	      statement.executeUpdate();

	      // Cerrar la conexión a la base de datos
	      conn.close();
	}
}
