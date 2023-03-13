package cl.tchile.app.vo;

import java.util.List;

/**
 * The Class ConsultaPSPorLineaVO.
 */
public class ConsultaPSPorLineaVO {

	/** The awps01 co_o_cod_ret. */
    private String awps01co_o_cod_ret;

    /** The awps01 co_o_desc_cod_ret. */
    private String awps01co_o_desc_cod_ret;

    /** The awps01 co_o_finpaginacion. */
    private String awps01co_o_finpaginacion;

    /** The awps01 co_o_numregistros. */
    private String awps01co_o_numregistros;

    /** The awps01 co_o_pi_cliente. */
    private List<Awps01CoOPiClienteVO> awps01co_o_pi_cliente;

    /** The awps01 co_o_plan_minuto. */
    private String awps01co_o_plan_minuto;
    
    
 
	/**
	 * @return the awps01co_o_cod_ret
	 */
	public String getAwps01co_o_cod_ret() {
		return awps01co_o_cod_ret;
	}



	/**
	 * @param awps01co_o_cod_ret the awps01co_o_cod_ret to set
	 */
	public void setAwps01co_o_cod_ret(String awps01co_o_cod_ret) {
		this.awps01co_o_cod_ret = awps01co_o_cod_ret;
	}



	/**
	 * @return the awps01co_o_desc_cod_ret
	 */
	public String getAwps01co_o_desc_cod_ret() {
		return awps01co_o_desc_cod_ret;
	}



	/**
	 * @param awps01co_o_desc_cod_ret the awps01co_o_desc_cod_ret to set
	 */
	public void setAwps01co_o_desc_cod_ret(String awps01co_o_desc_cod_ret) {
		this.awps01co_o_desc_cod_ret = awps01co_o_desc_cod_ret;
	}



	/**
	 * @return the awps01co_o_finpaginacion
	 */
	public String getAwps01co_o_finpaginacion() {
		return awps01co_o_finpaginacion;
	}



	/**
	 * @param awps01co_o_finpaginacion the awps01co_o_finpaginacion to set
	 */
	public void setAwps01co_o_finpaginacion(String awps01co_o_finpaginacion) {
		this.awps01co_o_finpaginacion = awps01co_o_finpaginacion;
	}



	/**
	 * @return the awps01co_o_numregistros
	 */
	public String getAwps01co_o_numregistros() {
		return awps01co_o_numregistros;
	}



	/**
	 * @param awps01co_o_numregistros the awps01co_o_numregistros to set
	 */
	public void setAwps01co_o_numregistros(String awps01co_o_numregistros) {
		this.awps01co_o_numregistros = awps01co_o_numregistros;
	}
	

	/**
	 * @return the awps01Co_o_pi_cliente
	 */
	public List<Awps01CoOPiClienteVO> getAwps01Co_o_pi_cliente() {
		return awps01co_o_pi_cliente;
	}



	/**
	 * @param awps01Co_o_pi_cliente the awps01Co_o_pi_cliente to set
	 */
	public void setAwps01Co_o_pi_cliente(List<Awps01CoOPiClienteVO> awps01co_o_pi_cliente) {
		this.awps01co_o_pi_cliente = awps01co_o_pi_cliente;
	}



	/**
	 * @return the awps01co_o_plan_minuto
	 */
	public String getAwps01co_o_plan_minuto() {
		return awps01co_o_plan_minuto;
	}



	/**
	 * @param awps01Co_o_plan_minuto the awps01co_o_plan_minuto to set
	 */
	public void setAwps01co_o_plan_minuto(String awps01co_o_plan_minuto) {
		this.awps01co_o_plan_minuto = awps01co_o_plan_minuto;
	}



	/**
     * The Class Awps01CoOPiCliente.
     */					
    public static class Awps01CoOPiClienteVO{
    	/** The awps01 co_o_sec_ps. */
        private String awps01co_o_sec_ps;

        /** The awps01 co_o_cod_ps. */
        private String awps01co_o_cod_ps;

        /** The awps01 co_o_desc_ps. */
        private String awps01co_o_desc_ps;

        /** The awps01 co_o_cod_op. */
        private String awps01co_o_cod_op;

        /** The awps01 co_o_desc_op. */
        private String awps01co_o_desc_op;

        /** The awps01 co_o_cant_ps. */
        private String awps01co_o_cant_ps;

        /** The awps01 co_o_tip_ps. */
        private String awps01co_o_tip_ps;

        /** The awps01 co_o_desc_tip_ps. */
        private String awps01co_o_desc_tip_ps;

