package cl.tchile.app.vo;

import java.util.List;


/**
 * 
 * ListaPSFrontEndResponseVO
 *
 */
public class ListaPSFrontEndResponseVO {
	
	/** awpsl2wo_salida */
	private Awpsl2woSalida awpsl2wo_salida;
	
	/** awpsl2wo_lista_ps */
	private List<Awpsl2WoListaPs> awpsl2wo_lista_ps;
	
	/**
	 * @return the awpsl2wo_salida
	 */
	public Awpsl2woSalida getAwpsl2wo_salida() {
		return awpsl2wo_salida;
	}


	/**
	 * @param awpsl2wo_salida the awpsl2wo_salida to set
	 */
	public void setAwpsl2wo_salida(Awpsl2woSalida awpsl2wo_salida) {
		this.awpsl2wo_salida = awpsl2wo_salida;
	}


	/**
	 * @return the awpsl2wo_lista_ps
	 */
	public List<Awpsl2WoListaPs> getAwpsl2wo_lista_ps() {
		return awpsl2wo_lista_ps;
	}


	/**
	 * @param awpsl2wo_lista_ps the awpsl2wo_lista_ps to set
	 */
	public void setAwpsl2wo_lista_ps(List<Awpsl2WoListaPs> awpsl2wo_lista_ps) {
		this.awpsl2wo_lista_ps = awpsl2wo_lista_ps;
	}

	
	/**
	 * 
	 * Awpsl2woSalida
	 *
	 */
	public static class Awpsl2woSalida{
		
		/** awpsl2wo_cod_ret */
		private String awpsl2wo_cod_ret;
		
		/** awpsl2wo_desc_ret */
		private String awpsl2wo_desc_ret;
		
		/** awpsl2wo_cod_db */
		private String awpsl2wo_cod_db;
		
		/** awpsl2wo_parrafo */
		private String awpsl2wo_parrafo;
		
		/** awpsl2wo_servicio */
		private String awpsl2wo_servicio;
		
		/** awpsl2wo_finpag */
		private String awpsl2wo_finpag;
		
		/** awpsl2wo_numreg */
		private Long awpsl2wo_numreg;

		/**
		 * @return the awpsl2wo_cod_ret
		 */
		public String getAwpsl2wo_cod_ret() {
			return awpsl2wo_cod_ret;
		}

		/**
		 * @param awpsl2wo_cod_ret the awpsl2wo_cod_ret to set
		 */
		public void setAwpsl2wo_cod_ret(String awpsl2wo_cod_ret) {
			this.awpsl2wo_cod_ret = awpsl2wo_cod_ret;
		}

		/**
		 * @return the awpsl2wo_desc_ret
		 */
		public String getAwpsl2wo_desc_ret() {
			return awpsl2wo_desc_ret;
		}

		/**
		 * @param awpsl2wo_desc_ret the awpsl2wo_desc_ret to set
		 */
		public void setAwpsl2wo_desc_ret(String awpsl2wo_desc_ret) {
			this.awpsl2wo_desc_ret = awpsl2wo_desc_ret;
		}

		/**
		 * @return the awpsl2wo_cod_db
		 */
		public String getAwpsl2wo_cod_db() {
			return awpsl2wo_cod_db;
		}

		/**
		 * @param awpsl2wo_cod_db the awpsl2wo_cod_db to set
		 */
		public void setAwpsl2wo_cod_db(String awpsl2wo_cod_db) {
			this.awpsl2wo_cod_db = awpsl2wo_cod_db;
		}

		/**
		 * @return the awpsl2wo_parrafo
		 */
		public String getAwpsl2wo_parrafo() {
			return awpsl2wo_parrafo;
		}

		/**
		 * @param awpsl2wo_parrafo the awpsl2wo_parrafo to set
		 */
		public void setAwpsl2wo_parrafo(String awpsl2wo_parrafo) {
			this.awpsl2wo_parrafo = awpsl2wo_parrafo;
		}

		/**
		 * @return the awpsl2wo_servicio
		 */
		public String getAwpsl2wo_servicio() {
			return awpsl2wo_servicio;
		}

		/**
		 * @param awpsl2wo_servicio the awpsl2wo_servicio to set
		 */
		public void setAwpsl2wo_servicio(String awpsl2wo_servicio) {
			this.awpsl2wo_servicio = awpsl2wo_servicio;
		}

		/**
		 * @return the awpsl2wo_finpag
		 */
		public String getAwpsl2wo_finpag() {
			return awpsl2wo_finpag;
		}

		/**
		 * @param awpsl2wo_finpag the awpsl2wo_finpag to set
		 */
		public void setAwpsl2wo_finpag(String awpsl2wo_finpag) {
			this.awpsl2wo_finpag = awpsl2wo_finpag;
		}

		/**
		 * @return the awpsl2wo_numreg
		 */
		public Long getAwpsl2wo_numreg() {
			return awpsl2wo_numreg;
		}

