package cl.tchile.vo;

/**
 * The Class RutClienteVO.
 */
public class ClienteVO extends RutClienteVO{

	String idFono;
	String idTypeCall;

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

	public ClienteVO(String area, String fono, String inicioVigencia, String rut, String dv) {
		super(area, fono, inicioVigencia, rut, dv);
	}
}
