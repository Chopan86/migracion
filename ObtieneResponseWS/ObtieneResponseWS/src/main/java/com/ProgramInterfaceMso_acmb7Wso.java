/**
 * ProgramInterfaceMso_acmb7Wso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProgramInterfaceMso_acmb7Wso  implements java.io.Serializable {
    private com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores acmb7Wso_errores;

    private com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_datos acmb7Wso_datos;

    public ProgramInterfaceMso_acmb7Wso() {
    }

    public ProgramInterfaceMso_acmb7Wso(
           com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores acmb7Wso_errores,
           com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_datos acmb7Wso_datos) {
           this.acmb7Wso_errores = acmb7Wso_errores;
           this.acmb7Wso_datos = acmb7Wso_datos;
    }


    /**
     * Gets the acmb7Wso_errores value for this ProgramInterfaceMso_acmb7Wso.
     * 
     * @return acmb7Wso_errores
     */
    public com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores getAcmb7Wso_errores() {
        return acmb7Wso_errores;
    }


    /**
     * Sets the acmb7Wso_errores value for this ProgramInterfaceMso_acmb7Wso.
     * 
     * @param acmb7Wso_errores
     */
    public void setAcmb7Wso_errores(com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_errores acmb7Wso_errores) {
        this.acmb7Wso_errores = acmb7Wso_errores;
    }


    /**
     * Gets the acmb7Wso_datos value for this ProgramInterfaceMso_acmb7Wso.
     * 
     * @return acmb7Wso_datos
     */
    public com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_datos getAcmb7Wso_datos() {
        return acmb7Wso_datos;
    }


    /**
     * Sets the acmb7Wso_datos value for this ProgramInterfaceMso_acmb7Wso.
     * 
     * @param acmb7Wso_datos
     */
    public void setAcmb7Wso_datos(com.ProgramInterfaceMso_acmb7WsoAcmb7Wso_datos acmb7Wso_datos) {
        this.acmb7Wso_datos = acmb7Wso_datos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_acmb7Wso)) return false;
        ProgramInterfaceMso_acmb7Wso other = (ProgramInterfaceMso_acmb7Wso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acmb7Wso_errores==null && other.getAcmb7Wso_errores()==null) || 
             (this.acmb7Wso_errores!=null &&
              this.acmb7Wso_errores.equals(other.getAcmb7Wso_errores()))) &&
            ((this.acmb7Wso_datos==null && other.getAcmb7Wso_datos()==null) || 
             (this.acmb7Wso_datos!=null &&
              this.acmb7Wso_datos.equals(other.getAcmb7Wso_datos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAcmb7Wso_errores() != null) {
            _hashCode += getAcmb7Wso_errores().hashCode();
        }
        if (getAcmb7Wso_datos() != null) {
            _hashCode += getAcmb7Wso_datos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_acmb7Wso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", ">ProgramInterface>mso_acmb7wso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_errores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_errores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", ">>ProgramInterface>mso_acmb7wso>acmb7wso_errores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_datos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_datos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", ">>ProgramInterface>mso_acmb7wso>acmb7wso_datos"));
        elemField.setMinOccurs(0);
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