		/**
		 * @param awpsl2wo_numreg the awpsl2wo_numreg to set
		 */
		public void setAwpsl2wo_numreg(Long awpsl2wo_numreg) {
			this.awpsl2wo_numreg = awpsl2wo_numreg;
		}
		
	}
	
	/**
	 * 
	 * Awpsl2WoListaPs
	 *
	 */
	public static class Awpsl2WoListaPs{
		 
		/** awpsl2wo_cod_ps */
        private String awpsl2wo_cod_ps;
        
        /** awpsl2wo_desc_ps */
        private String awpsl2wo_desc_ps;
        
        /** awpsl2wo_tip_ps */
        private String awpsl2wo_tip_ps;
         
        /** awpsl2wo_fec_alta_ps */
        private String awpsl2wo_fec_alta_ps;
         
        /** awpsl2wo_cod_op */
        private String awpsl2wo_cod_op;
         
        /** awpsl2wo_desc_op */
        private String awpsl2wo_desc_op;
         
        /** awpsl2wo_cod_paq */
        private String awpsl2wo_cod_paq;
         
        /** awpsl2wo_nombre_paq */
        private String awpsl2wo_nombre_paq;
         
        /** awpsl2wo_cod_fam */
        private String awpsl2wo_cod_fam;
         
        /** awpsl2wo_cod_sg1 */
         private String awpsl2wo_cod_sg1;
        
         /** awpsl2wo_cod_sg2 */
         private String awpsl2wo_cod_sg2;
         
         /** awpsl2wo_marca_ps */
         private String awpsl2wo_marca_ps;
         	
         /** awpsl2wo_cod_isp */
         private String awpsl2wo_cod_isp;
         
         /** awpsl2wo_des_subg1 */
         private String awpsl2wo_des_subg1;
         
         /** awpsl2wo_des_subg2 */
         private String awpsl2wo_des_subg2;
         
         /** awpsl2wo_est_ps */
         private String awpsl2wo_est_ps;

         /** awpsl2wo_cant_ps */
         private Long awpsl2wo_cant_ps;

		/**
		 * @return the awpsl2wo_cod_ps
		 */
		public String getAwpsl2wo_cod_ps() {
			return awpsl2wo_cod_ps;
		}

		/**
		 * @param awpsl2wo_cod_ps the awpsl2wo_cod_ps to set
		 */
		public void setAwpsl2wo_cod_ps(String awpsl2wo_cod_ps) {
			this.awpsl2wo_cod_ps = awpsl2wo_cod_ps;
		}

		/**
		 * @return the awpsl2wo_desc_ps
		 */
		public String getAwpsl2wo_desc_ps() {
			return awpsl2wo_desc_ps;
		}

		/**
		 * @param awpsl2wo_desc_ps the awpsl2wo_desc_ps to set
		 */
		public void setAwpsl2wo_desc_ps(String awpsl2wo_desc_ps) {
			this.awpsl2wo_desc_ps = awpsl2wo_desc_ps;
		}

		/**
		 * @return the awpsl2wo_tip_ps
		 */
		public String getAwpsl2wo_tip_ps() {
			return awpsl2wo_tip_ps;
		}

		/**
		 * @param awpsl2wo_tip_ps the awpsl2wo_tip_ps to set
		 */
		public void setAwpsl2wo_tip_ps(String awpsl2wo_tip_ps) {
			this.awpsl2wo_tip_ps = awpsl2wo_tip_ps;
		}

		/**
		 * @return the awpsl2wo_fec_alta_ps
		 */
		public String getAwpsl2wo_fec_alta_ps() {
			return awpsl2wo_fec_alta_ps;
		}

		/**
		 * @param awpsl2wo_fec_alta_ps the awpsl2wo_fec_alta_ps to set
		 */
		public void setAwpsl2wo_fec_alta_ps(String awpsl2wo_fec_alta_ps) {
			this.awpsl2wo_fec_alta_ps = awpsl2wo_fec_alta_ps;
		}

		/**
		 * @return the awpsl2wo_cod_op
		 */
		public String getAwpsl2wo_cod_op() {
			return awpsl2wo_cod_op;
		}

		/**
		 * @param awpsl2wo_cod_op the awpsl2wo_cod_op to set
		 */
		public void setAwpsl2wo_cod_op(String awpsl2wo_cod_op) {
			this.awpsl2wo_cod_op = awpsl2wo_cod_op;
		}

		/**
		 * @return the awpsl2wo_desc_op
		 */
		public String getAwpsl2wo_desc_op() {
			return awpsl2wo_desc_op;
		}

		/**
		 * @param awpsl2wo_desc_op the awpsl2wo_desc_op to set
		 */
		public void setAwpsl2wo_desc_op(String awpsl2wo_desc_op) {
			this.awpsl2wo_desc_op = awpsl2wo_desc_op;
		}

		/**
		 * @return the awpsl2wo_cod_paq
		 */
		public String getAwpsl2wo_cod_paq() {
			return awpsl2wo_cod_paq;
		}

