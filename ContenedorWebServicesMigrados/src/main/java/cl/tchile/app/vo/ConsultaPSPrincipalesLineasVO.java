package cl.tchile.app.vo;

import java.util.List;

/**
 * The Class ConsultaPSPrincipalesLineasVO.
 */
public class ConsultaPSPrincipalesLineasVO {


	/** The accpspwo o cod error. */
	private Long accpspwo_o_cod_error;
	
	/** The accpspwo o desc error. */
	private String accpspwo_o_desc_error;
	
	/** The accpspwo o cod db. */
	private Long accpspwo_o_cod_db;
	
	
	/** The accpspwo o programa. */
	private String accpspwo_o_programa;
	
//	/** The accpspwo o lineas. */
	private List<AccpspwoOLineas> accpspwo_o_lineas;
	
	/**
	 * Gets the accpspwo o cod error.
	 *
	 * @return the accpspwo_o_cod_error
	 */
	public Long getAccpspwo_o_cod_error() {
		return accpspwo_o_cod_error;
	}
	
	/**
	 * Sets the accpspwo o cod error.
	 *
	 * @param accpspwo_o_cod_error the accpspwo_o_cod_error to set
	 */
	public void setAccpspwo_o_cod_error(Long accpspwo_o_cod_error) {
		this.accpspwo_o_cod_error = accpspwo_o_cod_error;
	}
	
	/**
	 * Gets the accpspwo o desc error.
	 *
	 * @return the accpspwo_o_desc_error
	 */
	public String getAccpspwo_o_desc_error() {
		return accpspwo_o_desc_error;
	}
	
	/**
	 * Sets the accpspwo o desc error.
	 *
	 * @param accpspwo_o_desc_error the accpspwo_o_desc_error to set
	 */
	public void setAccpspwo_o_desc_error(String accpspwo_o_desc_error) {
		this.accpspwo_o_desc_error = accpspwo_o_desc_error;
	}
	
	/**
	 * Gets the accpspwo o cod db.
	 *
	 * @return the accpspwo_o_cod_db
	 */
	public Long getAccpspwo_o_cod_db() {
		return accpspwo_o_cod_db;
	}
	
	/**
	 * Sets the accpspwo o cod db.
	 *
	 * @param accpspwo_o_cod_db the accpspwo_o_cod_db to set
	 */
	public void setAccpspwo_o_cod_db(Long accpspwo_o_cod_db) {
		this.accpspwo_o_cod_db = accpspwo_o_cod_db;
	}
	
	/**
	 * Gets the accpspwo o lineas.
	 *
	 * @return the accpspwo_o_lineas
	 */
	public List<AccpspwoOLineas> getAccpspwo_o_lineas() {
		return accpspwo_o_lineas;
	}
	
	/**
	 * Sets the accpspwo o lineas.
	 *
	 * @param accpspwo_o_lineas the accpspwo_o_lineas to set
	 */
	public void setAccpspwo_o_lineas(List<AccpspwoOLineas> accpspwo_o_lineas) {
		this.accpspwo_o_lineas = accpspwo_o_lineas;
	}

	/**
	 * @return the accpspwo_o_programa
	 */
	public String getAccpspwo_o_programa() {
		return accpspwo_o_programa;
	}

	/**
	 * @param accpspwo_o_programa the accpspwo_o_programa to set
	 */
	public void setAccpspwo_o_programa(String accpspwo_o_programa) {
		this.accpspwo_o_programa = accpspwo_o_programa;
	}

	/**
	 * The Class AccpspwoOLineas.
	 */
	public static class AccpspwoOLineas {

		/** The accpspwo o area. */
		private String accpspwo_o_area;
		
		/** The accpspwo o fono. */
		private String accpspwo_o_fono;
		
		
//		/** The accpspwo ps lineas. */
		private List<AccpspwoPsLineas> accpspwo_ps_lineas;
		
		/**
		 * Gets the accpspwo o area.
		 *
		 * @return the accpspwo_o_area
		 */
		public String getAccpspwo_o_area() {
			return accpspwo_o_area;
		}
		
