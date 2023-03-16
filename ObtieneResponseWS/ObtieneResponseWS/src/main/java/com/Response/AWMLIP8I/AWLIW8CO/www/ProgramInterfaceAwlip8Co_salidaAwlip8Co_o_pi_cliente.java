/**
 * ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.AWMLIP8I.AWLIW8CO.www;

import cl.tchile.adapter.StringAdapter;
import cl.tchile.adapter.UnsignedIntAdapter;
import cl.tchile.adapter.UnsignedLongAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente implements java.io.Serializable {
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlip8Co_o_cod_ps;
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlip8Co_o_cod_op;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_desc_op;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_cant_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_tip_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_desc_tip_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_ind_fact_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_est_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_desc_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_fec_alta_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_fec_baja_ps;
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlip8Co_o_cod_paq;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_nombre_paq;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_sec_paq;
    @XmlJavaTypeAdapter(value = UnsignedLongAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedLong awlip8Co_o_sec_ps;
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlip8Co_o_cod_familia;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_desc_familia;
    @XmlJavaTypeAdapter(value = UnsignedLongAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedLong awlip8Co_o_valor_ps;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_moneda;
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlip8Co_o_cod_cf;
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt awlip8Co_o_cod_conf;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_desc_cf;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_cod_fam;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_des_fam;

    private com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente[] awlip8Co_o_pi_cliente;

    public ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente() {
    }

    public ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente(
        org.apache.axis.types.UnsignedInt awlip8Co_o_cod_ps,
        org.apache.axis.types.UnsignedInt awlip8Co_o_cod_op,
        java.lang.String awlip8Co_o_desc_op,
        java.lang.String awlip8Co_o_cant_ps,
        java.lang.String awlip8Co_o_tip_ps,
        java.lang.String awlip8Co_o_desc_tip_ps,
        java.lang.String awlip8Co_o_ind_fact_ps,
        java.lang.String awlip8Co_o_est_ps,
        java.lang.String awlip8Co_o_desc_ps,
        java.lang.String awlip8Co_o_fec_alta_ps,
        java.lang.String awlip8Co_o_fec_baja_ps,
        org.apache.axis.types.UnsignedInt awlip8Co_o_cod_paq,
        java.lang.String awlip8Co_o_nombre_paq,
        java.lang.String awlip8Co_o_sec_paq,
        org.apache.axis.types.UnsignedLong awlip8Co_o_sec_ps,
        org.apache.axis.types.UnsignedInt awlip8Co_o_cod_familia,
        java.lang.String awlip8Co_o_desc_familia,
        org.apache.axis.types.UnsignedLong awlip8Co_o_valor_ps,
        java.lang.String awlip8Co_o_moneda,
        org.apache.axis.types.UnsignedInt awlip8Co_o_cod_cf,
        org.apache.axis.types.UnsignedInt awlip8Co_o_cod_conf,
        java.lang.String awlip8Co_o_desc_cf,
        java.lang.String awlip8Co_o_cod_fam,
        java.lang.String awlip8Co_o_des_fam,
        com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente[] awlip8Co_o_pi_cliente) {
        this.awlip8Co_o_cod_ps = awlip8Co_o_cod_ps;
        this.awlip8Co_o_cod_op = awlip8Co_o_cod_op;
        this.awlip8Co_o_desc_op = awlip8Co_o_desc_op;
        this.awlip8Co_o_cant_ps = awlip8Co_o_cant_ps;
        this.awlip8Co_o_tip_ps = awlip8Co_o_tip_ps;
        this.awlip8Co_o_desc_tip_ps = awlip8Co_o_desc_tip_ps;
        this.awlip8Co_o_ind_fact_ps = awlip8Co_o_ind_fact_ps;
        this.awlip8Co_o_est_ps = awlip8Co_o_est_ps;
        this.awlip8Co_o_desc_ps = awlip8Co_o_desc_ps;
        this.awlip8Co_o_fec_alta_ps = awlip8Co_o_fec_alta_ps;
        this.awlip8Co_o_fec_baja_ps = awlip8Co_o_fec_baja_ps;
        this.awlip8Co_o_cod_paq = awlip8Co_o_cod_paq;
        this.awlip8Co_o_nombre_paq = awlip8Co_o_nombre_paq;
        this.awlip8Co_o_sec_paq = awlip8Co_o_sec_paq;
        this.awlip8Co_o_sec_ps = awlip8Co_o_sec_ps;
        this.awlip8Co_o_cod_familia = awlip8Co_o_cod_familia;
        this.awlip8Co_o_desc_familia = awlip8Co_o_desc_familia;
        this.awlip8Co_o_valor_ps = awlip8Co_o_valor_ps;
        this.awlip8Co_o_moneda = awlip8Co_o_moneda;
        this.awlip8Co_o_cod_cf = awlip8Co_o_cod_cf;
        this.awlip8Co_o_cod_conf = awlip8Co_o_cod_conf;
        this.awlip8Co_o_desc_cf = awlip8Co_o_desc_cf;
        this.awlip8Co_o_cod_fam = awlip8Co_o_cod_fam;
        this.awlip8Co_o_des_fam = awlip8Co_o_des_fam;
        this.awlip8Co_o_pi_cliente = awlip8Co_o_pi_cliente;
    }

    /**
     * Gets the awlip8Co_o_cod_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_ps
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_o_cod_ps() {
        return awlip8Co_o_cod_ps;
    }

    /**
     * Sets the awlip8Co_o_cod_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_ps
     */
    public void setAwlip8Co_o_cod_ps(org.apache.axis.types.UnsignedInt awlip8Co_o_cod_ps) {
        this.awlip8Co_o_cod_ps = awlip8Co_o_cod_ps;
    }

    /**
     * Gets the awlip8Co_o_cod_op value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_op
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_o_cod_op() {
        return awlip8Co_o_cod_op;
    }

    /**
     * Sets the awlip8Co_o_cod_op value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_op
     */
    public void setAwlip8Co_o_cod_op(org.apache.axis.types.UnsignedInt awlip8Co_o_cod_op) {
        this.awlip8Co_o_cod_op = awlip8Co_o_cod_op;
    }

    /**
     * Gets the awlip8Co_o_desc_op value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_desc_op
     */
    public java.lang.String getAwlip8Co_o_desc_op() {
        return awlip8Co_o_desc_op;
    }

    /**
     * Sets the awlip8Co_o_desc_op value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_desc_op
     */
    public void setAwlip8Co_o_desc_op(java.lang.String awlip8Co_o_desc_op) {
        this.awlip8Co_o_desc_op = awlip8Co_o_desc_op;
    }

    /**
     * Gets the awlip8Co_o_cant_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cant_ps
     */
    public java.lang.String getAwlip8Co_o_cant_ps() {
        return awlip8Co_o_cant_ps;
    }

    /**
     * Sets the awlip8Co_o_cant_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cant_ps
     */
    public void setAwlip8Co_o_cant_ps(java.lang.String awlip8Co_o_cant_ps) {
        this.awlip8Co_o_cant_ps = awlip8Co_o_cant_ps;
    }

    /**
     * Gets the awlip8Co_o_tip_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_tip_ps
     */
    public java.lang.String getAwlip8Co_o_tip_ps() {
        return awlip8Co_o_tip_ps;
    }

    /**
     * Sets the awlip8Co_o_tip_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_tip_ps
     */
    public void setAwlip8Co_o_tip_ps(java.lang.String awlip8Co_o_tip_ps) {
        this.awlip8Co_o_tip_ps = awlip8Co_o_tip_ps;
    }

    /**
     * Gets the awlip8Co_o_desc_tip_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_desc_tip_ps
     */
    public java.lang.String getAwlip8Co_o_desc_tip_ps() {
        return awlip8Co_o_desc_tip_ps;
    }

    /**
     * Sets the awlip8Co_o_desc_tip_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_desc_tip_ps
     */
    public void setAwlip8Co_o_desc_tip_ps(java.lang.String awlip8Co_o_desc_tip_ps) {
        this.awlip8Co_o_desc_tip_ps = awlip8Co_o_desc_tip_ps;
    }

    /**
     * Gets the awlip8Co_o_ind_fact_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_ind_fact_ps
     */
    public java.lang.String getAwlip8Co_o_ind_fact_ps() {
        return awlip8Co_o_ind_fact_ps;
    }

    /**
     * Sets the awlip8Co_o_ind_fact_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_ind_fact_ps
     */
    public void setAwlip8Co_o_ind_fact_ps(java.lang.String awlip8Co_o_ind_fact_ps) {
        this.awlip8Co_o_ind_fact_ps = awlip8Co_o_ind_fact_ps;
    }

    /**
     * Gets the awlip8Co_o_est_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_est_ps
     */
    public java.lang.String getAwlip8Co_o_est_ps() {
        return awlip8Co_o_est_ps;
    }

    /**
     * Sets the awlip8Co_o_est_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_est_ps
     */
    public void setAwlip8Co_o_est_ps(java.lang.String awlip8Co_o_est_ps) {
        this.awlip8Co_o_est_ps = awlip8Co_o_est_ps;
    }

    /**
     * Gets the awlip8Co_o_desc_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_desc_ps
     */
    public java.lang.String getAwlip8Co_o_desc_ps() {
        return awlip8Co_o_desc_ps;
    }

    /**
     * Sets the awlip8Co_o_desc_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_desc_ps
     */
    public void setAwlip8Co_o_desc_ps(java.lang.String awlip8Co_o_desc_ps) {
        this.awlip8Co_o_desc_ps = awlip8Co_o_desc_ps;
    }

    /**
     * Gets the awlip8Co_o_fec_alta_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_fec_alta_ps
     */
    public java.lang.String getAwlip8Co_o_fec_alta_ps() {
        return awlip8Co_o_fec_alta_ps;
    }

    /**
     * Sets the awlip8Co_o_fec_alta_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_fec_alta_ps
     */
    public void setAwlip8Co_o_fec_alta_ps(java.lang.String awlip8Co_o_fec_alta_ps) {
        this.awlip8Co_o_fec_alta_ps = awlip8Co_o_fec_alta_ps;
    }

    /**
     * Gets the awlip8Co_o_fec_baja_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_fec_baja_ps
     */
    public java.lang.String getAwlip8Co_o_fec_baja_ps() {
        return awlip8Co_o_fec_baja_ps;
    }

    /**
     * Sets the awlip8Co_o_fec_baja_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_fec_baja_ps
     */
    public void setAwlip8Co_o_fec_baja_ps(java.lang.String awlip8Co_o_fec_baja_ps) {
        this.awlip8Co_o_fec_baja_ps = awlip8Co_o_fec_baja_ps;
    }

    /**
     * Gets the awlip8Co_o_cod_paq value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_paq
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_o_cod_paq() {
        return awlip8Co_o_cod_paq;
    }

    /**
     * Sets the awlip8Co_o_cod_paq value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_paq
     */
    public void setAwlip8Co_o_cod_paq(org.apache.axis.types.UnsignedInt awlip8Co_o_cod_paq) {
        this.awlip8Co_o_cod_paq = awlip8Co_o_cod_paq;
    }

    /**
     * Gets the awlip8Co_o_nombre_paq value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_nombre_paq
     */
    public java.lang.String getAwlip8Co_o_nombre_paq() {
        return awlip8Co_o_nombre_paq;
    }

    /**
     * Sets the awlip8Co_o_nombre_paq value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_nombre_paq
     */
    public void setAwlip8Co_o_nombre_paq(java.lang.String awlip8Co_o_nombre_paq) {
        this.awlip8Co_o_nombre_paq = awlip8Co_o_nombre_paq;
    }

    /**
     * Gets the awlip8Co_o_sec_paq value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_sec_paq
     */
    public java.lang.String getAwlip8Co_o_sec_paq() {
        return awlip8Co_o_sec_paq;
    }

    /**
     * Sets the awlip8Co_o_sec_paq value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_sec_paq
     */
    public void setAwlip8Co_o_sec_paq(java.lang.String awlip8Co_o_sec_paq) {
        this.awlip8Co_o_sec_paq = awlip8Co_o_sec_paq;
    }

    /**
     * Gets the awlip8Co_o_sec_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_sec_ps
     */
    public org.apache.axis.types.UnsignedLong getAwlip8Co_o_sec_ps() {
        return awlip8Co_o_sec_ps;
    }

    /**
     * Sets the awlip8Co_o_sec_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_sec_ps
     */
    public void setAwlip8Co_o_sec_ps(org.apache.axis.types.UnsignedLong awlip8Co_o_sec_ps) {
        this.awlip8Co_o_sec_ps = awlip8Co_o_sec_ps;
    }

    /**
     * Gets the awlip8Co_o_cod_familia value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_familia
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_o_cod_familia() {
        return awlip8Co_o_cod_familia;
    }

    /**
     * Sets the awlip8Co_o_cod_familia value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_familia
     */
    public void setAwlip8Co_o_cod_familia(org.apache.axis.types.UnsignedInt awlip8Co_o_cod_familia) {
        this.awlip8Co_o_cod_familia = awlip8Co_o_cod_familia;
    }

    /**
     * Gets the awlip8Co_o_desc_familia value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_desc_familia
     */
    public java.lang.String getAwlip8Co_o_desc_familia() {
        return awlip8Co_o_desc_familia;
    }

    /**
     * Sets the awlip8Co_o_desc_familia value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_desc_familia
     */
    public void setAwlip8Co_o_desc_familia(java.lang.String awlip8Co_o_desc_familia) {
        this.awlip8Co_o_desc_familia = awlip8Co_o_desc_familia;
    }

    /**
     * Gets the awlip8Co_o_valor_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_valor_ps
     */
    public org.apache.axis.types.UnsignedLong getAwlip8Co_o_valor_ps() {
        return awlip8Co_o_valor_ps;
    }

    /**
     * Sets the awlip8Co_o_valor_ps value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_valor_ps
     */
    public void setAwlip8Co_o_valor_ps(org.apache.axis.types.UnsignedLong awlip8Co_o_valor_ps) {
        this.awlip8Co_o_valor_ps = awlip8Co_o_valor_ps;
    }

    /**
     * Gets the awlip8Co_o_moneda value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_moneda
     */
    public java.lang.String getAwlip8Co_o_moneda() {
        return awlip8Co_o_moneda;
    }

    /**
     * Sets the awlip8Co_o_moneda value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_moneda
     */
    public void setAwlip8Co_o_moneda(java.lang.String awlip8Co_o_moneda) {
        this.awlip8Co_o_moneda = awlip8Co_o_moneda;
    }

    /**
     * Gets the awlip8Co_o_cod_cf value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_cf
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_o_cod_cf() {
        return awlip8Co_o_cod_cf;
    }

    /**
     * Sets the awlip8Co_o_cod_cf value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_cf
     */
    public void setAwlip8Co_o_cod_cf(org.apache.axis.types.UnsignedInt awlip8Co_o_cod_cf) {
        this.awlip8Co_o_cod_cf = awlip8Co_o_cod_cf;
    }

    /**
     * Gets the awlip8Co_o_cod_conf value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_conf
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_o_cod_conf() {
        return awlip8Co_o_cod_conf;
    }

    /**
     * Sets the awlip8Co_o_cod_conf value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_conf
     */
    public void setAwlip8Co_o_cod_conf(org.apache.axis.types.UnsignedInt awlip8Co_o_cod_conf) {
        this.awlip8Co_o_cod_conf = awlip8Co_o_cod_conf;
    }

    /**
     * Gets the awlip8Co_o_desc_cf value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_desc_cf
     */
    public java.lang.String getAwlip8Co_o_desc_cf() {
        return awlip8Co_o_desc_cf;
    }

    /**
     * Sets the awlip8Co_o_desc_cf value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_desc_cf
     */
    public void setAwlip8Co_o_desc_cf(java.lang.String awlip8Co_o_desc_cf) {
        this.awlip8Co_o_desc_cf = awlip8Co_o_desc_cf;
    }

    /**
     * Gets the awlip8Co_o_cod_fam value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_fam
     */
    public java.lang.String getAwlip8Co_o_cod_fam() {
        return awlip8Co_o_cod_fam;
    }

    /**
     * Sets the awlip8Co_o_cod_fam value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_fam
     */
    public void setAwlip8Co_o_cod_fam(java.lang.String awlip8Co_o_cod_fam) {
        this.awlip8Co_o_cod_fam = awlip8Co_o_cod_fam;
    }

    /**
     * Gets the awlip8Co_o_des_fam value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_des_fam
     */
    public java.lang.String getAwlip8Co_o_des_fam() {
        return awlip8Co_o_des_fam;
    }

    /**
     * Sets the awlip8Co_o_des_fam value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_des_fam
     */
    public void setAwlip8Co_o_des_fam(java.lang.String awlip8Co_o_des_fam) {
        this.awlip8Co_o_des_fam = awlip8Co_o_des_fam;
    }

    /**
     * Gets the awlip8Co_o_pi_cliente value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_pi_cliente
     */
    public com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente[] getAwlip8Co_o_pi_cliente() {
        return awlip8Co_o_pi_cliente;
    }

    /**
     * Sets the awlip8Co_o_pi_cliente value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_pi_cliente
     */
    public void setAwlip8Co_o_pi_cliente(
        com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente[] awlip8Co_o_pi_cliente) {
        this.awlip8Co_o_pi_cliente = awlip8Co_o_pi_cliente;
    }

    public com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente getAwlip8Co_o_pi_cliente(
        int i) {
        return this.awlip8Co_o_pi_cliente[i];
    }

    public void setAwlip8Co_o_pi_cliente(int i,
        com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente _value) {
        this.awlip8Co_o_pi_cliente[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente))
            return false;
        ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente other = (ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente) obj;
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
            ((this.awlip8Co_o_cod_ps == null && other.getAwlip8Co_o_cod_ps() == null) ||
                (this.awlip8Co_o_cod_ps != null &&
                    this.awlip8Co_o_cod_ps.equals(other.getAwlip8Co_o_cod_ps()))) &&
            ((this.awlip8Co_o_cod_op == null && other.getAwlip8Co_o_cod_op() == null) ||
                (this.awlip8Co_o_cod_op != null &&
                    this.awlip8Co_o_cod_op.equals(other.getAwlip8Co_o_cod_op()))) &&
            ((this.awlip8Co_o_desc_op == null && other.getAwlip8Co_o_desc_op() == null) ||
                (this.awlip8Co_o_desc_op != null &&
                    this.awlip8Co_o_desc_op.equals(other.getAwlip8Co_o_desc_op()))) &&
            ((this.awlip8Co_o_cant_ps == null && other.getAwlip8Co_o_cant_ps() == null) ||
                (this.awlip8Co_o_cant_ps != null &&
                    this.awlip8Co_o_cant_ps.equals(other.getAwlip8Co_o_cant_ps()))) &&
            ((this.awlip8Co_o_tip_ps == null && other.getAwlip8Co_o_tip_ps() == null) ||
                (this.awlip8Co_o_tip_ps != null &&
                    this.awlip8Co_o_tip_ps.equals(other.getAwlip8Co_o_tip_ps()))) &&
            ((this.awlip8Co_o_desc_tip_ps == null && other.getAwlip8Co_o_desc_tip_ps() == null) ||
                (this.awlip8Co_o_desc_tip_ps != null &&
                    this.awlip8Co_o_desc_tip_ps.equals(other.getAwlip8Co_o_desc_tip_ps()))) &&
            ((this.awlip8Co_o_ind_fact_ps == null && other.getAwlip8Co_o_ind_fact_ps() == null) ||
                (this.awlip8Co_o_ind_fact_ps != null &&
                    this.awlip8Co_o_ind_fact_ps.equals(other.getAwlip8Co_o_ind_fact_ps()))) &&
            ((this.awlip8Co_o_est_ps == null && other.getAwlip8Co_o_est_ps() == null) ||
                (this.awlip8Co_o_est_ps != null &&
                    this.awlip8Co_o_est_ps.equals(other.getAwlip8Co_o_est_ps()))) &&
            ((this.awlip8Co_o_desc_ps == null && other.getAwlip8Co_o_desc_ps() == null) ||
                (this.awlip8Co_o_desc_ps != null &&
                    this.awlip8Co_o_desc_ps.equals(other.getAwlip8Co_o_desc_ps()))) &&
            ((this.awlip8Co_o_fec_alta_ps == null && other.getAwlip8Co_o_fec_alta_ps() == null) ||
                (this.awlip8Co_o_fec_alta_ps != null &&
                    this.awlip8Co_o_fec_alta_ps.equals(other.getAwlip8Co_o_fec_alta_ps()))) &&
            ((this.awlip8Co_o_fec_baja_ps == null && other.getAwlip8Co_o_fec_baja_ps() == null) ||
                (this.awlip8Co_o_fec_baja_ps != null &&
                    this.awlip8Co_o_fec_baja_ps.equals(other.getAwlip8Co_o_fec_baja_ps()))) &&
            ((this.awlip8Co_o_cod_paq == null && other.getAwlip8Co_o_cod_paq() == null) ||
                (this.awlip8Co_o_cod_paq != null &&
                    this.awlip8Co_o_cod_paq.equals(other.getAwlip8Co_o_cod_paq()))) &&
            ((this.awlip8Co_o_nombre_paq == null && other.getAwlip8Co_o_nombre_paq() == null) ||
                (this.awlip8Co_o_nombre_paq != null &&
                    this.awlip8Co_o_nombre_paq.equals(other.getAwlip8Co_o_nombre_paq()))) &&
            ((this.awlip8Co_o_sec_paq == null && other.getAwlip8Co_o_sec_paq() == null) ||
                (this.awlip8Co_o_sec_paq != null &&
                    this.awlip8Co_o_sec_paq.equals(other.getAwlip8Co_o_sec_paq()))) &&
            ((this.awlip8Co_o_sec_ps == null && other.getAwlip8Co_o_sec_ps() == null) ||
                (this.awlip8Co_o_sec_ps != null &&
                    this.awlip8Co_o_sec_ps.equals(other.getAwlip8Co_o_sec_ps()))) &&
            ((this.awlip8Co_o_cod_familia == null && other.getAwlip8Co_o_cod_familia() == null) ||
                (this.awlip8Co_o_cod_familia != null &&
                    this.awlip8Co_o_cod_familia.equals(other.getAwlip8Co_o_cod_familia()))) &&
            ((this.awlip8Co_o_desc_familia == null && other.getAwlip8Co_o_desc_familia() == null) ||
                (this.awlip8Co_o_desc_familia != null &&
                    this.awlip8Co_o_desc_familia.equals(other.getAwlip8Co_o_desc_familia()))) &&
            ((this.awlip8Co_o_valor_ps == null && other.getAwlip8Co_o_valor_ps() == null) ||
                (this.awlip8Co_o_valor_ps != null &&
                    this.awlip8Co_o_valor_ps.equals(other.getAwlip8Co_o_valor_ps()))) &&
            ((this.awlip8Co_o_moneda == null && other.getAwlip8Co_o_moneda() == null) ||
                (this.awlip8Co_o_moneda != null &&
                    this.awlip8Co_o_moneda.equals(other.getAwlip8Co_o_moneda()))) &&
            ((this.awlip8Co_o_cod_cf == null && other.getAwlip8Co_o_cod_cf() == null) ||
                (this.awlip8Co_o_cod_cf != null &&
                    this.awlip8Co_o_cod_cf.equals(other.getAwlip8Co_o_cod_cf()))) &&
            ((this.awlip8Co_o_cod_conf == null && other.getAwlip8Co_o_cod_conf() == null) ||
                (this.awlip8Co_o_cod_conf != null &&
                    this.awlip8Co_o_cod_conf.equals(other.getAwlip8Co_o_cod_conf()))) &&
            ((this.awlip8Co_o_desc_cf == null && other.getAwlip8Co_o_desc_cf() == null) ||
                (this.awlip8Co_o_desc_cf != null &&
                    this.awlip8Co_o_desc_cf.equals(other.getAwlip8Co_o_desc_cf()))) &&
            ((this.awlip8Co_o_cod_fam == null && other.getAwlip8Co_o_cod_fam() == null) ||
                (this.awlip8Co_o_cod_fam != null &&
                    this.awlip8Co_o_cod_fam.equals(other.getAwlip8Co_o_cod_fam()))) &&
            ((this.awlip8Co_o_des_fam == null && other.getAwlip8Co_o_des_fam() == null) ||
                (this.awlip8Co_o_des_fam != null &&
                    this.awlip8Co_o_des_fam.equals(other.getAwlip8Co_o_des_fam()))) &&
            ((this.awlip8Co_o_pi_cliente == null && other.getAwlip8Co_o_pi_cliente() == null) ||
                (this.awlip8Co_o_pi_cliente != null &&
                    java.util.Arrays.equals(this.awlip8Co_o_pi_cliente, other.getAwlip8Co_o_pi_cliente())));
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
        if (getAwlip8Co_o_cod_ps() != null) {
            _hashCode += getAwlip8Co_o_cod_ps().hashCode();
        }
        if (getAwlip8Co_o_cod_op() != null) {
            _hashCode += getAwlip8Co_o_cod_op().hashCode();
        }
        if (getAwlip8Co_o_desc_op() != null) {
            _hashCode += getAwlip8Co_o_desc_op().hashCode();
        }
        if (getAwlip8Co_o_cant_ps() != null) {
            _hashCode += getAwlip8Co_o_cant_ps().hashCode();
        }
        if (getAwlip8Co_o_tip_ps() != null) {
            _hashCode += getAwlip8Co_o_tip_ps().hashCode();
        }
        if (getAwlip8Co_o_desc_tip_ps() != null) {
            _hashCode += getAwlip8Co_o_desc_tip_ps().hashCode();
        }
        if (getAwlip8Co_o_ind_fact_ps() != null) {
            _hashCode += getAwlip8Co_o_ind_fact_ps().hashCode();
        }
        if (getAwlip8Co_o_est_ps() != null) {
            _hashCode += getAwlip8Co_o_est_ps().hashCode();
        }
        if (getAwlip8Co_o_desc_ps() != null) {
            _hashCode += getAwlip8Co_o_desc_ps().hashCode();
        }
        if (getAwlip8Co_o_fec_alta_ps() != null) {
            _hashCode += getAwlip8Co_o_fec_alta_ps().hashCode();
        }
        if (getAwlip8Co_o_fec_baja_ps() != null) {
            _hashCode += getAwlip8Co_o_fec_baja_ps().hashCode();
        }
        if (getAwlip8Co_o_cod_paq() != null) {
            _hashCode += getAwlip8Co_o_cod_paq().hashCode();
        }
        if (getAwlip8Co_o_nombre_paq() != null) {
            _hashCode += getAwlip8Co_o_nombre_paq().hashCode();
        }
        if (getAwlip8Co_o_sec_paq() != null) {
            _hashCode += getAwlip8Co_o_sec_paq().hashCode();
        }
        if (getAwlip8Co_o_sec_ps() != null) {
            _hashCode += getAwlip8Co_o_sec_ps().hashCode();
        }
        if (getAwlip8Co_o_cod_familia() != null) {
            _hashCode += getAwlip8Co_o_cod_familia().hashCode();
        }
        if (getAwlip8Co_o_desc_familia() != null) {
            _hashCode += getAwlip8Co_o_desc_familia().hashCode();
        }
        if (getAwlip8Co_o_valor_ps() != null) {
            _hashCode += getAwlip8Co_o_valor_ps().hashCode();
        }
        if (getAwlip8Co_o_moneda() != null) {
            _hashCode += getAwlip8Co_o_moneda().hashCode();
        }
        if (getAwlip8Co_o_cod_cf() != null) {
            _hashCode += getAwlip8Co_o_cod_cf().hashCode();
        }
        if (getAwlip8Co_o_cod_conf() != null) {
            _hashCode += getAwlip8Co_o_cod_conf().hashCode();
        }
        if (getAwlip8Co_o_desc_cf() != null) {
            _hashCode += getAwlip8Co_o_desc_cf().hashCode();
        }
        if (getAwlip8Co_o_cod_fam() != null) {
            _hashCode += getAwlip8Co_o_cod_fam().hashCode();
        }
        if (getAwlip8Co_o_des_fam() != null) {
            _hashCode += getAwlip8Co_o_des_fam().hashCode();
        }
        if (getAwlip8Co_o_pi_cliente() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAwlip8Co_o_pi_cliente());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwlip8Co_o_pi_cliente(), i);
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
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com",
            ">>ProgramInterface>awlip8co_salida>awlip8co_o_pi_cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_op");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_desc_op");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_desc_op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cant_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cant_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_tip_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_tip_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_desc_tip_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_desc_tip_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_ind_fact_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_ind_fact_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_est_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_est_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_desc_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_desc_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_fec_alta_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_fec_alta_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_fec_baja_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_fec_baja_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_paq");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_paq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_nombre_paq");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_nombre_paq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_sec_paq");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_sec_paq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_sec_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_sec_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_familia");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_familia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_desc_familia");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_desc_familia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_valor_ps");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_valor_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_moneda");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_moneda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_cf");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_cf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_conf");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_conf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_desc_cf");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_desc_cf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_fam");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_fam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_des_fam");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_des_fam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_pi_cliente");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_pi_cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com",
            ">>>ProgramInterface>awlip8co_salida>awlip8co_o_pi_cliente>awlip8co_o_pi_cliente"));
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
