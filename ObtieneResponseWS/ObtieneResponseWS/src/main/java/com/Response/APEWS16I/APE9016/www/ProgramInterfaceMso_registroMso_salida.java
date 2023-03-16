/**
 * ProgramInterfaceMso_registroMso_salida.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.APEWS16I.APE9016.www;

import cl.tchile.adapter.StringAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceMso_registroMso_salida implements java.io.Serializable {
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String filler1;

    private com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salida mso_datos_salida;

    public ProgramInterfaceMso_registroMso_salida() {
    }

    public ProgramInterfaceMso_registroMso_salida(
        java.lang.String filler1,
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salida mso_datos_salida) {
        this.filler1 = filler1;
        this.mso_datos_salida = mso_datos_salida;
    }

    /**
     * Gets the filler1 value for this ProgramInterfaceMso_registroMso_salida.
     *
     * @return filler1
     */
    public java.lang.String getFiller1() {
        return filler1;
    }

    /**
     * Sets the filler1 value for this ProgramInterfaceMso_registroMso_salida.
     *
     * @param filler1
     */
    public void setFiller1(java.lang.String filler1) {
        this.filler1 = filler1;
    }

    /**
     * Gets the mso_datos_salida value for this ProgramInterfaceMso_registroMso_salida.
     *
     * @return mso_datos_salida
     */
    public com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salida getMso_datos_salida() {
        return mso_datos_salida;
    }

    /**
     * Sets the mso_datos_salida value for this ProgramInterfaceMso_registroMso_salida.
     *
     * @param mso_datos_salida
     */
    public void setMso_datos_salida(
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salida mso_datos_salida) {
        this.mso_datos_salida = mso_datos_salida;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_registroMso_salida))
            return false;
        ProgramInterfaceMso_registroMso_salida other = (ProgramInterfaceMso_registroMso_salida) obj;
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
            ((this.filler1 == null && other.getFiller1() == null) ||
                (this.filler1 != null &&
                    this.filler1.equals(other.getFiller1()))) &&
            ((this.mso_datos_salida == null && other.getMso_datos_salida() == null) ||
                (this.mso_datos_salida != null &&
                    this.mso_datos_salida.equals(other.getMso_datos_salida())));
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
        if (getFiller1() != null) {
            _hashCode += getFiller1().hashCode();
        }
        if (getMso_datos_salida() != null) {
            _hashCode += getMso_datos_salida().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_registroMso_salida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>ProgramInterface>mso_registro>mso_salida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "filler1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_datos_salida");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_datos_salida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>>ProgramInterface>mso_registro>mso_salida>mso_datos_salida"));
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