		/**
		 * Sets the accpspwo o area.
		 *
		 * @param accpspwo_o_area the accpspwo_o_area to set
		 */
		public void setAccpspwo_o_area(String accpspwo_o_area) {
			this.accpspwo_o_area = accpspwo_o_area;
		}
		
		/**
		 * Gets the accpspwo o fono.
		 *
		 * @return the accpspwo_o_fono
		 */
		public String getAccpspwo_o_fono() {
			return accpspwo_o_fono;
		}
		
		/**
		 * Sets the accpspwo o fono.
		 *
		 * @param accpspwo_o_fono the accpspwo_o_fono to set
		 */
		public void setAccpspwo_o_fono(String accpspwo_o_fono) {
			this.accpspwo_o_fono = accpspwo_o_fono;
		}
		
		
		/**
		 * Gets the accpspwo ps lineas.
		 *
		 * @return the accpspwo_ps_lineas
		 */
		public List<AccpspwoPsLineas> getAccpspwo_ps_lineas() {
			return accpspwo_ps_lineas;
		}
		
		/**
		 * Sets the accpspwo ps lineas.
		 *
		 * @param accpspwo_ps_lineas the accpspwo_ps_lineas to set
		 */
		public void setAccpspwo_ps_lineas(List<AccpspwoPsLineas> accpspwo_ps_lineas) {
			this.accpspwo_ps_lineas = accpspwo_ps_lineas;
		}

		/**
		 * The Class AccpspwoPsLineas.
		 */
		public static class AccpspwoPsLineas {

			/** The accpspwo o ps. */
			private Long accpspwo_o_ps;
			
			/** The accpspwo o desc. */
			private String accpspwo_o_desc;
			
			/** The accpspwo o cod fam. */
			private String accpspwo_o_cod_fam;
			
			/** The accpspwo o subgr 2. */
			private Long accpspwo_o_subgr2;
			
			/**
			 * Gets the accpspwo o ps.
			 *
			 * @return the accpspwo_o_ps
			 */
			public Long getAccpspwo_o_ps() {
				return accpspwo_o_ps;
			}
			
			/**
			 * Sets the accpspwo o ps.
			 *
			 * @param accpspwo_o_ps the accpspwo_o_ps to set
			 */
			public void setAccpspwo_o_ps(Long accpspwo_o_ps) {
				this.accpspwo_o_ps = accpspwo_o_ps;
			}
			
			/**
			 * Gets the accpspwo o desc.
			 *
			 * @return the accpspwo_o_desc
			 */
			public String getAccpspwo_o_desc() {
				return accpspwo_o_desc;
			}
			
			/**
			 * Sets the accpspwo o desc.
			 *
			 * @param accpspwo_o_desc the accpspwo_o_desc to set
			 */
			public void setAccpspwo_o_desc(String accpspwo_o_desc) {
				this.accpspwo_o_desc = accpspwo_o_desc;
			}
			
			/**
			 * Gets the accpspwo o cod fam.
			 *
			 * @return the accpspwo_o_cod_fam
			 */
			public String getAccpspwo_o_cod_fam() {
				return accpspwo_o_cod_fam;
			}
			
			/**
			 * Sets the accpspwo o cod fam.
			 *
			 * @param accpspwo_o_cod_fam the accpspwo_o_cod_fam to set
			 */
			public void setAccpspwo_o_cod_fam(String accpspwo_o_cod_fam) {
				this.accpspwo_o_cod_fam = accpspwo_o_cod_fam;
			}
			
			/**
			 * Gets the accpspwo o subgr 2.
			 *
			 * @return the accpspwo_o_subgr2
			 */
			public Long getAccpspwo_o_subgr2() {
				return accpspwo_o_subgr2;
			}
			
			/**
			 * Sets the accpspwo o subgr 2.
			 *
			 * @param accpspwo_o_subgr2 the accpspwo_o_subgr2 to set
			 */
			public void setAccpspwo_o_subgr2(Long accpspwo_o_subgr2) {
				this.accpspwo_o_subgr2 = accpspwo_o_subgr2;
			}
		}

	}
}
