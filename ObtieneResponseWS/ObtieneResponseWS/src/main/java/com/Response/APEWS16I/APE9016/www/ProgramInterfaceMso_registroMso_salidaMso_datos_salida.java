/**
 * ProgramInterfaceMso_registroMso_salidaMso_datos_salida.java
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
public class ProgramInterfaceMso_registroMso_salidaMso_datos_salida implements java.io.Serializable {
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_s_respuesta;

    private com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2[] filler2;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_cant_reg;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String filler3;

    public ProgramInterfaceMso_registroMso_salidaMso_datos_salida() {
    }

    public ProgramInterfaceMso_registroMso_salidaMso_datos_salida(
        java.lang.String mso_s_respuesta,
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2[] filler2,
        java.lang.String mso_cant_reg,
        java.lang.String filler3) {
        this.mso_s_respuesta = mso_s_respuesta;
        this.filler2 = filler2;
        this.mso_cant_reg = mso_cant_reg;
        this.filler3 = filler3;
    }

    /**
     * Gets the mso_s_respuesta value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @return mso_s_respuesta
     */
    public java.lang.String getMso_s_respuesta() {
        return mso_s_respuesta;
    }

    /**
     * Sets the mso_s_respuesta value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @param mso_s_respuesta
     */
    public void setMso_s_respuesta(java.lang.String mso_s_respuesta) {
        this.mso_s_respuesta = mso_s_respuesta;
    }

    /**
     * Gets the filler2 value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @return filler2
     */
    public com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2[] getFiller2() {
        return filler2;
    }

    /**
     * Sets the filler2 value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @param filler2
     */
    public void setFiller2(
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2[] filler2) {
        this.filler2 = filler2;
    }

    public com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2 getFiller2(
        int i) {
        return this.filler2[i];
    }

    public void setFiller2(int i,
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2 _value) {
        this.filler2[i] = _value;
    }

    /**
     * Gets the mso_cant_reg value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @return mso_cant_reg
     */
    public java.lang.String getMso_cant_reg() {
        return mso_cant_reg;
    }

    /**
     * Sets the mso_cant_reg value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @param mso_cant_reg
     */
    public void setMso_cant_reg(java.lang.String mso_cant_reg) {
        this.mso_cant_reg = mso_cant_reg;
    }

    /**
     * Gets the filler3 value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @return filler3
     */
    public java.lang.String getFiller3() {
        return filler3;
    }

    /**
     * Sets the filler3 value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salida.
     *
     * @param filler3
     */
    public void setFiller3(java.lang.String filler3) {
        this.filler3 = filler3;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_registroMso_salidaMso_datos_salida))
            return false;
        ProgramInterfaceMso_registroMso_salidaMso_datos_salida other = (ProgramInterfaceMso_registroMso_salidaMso_datos_salida) obj;
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
            ((this.mso_s_respuesta == null && other.getMso_s_respuesta() == null) ||
                (this.mso_s_respuesta != null &&
                    this.mso_s_respuesta.equals(other.getMso_s_respuesta()))) &&
            ((this.filler2 == null && other.getFiller2() == null) ||
                (this.filler2 != null &&
                    java.util.Arrays.equals(this.filler2, other.getFiller2()))) &&
            ((this.mso_cant_reg == null && other.getMso_cant_reg() == null) ||
                (this.mso_cant_reg != null &&
                    this.mso_cant_reg.equals(other.getMso_cant_reg()))) &&
            ((this.filler3 == null && other.getFiller3() == null) ||
                (this.filler3 != null &&
                    this.filler3.equals(other.getFiller3())));
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
        if (getMso_s_respuesta() != null) {
            _hashCode += getMso_s_respuesta().hashCode();
        }
        if (getFiller2() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFiller2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiller2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMso_cant_reg() != null) {
            _hashCode += getMso_cant_reg().hashCode();
        }
        if (getFiller3() != null) {
            _hashCode += getFiller3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_registroMso_salidaMso_datos_salida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>>ProgramInterface>mso_registro>mso_salida>mso_datos_salida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_s_respuesta");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_s_respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "filler2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>>>ProgramInterface>mso_registro>mso_salida>mso_datos_salida>filler2"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_cant_reg");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_cant_reg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "filler3"));
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
