/**
 * ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.java
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
public class ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo implements java.io.Serializable {
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_nod_cll;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_nod_alt;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_nod_num;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_nod_tip;

    public ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo() {
    }

    public ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo(
        java.lang.String mso_nod_cll,
        java.lang.String mso_nod_alt,
        java.lang.String mso_nod_num,
        java.lang.String mso_nod_tip) {
        this.mso_nod_cll = mso_nod_cll;
        this.mso_nod_alt = mso_nod_alt;
        this.mso_nod_num = mso_nod_num;
        this.mso_nod_tip = mso_nod_tip;
    }

    /**
     * Gets the mso_nod_cll value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @return mso_nod_cll
     */
    public java.lang.String getMso_nod_cll() {
        return mso_nod_cll;
    }

    /**
     * Sets the mso_nod_cll value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @param mso_nod_cll
     */
    public void setMso_nod_cll(java.lang.String mso_nod_cll) {
        this.mso_nod_cll = mso_nod_cll;
    }

    /**
     * Gets the mso_nod_alt value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @return mso_nod_alt
     */
    public java.lang.String getMso_nod_alt() {
        return mso_nod_alt;
    }

    /**
     * Sets the mso_nod_alt value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @param mso_nod_alt
     */
    public void setMso_nod_alt(java.lang.String mso_nod_alt) {
        this.mso_nod_alt = mso_nod_alt;
    }

    /**
     * Gets the mso_nod_num value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @return mso_nod_num
     */
    public java.lang.String getMso_nod_num() {
        return mso_nod_num;
    }

    /**
     * Sets the mso_nod_num value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @param mso_nod_num
     */
    public void setMso_nod_num(java.lang.String mso_nod_num) {
        this.mso_nod_num = mso_nod_num;
    }

    /**
     * Gets the mso_nod_tip value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @return mso_nod_tip
     */
    public java.lang.String getMso_nod_tip() {
        return mso_nod_tip;
    }

    /**
     * Sets the mso_nod_tip value for this ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.
     *
     * @param mso_nod_tip
     */
    public void setMso_nod_tip(java.lang.String mso_nod_tip) {
        this.mso_nod_tip = mso_nod_tip;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo))
            return false;
        ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo other = (ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo) obj;
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
            ((this.mso_nod_cll == null && other.getMso_nod_cll() == null) ||
                (this.mso_nod_cll != null &&
                    this.mso_nod_cll.equals(other.getMso_nod_cll()))) &&
            ((this.mso_nod_alt == null && other.getMso_nod_alt() == null) ||
                (this.mso_nod_alt != null &&
                    this.mso_nod_alt.equals(other.getMso_nod_alt()))) &&
            ((this.mso_nod_num == null && other.getMso_nod_num() == null) ||
                (this.mso_nod_num != null &&
                    this.mso_nod_num.equals(other.getMso_nod_num()))) &&
            ((this.mso_nod_tip == null && other.getMso_nod_tip() == null) ||
                (this.mso_nod_tip != null &&
                    this.mso_nod_tip.equals(other.getMso_nod_tip())));
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
        if (getMso_nod_cll() != null) {
            _hashCode += getMso_nod_cll().hashCode();
        }
        if (getMso_nod_alt() != null) {
            _hashCode += getMso_nod_alt().hashCode();
        }
        if (getMso_nod_num() != null) {
            _hashCode += getMso_nod_num().hashCode();
        }
        if (getMso_nod_tip() != null) {
            _hashCode += getMso_nod_tip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(
            ProgramInterfaceMso_registroMso_salidaMso_datos_salidaFiller2Mso_nodo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>>>>ProgramInterface>mso_registro>mso_salida>mso_datos_salida>filler2>mso_nodo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_nod_cll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_nod_cll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_nod_alt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_nod_alt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_nod_num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_nod_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_nod_tip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_nod_tip"));
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