        /** The awps01 co_o_ind_fact_ps. */
        private String awps01co_o_ind_fact_ps;

        /** The awps01 co_o_est_ps. */
        private String awps01co_o_est_ps;

        /** The awps01 co_o_fec_alta_ps. */
        private String awps01co_o_fec_alta_ps;

        /** The awps01 co_o_fec_baja_ps. */
        private String awps01co_o_fec_baja_ps;

        /** The awps01 co_o_cod_familia. */
        private String awps01co_o_cod_familia;

        /** The awps01 co_o_desc_familia. */
        private String awps01co_o_desc_familia;

        /** The awps01 co_o_valor_ps. */
        private String awps01co_o_valor_ps;

        /** The awps01 co_o_valor_ps_red. */
        private String awps01co_o_valor_ps_red;

        /** The awps01 co_o_moneda. */
        private String awps01co_o_moneda;

        /** The awps01 co_o_cod_cf. */
        private String awps01co_o_cod_cf;

        /** The awps01 co_o_cod_conf. */
        private String awps01co_o_cod_conf;

        /** The awps01 co_o_desc_cf. */
        private String awps01co_o_desc_cf;

        /** The awps01 co_o_sec_paq. */
        private String awps01co_o_sec_paq;

        /** The awps01 co_o_cod_paq. */
        private String awps01co_o_cod_paq;

        /** The awps01 co_o_nombre_paq. */
        private String awps01co_o_nombre_paq;

        /** The awps01 co_o_cod_fam. */
        private String awps01co_o_cod_fam;

        /** The awps01 co_o_des_fam. */
        private String awps01co_o_des_fam;

        /** The awps01 co_o_subg1_cod. */
        private String awps01co_o_subg1_cod;

        /** The awps01 co_o_des_subg1. */
        private String awps01co_o_des_subg1;

        /** The awps01 co_o_subg2_cod. */
        private String awps01co_o_subg2_cod;

        /** The awps01 co_o_des_subg2. */
        private String awps01co_o_des_subg2;

        /** The awps01 co_o_pi_cliente. */
        private List<Awps01CoSalidaCliente> awps01co_o_pi_cliente;
        

		/**
		 * @return the awps01co_o_sec_ps
		 */
		public String getAwps01co_o_sec_ps() {
			return awps01co_o_sec_ps;
		}




		/**
		 * @param awps01co_o_sec_ps the awps01co_o_sec_ps to set
		 */
		public void setAwps01co_o_sec_ps(String awps01co_o_sec_ps) {
			this.awps01co_o_sec_ps = awps01co_o_sec_ps;
		}




		/**
		 * @return the awps01co_o_cod_ps
		 */
		public String getAwps01co_o_cod_ps() {
			return awps01co_o_cod_ps;
		}




		/**
		 * @param awps01co_o_cod_ps the awps01co_o_cod_ps to set
		 */
		public void setAwps01co_o_cod_ps(String awps01co_o_cod_ps) {
			this.awps01co_o_cod_ps = awps01co_o_cod_ps;
		}




		/**
		 * @return the awps01co_o_desc_ps
		 */
		public String getAwps01co_o_desc_ps() {
			return awps01co_o_desc_ps;
		}




		/**
		 * @param awps01co_o_desc_ps the awps01co_o_desc_ps to set
		 */
		public void setAwps01co_o_desc_ps(String awps01co_o_desc_ps) {
			this.awps01co_o_desc_ps = awps01co_o_desc_ps;
		}




		/**
		 * @return the awps01co_o_cod_op
		 */
		public String getAwps01co_o_cod_op() {
			return awps01co_o_cod_op;
		}




		/**
		 * @param awps01co_o_cod_op the awps01co_o_cod_op to set
		 */
		public void setAwps01co_o_cod_op(String awps01co_o_cod_op) {
			this.awps01co_o_cod_op = awps01co_o_cod_op;
		}




		/**
		 * @return the awps01co_o_desc_op
		 */
		public String getAwps01co_o_desc_op() {
			return awps01co_o_desc_op;
		}




		/**
		 * @param awps01co_o_desc_op the awps01co_o_desc_op to set
		 */
		public void setAwps01co_o_desc_op(String awps01co_o_desc_op) {
			this.awps01co_o_desc_op = awps01co_o_desc_op;
		}




		/**
		 * @return the awps01co_o_cant_ps
		 */
		public String getAwps01co_o_cant_ps() {
			return awps01co_o_cant_ps;
		}




		/**
		 * @param awps01co_o_cant_ps the awps01co_o_cant_ps to set
		 */
		public void setAwps01co_o_cant_ps(String awps01co_o_cant_ps) {
			this.awps01co_o_cant_ps = awps01co_o_cant_ps;
		}




