package cl.tchile.vo;

/**
 * The Class FonoClienteVO.
 */
public class FonoClienteVO {

    private String area;

    private String fono;

    /**
     * Fecha inicio linea /  vigencia
     */
    private String inicioVigencia;

    public String getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

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

	public FonoClienteVO(String area, String fono, String inicioVigencia) {
		this.area = area;
		this.fono = fono;
		this.inicioVigencia = inicioVigencia;
	}

	private String obtenerArea() {
        return null;
    }

    private String obtenerFono() {
        return null;
    }
}
