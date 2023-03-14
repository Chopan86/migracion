package cl.tchile.vo;

/**
 * The Class RutClienteVO.
 */
public class ClienteVO extends RutClienteVO{

	String idFono;
	String idTypeCall;

	String codCiudad;
	String codCalle;
	String codAltura;

	public String getCodCiudad() {
		return codCiudad;
	}

	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}

	public String getCodCalle() {
		return codCalle;
	}

	public void setCodCalle(String codCalle) {
		this.codCalle = codCalle;
	}

	public String getCodAltura() {
		return codAltura;
	}

	public void setCodAltura(String codAltura) {
		this.codAltura = codAltura;
	}

	public String getIdFono() {
		return idFono;
	}

	public void setIdFono(String idFono) {
		this.idFono = idFono;
	}

	public String getIdTypeCall() {
		return idTypeCall;
	}

	public void setIdTypeCall(String idTypeCall) {
		this.idTypeCall = idTypeCall;
	}

	public ClienteVO() {
	}

	public ClienteVO(String rut, String dv) {
		super(rut, dv);
	}

	public ClienteVO(String area, String fono, String rut, String dv) {
		super(area, fono, rut, dv);
	}

	public ClienteVO(String area, String fono, String rut, String dv, String idFono, String idTypeCall) {
		super(area, fono, rut, dv);
		this.idFono = idFono;
		this.idTypeCall = idTypeCall;
	}

	public ClienteVO(String area, String fono, String inicioVigencia, String rut, String dv, String idFono,
		String idTypeCall) {
		super(area, fono, inicioVigencia, rut, dv);
		this.idFono = idFono;
		this.idTypeCall = idTypeCall;
	}

	public ClienteVO(String area, String fono, String rut, String dv, String idFono, String idTypeCall,
		String codCiudad,
		String codCalle, String codAltura) {
		super(area, fono, rut, dv);
		this.idFono = idFono;
		this.idTypeCall = idTypeCall;
		this.codCiudad = codCiudad;
		this.codCalle = codCalle;
		this.codAltura = codAltura;
	}

	public ClienteVO(String area, String fono, String inicioVigencia, String rut, String dv, String idFono,
		String idTypeCall, String codCiudad, String codCalle, String codAltura) {
		super(area, fono, inicioVigencia, rut, dv);
		this.idFono = idFono;
		this.idTypeCall = idTypeCall;
		this.codCiudad = codCiudad;
		this.codCalle = codCalle;
		this.codAltura = codAltura;
	}

	public ClienteVO(String area, String fono, String inicioVigencia, String rut, String dv) {
		super(area, fono, inicioVigencia, rut, dv);
	}

}
