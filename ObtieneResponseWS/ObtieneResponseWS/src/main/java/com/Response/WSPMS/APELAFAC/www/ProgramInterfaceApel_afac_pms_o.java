/**
 * ProgramInterfaceApel_afac_pms_o.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.WSPMS.APELAFAC.www;

public class ProgramInterfaceApel_afac_pms_o  implements java.io.Serializable {
    private java.lang.String dataout;

    public ProgramInterfaceApel_afac_pms_o() {
    }

    public ProgramInterfaceApel_afac_pms_o(
           java.lang.String dataout) {
           this.dataout = dataout;
    }


    /**
     * Gets the dataout value for this ProgramInterfaceApel_afac_pms_o.
     * 
     * @return dataout
     */
    public java.lang.String getDataout() {
        return dataout;
    }


    /**
     * Sets the dataout value for this ProgramInterfaceApel_afac_pms_o.
     * 
     * @param dataout
     */
    public void setDataout(java.lang.String dataout) {
        this.dataout = dataout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceApel_afac_pms_o)) return false;
        ProgramInterfaceApel_afac_pms_o other = (ProgramInterfaceApel_afac_pms_o) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataout==null && other.getDataout()==null) || 
             (this.dataout!=null &&
              this.dataout.equals(other.getDataout())));
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
        if (getDataout() != null) {
            _hashCode += getDataout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceApel_afac_pms_o.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APELAFAC.WSPMS.Response.com", ">ProgramInterface>apel_afac_pms_o"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APELAFAC.WSPMS.Response.com", "dataout"));
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