		/**
		 * @return the awps01co_o_tip_ps
		 */
		public String getAwps01co_o_tip_ps() {
			return awps01co_o_tip_ps;
		}




		/**
		 * @param awps01co_o_tip_ps the awps01co_o_tip_ps to set
		 */
		public void setAwps01co_o_tip_ps(String awps01co_o_tip_ps) {
			this.awps01co_o_tip_ps = awps01co_o_tip_ps;
		}




		/**
		 * @return the awps01co_o_desc_tip_ps
		 */
		public String getAwps01co_o_desc_tip_ps() {
			return awps01co_o_desc_tip_ps;
		}




		/**
		 * @param awps01co_o_desc_tip_ps the awps01co_o_desc_tip_ps to set
		 */
		public void setAwps01co_o_desc_tip_ps(String awps01co_o_desc_tip_ps) {
			this.awps01co_o_desc_tip_ps = awps01co_o_desc_tip_ps;
		}




		/**
		 * @return the awps01co_o_ind_fact_ps
		 */
		public String getAwps01co_o_ind_fact_ps() {
			return awps01co_o_ind_fact_ps;
		}




		/**
		 * @param awps01co_o_ind_fact_ps the awps01co_o_ind_fact_ps to set
		 */
		public void setAwps01co_o_ind_fact_ps(String awps01co_o_ind_fact_ps) {
			this.awps01co_o_ind_fact_ps = awps01co_o_ind_fact_ps;
		}




		/**
		 * @return the awps01co_o_est_ps
		 */
		public String getAwps01co_o_est_ps() {
			return awps01co_o_est_ps;
		}




		/**
		 * @param awps01co_o_est_ps the awps01co_o_est_ps to set
		 */
		public void setAwps01co_o_est_ps(String awps01co_o_est_ps) {
			this.awps01co_o_est_ps = awps01co_o_est_ps;
		}




		/**
		 * @return the awps01co_o_fec_alta_ps
		 */
		public String getAwps01co_o_fec_alta_ps() {
			return awps01co_o_fec_alta_ps;
		}




		/**
		 * @param awps01co_o_fec_alta_ps the awps01co_o_fec_alta_ps to set
		 */
		public void setAwps01co_o_fec_alta_ps(String awps01co_o_fec_alta_ps) {
			this.awps01co_o_fec_alta_ps = awps01co_o_fec_alta_ps;
		}




		/**
		 * @return the awps01co_o_fec_baja_ps
		 */
		public String getAwps01co_o_fec_baja_ps() {
			return awps01co_o_fec_baja_ps;
		}




		/**
		 * @param awps01co_o_fec_baja_ps the awps01co_o_fec_baja_ps to set
		 */
		public void setAwps01co_o_fec_baja_ps(String awps01co_o_fec_baja_ps) {
			this.awps01co_o_fec_baja_ps = awps01co_o_fec_baja_ps;
		}




		/**
		 * @return the awps01co_o_cod_familia
		 */
		public String getAwps01co_o_cod_familia() {
			return awps01co_o_cod_familia;
		}




		/**
		 * @param awps01co_o_cod_familia the awps01co_o_cod_familia to set
		 */
		public void setAwps01co_o_cod_familia(String awps01co_o_cod_familia) {
			this.awps01co_o_cod_familia = awps01co_o_cod_familia;
		}




		/**
		 * @return the awps01co_o_desc_familia
		 */
		public String getAwps01co_o_desc_familia() {
			return awps01co_o_desc_familia;
		}




		/**
		 * @param awps01co_o_desc_familia the awps01co_o_desc_familia to set
		 */
		public void setAwps01co_o_desc_familia(String awps01co_o_desc_familia) {
			this.awps01co_o_desc_familia = awps01co_o_desc_familia;
		}




		/**
		 * @return the awps01co_o_valor_ps
		 */
		public String getAwps01co_o_valor_ps() {
			return awps01co_o_valor_ps;
		}




		/**
		 * @param awps01co_o_valor_ps the awps01co_o_valor_ps to set
		 */
		public void setAwps01co_o_valor_ps(String awps01co_o_valor_ps) {
			this.awps01co_o_valor_ps = awps01co_o_valor_ps;
		}




		/**
		 * @return the awps01co_o_valor_ps_red
		 */
		public String getAwps01co_o_valor_ps_red() {
			return awps01co_o_valor_ps_red;
		}




