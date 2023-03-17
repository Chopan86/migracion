/**
 * ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli  implements java.io.Serializable {
    private java.lang.String acmb7Wso_ac_rut;

    private java.lang.String acmb7Wso_ac_dv;

    public ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli() {
    }

    public ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli(
           java.lang.String acmb7Wso_ac_rut,
           java.lang.String acmb7Wso_ac_dv) {
           this.acmb7Wso_ac_rut = acmb7Wso_ac_rut;
           this.acmb7Wso_ac_dv = acmb7Wso_ac_dv;
    }


    /**
     * Gets the acmb7Wso_ac_rut value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli.
     * 
     * @return acmb7Wso_ac_rut
     */
    public java.lang.String getAcmb7Wso_ac_rut() {
        return acmb7Wso_ac_rut;
    }


    /**
     * Sets the acmb7Wso_ac_rut value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli.
     * 
     * @param acmb7Wso_ac_rut
     */
    public void setAcmb7Wso_ac_rut(java.lang.String acmb7Wso_ac_rut) {
        this.acmb7Wso_ac_rut = acmb7Wso_ac_rut;
    }


    /**
     * Gets the acmb7Wso_ac_dv value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli.
     * 
     * @return acmb7Wso_ac_dv
     */
    public java.lang.String getAcmb7Wso_ac_dv() {
        return acmb7Wso_ac_dv;
    }


    /**
     * Sets the acmb7Wso_ac_dv value for this ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli.
     * 
     * @param acmb7Wso_ac_dv
     */
    public void setAcmb7Wso_ac_dv(java.lang.String acmb7Wso_ac_dv) {
        this.acmb7Wso_ac_dv = acmb7Wso_ac_dv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli)) return false;
        ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli other = (ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acmb7Wso_ac_rut==null && other.getAcmb7Wso_ac_rut()==null) || 
             (this.acmb7Wso_ac_rut!=null &&
              this.acmb7Wso_ac_rut.equals(other.getAcmb7Wso_ac_rut()))) &&
            ((this.acmb7Wso_ac_dv==null && other.getAcmb7Wso_ac_dv()==null) || 
             (this.acmb7Wso_ac_dv!=null &&
              this.acmb7Wso_ac_dv.equals(other.getAcmb7Wso_ac_dv())));
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
        if (getAcmb7Wso_ac_rut() != null) {
            _hashCode += getAcmb7Wso_ac_rut().hashCode();
        }
        if (getAcmb7Wso_ac_dv() != null) {
            _hashCode += getAcmb7Wso_ac_dv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMso_acmb7WsoAcmb7Wso_datosAcmb7Wso_ac_rut_cli.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", ">>>ProgramInterface>mso_acmb7wso>acmb7wso_datos>acmb7wso_ac_rut_cli"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_ac_rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_ac_rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wso_ac_dv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Response.com", "acmb7wso_ac_dv"));
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
