package cl.tchile.vo;

/**
 * The Class FonoClienteVO.
 */
public class FonoClienteVO {

	private String area;

	private String fono;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	public FonoClienteVO() {
	}
	public FonoClienteVO(String area, String fono) {
		this.area = area;
		this.fono = fono;
	}

	private String obtenerArea(){
		return null;
	}

	private String obtenerFono(){
		return null;
	}
}