		/**
		 * @param awps01co_o_valor_ps_red the awps01co_o_valor_ps_red to set
		 */
		public void setAwps01co_o_valor_ps_red(String awps01co_o_valor_ps_red) {
			this.awps01co_o_valor_ps_red = awps01co_o_valor_ps_red;
		}




		/**
		 * @return the awps01co_o_moneda
		 */
		public String getAwps01co_o_moneda() {
			return awps01co_o_moneda;
		}




		/**
		 * @param awps01co_o_moneda the awps01co_o_moneda to set
		 */
		public void setAwps01co_o_moneda(String awps01co_o_moneda) {
			this.awps01co_o_moneda = awps01co_o_moneda;
		}




		/**
		 * @return the awps01co_o_cod_cf
		 */
		public String getAwps01co_o_cod_cf() {
			return awps01co_o_cod_cf;
		}




		/**
		 * @param awps01co_o_cod_cf the awps01co_o_cod_cf to set
		 */
		public void setAwps01co_o_cod_cf(String awps01co_o_cod_cf) {
			this.awps01co_o_cod_cf = awps01co_o_cod_cf;
		}




		/**
		 * @return the awps01co_o_cod_conf
		 */
		public String getAwps01co_o_cod_conf() {
			return awps01co_o_cod_conf;
		}




		/**
		 * @param awps01co_o_cod_conf the awps01co_o_cod_conf to set
		 */
		public void setAwps01co_o_cod_conf(String awps01co_o_cod_conf) {
			this.awps01co_o_cod_conf = awps01co_o_cod_conf;
		}




		/**
		 * @return the awps01co_o_desc_cf
		 */
		public String getAwps01co_o_desc_cf() {
			return awps01co_o_desc_cf;
		}




		/**
		 * @param awps01co_o_desc_cf the awps01co_o_desc_cf to set
		 */
		public void setAwps01co_o_desc_cf(String awps01co_o_desc_cf) {
			this.awps01co_o_desc_cf = awps01co_o_desc_cf;
		}




		/**
		 * @return the awps01co_o_sec_paq
		 */
		public String getAwps01co_o_sec_paq() {
			return awps01co_o_sec_paq;
		}




		/**
		 * @param awps01co_o_sec_paq the awps01co_o_sec_paq to set
		 */
		public void setAwps01co_o_sec_paq(String awps01co_o_sec_paq) {
			this.awps01co_o_sec_paq = awps01co_o_sec_paq;
		}




		/**
		 * @return the awps01co_o_cod_paq
		 */
		public String getAwps01co_o_cod_paq() {
			return awps01co_o_cod_paq;
		}




		/**
		 * @param awps01co_o_cod_paq the awps01co_o_cod_paq to set
		 */
		public void setAwps01co_o_cod_paq(String awps01co_o_cod_paq) {
			this.awps01co_o_cod_paq = awps01co_o_cod_paq;
		}




		/**
		 * @return the awps01co_o_nombre_paq
		 */
		public String getAwps01co_o_nombre_paq() {
			return awps01co_o_nombre_paq;
		}




		/**
		 * @param awps01co_o_nombre_paq the awps01co_o_nombre_paq to set
		 */
		public void setAwps01co_o_nombre_paq(String awps01co_o_nombre_paq) {
			this.awps01co_o_nombre_paq = awps01co_o_nombre_paq;
		}




		/**
		 * @return the awps01co_o_cod_fam
		 */
		public String getAwps01co_o_cod_fam() {
			return awps01co_o_cod_fam;
		}




		/**
		 * @param awps01co_o_cod_fam the awps01co_o_cod_fam to set
		 */
		public void setAwps01co_o_cod_fam(String awps01co_o_cod_fam) {
			this.awps01co_o_cod_fam = awps01co_o_cod_fam;
		}




		/**
		 * @return the awps01co_o_des_fam
		 */
		public String getAwps01co_o_des_fam() {
			return awps01co_o_des_fam;
		}




		/**
		 * @param awps01co_o_des_fam the awps01co_o_des_fam to set
		 */
		public void setAwps01co_o_des_fam(String awps01co_o_des_fam) {
			this.awps01co_o_des_fam = awps01co_o_des_fam;
		}




		/**
		 * @return the awps01co_o_subg1_cod
		 */
		public String getAwps01co_o_subg1_cod() {
			return awps01co_o_subg1_cod;
		}




		/**
		 * @param awps01co_o_subg1_cod the awps01co_o_subg1_cod to set
		 */
		public void setAwps01co_o_subg1_cod(String awps01co_o_subg1_cod) {
			this.awps01co_o_subg1_cod = awps01co_o_subg1_cod;
		}




