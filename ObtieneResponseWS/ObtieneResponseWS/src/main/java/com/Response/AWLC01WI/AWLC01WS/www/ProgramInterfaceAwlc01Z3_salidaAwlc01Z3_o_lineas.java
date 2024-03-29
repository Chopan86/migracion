/**
 * ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.AWLC01WI.AWLC01WS.www;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cl.tchile.adapter.UnsignedIntAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas  implements java.io.Serializable {
    private java.lang.String awlc01Z3_o_area;

    private java.lang.String awlc01Z3_o_fono;

    private java.lang.String awlc01Z3_o_sec_linea;

    private java.lang.String awlc01Z3_o_calle_inst;

    private java.lang.String awlc01Z3_o_num_inst;

    private java.lang.String awlc01Z3_o_piso_inst;

    private java.lang.String awlc01Z3_o_dpto_inst;

    private java.lang.String awlc01Z3_o_cod_post_inst;

    private java.lang.String awlc01Z3_o_cod_comun;

    private java.lang.String awlc01Z3_o_desc_comun_inst;

    private java.lang.String awlc01Z3_o_ciuda_inst;

    private java.lang.String awlc01Z3_o_zona;

    private java.lang.String awlc01Z3_o_central;

    private java.lang.String awlc01Z3_o_desc_zona_cent;

    private java.lang.String awlc01Z3_o_pta_comercial;

    private java.lang.String awlc01Z3_o_fec_instalacion;

    private java.lang.String awlc01Z3_o_tipo_linea;

    private java.lang.String awlc01Z3_o_desc_tipo_linea;

    private java.lang.String awlc01Z3_o_ind_fact;

    private java.lang.String awlc01Z3_o_ind_pagadora;

    private java.lang.String awlc01Z3_o_est_linea;

    private java.lang.String awlc01Z3_o_cod_agencia;

    private java.lang.String awlc01Z3_o_desc_agencia;

    private java.lang.String awlc01Z3_o_fec_alta_li;

    private java.lang.String awlc01Z3_o_fec_fin_vi;
    
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlc01Z3_o_clie;
    
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlc01Z3_o_num_cuen;

    private com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineasAwlc01Z3_o_direccion_cob awlc01Z3_o_direccion_cob;

    public ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas() {
    }

    public ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas(
           java.lang.String awlc01Z3_o_area,
           java.lang.String awlc01Z3_o_fono,
           java.lang.String awlc01Z3_o_sec_linea,
           java.lang.String awlc01Z3_o_calle_inst,
           java.lang.String awlc01Z3_o_num_inst,
           java.lang.String awlc01Z3_o_piso_inst,
           java.lang.String awlc01Z3_o_dpto_inst,
           java.lang.String awlc01Z3_o_cod_post_inst,
           java.lang.String awlc01Z3_o_cod_comun,
           java.lang.String awlc01Z3_o_desc_comun_inst,
           java.lang.String awlc01Z3_o_ciuda_inst,
           java.lang.String awlc01Z3_o_zona,
           java.lang.String awlc01Z3_o_central,
           java.lang.String awlc01Z3_o_desc_zona_cent,
           java.lang.String awlc01Z3_o_pta_comercial,
           java.lang.String awlc01Z3_o_fec_instalacion,
           java.lang.String awlc01Z3_o_tipo_linea,
           java.lang.String awlc01Z3_o_desc_tipo_linea,
           java.lang.String awlc01Z3_o_ind_fact,
           java.lang.String awlc01Z3_o_ind_pagadora,
           java.lang.String awlc01Z3_o_est_linea,
           java.lang.String awlc01Z3_o_cod_agencia,
           java.lang.String awlc01Z3_o_desc_agencia,
           java.lang.String awlc01Z3_o_fec_alta_li,
           java.lang.String awlc01Z3_o_fec_fin_vi,
           org.apache.axis.types.UnsignedInt awlc01Z3_o_clie,
           org.apache.axis.types.UnsignedInt awlc01Z3_o_num_cuen,
           com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineasAwlc01Z3_o_direccion_cob awlc01Z3_o_direccion_cob) {
           this.awlc01Z3_o_area = awlc01Z3_o_area;
           this.awlc01Z3_o_fono = awlc01Z3_o_fono;
           this.awlc01Z3_o_sec_linea = awlc01Z3_o_sec_linea;
           this.awlc01Z3_o_calle_inst = awlc01Z3_o_calle_inst;
           this.awlc01Z3_o_num_inst = awlc01Z3_o_num_inst;
           this.awlc01Z3_o_piso_inst = awlc01Z3_o_piso_inst;
           this.awlc01Z3_o_dpto_inst = awlc01Z3_o_dpto_inst;
           this.awlc01Z3_o_cod_post_inst = awlc01Z3_o_cod_post_inst;
           this.awlc01Z3_o_cod_comun = awlc01Z3_o_cod_comun;
           this.awlc01Z3_o_desc_comun_inst = awlc01Z3_o_desc_comun_inst;
           this.awlc01Z3_o_ciuda_inst = awlc01Z3_o_ciuda_inst;
           this.awlc01Z3_o_zona = awlc01Z3_o_zona;
           this.awlc01Z3_o_central = awlc01Z3_o_central;
           this.awlc01Z3_o_desc_zona_cent = awlc01Z3_o_desc_zona_cent;
           this.awlc01Z3_o_pta_comercial = awlc01Z3_o_pta_comercial;
           this.awlc01Z3_o_fec_instalacion = awlc01Z3_o_fec_instalacion;
           this.awlc01Z3_o_tipo_linea = awlc01Z3_o_tipo_linea;
           this.awlc01Z3_o_desc_tipo_linea = awlc01Z3_o_desc_tipo_linea;
           this.awlc01Z3_o_ind_fact = awlc01Z3_o_ind_fact;
           this.awlc01Z3_o_ind_pagadora = awlc01Z3_o_ind_pagadora;
           this.awlc01Z3_o_est_linea = awlc01Z3_o_est_linea;
           this.awlc01Z3_o_cod_agencia = awlc01Z3_o_cod_agencia;
           this.awlc01Z3_o_desc_agencia = awlc01Z3_o_desc_agencia;
           this.awlc01Z3_o_fec_alta_li = awlc01Z3_o_fec_alta_li;
           this.awlc01Z3_o_fec_fin_vi = awlc01Z3_o_fec_fin_vi;
           this.awlc01Z3_o_clie = awlc01Z3_o_clie;
           this.awlc01Z3_o_num_cuen = awlc01Z3_o_num_cuen;
           this.awlc01Z3_o_direccion_cob = awlc01Z3_o_direccion_cob;
    }


    /**
     * Gets the awlc01Z3_o_area value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_area
     */
    public java.lang.String getAwlc01Z3_o_area() {
        return awlc01Z3_o_area;
    }


    /**
     * Sets the awlc01Z3_o_area value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_area
     */
    public void setAwlc01Z3_o_area(java.lang.String awlc01Z3_o_area) {
        this.awlc01Z3_o_area = awlc01Z3_o_area;
    }


    /**
     * Gets the awlc01Z3_o_fono value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_fono
     */
    public java.lang.String getAwlc01Z3_o_fono() {
        return awlc01Z3_o_fono;
    }


    /**
     * Sets the awlc01Z3_o_fono value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_fono
     */
    public void setAwlc01Z3_o_fono(java.lang.String awlc01Z3_o_fono) {
        this.awlc01Z3_o_fono = awlc01Z3_o_fono;
    }


    /**
     * Gets the awlc01Z3_o_sec_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_sec_linea
     */
    public java.lang.String getAwlc01Z3_o_sec_linea() {
        return awlc01Z3_o_sec_linea;
    }


    /**
     * Sets the awlc01Z3_o_sec_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_sec_linea
     */
    public void setAwlc01Z3_o_sec_linea(java.lang.String awlc01Z3_o_sec_linea) {
        this.awlc01Z3_o_sec_linea = awlc01Z3_o_sec_linea;
    }


    /**
     * Gets the awlc01Z3_o_calle_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_calle_inst
     */
    public java.lang.String getAwlc01Z3_o_calle_inst() {
        return awlc01Z3_o_calle_inst;
    }


    /**
     * Sets the awlc01Z3_o_calle_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_calle_inst
     */
    public void setAwlc01Z3_o_calle_inst(java.lang.String awlc01Z3_o_calle_inst) {
        this.awlc01Z3_o_calle_inst = awlc01Z3_o_calle_inst;
    }


    /**
     * Gets the awlc01Z3_o_num_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_num_inst
     */
    public java.lang.String getAwlc01Z3_o_num_inst() {
        return awlc01Z3_o_num_inst;
    }


    /**
     * Sets the awlc01Z3_o_num_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_num_inst
     */
    public void setAwlc01Z3_o_num_inst(java.lang.String awlc01Z3_o_num_inst) {
        this.awlc01Z3_o_num_inst = awlc01Z3_o_num_inst;
    }


    /**
     * Gets the awlc01Z3_o_piso_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_piso_inst
     */
    public java.lang.String getAwlc01Z3_o_piso_inst() {
        return awlc01Z3_o_piso_inst;
    }


    /**
     * Sets the awlc01Z3_o_piso_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_piso_inst
     */
    public void setAwlc01Z3_o_piso_inst(java.lang.String awlc01Z3_o_piso_inst) {
        this.awlc01Z3_o_piso_inst = awlc01Z3_o_piso_inst;
    }


    /**
     * Gets the awlc01Z3_o_dpto_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_dpto_inst
     */
    public java.lang.String getAwlc01Z3_o_dpto_inst() {
        return awlc01Z3_o_dpto_inst;
    }


    /**
     * Sets the awlc01Z3_o_dpto_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_dpto_inst
     */
    public void setAwlc01Z3_o_dpto_inst(java.lang.String awlc01Z3_o_dpto_inst) {
        this.awlc01Z3_o_dpto_inst = awlc01Z3_o_dpto_inst;
    }


    /**
     * Gets the awlc01Z3_o_cod_post_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_cod_post_inst
     */
    public java.lang.String getAwlc01Z3_o_cod_post_inst() {
        return awlc01Z3_o_cod_post_inst;
    }


    /**
     * Sets the awlc01Z3_o_cod_post_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_cod_post_inst
     */
    public void setAwlc01Z3_o_cod_post_inst(java.lang.String awlc01Z3_o_cod_post_inst) {
        this.awlc01Z3_o_cod_post_inst = awlc01Z3_o_cod_post_inst;
    }


    /**
     * Gets the awlc01Z3_o_cod_comun value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_cod_comun
     */
    public java.lang.String getAwlc01Z3_o_cod_comun() {
        return awlc01Z3_o_cod_comun;
    }


    /**
     * Sets the awlc01Z3_o_cod_comun value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_cod_comun
     */
    public void setAwlc01Z3_o_cod_comun(java.lang.String awlc01Z3_o_cod_comun) {
        this.awlc01Z3_o_cod_comun = awlc01Z3_o_cod_comun;
    }


    /**
     * Gets the awlc01Z3_o_desc_comun_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_desc_comun_inst
     */
    public java.lang.String getAwlc01Z3_o_desc_comun_inst() {
        return awlc01Z3_o_desc_comun_inst;
    }


    /**
     * Sets the awlc01Z3_o_desc_comun_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_desc_comun_inst
     */
    public void setAwlc01Z3_o_desc_comun_inst(java.lang.String awlc01Z3_o_desc_comun_inst) {
        this.awlc01Z3_o_desc_comun_inst = awlc01Z3_o_desc_comun_inst;
    }


    /**
     * Gets the awlc01Z3_o_ciuda_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_ciuda_inst
     */
    public java.lang.String getAwlc01Z3_o_ciuda_inst() {
        return awlc01Z3_o_ciuda_inst;
    }


    /**
     * Sets the awlc01Z3_o_ciuda_inst value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_ciuda_inst
     */
    public void setAwlc01Z3_o_ciuda_inst(java.lang.String awlc01Z3_o_ciuda_inst) {
        this.awlc01Z3_o_ciuda_inst = awlc01Z3_o_ciuda_inst;
    }


    /**
     * Gets the awlc01Z3_o_zona value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_zona
     */
    public java.lang.String getAwlc01Z3_o_zona() {
        return awlc01Z3_o_zona;
    }


    /**
     * Sets the awlc01Z3_o_zona value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_zona
     */
    public void setAwlc01Z3_o_zona(java.lang.String awlc01Z3_o_zona) {
        this.awlc01Z3_o_zona = awlc01Z3_o_zona;
    }


    /**
     * Gets the awlc01Z3_o_central value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_central
     */
    public java.lang.String getAwlc01Z3_o_central() {
        return awlc01Z3_o_central;
    }


    /**
     * Sets the awlc01Z3_o_central value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_central
     */
    public void setAwlc01Z3_o_central(java.lang.String awlc01Z3_o_central) {
        this.awlc01Z3_o_central = awlc01Z3_o_central;
    }


    /**
     * Gets the awlc01Z3_o_desc_zona_cent value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_desc_zona_cent
     */
    public java.lang.String getAwlc01Z3_o_desc_zona_cent() {
        return awlc01Z3_o_desc_zona_cent;
    }


    /**
     * Sets the awlc01Z3_o_desc_zona_cent value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_desc_zona_cent
     */
    public void setAwlc01Z3_o_desc_zona_cent(java.lang.String awlc01Z3_o_desc_zona_cent) {
        this.awlc01Z3_o_desc_zona_cent = awlc01Z3_o_desc_zona_cent;
    }


    /**
     * Gets the awlc01Z3_o_pta_comercial value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_pta_comercial
     */
    public java.lang.String getAwlc01Z3_o_pta_comercial() {
        return awlc01Z3_o_pta_comercial;
    }


    /**
     * Sets the awlc01Z3_o_pta_comercial value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_pta_comercial
     */
    public void setAwlc01Z3_o_pta_comercial(java.lang.String awlc01Z3_o_pta_comercial) {
        this.awlc01Z3_o_pta_comercial = awlc01Z3_o_pta_comercial;
    }


    /**
     * Gets the awlc01Z3_o_fec_instalacion value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_fec_instalacion
     */
    public java.lang.String getAwlc01Z3_o_fec_instalacion() {
        return awlc01Z3_o_fec_instalacion;
    }


    /**
     * Sets the awlc01Z3_o_fec_instalacion value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_fec_instalacion
     */
    public void setAwlc01Z3_o_fec_instalacion(java.lang.String awlc01Z3_o_fec_instalacion) {
        this.awlc01Z3_o_fec_instalacion = awlc01Z3_o_fec_instalacion;
    }


    /**
     * Gets the awlc01Z3_o_tipo_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_tipo_linea
     */
    public java.lang.String getAwlc01Z3_o_tipo_linea() {
        return awlc01Z3_o_tipo_linea;
    }


    /**
     * Sets the awlc01Z3_o_tipo_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_tipo_linea
     */
    public void setAwlc01Z3_o_tipo_linea(java.lang.String awlc01Z3_o_tipo_linea) {
        this.awlc01Z3_o_tipo_linea = awlc01Z3_o_tipo_linea;
    }


    /**
     * Gets the awlc01Z3_o_desc_tipo_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_desc_tipo_linea
     */
    public java.lang.String getAwlc01Z3_o_desc_tipo_linea() {
        return awlc01Z3_o_desc_tipo_linea;
    }


    /**
     * Sets the awlc01Z3_o_desc_tipo_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_desc_tipo_linea
     */
    public void setAwlc01Z3_o_desc_tipo_linea(java.lang.String awlc01Z3_o_desc_tipo_linea) {
        this.awlc01Z3_o_desc_tipo_linea = awlc01Z3_o_desc_tipo_linea;
    }


    /**
     * Gets the awlc01Z3_o_ind_fact value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_ind_fact
     */
    public java.lang.String getAwlc01Z3_o_ind_fact() {
        return awlc01Z3_o_ind_fact;
    }


    /**
     * Sets the awlc01Z3_o_ind_fact value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_ind_fact
     */
    public void setAwlc01Z3_o_ind_fact(java.lang.String awlc01Z3_o_ind_fact) {
        this.awlc01Z3_o_ind_fact = awlc01Z3_o_ind_fact;
    }


    /**
     * Gets the awlc01Z3_o_ind_pagadora value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_ind_pagadora
     */
    public java.lang.String getAwlc01Z3_o_ind_pagadora() {
        return awlc01Z3_o_ind_pagadora;
    }


    /**
     * Sets the awlc01Z3_o_ind_pagadora value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_ind_pagadora
     */
    public void setAwlc01Z3_o_ind_pagadora(java.lang.String awlc01Z3_o_ind_pagadora) {
        this.awlc01Z3_o_ind_pagadora = awlc01Z3_o_ind_pagadora;
    }


    /**
     * Gets the awlc01Z3_o_est_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_est_linea
     */
    public java.lang.String getAwlc01Z3_o_est_linea() {
        return awlc01Z3_o_est_linea;
    }


    /**
     * Sets the awlc01Z3_o_est_linea value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_est_linea
     */
    public void setAwlc01Z3_o_est_linea(java.lang.String awlc01Z3_o_est_linea) {
        this.awlc01Z3_o_est_linea = awlc01Z3_o_est_linea;
    }


    /**
     * Gets the awlc01Z3_o_cod_agencia value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_cod_agencia
     */
    public java.lang.String getAwlc01Z3_o_cod_agencia() {
        return awlc01Z3_o_cod_agencia;
    }


    /**
     * Sets the awlc01Z3_o_cod_agencia value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_cod_agencia
     */
    public void setAwlc01Z3_o_cod_agencia(java.lang.String awlc01Z3_o_cod_agencia) {
        this.awlc01Z3_o_cod_agencia = awlc01Z3_o_cod_agencia;
    }


    /**
     * Gets the awlc01Z3_o_desc_agencia value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_desc_agencia
     */
    public java.lang.String getAwlc01Z3_o_desc_agencia() {
        return awlc01Z3_o_desc_agencia;
    }


    /**
     * Sets the awlc01Z3_o_desc_agencia value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_desc_agencia
     */
    public void setAwlc01Z3_o_desc_agencia(java.lang.String awlc01Z3_o_desc_agencia) {
        this.awlc01Z3_o_desc_agencia = awlc01Z3_o_desc_agencia;
    }


    /**
     * Gets the awlc01Z3_o_fec_alta_li value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_fec_alta_li
     */
    public java.lang.String getAwlc01Z3_o_fec_alta_li() {
        return awlc01Z3_o_fec_alta_li;
    }


    /**
     * Sets the awlc01Z3_o_fec_alta_li value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_fec_alta_li
     */
    public void setAwlc01Z3_o_fec_alta_li(java.lang.String awlc01Z3_o_fec_alta_li) {
        this.awlc01Z3_o_fec_alta_li = awlc01Z3_o_fec_alta_li;
    }


    /**
     * Gets the awlc01Z3_o_fec_fin_vi value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_fec_fin_vi
     */
    public java.lang.String getAwlc01Z3_o_fec_fin_vi() {
        return awlc01Z3_o_fec_fin_vi;
    }


    /**
     * Sets the awlc01Z3_o_fec_fin_vi value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_fec_fin_vi
     */
    public void setAwlc01Z3_o_fec_fin_vi(java.lang.String awlc01Z3_o_fec_fin_vi) {
        this.awlc01Z3_o_fec_fin_vi = awlc01Z3_o_fec_fin_vi;
    }


    /**
     * Gets the awlc01Z3_o_clie value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_clie
     */
    public org.apache.axis.types.UnsignedInt getAwlc01Z3_o_clie() {
        return awlc01Z3_o_clie;
    }


    /**
     * Sets the awlc01Z3_o_clie value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_clie
     */
    public void setAwlc01Z3_o_clie(org.apache.axis.types.UnsignedInt awlc01Z3_o_clie) {
        this.awlc01Z3_o_clie = awlc01Z3_o_clie;
    }


    /**
     * Gets the awlc01Z3_o_num_cuen value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_num_cuen
     */
    public org.apache.axis.types.UnsignedInt getAwlc01Z3_o_num_cuen() {
        return awlc01Z3_o_num_cuen;
    }


    /**
     * Sets the awlc01Z3_o_num_cuen value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_num_cuen
     */
    public void setAwlc01Z3_o_num_cuen(org.apache.axis.types.UnsignedInt awlc01Z3_o_num_cuen) {
        this.awlc01Z3_o_num_cuen = awlc01Z3_o_num_cuen;
    }


    /**
     * Gets the awlc01Z3_o_direccion_cob value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @return awlc01Z3_o_direccion_cob
     */
    public com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineasAwlc01Z3_o_direccion_cob getAwlc01Z3_o_direccion_cob() {
        return awlc01Z3_o_direccion_cob;
    }


    /**
     * Sets the awlc01Z3_o_direccion_cob value for this ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.
     * 
     * @param awlc01Z3_o_direccion_cob
     */
    public void setAwlc01Z3_o_direccion_cob(com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineasAwlc01Z3_o_direccion_cob awlc01Z3_o_direccion_cob) {
        this.awlc01Z3_o_direccion_cob = awlc01Z3_o_direccion_cob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas)) return false;
        ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas other = (ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awlc01Z3_o_area==null && other.getAwlc01Z3_o_area()==null) || 
             (this.awlc01Z3_o_area!=null &&
              this.awlc01Z3_o_area.equals(other.getAwlc01Z3_o_area()))) &&
            ((this.awlc01Z3_o_fono==null && other.getAwlc01Z3_o_fono()==null) || 
             (this.awlc01Z3_o_fono!=null &&
              this.awlc01Z3_o_fono.equals(other.getAwlc01Z3_o_fono()))) &&
            ((this.awlc01Z3_o_sec_linea==null && other.getAwlc01Z3_o_sec_linea()==null) || 
             (this.awlc01Z3_o_sec_linea!=null &&
              this.awlc01Z3_o_sec_linea.equals(other.getAwlc01Z3_o_sec_linea()))) &&
            ((this.awlc01Z3_o_calle_inst==null && other.getAwlc01Z3_o_calle_inst()==null) || 
             (this.awlc01Z3_o_calle_inst!=null &&
              this.awlc01Z3_o_calle_inst.equals(other.getAwlc01Z3_o_calle_inst()))) &&
            ((this.awlc01Z3_o_num_inst==null && other.getAwlc01Z3_o_num_inst()==null) || 
             (this.awlc01Z3_o_num_inst!=null &&
              this.awlc01Z3_o_num_inst.equals(other.getAwlc01Z3_o_num_inst()))) &&
            ((this.awlc01Z3_o_piso_inst==null && other.getAwlc01Z3_o_piso_inst()==null) || 
             (this.awlc01Z3_o_piso_inst!=null &&
              this.awlc01Z3_o_piso_inst.equals(other.getAwlc01Z3_o_piso_inst()))) &&
            ((this.awlc01Z3_o_dpto_inst==null && other.getAwlc01Z3_o_dpto_inst()==null) || 
             (this.awlc01Z3_o_dpto_inst!=null &&
              this.awlc01Z3_o_dpto_inst.equals(other.getAwlc01Z3_o_dpto_inst()))) &&
            ((this.awlc01Z3_o_cod_post_inst==null && other.getAwlc01Z3_o_cod_post_inst()==null) || 
             (this.awlc01Z3_o_cod_post_inst!=null &&
              this.awlc01Z3_o_cod_post_inst.equals(other.getAwlc01Z3_o_cod_post_inst()))) &&
            ((this.awlc01Z3_o_cod_comun==null && other.getAwlc01Z3_o_cod_comun()==null) || 
             (this.awlc01Z3_o_cod_comun!=null &&
              this.awlc01Z3_o_cod_comun.equals(other.getAwlc01Z3_o_cod_comun()))) &&
            ((this.awlc01Z3_o_desc_comun_inst==null && other.getAwlc01Z3_o_desc_comun_inst()==null) || 
             (this.awlc01Z3_o_desc_comun_inst!=null &&
              this.awlc01Z3_o_desc_comun_inst.equals(other.getAwlc01Z3_o_desc_comun_inst()))) &&
            ((this.awlc01Z3_o_ciuda_inst==null && other.getAwlc01Z3_o_ciuda_inst()==null) || 
             (this.awlc01Z3_o_ciuda_inst!=null &&
              this.awlc01Z3_o_ciuda_inst.equals(other.getAwlc01Z3_o_ciuda_inst()))) &&
            ((this.awlc01Z3_o_zona==null && other.getAwlc01Z3_o_zona()==null) || 
             (this.awlc01Z3_o_zona!=null &&
              this.awlc01Z3_o_zona.equals(other.getAwlc01Z3_o_zona()))) &&
            ((this.awlc01Z3_o_central==null && other.getAwlc01Z3_o_central()==null) || 
             (this.awlc01Z3_o_central!=null &&
              this.awlc01Z3_o_central.equals(other.getAwlc01Z3_o_central()))) &&
            ((this.awlc01Z3_o_desc_zona_cent==null && other.getAwlc01Z3_o_desc_zona_cent()==null) || 
             (this.awlc01Z3_o_desc_zona_cent!=null &&
              this.awlc01Z3_o_desc_zona_cent.equals(other.getAwlc01Z3_o_desc_zona_cent()))) &&
            ((this.awlc01Z3_o_pta_comercial==null && other.getAwlc01Z3_o_pta_comercial()==null) || 
             (this.awlc01Z3_o_pta_comercial!=null &&
              this.awlc01Z3_o_pta_comercial.equals(other.getAwlc01Z3_o_pta_comercial()))) &&
            ((this.awlc01Z3_o_fec_instalacion==null && other.getAwlc01Z3_o_fec_instalacion()==null) || 
             (this.awlc01Z3_o_fec_instalacion!=null &&
              this.awlc01Z3_o_fec_instalacion.equals(other.getAwlc01Z3_o_fec_instalacion()))) &&
            ((this.awlc01Z3_o_tipo_linea==null && other.getAwlc01Z3_o_tipo_linea()==null) || 
             (this.awlc01Z3_o_tipo_linea!=null &&
              this.awlc01Z3_o_tipo_linea.equals(other.getAwlc01Z3_o_tipo_linea()))) &&
            ((this.awlc01Z3_o_desc_tipo_linea==null && other.getAwlc01Z3_o_desc_tipo_linea()==null) || 
             (this.awlc01Z3_o_desc_tipo_linea!=null &&
              this.awlc01Z3_o_desc_tipo_linea.equals(other.getAwlc01Z3_o_desc_tipo_linea()))) &&
            ((this.awlc01Z3_o_ind_fact==null && other.getAwlc01Z3_o_ind_fact()==null) || 
             (this.awlc01Z3_o_ind_fact!=null &&
              this.awlc01Z3_o_ind_fact.equals(other.getAwlc01Z3_o_ind_fact()))) &&
            ((this.awlc01Z3_o_ind_pagadora==null && other.getAwlc01Z3_o_ind_pagadora()==null) || 
             (this.awlc01Z3_o_ind_pagadora!=null &&
              this.awlc01Z3_o_ind_pagadora.equals(other.getAwlc01Z3_o_ind_pagadora()))) &&
            ((this.awlc01Z3_o_est_linea==null && other.getAwlc01Z3_o_est_linea()==null) || 
             (this.awlc01Z3_o_est_linea!=null &&
              this.awlc01Z3_o_est_linea.equals(other.getAwlc01Z3_o_est_linea()))) &&
            ((this.awlc01Z3_o_cod_agencia==null && other.getAwlc01Z3_o_cod_agencia()==null) || 
             (this.awlc01Z3_o_cod_agencia!=null &&
              this.awlc01Z3_o_cod_agencia.equals(other.getAwlc01Z3_o_cod_agencia()))) &&
            ((this.awlc01Z3_o_desc_agencia==null && other.getAwlc01Z3_o_desc_agencia()==null) || 
             (this.awlc01Z3_o_desc_agencia!=null &&
              this.awlc01Z3_o_desc_agencia.equals(other.getAwlc01Z3_o_desc_agencia()))) &&
            ((this.awlc01Z3_o_fec_alta_li==null && other.getAwlc01Z3_o_fec_alta_li()==null) || 
             (this.awlc01Z3_o_fec_alta_li!=null &&
              this.awlc01Z3_o_fec_alta_li.equals(other.getAwlc01Z3_o_fec_alta_li()))) &&
            ((this.awlc01Z3_o_fec_fin_vi==null && other.getAwlc01Z3_o_fec_fin_vi()==null) || 
             (this.awlc01Z3_o_fec_fin_vi!=null &&
              this.awlc01Z3_o_fec_fin_vi.equals(other.getAwlc01Z3_o_fec_fin_vi()))) &&
            ((this.awlc01Z3_o_clie==null && other.getAwlc01Z3_o_clie()==null) || 
             (this.awlc01Z3_o_clie!=null &&
              this.awlc01Z3_o_clie.equals(other.getAwlc01Z3_o_clie()))) &&
            ((this.awlc01Z3_o_num_cuen==null && other.getAwlc01Z3_o_num_cuen()==null) || 
             (this.awlc01Z3_o_num_cuen!=null &&
              this.awlc01Z3_o_num_cuen.equals(other.getAwlc01Z3_o_num_cuen()))) &&
            ((this.awlc01Z3_o_direccion_cob==null && other.getAwlc01Z3_o_direccion_cob()==null) || 
             (this.awlc01Z3_o_direccion_cob!=null &&
              this.awlc01Z3_o_direccion_cob.equals(other.getAwlc01Z3_o_direccion_cob())));
        __equalsCalc = null;
        return _equals;
    }

    @XmlTransient
    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAwlc01Z3_o_area() != null) {
            _hashCode += getAwlc01Z3_o_area().hashCode();
        }
        if (getAwlc01Z3_o_fono() != null) {
            _hashCode += getAwlc01Z3_o_fono().hashCode();
        }
        if (getAwlc01Z3_o_sec_linea() != null) {
            _hashCode += getAwlc01Z3_o_sec_linea().hashCode();
        }
        if (getAwlc01Z3_o_calle_inst() != null) {
            _hashCode += getAwlc01Z3_o_calle_inst().hashCode();
        }
        if (getAwlc01Z3_o_num_inst() != null) {
            _hashCode += getAwlc01Z3_o_num_inst().hashCode();
        }
        if (getAwlc01Z3_o_piso_inst() != null) {
            _hashCode += getAwlc01Z3_o_piso_inst().hashCode();
        }
        if (getAwlc01Z3_o_dpto_inst() != null) {
            _hashCode += getAwlc01Z3_o_dpto_inst().hashCode();
        }
        if (getAwlc01Z3_o_cod_post_inst() != null) {
            _hashCode += getAwlc01Z3_o_cod_post_inst().hashCode();
        }
        if (getAwlc01Z3_o_cod_comun() != null) {
            _hashCode += getAwlc01Z3_o_cod_comun().hashCode();
        }
        if (getAwlc01Z3_o_desc_comun_inst() != null) {
            _hashCode += getAwlc01Z3_o_desc_comun_inst().hashCode();
        }
        if (getAwlc01Z3_o_ciuda_inst() != null) {
            _hashCode += getAwlc01Z3_o_ciuda_inst().hashCode();
        }
        if (getAwlc01Z3_o_zona() != null) {
            _hashCode += getAwlc01Z3_o_zona().hashCode();
        }
        if (getAwlc01Z3_o_central() != null) {
            _hashCode += getAwlc01Z3_o_central().hashCode();
        }
        if (getAwlc01Z3_o_desc_zona_cent() != null) {
            _hashCode += getAwlc01Z3_o_desc_zona_cent().hashCode();
        }
        if (getAwlc01Z3_o_pta_comercial() != null) {
            _hashCode += getAwlc01Z3_o_pta_comercial().hashCode();
        }
        if (getAwlc01Z3_o_fec_instalacion() != null) {
            _hashCode += getAwlc01Z3_o_fec_instalacion().hashCode();
        }
        if (getAwlc01Z3_o_tipo_linea() != null) {
            _hashCode += getAwlc01Z3_o_tipo_linea().hashCode();
        }
        if (getAwlc01Z3_o_desc_tipo_linea() != null) {
            _hashCode += getAwlc01Z3_o_desc_tipo_linea().hashCode();
        }
        if (getAwlc01Z3_o_ind_fact() != null) {
            _hashCode += getAwlc01Z3_o_ind_fact().hashCode();
        }
        if (getAwlc01Z3_o_ind_pagadora() != null) {
            _hashCode += getAwlc01Z3_o_ind_pagadora().hashCode();
        }
        if (getAwlc01Z3_o_est_linea() != null) {
            _hashCode += getAwlc01Z3_o_est_linea().hashCode();
        }
        if (getAwlc01Z3_o_cod_agencia() != null) {
            _hashCode += getAwlc01Z3_o_cod_agencia().hashCode();
        }
        if (getAwlc01Z3_o_desc_agencia() != null) {
            _hashCode += getAwlc01Z3_o_desc_agencia().hashCode();
        }
        if (getAwlc01Z3_o_fec_alta_li() != null) {
            _hashCode += getAwlc01Z3_o_fec_alta_li().hashCode();
        }
        if (getAwlc01Z3_o_fec_fin_vi() != null) {
            _hashCode += getAwlc01Z3_o_fec_fin_vi().hashCode();
        }
        if (getAwlc01Z3_o_clie() != null) {
            _hashCode += getAwlc01Z3_o_clie().hashCode();
        }
        if (getAwlc01Z3_o_num_cuen() != null) {
            _hashCode += getAwlc01Z3_o_num_cuen().hashCode();
        }
        if (getAwlc01Z3_o_direccion_cob() != null) {
            _hashCode += getAwlc01Z3_o_direccion_cob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", ">>ProgramInterface>awlc01z3_salida>awlc01z3_o_lineas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_fono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_fono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_sec_linea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_sec_linea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_calle_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_calle_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_num_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_num_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_piso_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_piso_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_dpto_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_dpto_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_post_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_post_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_comun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_comun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_comun_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_comun_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ciuda_inst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ciuda_inst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_zona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_zona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_central");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_zona_cent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_zona_cent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_pta_comercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_pta_comercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_fec_instalacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_fec_instalacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_tipo_linea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_tipo_linea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_tipo_linea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_tipo_linea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ind_fact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ind_fact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ind_pagadora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ind_pagadora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_est_linea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_est_linea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_fec_alta_li");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_fec_alta_li"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_fec_fin_vi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_fec_fin_vi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_clie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_clie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_num_cuen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_num_cuen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_direccion_cob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_direccion_cob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", ">>>ProgramInterface>awlc01z3_salida>awlc01z3_o_lineas>awlc01z3_o_direccion_cob"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
