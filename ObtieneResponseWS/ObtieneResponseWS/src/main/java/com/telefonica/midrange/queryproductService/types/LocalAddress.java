/**
 * LocalAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class LocalAddress  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String positionNr;

    private java.lang.String fullAdress;

    public LocalAddress() {
    }

    public LocalAddress(
           java.lang.String type,
           java.lang.String positionNr,
           java.lang.String fullAdress) {
           this.type = type;
           this.positionNr = positionNr;
           this.fullAdress = fullAdress;
    }


    /**
     * Gets the type value for this LocalAddress.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this LocalAddress.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the positionNr value for this LocalAddress.
     * 
     * @return positionNr
     */
    public java.lang.String getPositionNr() {
        return positionNr;
    }


    /**
     * Sets the positionNr value for this LocalAddress.
     * 
     * @param positionNr
     */
    public void setPositionNr(java.lang.String positionNr) {
        this.positionNr = positionNr;
    }


    /**
     * Gets the fullAdress value for this LocalAddress.
     * 
     * @return fullAdress
     */
    public java.lang.String getFullAdress() {
        return fullAdress;
    }


    /**
     * Sets the fullAdress value for this LocalAddress.
     * 
     * @param fullAdress
     */
    public void setFullAdress(java.lang.String fullAdress) {
        this.fullAdress = fullAdress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocalAddress)) return false;
        LocalAddress other = (LocalAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.positionNr==null && other.getPositionNr()==null) || 
             (this.positionNr!=null &&
              this.positionNr.equals(other.getPositionNr()))) &&
            ((this.fullAdress==null && other.getFullAdress()==null) || 
             (this.fullAdress!=null &&
              this.fullAdress.equals(other.getFullAdress())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPositionNr() != null) {
            _hashCode += getPositionNr().hashCode();
        }
        if (getFullAdress() != null) {
            _hashCode += getFullAdress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocalAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "localAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positionNr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "positionNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullAdress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "fullAdress"));
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
