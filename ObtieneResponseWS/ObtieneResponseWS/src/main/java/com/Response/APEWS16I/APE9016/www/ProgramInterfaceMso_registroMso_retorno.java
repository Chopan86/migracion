/**
 * ProgramInterfaceMso_registroMso_retorno.java
 *
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
public class ProgramInterfaceMso_registroMso_retorno  implements java.io.Serializable {
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_cod_retorno;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_cod_error;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_descripcion_error;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String mso_filler;

    public ProgramInterfaceMso_registroMso_retorno() {
    }

    public ProgramInterfaceMso_registroMso_retorno(
           java.lang.String mso_cod_retorno,
           java.lang.String mso_cod_error,
           java.lang.String mso_descripcion_error,
           java.lang.String mso_filler) {
           this.mso_cod_retorno = mso_cod_retorno;
           this.mso_cod_error = mso_cod_error;
           this.mso_descripcion_error = mso_descripcion_error;
           this.mso_filler = mso_filler;
    }


    /**
     * Gets the mso_cod_retorno value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @return mso_cod_retorno
     */
    public java.lang.String getMso_cod_retorno() {
        return mso_cod_retorno;
    }


    /**
     * Sets the mso_cod_retorno value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @param mso_cod_retorno
     */
    public void setMso_cod_retorno(java.lang.String mso_cod_retorno) {
        this.mso_cod_retorno = mso_cod_retorno;
    }


    /**
     * Gets the mso_cod_error value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @return mso_cod_error
     */
    public java.lang.String getMso_cod_error() {
        return mso_cod_error;
    }


    /**
     * Sets the mso_cod_error value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @param mso_cod_error
     */
    public void setMso_cod_error(java.lang.String mso_cod_error) {
        this.mso_cod_error = mso_cod_error;
    }


    /**
     * Gets the mso_descripcion_error value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @return mso_descripcion_error
     */
    public java.lang.String getMso_descripcion_error() {
        return mso_descripcion_error;
    }


    /**
     * Sets the mso_descripcion_error value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @param mso_descripcion_error
     */
    public void setMso_descripcion_error(java.lang.String mso_descripcion_error) {
        this.mso_descripcion_error = mso_descripcion_error;
    }


    /**
     * Gets the mso_filler value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @return mso_filler
     */
    public java.lang.String getMso_filler() {
        return mso_filler;
    }


    /**
     * Sets the mso_filler value for this ProgramInterfaceMso_registroMso_retorno.
     * 
     * @param mso_filler
     */
    public void setMso_filler(java.lang.String mso_filler) {
        this.mso_filler = mso_filler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_registroMso_retorno)) return false;
        ProgramInterfaceMso_registroMso_retorno other = (ProgramInterfaceMso_registroMso_retorno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mso_cod_retorno==null && other.getMso_cod_retorno()==null) || 
             (this.mso_cod_retorno!=null &&
              this.mso_cod_retorno.equals(other.getMso_cod_retorno()))) &&
            ((this.mso_cod_error==null && other.getMso_cod_error()==null) || 
             (this.mso_cod_error!=null &&
              this.mso_cod_error.equals(other.getMso_cod_error()))) &&
            ((this.mso_descripcion_error==null && other.getMso_descripcion_error()==null) || 
             (this.mso_descripcion_error!=null &&
              this.mso_descripcion_error.equals(other.getMso_descripcion_error()))) &&
            ((this.mso_filler==null && other.getMso_filler()==null) || 
             (this.mso_filler!=null &&
              this.mso_filler.equals(other.getMso_filler())));
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
        if (getMso_cod_retorno() != null) {
            _hashCode += getMso_cod_retorno().hashCode();
        }
        if (getMso_cod_error() != null) {
            _hashCode += getMso_cod_error().hashCode();
        }
        if (getMso_descripcion_error() != null) {
            _hashCode += getMso_descripcion_error().hashCode();
        }
        if (getMso_filler() != null) {
            _hashCode += getMso_filler().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_registroMso_retorno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", ">>ProgramInterface>mso_registro>mso_retorno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_cod_retorno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_cod_retorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_cod_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_cod_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_descripcion_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_descripcion_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mso_filler");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Response.com", "mso_filler"));
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
