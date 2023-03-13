/**
 * ProgramInterfaceApel_afac_pms_i.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.WSPMS.APELAFAC.www;

public class ProgramInterfaceApel_afac_pms_i  implements java.io.Serializable {
    private java.lang.String datain;

    public ProgramInterfaceApel_afac_pms_i() {
    }

    public ProgramInterfaceApel_afac_pms_i(
           java.lang.String datain) {
           this.datain = datain;
    }


    /**
     * Gets the datain value for this ProgramInterfaceApel_afac_pms_i.
     * 
     * @return datain
     */
    public java.lang.String getDatain() {
        return datain;
    }


    /**
     * Sets the datain value for this ProgramInterfaceApel_afac_pms_i.
     * 
     * @param datain
     */
    public void setDatain(java.lang.String datain) {
        this.datain = datain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceApel_afac_pms_i)) return false;
        ProgramInterfaceApel_afac_pms_i other = (ProgramInterfaceApel_afac_pms_i) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datain==null && other.getDatain()==null) || 
             (this.datain!=null &&
              this.datain.equals(other.getDatain())));
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
        if (getDatain() != null) {
            _hashCode += getDatain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceApel_afac_pms_i.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APELAFAC.WSPMS.Request.com", ">ProgramInterface>apel_afac_pms_i"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APELAFAC.WSPMS.Request.com", "datain"));
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
