/**
 * Place.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class Place  implements java.io.Serializable {
    private java.lang.String id;

    private com.telefonica.midrange.queryproductService.types.ValidFor validFor;

    private com.telefonica.midrange.queryproductService.types.LocalAddress localAddress;

    public Place() {
    }

    public Place(
           java.lang.String id,
           com.telefonica.midrange.queryproductService.types.ValidFor validFor,
           com.telefonica.midrange.queryproductService.types.LocalAddress localAddress) {
           this.id = id;
           this.validFor = validFor;
           this.localAddress = localAddress;
    }


    /**
     * Gets the id value for this Place.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Place.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the validFor value for this Place.
     * 
     * @return validFor
     */
    public com.telefonica.midrange.queryproductService.types.ValidFor getValidFor() {
        return validFor;
    }


    /**
     * Sets the validFor value for this Place.
     * 
     * @param validFor
     */
    public void setValidFor(com.telefonica.midrange.queryproductService.types.ValidFor validFor) {
        this.validFor = validFor;
    }


    /**
     * Gets the localAddress value for this Place.
     * 
     * @return localAddress
     */
    public com.telefonica.midrange.queryproductService.types.LocalAddress getLocalAddress() {
        return localAddress;
    }


    /**
     * Sets the localAddress value for this Place.
     * 
     * @param localAddress
     */
    public void setLocalAddress(com.telefonica.midrange.queryproductService.types.LocalAddress localAddress) {
        this.localAddress = localAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Place)) return false;
        Place other = (Place) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.validFor==null && other.getValidFor()==null) || 
             (this.validFor!=null &&
              this.validFor.equals(other.getValidFor()))) &&
            ((this.localAddress==null && other.getLocalAddress()==null) || 
             (this.localAddress!=null &&
              this.localAddress.equals(other.getLocalAddress())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getValidFor() != null) {
            _hashCode += getValidFor().hashCode();
        }
        if (getLocalAddress() != null) {
            _hashCode += getLocalAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Place.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "place"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "validFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "validFor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "localAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "localAddress"));
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
