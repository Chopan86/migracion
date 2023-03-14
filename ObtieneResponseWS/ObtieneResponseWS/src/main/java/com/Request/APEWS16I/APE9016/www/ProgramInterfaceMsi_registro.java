/**
 * ProgramInterfaceMsi_registro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.APEWS16I.APE9016.www;

public class ProgramInterfaceMsi_registro  implements java.io.Serializable {
    private com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registroMsi_entrada msi_entrada;

    public ProgramInterfaceMsi_registro() {
    }

    public ProgramInterfaceMsi_registro(
           com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registroMsi_entrada msi_entrada) {
           this.msi_entrada = msi_entrada;
    }


    /**
     * Gets the msi_entrada value for this ProgramInterfaceMsi_registro.
     * 
     * @return msi_entrada
     */
    public com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registroMsi_entrada getMsi_entrada() {
        return msi_entrada;
    }


    /**
     * Sets the msi_entrada value for this ProgramInterfaceMsi_registro.
     * 
     * @param msi_entrada
     */
    public void setMsi_entrada(com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registroMsi_entrada msi_entrada) {
        this.msi_entrada = msi_entrada;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMsi_registro)) return false;
        ProgramInterfaceMsi_registro other = (ProgramInterfaceMsi_registro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msi_entrada==null && other.getMsi_entrada()==null) || 
             (this.msi_entrada!=null &&
              this.msi_entrada.equals(other.getMsi_entrada())));
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
        if (getMsi_entrada() != null) {
            _hashCode += getMsi_entrada().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMsi_registro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", ">ProgramInterface>msi_registro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msi_entrada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", "msi_entrada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", ">>ProgramInterface>msi_registro>msi_entrada"));
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
