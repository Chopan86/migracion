/**
 * ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.AWMLIP8I.AWLIW8CO.www;

import cl.tchile.adapter.StringAdapter;
import cl.tchile.adapter.UnsignedLongAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente
    implements java.io.Serializable {
    @XmlJavaTypeAdapter(value = UnsignedLongAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedLong awlip8Co_o_sec_car;
    @XmlJavaTypeAdapter(value = UnsignedLongAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedLong awlip8Co_o_cod_car;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_cod_dom;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_tip_dom;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awlip8Co_o_valor_dom;

    public ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente() {
    }

    public ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente(
        org.apache.axis.types.UnsignedLong awlip8Co_o_sec_car,
        org.apache.axis.types.UnsignedLong awlip8Co_o_cod_car,
        java.lang.String awlip8Co_o_cod_dom,
        java.lang.String awlip8Co_o_tip_dom,
        java.lang.String awlip8Co_o_valor_dom) {
        this.awlip8Co_o_sec_car = awlip8Co_o_sec_car;
        this.awlip8Co_o_cod_car = awlip8Co_o_cod_car;
        this.awlip8Co_o_cod_dom = awlip8Co_o_cod_dom;
        this.awlip8Co_o_tip_dom = awlip8Co_o_tip_dom;
        this.awlip8Co_o_valor_dom = awlip8Co_o_valor_dom;
    }

    /**
     * Gets the awlip8Co_o_sec_car value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_sec_car
     */
    public org.apache.axis.types.UnsignedLong getAwlip8Co_o_sec_car() {
        return awlip8Co_o_sec_car;
    }

    /**
     * Sets the awlip8Co_o_sec_car value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_sec_car
     */
    public void setAwlip8Co_o_sec_car(org.apache.axis.types.UnsignedLong awlip8Co_o_sec_car) {
        this.awlip8Co_o_sec_car = awlip8Co_o_sec_car;
    }

    /**
     * Gets the awlip8Co_o_cod_car value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_car
     */
    public org.apache.axis.types.UnsignedLong getAwlip8Co_o_cod_car() {
        return awlip8Co_o_cod_car;
    }

    /**
     * Sets the awlip8Co_o_cod_car value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_car
     */
    public void setAwlip8Co_o_cod_car(org.apache.axis.types.UnsignedLong awlip8Co_o_cod_car) {
        this.awlip8Co_o_cod_car = awlip8Co_o_cod_car;
    }

    /**
     * Gets the awlip8Co_o_cod_dom value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_cod_dom
     */
    public java.lang.String getAwlip8Co_o_cod_dom() {
        return awlip8Co_o_cod_dom;
    }

    /**
     * Sets the awlip8Co_o_cod_dom value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_cod_dom
     */
    public void setAwlip8Co_o_cod_dom(java.lang.String awlip8Co_o_cod_dom) {
        this.awlip8Co_o_cod_dom = awlip8Co_o_cod_dom;
    }

    /**
     * Gets the awlip8Co_o_tip_dom value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_tip_dom
     */
    public java.lang.String getAwlip8Co_o_tip_dom() {
        return awlip8Co_o_tip_dom;
    }

    /**
     * Sets the awlip8Co_o_tip_dom value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_tip_dom
     */
    public void setAwlip8Co_o_tip_dom(java.lang.String awlip8Co_o_tip_dom) {
        this.awlip8Co_o_tip_dom = awlip8Co_o_tip_dom;
    }

    /**
     * Gets the awlip8Co_o_valor_dom value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @return awlip8Co_o_valor_dom
     */
    public java.lang.String getAwlip8Co_o_valor_dom() {
        return awlip8Co_o_valor_dom;
    }

    /**
     * Sets the awlip8Co_o_valor_dom value for this ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.
     *
     * @param awlip8Co_o_valor_dom
     */
    public void setAwlip8Co_o_valor_dom(java.lang.String awlip8Co_o_valor_dom) {
        this.awlip8Co_o_valor_dom = awlip8Co_o_valor_dom;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente))
            return false;
        ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente other = (ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente) obj;
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
            ((this.awlip8Co_o_sec_car == null && other.getAwlip8Co_o_sec_car() == null) ||
                (this.awlip8Co_o_sec_car != null &&
                    this.awlip8Co_o_sec_car.equals(other.getAwlip8Co_o_sec_car()))) &&
            ((this.awlip8Co_o_cod_car == null && other.getAwlip8Co_o_cod_car() == null) ||
                (this.awlip8Co_o_cod_car != null &&
                    this.awlip8Co_o_cod_car.equals(other.getAwlip8Co_o_cod_car()))) &&
            ((this.awlip8Co_o_cod_dom == null && other.getAwlip8Co_o_cod_dom() == null) ||
                (this.awlip8Co_o_cod_dom != null &&
                    this.awlip8Co_o_cod_dom.equals(other.getAwlip8Co_o_cod_dom()))) &&
            ((this.awlip8Co_o_tip_dom == null && other.getAwlip8Co_o_tip_dom() == null) ||
                (this.awlip8Co_o_tip_dom != null &&
                    this.awlip8Co_o_tip_dom.equals(other.getAwlip8Co_o_tip_dom()))) &&
            ((this.awlip8Co_o_valor_dom == null && other.getAwlip8Co_o_valor_dom() == null) ||
                (this.awlip8Co_o_valor_dom != null &&
                    this.awlip8Co_o_valor_dom.equals(other.getAwlip8Co_o_valor_dom())));
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
        if (getAwlip8Co_o_sec_car() != null) {
            _hashCode += getAwlip8Co_o_sec_car().hashCode();
        }
        if (getAwlip8Co_o_cod_car() != null) {
            _hashCode += getAwlip8Co_o_cod_car().hashCode();
        }
        if (getAwlip8Co_o_cod_dom() != null) {
            _hashCode += getAwlip8Co_o_cod_dom().hashCode();
        }
        if (getAwlip8Co_o_tip_dom() != null) {
            _hashCode += getAwlip8Co_o_tip_dom().hashCode();
        }
        if (getAwlip8Co_o_valor_dom() != null) {
            _hashCode += getAwlip8Co_o_valor_dom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(
            ProgramInterfaceAwlip8Co_salidaAwlip8Co_o_pi_clienteAwlip8Co_o_pi_cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com",
            ">>>ProgramInterface>awlip8co_salida>awlip8co_o_pi_cliente>awlip8co_o_pi_cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_sec_car");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_sec_car"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_car");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_car"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_cod_dom");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_cod_dom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_tip_dom");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_tip_dom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_o_valor_dom");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Response.com", "awlip8co_o_valor_dom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
