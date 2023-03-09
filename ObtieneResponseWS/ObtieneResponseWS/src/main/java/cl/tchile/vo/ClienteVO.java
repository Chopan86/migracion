package cl.tchile.vo;

/**
 * The Class RutClienteVO.
 */
public class ClienteVO extends RutClienteVO{

	public ClienteVO() {
	}

	public ClienteVO(String rut, String dv) {
		super(rut, dv);
	}

	public ClienteVO(String area, String fono, String rut, String dv) {
		super(area, fono, rut, dv);
	}
}
