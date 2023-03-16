/**
 * ProgramInterfaceMso_registro.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.APEWS16I.APE9016.www;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceMso_registro implements java.io.Serializable {
    private com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salida mso_salida;

    private com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_retorno mso_retorno;

    public ProgramInterfaceMso_registro() {
    }

    public ProgramInterfaceMso_registro(
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salida mso_salida,
        com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_retorno mso_retorno) {
        this.mso_salida = mso_salida;
        this.mso_retorno = mso_retorno;
    }

    /**
     * Gets the mso_salida value for this ProgramInterfaceMso_registro.
     *
     * @return mso_salida
     */
    public com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salida getMso_salida() {
        return mso_salida;
    }

    /**
     * Sets the mso_salida value for this ProgramInterfaceMso_registro.
     *
     * @param mso_salida
     */
    public void setMso_salida(com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_salida mso_salida) {
        this.mso_salida = mso_salida;
    }

    /**
     * Gets the mso_retorno value for this ProgramInterfaceMso_registro.
     *
     * @return mso_retorno
     */
    public com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_retorno getMso_retorno() {
        return mso_retorno;
    }

    /**
     * Sets the mso_retorno value for this ProgramInterfaceMso_registro.
     *
     * @param mso_retorno
     */
    public void setMso_retorno(com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registroMso_retorno mso_retorno) {
        this.mso_retorno = mso_retorno;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_registro))
            return false;
        ProgramInterfaceMso_registro other = (ProgramInterfaceMso_registro) obj;
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
            ((this.mso_salida == null && other.getMso_salida() == null) ||
                (this.mso_salida != null &&
                    this.mso_salida.equals(other.getMso_salida()))) &&
            ((this.mso_retorno == null && other.getMso_retorno() == null) ||
                (this.mso_retorno != null &&
                    this.mso_retorno.equals(other.getMso_retorno())));
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
        if (getMso_salida() != null) {
            _hashCode += getMso_salida().hashCode();
        }
        if (getMso_retorno() != null) {
            _hashCode += getMso_retorno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_registro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">ProgramInterface>mso_registro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_salida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_salida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>ProgramInterface>mso_registro>mso_salida"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com",
            ">>ProgramInterface>mso_registro>mso_retorno"));
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
