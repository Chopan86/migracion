package cl.tchile.vo;

/**
 * The Class RutClienteVO.
 */
public class RutClienteVO extends FonoClienteVO{

		/** The rut. */
		private String rut;
		
		/** The dv. */
		private String dv;

	public RutClienteVO() {
	}

	public RutClienteVO(String rut, String dv) {
		this.rut = rut;
		this.dv = dv;
	}

	public RutClienteVO(String area, String fono, String rut, String dv) {
		super(area, fono);
		this.rut = rut;
		this.dv = dv;
	}

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
		 * Gets the dv.
		 *
		 * @return the dv
		 */
		public String getDv() {
			return dv;
		}
		
		/**
		 * Sets the dv.
		 *
		 * @param dv the dv to set
		 */
		public void setDv(String dv) {
			this.dv = dv;
		}
}
