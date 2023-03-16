/**
 * ProgramInterfaceAwlc01Z3_salida.java
 * <p>
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
import cl.tchile.adapter.UnsignedShortAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceAwlc01Z3_salida implements java.io.Serializable {
    private java.lang.String awlc01Z3_o_cod_ret;

    private java.lang.String awlc01Z3_o_desc_cod_ret;

    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlc01Z3_o_sqlcode;

    private java.lang.String awlc01Z3_o_parrafo;

    private java.lang.String awlc01Z3_o_finpaginacion;

    @XmlJavaTypeAdapter(value = UnsignedShortAdapter.class, type = Short.class)
    private org.apache.axis.types.UnsignedShort awlc01Z3_o_numregistros;

    private java.lang.String awlc01Z3_o_nom_pag;

    private java.lang.String awlc01Z3_o_ape1_pag;

    private java.lang.String awlc01Z3_o_ape2_pag;

    private java.lang.String awlc01Z3_o_nom_tit;

    private java.lang.String awlc01Z3_o_ape1_tit;

    private java.lang.String awlc01Z3_o_ape2_tit;

    private java.lang.String awlc01Z3_o_rut_tit;

    private java.lang.String awlc01Z3_o_dvf_tit;

    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlc01Z3_o_sec_tit;

    private java.lang.String awlc01Z3_o_raz_soc;

    private java.lang.String awlc01Z3_o_nom_fan;

    private java.lang.String awlc01Z3_o_cod_giro;

    private java.lang.String awlc01Z3_o_tipo_clie;

    private java.lang.String awlc01Z3_o_tipo_seg;

    private java.lang.String awlc01Z3_o_desc_tipo_clie;

    private java.lang.String awlc01Z3_o_cod_seg;

    private java.lang.String awlc01Z3_o_desc_seg;

    private java.lang.String awlc01Z3_o_cod_sub_seg;

    private java.lang.String awlc01Z3_o_desc_sub_seg;

    private java.lang.String awlc01Z3_o_mail_cliente;

    private java.lang.String awlc01Z3_o_fecha_alt_clte;

    private java.lang.String awlc01Z3_o_area_fax;

    private java.lang.String awlc01Z3_o_num_fax;

    private java.lang.String awlc01Z3_o_num_celula;

    private java.lang.String awlc01Z3_o_pag_web;

    private java.lang.String awlc01Z3_o_calle_tit;

    private java.lang.String awlc01Z3_o_num_tit;

    private java.lang.String awlc01Z3_o_piso_tit;

    private java.lang.String awlc01Z3_o_dpto_tit;

    private java.lang.String awlc01Z3_o_desc_comun_tit;

    private java.lang.String awlc01Z3_o_desc_ciuda_tit;

    private com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas[] awlc01Z3_o_lineas;

    public ProgramInterfaceAwlc01Z3_salida() {
    }

    public ProgramInterfaceAwlc01Z3_salida(
        java.lang.String awlc01Z3_o_cod_ret,
        java.lang.String awlc01Z3_o_desc_cod_ret,
        org.apache.axis.types.UnsignedInt awlc01Z3_o_sqlcode,
        java.lang.String awlc01Z3_o_parrafo,
        java.lang.String awlc01Z3_o_finpaginacion,
        org.apache.axis.types.UnsignedShort awlc01Z3_o_numregistros,
        java.lang.String awlc01Z3_o_nom_pag,
        java.lang.String awlc01Z3_o_ape1_pag,
        java.lang.String awlc01Z3_o_ape2_pag,
        java.lang.String awlc01Z3_o_nom_tit,
        java.lang.String awlc01Z3_o_ape1_tit,
        java.lang.String awlc01Z3_o_ape2_tit,
        java.lang.String awlc01Z3_o_rut_tit,
        java.lang.String awlc01Z3_o_dvf_tit,
        org.apache.axis.types.UnsignedInt awlc01Z3_o_sec_tit,
        java.lang.String awlc01Z3_o_raz_soc,
        java.lang.String awlc01Z3_o_nom_fan,
        java.lang.String awlc01Z3_o_cod_giro,
        java.lang.String awlc01Z3_o_tipo_clie,
        java.lang.String awlc01Z3_o_tipo_seg,
        java.lang.String awlc01Z3_o_desc_tipo_clie,
        java.lang.String awlc01Z3_o_cod_seg,
        java.lang.String awlc01Z3_o_desc_seg,
        java.lang.String awlc01Z3_o_cod_sub_seg,
        java.lang.String awlc01Z3_o_desc_sub_seg,
        java.lang.String awlc01Z3_o_mail_cliente,
        java.lang.String awlc01Z3_o_fecha_alt_clte,
        java.lang.String awlc01Z3_o_area_fax,
        java.lang.String awlc01Z3_o_num_fax,
        java.lang.String awlc01Z3_o_num_celula,
        java.lang.String awlc01Z3_o_pag_web,
        java.lang.String awlc01Z3_o_calle_tit,
        java.lang.String awlc01Z3_o_num_tit,
        java.lang.String awlc01Z3_o_piso_tit,
        java.lang.String awlc01Z3_o_dpto_tit,
        java.lang.String awlc01Z3_o_desc_comun_tit,
        java.lang.String awlc01Z3_o_desc_ciuda_tit,
        com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas[] awlc01Z3_o_lineas) {
        this.awlc01Z3_o_cod_ret = awlc01Z3_o_cod_ret;
        this.awlc01Z3_o_desc_cod_ret = awlc01Z3_o_desc_cod_ret;
        this.awlc01Z3_o_sqlcode = awlc01Z3_o_sqlcode;
        this.awlc01Z3_o_parrafo = awlc01Z3_o_parrafo;
        this.awlc01Z3_o_finpaginacion = awlc01Z3_o_finpaginacion;
        this.awlc01Z3_o_numregistros = awlc01Z3_o_numregistros;
        this.awlc01Z3_o_nom_pag = awlc01Z3_o_nom_pag;
        this.awlc01Z3_o_ape1_pag = awlc01Z3_o_ape1_pag;
        this.awlc01Z3_o_ape2_pag = awlc01Z3_o_ape2_pag;
        this.awlc01Z3_o_nom_tit = awlc01Z3_o_nom_tit;
        this.awlc01Z3_o_ape1_tit = awlc01Z3_o_ape1_tit;
        this.awlc01Z3_o_ape2_tit = awlc01Z3_o_ape2_tit;
        this.awlc01Z3_o_rut_tit = awlc01Z3_o_rut_tit;
        this.awlc01Z3_o_dvf_tit = awlc01Z3_o_dvf_tit;
        this.awlc01Z3_o_sec_tit = awlc01Z3_o_sec_tit;
        this.awlc01Z3_o_raz_soc = awlc01Z3_o_raz_soc;
        this.awlc01Z3_o_nom_fan = awlc01Z3_o_nom_fan;
        this.awlc01Z3_o_cod_giro = awlc01Z3_o_cod_giro;
        this.awlc01Z3_o_tipo_clie = awlc01Z3_o_tipo_clie;
        this.awlc01Z3_o_tipo_seg = awlc01Z3_o_tipo_seg;
        this.awlc01Z3_o_desc_tipo_clie = awlc01Z3_o_desc_tipo_clie;
        this.awlc01Z3_o_cod_seg = awlc01Z3_o_cod_seg;
        this.awlc01Z3_o_desc_seg = awlc01Z3_o_desc_seg;
        this.awlc01Z3_o_cod_sub_seg = awlc01Z3_o_cod_sub_seg;
        this.awlc01Z3_o_desc_sub_seg = awlc01Z3_o_desc_sub_seg;
        this.awlc01Z3_o_mail_cliente = awlc01Z3_o_mail_cliente;
        this.awlc01Z3_o_fecha_alt_clte = awlc01Z3_o_fecha_alt_clte;
        this.awlc01Z3_o_area_fax = awlc01Z3_o_area_fax;
        this.awlc01Z3_o_num_fax = awlc01Z3_o_num_fax;
        this.awlc01Z3_o_num_celula = awlc01Z3_o_num_celula;
        this.awlc01Z3_o_pag_web = awlc01Z3_o_pag_web;
        this.awlc01Z3_o_calle_tit = awlc01Z3_o_calle_tit;
        this.awlc01Z3_o_num_tit = awlc01Z3_o_num_tit;
        this.awlc01Z3_o_piso_tit = awlc01Z3_o_piso_tit;
        this.awlc01Z3_o_dpto_tit = awlc01Z3_o_dpto_tit;
        this.awlc01Z3_o_desc_comun_tit = awlc01Z3_o_desc_comun_tit;
        this.awlc01Z3_o_desc_ciuda_tit = awlc01Z3_o_desc_ciuda_tit;
        this.awlc01Z3_o_lineas = awlc01Z3_o_lineas;
    }

    /**
     * Gets the awlc01Z3_o_cod_ret value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_cod_ret
     */
    public java.lang.String getAwlc01Z3_o_cod_ret() {
        return awlc01Z3_o_cod_ret;
    }

    /**
     * Sets the awlc01Z3_o_cod_ret value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_cod_ret
     */
    public void setAwlc01Z3_o_cod_ret(java.lang.String awlc01Z3_o_cod_ret) {
        this.awlc01Z3_o_cod_ret = awlc01Z3_o_cod_ret;
    }

    /**
     * Gets the awlc01Z3_o_desc_cod_ret value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_desc_cod_ret
     */
    public java.lang.String getAwlc01Z3_o_desc_cod_ret() {
        return awlc01Z3_o_desc_cod_ret;
    }

    /**
     * Sets the awlc01Z3_o_desc_cod_ret value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_desc_cod_ret
     */
    public void setAwlc01Z3_o_desc_cod_ret(java.lang.String awlc01Z3_o_desc_cod_ret) {
        this.awlc01Z3_o_desc_cod_ret = awlc01Z3_o_desc_cod_ret;
    }

    /**
     * Gets the awlc01Z3_o_sqlcode value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_sqlcode
     */
    public org.apache.axis.types.UnsignedInt getAwlc01Z3_o_sqlcode() {
        return awlc01Z3_o_sqlcode;
    }

    /**
     * Sets the awlc01Z3_o_sqlcode value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_sqlcode
     */
    public void setAwlc01Z3_o_sqlcode(org.apache.axis.types.UnsignedInt awlc01Z3_o_sqlcode) {
        this.awlc01Z3_o_sqlcode = awlc01Z3_o_sqlcode;
    }

    /**
     * Gets the awlc01Z3_o_parrafo value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_parrafo
     */
    public java.lang.String getAwlc01Z3_o_parrafo() {
        return awlc01Z3_o_parrafo;
    }

    /**
     * Sets the awlc01Z3_o_parrafo value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_parrafo
     */
    public void setAwlc01Z3_o_parrafo(java.lang.String awlc01Z3_o_parrafo) {
        this.awlc01Z3_o_parrafo = awlc01Z3_o_parrafo;
    }

    /**
     * Gets the awlc01Z3_o_finpaginacion value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_finpaginacion
     */
    public java.lang.String getAwlc01Z3_o_finpaginacion() {
        return awlc01Z3_o_finpaginacion;
    }

    /**
     * Sets the awlc01Z3_o_finpaginacion value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_finpaginacion
     */
    public void setAwlc01Z3_o_finpaginacion(java.lang.String awlc01Z3_o_finpaginacion) {
        this.awlc01Z3_o_finpaginacion = awlc01Z3_o_finpaginacion;
    }

    /**
     * Gets the awlc01Z3_o_numregistros value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_numregistros
     */
    public org.apache.axis.types.UnsignedShort getAwlc01Z3_o_numregistros() {
        return awlc01Z3_o_numregistros;
    }

    /**
     * Sets the awlc01Z3_o_numregistros value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_numregistros
     */
    public void setAwlc01Z3_o_numregistros(org.apache.axis.types.UnsignedShort awlc01Z3_o_numregistros) {
        this.awlc01Z3_o_numregistros = awlc01Z3_o_numregistros;
    }

    /**
     * Gets the awlc01Z3_o_nom_pag value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_nom_pag
     */
    public java.lang.String getAwlc01Z3_o_nom_pag() {
        return awlc01Z3_o_nom_pag;
    }

    /**
     * Sets the awlc01Z3_o_nom_pag value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_nom_pag
     */
    public void setAwlc01Z3_o_nom_pag(java.lang.String awlc01Z3_o_nom_pag) {
        this.awlc01Z3_o_nom_pag = awlc01Z3_o_nom_pag;
    }

    /**
     * Gets the awlc01Z3_o_ape1_pag value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_ape1_pag
     */
    public java.lang.String getAwlc01Z3_o_ape1_pag() {
        return awlc01Z3_o_ape1_pag;
    }

    /**
     * Sets the awlc01Z3_o_ape1_pag value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_ape1_pag
     */
    public void setAwlc01Z3_o_ape1_pag(java.lang.String awlc01Z3_o_ape1_pag) {
        this.awlc01Z3_o_ape1_pag = awlc01Z3_o_ape1_pag;
    }

    /**
     * Gets the awlc01Z3_o_ape2_pag value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_ape2_pag
     */
    public java.lang.String getAwlc01Z3_o_ape2_pag() {
        return awlc01Z3_o_ape2_pag;
    }

    /**
     * Sets the awlc01Z3_o_ape2_pag value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_ape2_pag
     */
    public void setAwlc01Z3_o_ape2_pag(java.lang.String awlc01Z3_o_ape2_pag) {
        this.awlc01Z3_o_ape2_pag = awlc01Z3_o_ape2_pag;
    }

    /**
     * Gets the awlc01Z3_o_nom_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_nom_tit
     */
    public java.lang.String getAwlc01Z3_o_nom_tit() {
        return awlc01Z3_o_nom_tit;
    }

    /**
     * Sets the awlc01Z3_o_nom_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_nom_tit
     */
    public void setAwlc01Z3_o_nom_tit(java.lang.String awlc01Z3_o_nom_tit) {
        this.awlc01Z3_o_nom_tit = awlc01Z3_o_nom_tit;
    }

    /**
     * Gets the awlc01Z3_o_ape1_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_ape1_tit
     */
    public java.lang.String getAwlc01Z3_o_ape1_tit() {
        return awlc01Z3_o_ape1_tit;
    }

    /**
     * Sets the awlc01Z3_o_ape1_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_ape1_tit
     */
    public void setAwlc01Z3_o_ape1_tit(java.lang.String awlc01Z3_o_ape1_tit) {
        this.awlc01Z3_o_ape1_tit = awlc01Z3_o_ape1_tit;
    }

    /**
     * Gets the awlc01Z3_o_ape2_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_ape2_tit
     */
    public java.lang.String getAwlc01Z3_o_ape2_tit() {
        return awlc01Z3_o_ape2_tit;
    }

    /**
     * Sets the awlc01Z3_o_ape2_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_ape2_tit
     */
    public void setAwlc01Z3_o_ape2_tit(java.lang.String awlc01Z3_o_ape2_tit) {
        this.awlc01Z3_o_ape2_tit = awlc01Z3_o_ape2_tit;
    }

    /**
     * Gets the awlc01Z3_o_rut_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_rut_tit
     */
    public java.lang.String getAwlc01Z3_o_rut_tit() {
        return awlc01Z3_o_rut_tit;
    }

    /**
     * Sets the awlc01Z3_o_rut_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_rut_tit
     */
    public void setAwlc01Z3_o_rut_tit(java.lang.String awlc01Z3_o_rut_tit) {
        this.awlc01Z3_o_rut_tit = awlc01Z3_o_rut_tit;
    }

    /**
     * Gets the awlc01Z3_o_dvf_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_dvf_tit
     */
    public java.lang.String getAwlc01Z3_o_dvf_tit() {
        return awlc01Z3_o_dvf_tit;
    }

    /**
     * Sets the awlc01Z3_o_dvf_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_dvf_tit
     */
    public void setAwlc01Z3_o_dvf_tit(java.lang.String awlc01Z3_o_dvf_tit) {
        this.awlc01Z3_o_dvf_tit = awlc01Z3_o_dvf_tit;
    }

    /**
     * Gets the awlc01Z3_o_sec_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_sec_tit
     */
    public org.apache.axis.types.UnsignedInt getAwlc01Z3_o_sec_tit() {
        return awlc01Z3_o_sec_tit;
    }

    /**
     * Sets the awlc01Z3_o_sec_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_sec_tit
     */
    public void setAwlc01Z3_o_sec_tit(org.apache.axis.types.UnsignedInt awlc01Z3_o_sec_tit) {
        this.awlc01Z3_o_sec_tit = awlc01Z3_o_sec_tit;
    }

    /**
     * Gets the awlc01Z3_o_raz_soc value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_raz_soc
     */
    public java.lang.String getAwlc01Z3_o_raz_soc() {
        return awlc01Z3_o_raz_soc;
    }

    /**
     * Sets the awlc01Z3_o_raz_soc value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_raz_soc
     */
    public void setAwlc01Z3_o_raz_soc(java.lang.String awlc01Z3_o_raz_soc) {
        this.awlc01Z3_o_raz_soc = awlc01Z3_o_raz_soc;
    }

    /**
     * Gets the awlc01Z3_o_nom_fan value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_nom_fan
     */
    public java.lang.String getAwlc01Z3_o_nom_fan() {
        return awlc01Z3_o_nom_fan;
    }

    /**
     * Sets the awlc01Z3_o_nom_fan value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_nom_fan
     */
    public void setAwlc01Z3_o_nom_fan(java.lang.String awlc01Z3_o_nom_fan) {
        this.awlc01Z3_o_nom_fan = awlc01Z3_o_nom_fan;
    }

    /**
     * Gets the awlc01Z3_o_cod_giro value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_cod_giro
     */
    public java.lang.String getAwlc01Z3_o_cod_giro() {
        return awlc01Z3_o_cod_giro;
    }

    /**
     * Sets the awlc01Z3_o_cod_giro value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_cod_giro
     */
    public void setAwlc01Z3_o_cod_giro(java.lang.String awlc01Z3_o_cod_giro) {
        this.awlc01Z3_o_cod_giro = awlc01Z3_o_cod_giro;
    }

    /**
     * Gets the awlc01Z3_o_tipo_clie value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_tipo_clie
     */
    public java.lang.String getAwlc01Z3_o_tipo_clie() {
        return awlc01Z3_o_tipo_clie;
    }

    /**
     * Sets the awlc01Z3_o_tipo_clie value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_tipo_clie
     */
    public void setAwlc01Z3_o_tipo_clie(java.lang.String awlc01Z3_o_tipo_clie) {
        this.awlc01Z3_o_tipo_clie = awlc01Z3_o_tipo_clie;
    }

    /**
     * Gets the awlc01Z3_o_tipo_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_tipo_seg
     */
    public java.lang.String getAwlc01Z3_o_tipo_seg() {
        return awlc01Z3_o_tipo_seg;
    }

    /**
     * Sets the awlc01Z3_o_tipo_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_tipo_seg
     */
    public void setAwlc01Z3_o_tipo_seg(java.lang.String awlc01Z3_o_tipo_seg) {
        this.awlc01Z3_o_tipo_seg = awlc01Z3_o_tipo_seg;
    }

    /**
     * Gets the awlc01Z3_o_desc_tipo_clie value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_desc_tipo_clie
     */
    public java.lang.String getAwlc01Z3_o_desc_tipo_clie() {
        return awlc01Z3_o_desc_tipo_clie;
    }

    /**
     * Sets the awlc01Z3_o_desc_tipo_clie value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_desc_tipo_clie
     */
    public void setAwlc01Z3_o_desc_tipo_clie(java.lang.String awlc01Z3_o_desc_tipo_clie) {
        this.awlc01Z3_o_desc_tipo_clie = awlc01Z3_o_desc_tipo_clie;
    }

    /**
     * Gets the awlc01Z3_o_cod_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_cod_seg
     */
    public java.lang.String getAwlc01Z3_o_cod_seg() {
        return awlc01Z3_o_cod_seg;
    }

    /**
     * Sets the awlc01Z3_o_cod_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_cod_seg
     */
    public void setAwlc01Z3_o_cod_seg(java.lang.String awlc01Z3_o_cod_seg) {
        this.awlc01Z3_o_cod_seg = awlc01Z3_o_cod_seg;
    }

    /**
     * Gets the awlc01Z3_o_desc_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_desc_seg
     */
    public java.lang.String getAwlc01Z3_o_desc_seg() {
        return awlc01Z3_o_desc_seg;
    }

    /**
     * Sets the awlc01Z3_o_desc_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_desc_seg
     */
    public void setAwlc01Z3_o_desc_seg(java.lang.String awlc01Z3_o_desc_seg) {
        this.awlc01Z3_o_desc_seg = awlc01Z3_o_desc_seg;
    }

    /**
     * Gets the awlc01Z3_o_cod_sub_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_cod_sub_seg
     */
    public java.lang.String getAwlc01Z3_o_cod_sub_seg() {
        return awlc01Z3_o_cod_sub_seg;
    }

    /**
     * Sets the awlc01Z3_o_cod_sub_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_cod_sub_seg
     */
    public void setAwlc01Z3_o_cod_sub_seg(java.lang.String awlc01Z3_o_cod_sub_seg) {
        this.awlc01Z3_o_cod_sub_seg = awlc01Z3_o_cod_sub_seg;
    }

    /**
     * Gets the awlc01Z3_o_desc_sub_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_desc_sub_seg
     */
    public java.lang.String getAwlc01Z3_o_desc_sub_seg() {
        return awlc01Z3_o_desc_sub_seg;
    }

    /**
     * Sets the awlc01Z3_o_desc_sub_seg value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_desc_sub_seg
     */
    public void setAwlc01Z3_o_desc_sub_seg(java.lang.String awlc01Z3_o_desc_sub_seg) {
        this.awlc01Z3_o_desc_sub_seg = awlc01Z3_o_desc_sub_seg;
    }

    /**
     * Gets the awlc01Z3_o_mail_cliente value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_mail_cliente
     */
    public java.lang.String getAwlc01Z3_o_mail_cliente() {
        return awlc01Z3_o_mail_cliente;
    }

    /**
     * Sets the awlc01Z3_o_mail_cliente value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_mail_cliente
     */
    public void setAwlc01Z3_o_mail_cliente(java.lang.String awlc01Z3_o_mail_cliente) {
        this.awlc01Z3_o_mail_cliente = awlc01Z3_o_mail_cliente;
    }

    /**
     * Gets the awlc01Z3_o_fecha_alt_clte value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_fecha_alt_clte
     */
    public java.lang.String getAwlc01Z3_o_fecha_alt_clte() {
        return awlc01Z3_o_fecha_alt_clte;
    }

    /**
     * Sets the awlc01Z3_o_fecha_alt_clte value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_fecha_alt_clte
     */
    public void setAwlc01Z3_o_fecha_alt_clte(java.lang.String awlc01Z3_o_fecha_alt_clte) {
        this.awlc01Z3_o_fecha_alt_clte = awlc01Z3_o_fecha_alt_clte;
    }

    /**
     * Gets the awlc01Z3_o_area_fax value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_area_fax
     */
    public java.lang.String getAwlc01Z3_o_area_fax() {
        return awlc01Z3_o_area_fax;
    }

    /**
     * Sets the awlc01Z3_o_area_fax value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_area_fax
     */
    public void setAwlc01Z3_o_area_fax(java.lang.String awlc01Z3_o_area_fax) {
        this.awlc01Z3_o_area_fax = awlc01Z3_o_area_fax;
    }

    /**
     * Gets the awlc01Z3_o_num_fax value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_num_fax
     */
    public java.lang.String getAwlc01Z3_o_num_fax() {
        return awlc01Z3_o_num_fax;
    }

    /**
     * Sets the awlc01Z3_o_num_fax value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_num_fax
     */
    public void setAwlc01Z3_o_num_fax(java.lang.String awlc01Z3_o_num_fax) {
        this.awlc01Z3_o_num_fax = awlc01Z3_o_num_fax;
    }

    /**
     * Gets the awlc01Z3_o_num_celula value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_num_celula
     */
    public java.lang.String getAwlc01Z3_o_num_celula() {
        return awlc01Z3_o_num_celula;
    }

    /**
     * Sets the awlc01Z3_o_num_celula value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_num_celula
     */
    public void setAwlc01Z3_o_num_celula(java.lang.String awlc01Z3_o_num_celula) {
        this.awlc01Z3_o_num_celula = awlc01Z3_o_num_celula;
    }

    /**
     * Gets the awlc01Z3_o_pag_web value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_pag_web
     */
    public java.lang.String getAwlc01Z3_o_pag_web() {
        return awlc01Z3_o_pag_web;
    }

    /**
     * Sets the awlc01Z3_o_pag_web value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_pag_web
     */
    public void setAwlc01Z3_o_pag_web(java.lang.String awlc01Z3_o_pag_web) {
        this.awlc01Z3_o_pag_web = awlc01Z3_o_pag_web;
    }

    /**
     * Gets the awlc01Z3_o_calle_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_calle_tit
     */
    public java.lang.String getAwlc01Z3_o_calle_tit() {
        return awlc01Z3_o_calle_tit;
    }

    /**
     * Sets the awlc01Z3_o_calle_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_calle_tit
     */
    public void setAwlc01Z3_o_calle_tit(java.lang.String awlc01Z3_o_calle_tit) {
        this.awlc01Z3_o_calle_tit = awlc01Z3_o_calle_tit;
    }

    /**
     * Gets the awlc01Z3_o_num_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_num_tit
     */
    public java.lang.String getAwlc01Z3_o_num_tit() {
        return awlc01Z3_o_num_tit;
    }

    /**
     * Sets the awlc01Z3_o_num_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_num_tit
     */
    public void setAwlc01Z3_o_num_tit(java.lang.String awlc01Z3_o_num_tit) {
        this.awlc01Z3_o_num_tit = awlc01Z3_o_num_tit;
    }

    /**
     * Gets the awlc01Z3_o_piso_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_piso_tit
     */
    public java.lang.String getAwlc01Z3_o_piso_tit() {
        return awlc01Z3_o_piso_tit;
    }

    /**
     * Sets the awlc01Z3_o_piso_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_piso_tit
     */
    public void setAwlc01Z3_o_piso_tit(java.lang.String awlc01Z3_o_piso_tit) {
        this.awlc01Z3_o_piso_tit = awlc01Z3_o_piso_tit;
    }

    /**
     * Gets the awlc01Z3_o_dpto_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_dpto_tit
     */
    public java.lang.String getAwlc01Z3_o_dpto_tit() {
        return awlc01Z3_o_dpto_tit;
    }

    /**
     * Sets the awlc01Z3_o_dpto_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_dpto_tit
     */
    public void setAwlc01Z3_o_dpto_tit(java.lang.String awlc01Z3_o_dpto_tit) {
        this.awlc01Z3_o_dpto_tit = awlc01Z3_o_dpto_tit;
    }

    /**
     * Gets the awlc01Z3_o_desc_comun_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_desc_comun_tit
     */
    public java.lang.String getAwlc01Z3_o_desc_comun_tit() {
        return awlc01Z3_o_desc_comun_tit;
    }

    /**
     * Sets the awlc01Z3_o_desc_comun_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_desc_comun_tit
     */
    public void setAwlc01Z3_o_desc_comun_tit(java.lang.String awlc01Z3_o_desc_comun_tit) {
        this.awlc01Z3_o_desc_comun_tit = awlc01Z3_o_desc_comun_tit;
    }

    /**
     * Gets the awlc01Z3_o_desc_ciuda_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_desc_ciuda_tit
     */
    public java.lang.String getAwlc01Z3_o_desc_ciuda_tit() {
        return awlc01Z3_o_desc_ciuda_tit;
    }

    /**
     * Sets the awlc01Z3_o_desc_ciuda_tit value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_desc_ciuda_tit
     */
    public void setAwlc01Z3_o_desc_ciuda_tit(java.lang.String awlc01Z3_o_desc_ciuda_tit) {
        this.awlc01Z3_o_desc_ciuda_tit = awlc01Z3_o_desc_ciuda_tit;
    }

    /**
     * Gets the awlc01Z3_o_lineas value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @return awlc01Z3_o_lineas
     */
    public com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas[] getAwlc01Z3_o_lineas() {
        return awlc01Z3_o_lineas;
    }

    /**
     * Sets the awlc01Z3_o_lineas value for this ProgramInterfaceAwlc01Z3_salida.
     *
     * @param awlc01Z3_o_lineas
     */
    public void setAwlc01Z3_o_lineas(
        com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas[] awlc01Z3_o_lineas) {
        this.awlc01Z3_o_lineas = awlc01Z3_o_lineas;
    }

    public com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas getAwlc01Z3_o_lineas(
        int i) {
        return this.awlc01Z3_o_lineas[i];
    }

    public void setAwlc01Z3_o_lineas(int i,
        com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salidaAwlc01Z3_o_lineas _value) {
        this.awlc01Z3_o_lineas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwlc01Z3_salida))
            return false;
        ProgramInterfaceAwlc01Z3_salida other = (ProgramInterfaceAwlc01Z3_salida) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.awlc01Z3_o_cod_ret == null && other.getAwlc01Z3_o_cod_ret() == null) ||
                (this.awlc01Z3_o_cod_ret != null &&
                    this.awlc01Z3_o_cod_ret.equals(other.getAwlc01Z3_o_cod_ret()))) &&
            ((this.awlc01Z3_o_desc_cod_ret == null && other.getAwlc01Z3_o_desc_cod_ret() == null) ||
                (this.awlc01Z3_o_desc_cod_ret != null &&
                    this.awlc01Z3_o_desc_cod_ret.equals(other.getAwlc01Z3_o_desc_cod_ret()))) &&
            ((this.awlc01Z3_o_sqlcode == null && other.getAwlc01Z3_o_sqlcode() == null) ||
                (this.awlc01Z3_o_sqlcode != null &&
                    this.awlc01Z3_o_sqlcode.equals(other.getAwlc01Z3_o_sqlcode()))) &&
            ((this.awlc01Z3_o_parrafo == null && other.getAwlc01Z3_o_parrafo() == null) ||
                (this.awlc01Z3_o_parrafo != null &&
                    this.awlc01Z3_o_parrafo.equals(other.getAwlc01Z3_o_parrafo()))) &&
            ((this.awlc01Z3_o_finpaginacion == null && other.getAwlc01Z3_o_finpaginacion() == null) ||
                (this.awlc01Z3_o_finpaginacion != null &&
                    this.awlc01Z3_o_finpaginacion.equals(other.getAwlc01Z3_o_finpaginacion()))) &&
            ((this.awlc01Z3_o_numregistros == null && other.getAwlc01Z3_o_numregistros() == null) ||
                (this.awlc01Z3_o_numregistros != null &&
                    this.awlc01Z3_o_numregistros.equals(other.getAwlc01Z3_o_numregistros()))) &&
            ((this.awlc01Z3_o_nom_pag == null && other.getAwlc01Z3_o_nom_pag() == null) ||
                (this.awlc01Z3_o_nom_pag != null &&
                    this.awlc01Z3_o_nom_pag.equals(other.getAwlc01Z3_o_nom_pag()))) &&
            ((this.awlc01Z3_o_ape1_pag == null && other.getAwlc01Z3_o_ape1_pag() == null) ||
                (this.awlc01Z3_o_ape1_pag != null &&
                    this.awlc01Z3_o_ape1_pag.equals(other.getAwlc01Z3_o_ape1_pag()))) &&
            ((this.awlc01Z3_o_ape2_pag == null && other.getAwlc01Z3_o_ape2_pag() == null) ||
                (this.awlc01Z3_o_ape2_pag != null &&
                    this.awlc01Z3_o_ape2_pag.equals(other.getAwlc01Z3_o_ape2_pag()))) &&
            ((this.awlc01Z3_o_nom_tit == null && other.getAwlc01Z3_o_nom_tit() == null) ||
                (this.awlc01Z3_o_nom_tit != null &&
                    this.awlc01Z3_o_nom_tit.equals(other.getAwlc01Z3_o_nom_tit()))) &&
            ((this.awlc01Z3_o_ape1_tit == null && other.getAwlc01Z3_o_ape1_tit() == null) ||
                (this.awlc01Z3_o_ape1_tit != null &&
                    this.awlc01Z3_o_ape1_tit.equals(other.getAwlc01Z3_o_ape1_tit()))) &&
            ((this.awlc01Z3_o_ape2_tit == null && other.getAwlc01Z3_o_ape2_tit() == null) ||
                (this.awlc01Z3_o_ape2_tit != null &&
                    this.awlc01Z3_o_ape2_tit.equals(other.getAwlc01Z3_o_ape2_tit()))) &&
            ((this.awlc01Z3_o_rut_tit == null && other.getAwlc01Z3_o_rut_tit() == null) ||
                (this.awlc01Z3_o_rut_tit != null &&
                    this.awlc01Z3_o_rut_tit.equals(other.getAwlc01Z3_o_rut_tit()))) &&
            ((this.awlc01Z3_o_dvf_tit == null && other.getAwlc01Z3_o_dvf_tit() == null) ||
                (this.awlc01Z3_o_dvf_tit != null &&
                    this.awlc01Z3_o_dvf_tit.equals(other.getAwlc01Z3_o_dvf_tit()))) &&
            ((this.awlc01Z3_o_sec_tit == null && other.getAwlc01Z3_o_sec_tit() == null) ||
                (this.awlc01Z3_o_sec_tit != null &&
                    this.awlc01Z3_o_sec_tit.equals(other.getAwlc01Z3_o_sec_tit()))) &&
            ((this.awlc01Z3_o_raz_soc == null && other.getAwlc01Z3_o_raz_soc() == null) ||
                (this.awlc01Z3_o_raz_soc != null &&
                    this.awlc01Z3_o_raz_soc.equals(other.getAwlc01Z3_o_raz_soc()))) &&
            ((this.awlc01Z3_o_nom_fan == null && other.getAwlc01Z3_o_nom_fan() == null) ||
                (this.awlc01Z3_o_nom_fan != null &&
                    this.awlc01Z3_o_nom_fan.equals(other.getAwlc01Z3_o_nom_fan()))) &&
            ((this.awlc01Z3_o_cod_giro == null && other.getAwlc01Z3_o_cod_giro() == null) ||
                (this.awlc01Z3_o_cod_giro != null &&
                    this.awlc01Z3_o_cod_giro.equals(other.getAwlc01Z3_o_cod_giro()))) &&
            ((this.awlc01Z3_o_tipo_clie == null && other.getAwlc01Z3_o_tipo_clie() == null) ||
                (this.awlc01Z3_o_tipo_clie != null &&
                    this.awlc01Z3_o_tipo_clie.equals(other.getAwlc01Z3_o_tipo_clie()))) &&
            ((this.awlc01Z3_o_tipo_seg == null && other.getAwlc01Z3_o_tipo_seg() == null) ||
                (this.awlc01Z3_o_tipo_seg != null &&
                    this.awlc01Z3_o_tipo_seg.equals(other.getAwlc01Z3_o_tipo_seg()))) &&
            ((this.awlc01Z3_o_desc_tipo_clie == null && other.getAwlc01Z3_o_desc_tipo_clie() == null) ||
                (this.awlc01Z3_o_desc_tipo_clie != null &&
                    this.awlc01Z3_o_desc_tipo_clie.equals(other.getAwlc01Z3_o_desc_tipo_clie()))) &&
            ((this.awlc01Z3_o_cod_seg == null && other.getAwlc01Z3_o_cod_seg() == null) ||
                (this.awlc01Z3_o_cod_seg != null &&
                    this.awlc01Z3_o_cod_seg.equals(other.getAwlc01Z3_o_cod_seg()))) &&
            ((this.awlc01Z3_o_desc_seg == null && other.getAwlc01Z3_o_desc_seg() == null) ||
                (this.awlc01Z3_o_desc_seg != null &&
                    this.awlc01Z3_o_desc_seg.equals(other.getAwlc01Z3_o_desc_seg()))) &&
            ((this.awlc01Z3_o_cod_sub_seg == null && other.getAwlc01Z3_o_cod_sub_seg() == null) ||
                (this.awlc01Z3_o_cod_sub_seg != null &&
                    this.awlc01Z3_o_cod_sub_seg.equals(other.getAwlc01Z3_o_cod_sub_seg()))) &&
            ((this.awlc01Z3_o_desc_sub_seg == null && other.getAwlc01Z3_o_desc_sub_seg() == null) ||
                (this.awlc01Z3_o_desc_sub_seg != null &&
                    this.awlc01Z3_o_desc_sub_seg.equals(other.getAwlc01Z3_o_desc_sub_seg()))) &&
            ((this.awlc01Z3_o_mail_cliente == null && other.getAwlc01Z3_o_mail_cliente() == null) ||
                (this.awlc01Z3_o_mail_cliente != null &&
                    this.awlc01Z3_o_mail_cliente.equals(other.getAwlc01Z3_o_mail_cliente()))) &&
            ((this.awlc01Z3_o_fecha_alt_clte == null && other.getAwlc01Z3_o_fecha_alt_clte() == null) ||
                (this.awlc01Z3_o_fecha_alt_clte != null &&
                    this.awlc01Z3_o_fecha_alt_clte.equals(other.getAwlc01Z3_o_fecha_alt_clte()))) &&
            ((this.awlc01Z3_o_area_fax == null && other.getAwlc01Z3_o_area_fax() == null) ||
                (this.awlc01Z3_o_area_fax != null &&
                    this.awlc01Z3_o_area_fax.equals(other.getAwlc01Z3_o_area_fax()))) &&
            ((this.awlc01Z3_o_num_fax == null && other.getAwlc01Z3_o_num_fax() == null) ||
                (this.awlc01Z3_o_num_fax != null &&
                    this.awlc01Z3_o_num_fax.equals(other.getAwlc01Z3_o_num_fax()))) &&
            ((this.awlc01Z3_o_num_celula == null && other.getAwlc01Z3_o_num_celula() == null) ||
                (this.awlc01Z3_o_num_celula != null &&
                    this.awlc01Z3_o_num_celula.equals(other.getAwlc01Z3_o_num_celula()))) &&
            ((this.awlc01Z3_o_pag_web == null && other.getAwlc01Z3_o_pag_web() == null) ||
                (this.awlc01Z3_o_pag_web != null &&
                    this.awlc01Z3_o_pag_web.equals(other.getAwlc01Z3_o_pag_web()))) &&
            ((this.awlc01Z3_o_calle_tit == null && other.getAwlc01Z3_o_calle_tit() == null) ||
                (this.awlc01Z3_o_calle_tit != null &&
                    this.awlc01Z3_o_calle_tit.equals(other.getAwlc01Z3_o_calle_tit()))) &&
            ((this.awlc01Z3_o_num_tit == null && other.getAwlc01Z3_o_num_tit() == null) ||
                (this.awlc01Z3_o_num_tit != null &&
                    this.awlc01Z3_o_num_tit.equals(other.getAwlc01Z3_o_num_tit()))) &&
            ((this.awlc01Z3_o_piso_tit == null && other.getAwlc01Z3_o_piso_tit() == null) ||
                (this.awlc01Z3_o_piso_tit != null &&
                    this.awlc01Z3_o_piso_tit.equals(other.getAwlc01Z3_o_piso_tit()))) &&
            ((this.awlc01Z3_o_dpto_tit == null && other.getAwlc01Z3_o_dpto_tit() == null) ||
                (this.awlc01Z3_o_dpto_tit != null &&
                    this.awlc01Z3_o_dpto_tit.equals(other.getAwlc01Z3_o_dpto_tit()))) &&
            ((this.awlc01Z3_o_desc_comun_tit == null && other.getAwlc01Z3_o_desc_comun_tit() == null) ||
                (this.awlc01Z3_o_desc_comun_tit != null &&
                    this.awlc01Z3_o_desc_comun_tit.equals(other.getAwlc01Z3_o_desc_comun_tit()))) &&
            ((this.awlc01Z3_o_desc_ciuda_tit == null && other.getAwlc01Z3_o_desc_ciuda_tit() == null) ||
                (this.awlc01Z3_o_desc_ciuda_tit != null &&
                    this.awlc01Z3_o_desc_ciuda_tit.equals(other.getAwlc01Z3_o_desc_ciuda_tit()))) &&
            ((this.awlc01Z3_o_lineas == null && other.getAwlc01Z3_o_lineas() == null) ||
                (this.awlc01Z3_o_lineas != null &&
                    java.util.Arrays.equals(this.awlc01Z3_o_lineas, other.getAwlc01Z3_o_lineas())));
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
        if (getAwlc01Z3_o_cod_ret() != null) {
            _hashCode += getAwlc01Z3_o_cod_ret().hashCode();
        }
        if (getAwlc01Z3_o_desc_cod_ret() != null) {
            _hashCode += getAwlc01Z3_o_desc_cod_ret().hashCode();
        }
        if (getAwlc01Z3_o_sqlcode() != null) {
            _hashCode += getAwlc01Z3_o_sqlcode().hashCode();
        }
        if (getAwlc01Z3_o_parrafo() != null) {
            _hashCode += getAwlc01Z3_o_parrafo().hashCode();
        }
        if (getAwlc01Z3_o_finpaginacion() != null) {
            _hashCode += getAwlc01Z3_o_finpaginacion().hashCode();
        }
        if (getAwlc01Z3_o_numregistros() != null) {
            _hashCode += getAwlc01Z3_o_numregistros().hashCode();
        }
        if (getAwlc01Z3_o_nom_pag() != null) {
            _hashCode += getAwlc01Z3_o_nom_pag().hashCode();
        }
        if (getAwlc01Z3_o_ape1_pag() != null) {
            _hashCode += getAwlc01Z3_o_ape1_pag().hashCode();
        }
        if (getAwlc01Z3_o_ape2_pag() != null) {
            _hashCode += getAwlc01Z3_o_ape2_pag().hashCode();
        }
        if (getAwlc01Z3_o_nom_tit() != null) {
            _hashCode += getAwlc01Z3_o_nom_tit().hashCode();
        }
        if (getAwlc01Z3_o_ape1_tit() != null) {
            _hashCode += getAwlc01Z3_o_ape1_tit().hashCode();
        }
        if (getAwlc01Z3_o_ape2_tit() != null) {
            _hashCode += getAwlc01Z3_o_ape2_tit().hashCode();
        }
        if (getAwlc01Z3_o_rut_tit() != null) {
            _hashCode += getAwlc01Z3_o_rut_tit().hashCode();
        }
        if (getAwlc01Z3_o_dvf_tit() != null) {
            _hashCode += getAwlc01Z3_o_dvf_tit().hashCode();
        }
        if (getAwlc01Z3_o_sec_tit() != null) {
            _hashCode += getAwlc01Z3_o_sec_tit().hashCode();
        }
        if (getAwlc01Z3_o_raz_soc() != null) {
            _hashCode += getAwlc01Z3_o_raz_soc().hashCode();
        }
        if (getAwlc01Z3_o_nom_fan() != null) {
            _hashCode += getAwlc01Z3_o_nom_fan().hashCode();
        }
        if (getAwlc01Z3_o_cod_giro() != null) {
            _hashCode += getAwlc01Z3_o_cod_giro().hashCode();
        }
        if (getAwlc01Z3_o_tipo_clie() != null) {
            _hashCode += getAwlc01Z3_o_tipo_clie().hashCode();
        }
        if (getAwlc01Z3_o_tipo_seg() != null) {
            _hashCode += getAwlc01Z3_o_tipo_seg().hashCode();
        }
        if (getAwlc01Z3_o_desc_tipo_clie() != null) {
            _hashCode += getAwlc01Z3_o_desc_tipo_clie().hashCode();
        }
        if (getAwlc01Z3_o_cod_seg() != null) {
            _hashCode += getAwlc01Z3_o_cod_seg().hashCode();
        }
        if (getAwlc01Z3_o_desc_seg() != null) {
            _hashCode += getAwlc01Z3_o_desc_seg().hashCode();
        }
        if (getAwlc01Z3_o_cod_sub_seg() != null) {
            _hashCode += getAwlc01Z3_o_cod_sub_seg().hashCode();
        }
        if (getAwlc01Z3_o_desc_sub_seg() != null) {
            _hashCode += getAwlc01Z3_o_desc_sub_seg().hashCode();
        }
        if (getAwlc01Z3_o_mail_cliente() != null) {
            _hashCode += getAwlc01Z3_o_mail_cliente().hashCode();
        }
        if (getAwlc01Z3_o_fecha_alt_clte() != null) {
            _hashCode += getAwlc01Z3_o_fecha_alt_clte().hashCode();
        }
        if (getAwlc01Z3_o_area_fax() != null) {
            _hashCode += getAwlc01Z3_o_area_fax().hashCode();
        }
        if (getAwlc01Z3_o_num_fax() != null) {
            _hashCode += getAwlc01Z3_o_num_fax().hashCode();
        }
        if (getAwlc01Z3_o_num_celula() != null) {
            _hashCode += getAwlc01Z3_o_num_celula().hashCode();
        }
        if (getAwlc01Z3_o_pag_web() != null) {
            _hashCode += getAwlc01Z3_o_pag_web().hashCode();
        }
        if (getAwlc01Z3_o_calle_tit() != null) {
            _hashCode += getAwlc01Z3_o_calle_tit().hashCode();
        }
        if (getAwlc01Z3_o_num_tit() != null) {
            _hashCode += getAwlc01Z3_o_num_tit().hashCode();
        }
        if (getAwlc01Z3_o_piso_tit() != null) {
            _hashCode += getAwlc01Z3_o_piso_tit().hashCode();
        }
        if (getAwlc01Z3_o_dpto_tit() != null) {
            _hashCode += getAwlc01Z3_o_dpto_tit().hashCode();
        }
        if (getAwlc01Z3_o_desc_comun_tit() != null) {
            _hashCode += getAwlc01Z3_o_desc_comun_tit().hashCode();
        }
        if (getAwlc01Z3_o_desc_ciuda_tit() != null) {
            _hashCode += getAwlc01Z3_o_desc_ciuda_tit().hashCode();
        }
        if (getAwlc01Z3_o_lineas() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAwlc01Z3_o_lineas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwlc01Z3_o_lineas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwlc01Z3_salida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com",
            ">ProgramInterface>awlc01z3_salida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_ret");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_ret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_cod_ret");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_cod_ret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_sqlcode");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_sqlcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_parrafo");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_parrafo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_finpaginacion");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_finpaginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_numregistros");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_numregistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_nom_pag");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_nom_pag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ape1_pag");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ape1_pag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ape2_pag");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ape2_pag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_nom_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_nom_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ape1_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ape1_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_ape2_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_ape2_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_rut_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_rut_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_dvf_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_dvf_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_sec_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_sec_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_raz_soc");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_raz_soc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_nom_fan");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_nom_fan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_giro");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_giro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_tipo_clie");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_tipo_clie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_tipo_seg");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_tipo_seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_tipo_clie");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_tipo_clie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_seg");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_seg");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_cod_sub_seg");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_cod_sub_seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_sub_seg");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_sub_seg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_mail_cliente");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_mail_cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_fecha_alt_clte");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_fecha_alt_clte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_area_fax");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_area_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_num_fax");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_num_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_num_celula");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_num_celula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_pag_web");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_pag_web"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_calle_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_calle_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_num_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_num_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_piso_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_piso_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_dpto_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_dpto_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_comun_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_comun_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_desc_ciuda_tit");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_desc_ciuda_tit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc01Z3_o_lineas");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com", "awlc01z3_o_lineas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.Response.com",
            ">>ProgramInterface>awlc01z3_salida>awlc01z3_o_lineas"));
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
            new org.apache.axis.encoding.ser.BeanSerializer(
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
            new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }

}
