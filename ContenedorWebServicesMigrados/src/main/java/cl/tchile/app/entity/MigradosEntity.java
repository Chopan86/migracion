package cl.tchile.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The Class ContenidoEstaticoEntity.
 */
@Entity
@Table (name = MigradosEntity.TABLE_NAME)
public class MigradosEntity {
	
	/** The Constant TABLE_NAME. */
	public static final String TABLE_NAME= "MIGRADOS";
	
	/** The rut. */
	@Column(name = "RUT")
	private String rut;
	
	/** The response. */
	@Column(name = "SALIDA")
	private String response;
	
	/** The identificador servicio. */
	@Id
	@Column(name = "SERVICIO")
	private String identificadorServicio;
	
	/** The linea. */
	@Column(name = "LINEA")
	private String linea;

	/**
	 * Gets the rut.
	 *
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * Sets the rut.
	 *
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * Gets the response.
	 *
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Sets the response.
	 *
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * Gets the identificador servicio.
	 *
	 * @return the identificadorServicio
	 */
	public String getIdentificadorServicio() {
		return identificadorServicio;
	}

	/**
	 * Sets the identificador servicio.
	 *
	 * @param identificadorServicio the identificadorServicio to set
	 */
	public void setIdentificadorServicio(String identificadorServicio) {
		this.identificadorServicio = identificadorServicio;
	}

	/**
	 * Gets the linea.
	 *
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * Sets the linea.
	 *
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}



}