		/**
		 * @return the awps01co_o_des_subg1
		 */
		public String getAwps01co_o_des_subg1() {
			return awps01co_o_des_subg1;
		}




		/**
		 * @param awps01co_o_des_subg1 the awps01co_o_des_subg1 to set
		 */
		public void setAwps01co_o_des_subg1(String awps01co_o_des_subg1) {
			this.awps01co_o_des_subg1 = awps01co_o_des_subg1;
		}




		/**
		 * @return the awps01co_o_subg2_cod
		 */
		public String getAwps01co_o_subg2_cod() {
			return awps01co_o_subg2_cod;
		}




		/**
		 * @param awps01co_o_subg2_cod the awps01co_o_subg2_cod to set
		 */
		public void setAwps01co_o_subg2_cod(String awps01co_o_subg2_cod) {
			this.awps01co_o_subg2_cod = awps01co_o_subg2_cod;
		}




		/**
		 * @return the awps01co_o_des_subg2
		 */
		public String getAwps01co_o_des_subg2() {
			return awps01co_o_des_subg2;
		}




		/**
		 * @param awps01co_o_des_subg2 the awps01co_o_des_subg2 to set
		 */
		public void setAwps01co_o_des_subg2(String awps01co_o_des_subg2) {
			this.awps01co_o_des_subg2 = awps01co_o_des_subg2;
		}




		/**
		 * @return the awps01co_o_pi_cliente
		 */
		public List<Awps01CoSalidaCliente> getAwps01co_o_pi_cliente() {
			return awps01co_o_pi_cliente;
		}




		/**
		 * @param awps01co_o_pi_cliente the awps01co_o_pi_cliente to set
		 */
		public void setAwps01co_o_pi_cliente(List<Awps01CoSalidaCliente> awps01co_o_pi_cliente) {
			this.awps01co_o_pi_cliente = awps01co_o_pi_cliente;
		}




		/**
         * The Class Awps01CoSalidaCliente.
         */
        public static class Awps01CoSalidaCliente{
        	/** The awps01 co_o_sec_car. */
            private String awps01co_o_sec_car;

            /** The awps01 co_o_cod_car. */
            private String awps01co_o_cod_car;

            /** The awps01 co_o_cod_dom. */
            private String awps01co_o_cod_dom;

            /** The awps01 co_o_tip_dom. */
            private String awps01co_o_tip_dom;

            /** The awps01 co_o_valor_dom. */
            private String awps01co_o_valor_dom;

			/**
			 * @return the awps01co_o_sec_car
			 */
			public String getAwps01co_o_sec_car() {
				return awps01co_o_sec_car;
			}

			/**
			 * @param awps01co_o_sec_car the awps01co_o_sec_car to set
			 */
			public void setAwps01co_o_sec_car(String awps01co_o_sec_car) {
				this.awps01co_o_sec_car = awps01co_o_sec_car;
			}

			/**
			 * @return the awps01co_o_cod_car
			 */
			public String getAwps01co_o_cod_car() {
				return awps01co_o_cod_car;
			}

			/**
			 * @param awps01co_o_cod_car the awps01co_o_cod_car to set
			 */
			public void setAwps01co_o_cod_car(String awps01co_o_cod_car) {
				this.awps01co_o_cod_car = awps01co_o_cod_car;
			}

			/**
			 * @return the awps01co_o_cod_dom
			 */
			public String getAwps01co_o_cod_dom() {
				return awps01co_o_cod_dom;
			}

			/**
			 * @param awps01co_o_cod_dom the awps01co_o_cod_dom to set
			 */
			public void setAwps01co_o_cod_dom(String awps01co_o_cod_dom) {
				this.awps01co_o_cod_dom = awps01co_o_cod_dom;
			}

			/**
			 * @return the awps01co_o_tip_dom
			 */
			public String getAwps01co_o_tip_dom() {
				return awps01co_o_tip_dom;
			}

			/**
			 * @param awps01co_o_tip_dom the awps01co_o_tip_dom to set
			 */
			public void setAwps01co_o_tip_dom(String awps01co_o_tip_dom) {
				this.awps01co_o_tip_dom = awps01co_o_tip_dom;
			}

			/**
			 * @return the awps01co_o_valor_dom
			 */
			public String getAwps01co_o_valor_dom() {
				return awps01co_o_valor_dom;
			}

			/**
			 * @param awps01co_o_valor_dom the awps01co_o_valor_dom to set
			 */
			public void setAwps01co_o_valor_dom(String awps01co_o_valor_dom) {
				this.awps01co_o_valor_dom = awps01co_o_valor_dom;
			}

            
        }
    }
    
}
