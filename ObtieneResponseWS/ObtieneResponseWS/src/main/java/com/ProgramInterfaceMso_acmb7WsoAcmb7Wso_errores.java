/**
 * ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

import cl.tchile.adapter.StringAdapter;
import cl.tchile.adapter.UnsignedIntAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores implements java.io.Serializable {
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt acmb7Wso_cod_error;
    @XmlJavaTypeAdapter(StringAdapter.class)

    private java.lang.String acmb7Wso_desc_error;
    @XmlJavaTypeAdapter(StringAdapter.class)

    private java.lang.String acmb7Wso_programa;
    @XmlJavaTypeAdapter(value = UnsignedIntAdapter.class, type = Long.class)
    private org.apache.axis.types.UnsignedInt acmb7Wso_cod_db;
    @XmlJavaTypeAdapter(StringAdapter.class)

    private java.lang.String acmb7Wso_desc_db;

    public ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores() {
    }

    public ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores(
        org.apache.axis.types.UnsignedInt acmb7Wso_cod_error,
        java.lang.String acmb7Wso_desc_error,
        java.lang.String acmb7Wso_programa,
        org.apache.axis.types.UnsignedInt acmb7Wso_cod_db,
        java.lang.String acmb7Wso_desc_db) {
        this.acmb7Wso_cod_error = acmb7Wso_cod_error;
        this.acmb7Wso_desc_error = acmb7Wso_desc_error;
        this.acmb7Wso_programa = acmb7Wso_programa;
        this.acmb7Wso_cod_db = acmb7Wso_cod_db;
        this.acmb7Wso_desc_db = acmb7Wso_desc_db;
    }

    /**
     * Gets the acmb7Wso_cod_error value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @return acmb7Wso_cod_error
     */
    public org.apache.axis.types.UnsignedInt getAcmb7Wso_cod_error() {
        return acmb7Wso_cod_error;
    }

    /**
     * Sets the acmb7Wso_cod_error value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @param acmb7Wso_cod_error
     */
    public void setAcmb7Wso_cod_error(org.apache.axis.types.UnsignedInt acmb7Wso_cod_error) {
        this.acmb7Wso_cod_error = acmb7Wso_cod_error;
    }

    /**
     * Gets the acmb7Wso_desc_error value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @return acmb7Wso_desc_error
     */
    public java.lang.String getAcmb7Wso_desc_error() {
        return acmb7Wso_desc_error;
    }

    /**
     * Sets the acmb7Wso_desc_error value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @param acmb7Wso_desc_error
     */
    public void setAcmb7Wso_desc_error(java.lang.String acmb7Wso_desc_error) {
        this.acmb7Wso_desc_error = acmb7Wso_desc_error;
    }

    /**
     * Gets the acmb7Wso_programa value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @return acmb7Wso_programa
     */
    public java.lang.String getAcmb7Wso_programa() {
        return acmb7Wso_programa;
    }

    /**
     * Sets the acmb7Wso_programa value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @param acmb7Wso_programa
     */
    public void setAcmb7Wso_programa(java.lang.String acmb7Wso_programa) {
        this.acmb7Wso_programa = acmb7Wso_programa;
    }

    /**
     * Gets the acmb7Wso_cod_db value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @return acmb7Wso_cod_db
     */
    public org.apache.axis.types.UnsignedInt getAcmb7Wso_cod_db() {
        return acmb7Wso_cod_db;
    }

    /**
     * Sets the acmb7Wso_cod_db value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @param acmb7Wso_cod_db
     */
    public void setAcmb7Wso_cod_db(org.apache.axis.types.UnsignedInt acmb7Wso_cod_db) {
        this.acmb7Wso_cod_db = acmb7Wso_cod_db;
    }

    /**
     * Gets the acmb7Wso_desc_db value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @return acmb7Wso_desc_db
     */
    public java.lang.String getAcmb7Wso_desc_db() {
        return acmb7Wso_desc_db;
    }

    /**
     * Sets the acmb7Wso_desc_db value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.
     *
     * @param acmb7Wso_desc_db
     */
    public void setAcmb7Wso_desc_db(java.lang.String acmb7Wso_desc_db) {
        this.acmb7Wso_desc_db = acmb7Wso_desc_db;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores))
            return false;
        ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores other = (ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores) obj;
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
            ((this.acmb7Wso_cod_error == null && other.getAcmb7Wso_cod_error() == null) ||
                (this.acmb7Wso_cod_error != null &&
                    this.acmb7Wso_cod_error.equals(other.getAcmb7Wso_cod_error()))) &&
            ((this.acmb7Wso_desc_error == null && other.getAcmb7Wso_desc_error() == null) ||
                (this.acmb7Wso_desc_error != null &&
                    this.acmb7Wso_desc_error.equals(other.getAcmb7Wso_desc_error()))) &&
            ((this.acmb7Wso_programa == null && other.getAcmb7Wso_programa() == null) ||
                (this.acmb7Wso_programa != null &&
                    this.acmb7Wso_programa.equals(other.getAcmb7Wso_programa()))) &&
            ((this.acmb7Wso_cod_db == null && other.getAcmb7Wso_cod_db() == null) ||
                (this.acmb7Wso_cod_db != null &&
                    this.acmb7Wso_cod_db.equals(other.getAcmb7Wso_cod_db()))) &&
            ((this.acmb7Wso_desc_db == null && other.getAcmb7Wso_desc_db() == null) ||
                (this.acmb7Wso_desc_db != null &&
                    this.acmb7Wso_desc_db.equals(other.getAcmb7Wso_desc_db())));
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
        if (getAcmb7Wso_cod_error() != null) {
            _hashCode += getAcmb7Wso_cod_error().hashCode();
        }
        if (getAcmb7Wso_desc_error() != null) {
            _hashCode += getAcmb7Wso_desc_error().hashCode();
        }
        if (getAcmb7Wso_programa() != null) {
            _hashCode += getAcmb7Wso_programa().hashCode();
        }
        if (getAcmb7Wso_cod_db() != null) {
            _hashCode += getAcmb7Wso_cod_db().hashCode();
        }
        if (getAcmb7Wso_desc_db() != null) {
            _hashCode += getAcmb7Wso_desc_db().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com",
            ">>ProgramInterface>mso_acmb7wso>acmb7wso_errores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_cod_error");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_cod_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_desc_error");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_desc_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_programa");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_programa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_cod_db");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_cod_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_desc_db");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_desc_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