		/**
		 * @param awpsl2wo_cod_paq the awpsl2wo_cod_paq to set
		 */
		public void setAwpsl2wo_cod_paq(String awpsl2wo_cod_paq) {
			this.awpsl2wo_cod_paq = awpsl2wo_cod_paq;
		}

		/**
		 * @return the awpsl2wo_nombre_paq
		 */
		public String getAwpsl2wo_nombre_paq() {
			return awpsl2wo_nombre_paq;
		}

		/**
		 * @param awpsl2wo_nombre_paq the awpsl2wo_nombre_paq to set
		 */
		public void setAwpsl2wo_nombre_paq(String awpsl2wo_nombre_paq) {
			this.awpsl2wo_nombre_paq = awpsl2wo_nombre_paq;
		}

		/**
		 * @return the awpsl2wo_cod_fam
		 */
		public String getAwpsl2wo_cod_fam() {
			return awpsl2wo_cod_fam;
		}

		/**
		 * @param awpsl2wo_cod_fam the awpsl2wo_cod_fam to set
		 */
		public void setAwpsl2wo_cod_fam(String awpsl2wo_cod_fam) {
			this.awpsl2wo_cod_fam = awpsl2wo_cod_fam;
		}

		/**
		 * @return the awpsl2wo_cod_sg1
		 */
		public String getAwpsl2wo_cod_sg1() {
			return awpsl2wo_cod_sg1;
		}

		/**
		 * @param awpsl2wo_cod_sg1 the awpsl2wo_cod_sg1 to set
		 */
		public void setAwpsl2wo_cod_sg1(String awpsl2wo_cod_sg1) {
			this.awpsl2wo_cod_sg1 = awpsl2wo_cod_sg1;
		}

		/**
		 * @return the awpsl2wo_cod_sg2
		 */
		public String getAwpsl2wo_cod_sg2() {
			return awpsl2wo_cod_sg2;
		}

		/**
		 * @param awpsl2wo_cod_sg2 the awpsl2wo_cod_sg2 to set
		 */
		public void setAwpsl2wo_cod_sg2(String awpsl2wo_cod_sg2) {
			this.awpsl2wo_cod_sg2 = awpsl2wo_cod_sg2;
		}

		/**
		 * @return the awpsl2wo_marca_ps
		 */
		public String getAwpsl2wo_marca_ps() {
			return awpsl2wo_marca_ps;
		}

		/**
		 * @param awpsl2wo_marca_ps the awpsl2wo_marca_ps to set
		 */
		public void setAwpsl2wo_marca_ps(String awpsl2wo_marca_ps) {
			this.awpsl2wo_marca_ps = awpsl2wo_marca_ps;
		}

		/**
		 * @return the awpsl2wo_cod_isp
		 */
		public String getAwpsl2wo_cod_isp() {
			return awpsl2wo_cod_isp;
		}

		/**
		 * @param awpsl2wo_cod_isp the awpsl2wo_cod_isp to set
		 */
		public void setAwpsl2wo_cod_isp(String awpsl2wo_cod_isp) {
			this.awpsl2wo_cod_isp = awpsl2wo_cod_isp;
		}

		/**
		 * @return the awpsl2wo_des_subg1
		 */
		public String getAwpsl2wo_des_subg1() {
			return awpsl2wo_des_subg1;
		}

		/**
		 * @param awpsl2wo_des_subg1 the awpsl2wo_des_subg1 to set
		 */
		public void setAwpsl2wo_des_subg1(String awpsl2wo_des_subg1) {
			this.awpsl2wo_des_subg1 = awpsl2wo_des_subg1;
		}

		/**
		 * @return the awpsl2wo_des_subg2
		 */
		public String getAwpsl2wo_des_subg2() {
			return awpsl2wo_des_subg2;
		}

		/**
		 * @param awpsl2wo_des_subg2 the awpsl2wo_des_subg2 to set
		 */
		public void setAwpsl2wo_des_subg2(String awpsl2wo_des_subg2) {
			this.awpsl2wo_des_subg2 = awpsl2wo_des_subg2;
		}

		/**
		 * @return the awpsl2wo_est_ps
		 */
		public String getAwpsl2wo_est_ps() {
			return awpsl2wo_est_ps;
		}

		/**
		 * @param awpsl2wo_est_ps the awpsl2wo_est_ps to set
		 */
		public void setAwpsl2wo_est_ps(String awpsl2wo_est_ps) {
			this.awpsl2wo_est_ps = awpsl2wo_est_ps;
		}

		/**
		 * @return the awpsl2wo_cant_ps
		 */
		public Long getAwpsl2wo_cant_ps() {
			return awpsl2wo_cant_ps;
		}

		/**
		 * @param awpsl2wo_cant_ps the awpsl2wo_cant_ps to set
		 */
		public void setAwpsl2wo_cant_ps(Long awpsl2wo_cant_ps) {
			this.awpsl2wo_cant_ps = awpsl2wo_cant_ps;
		}
         
	}
}
