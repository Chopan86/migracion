/**
 * ProductSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class ProductSpecification  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String productNumber;

    private java.lang.String brand;

    private com.telefonica.midrange.queryproductService.types.ValidFor validFor;

    private java.lang.String lifecycleStatus;

    public ProductSpecification() {
    }

    public ProductSpecification(
           java.lang.String id,
           java.lang.String name,
           java.lang.String description,
           java.lang.String productNumber,
           java.lang.String brand,
           com.telefonica.midrange.queryproductService.types.ValidFor validFor,
           java.lang.String lifecycleStatus) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.productNumber = productNumber;
           this.brand = brand;
           this.validFor = validFor;
           this.lifecycleStatus = lifecycleStatus;
    }


    /**
     * Gets the id value for this ProductSpecification.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ProductSpecification.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ProductSpecification.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductSpecification.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ProductSpecification.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductSpecification.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the productNumber value for this ProductSpecification.
     * 
     * @return productNumber
     */
    public java.lang.String getProductNumber() {
        return productNumber;
    }


    /**
     * Sets the productNumber value for this ProductSpecification.
     * 
     * @param productNumber
     */
    public void setProductNumber(java.lang.String productNumber) {
        this.productNumber = productNumber;
    }


    /**
     * Gets the brand value for this ProductSpecification.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this ProductSpecification.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the validFor value for this ProductSpecification.
     * 
     * @return validFor
     */
    public com.telefonica.midrange.queryproductService.types.ValidFor getValidFor() {
        return validFor;
    }


    /**
     * Sets the validFor value for this ProductSpecification.
     * 
     * @param validFor
     */
    public void setValidFor(com.telefonica.midrange.queryproductService.types.ValidFor validFor) {
        this.validFor = validFor;
    }


    /**
     * Gets the lifecycleStatus value for this ProductSpecification.
     * 
     * @return lifecycleStatus
     */
    public java.lang.String getLifecycleStatus() {
        return lifecycleStatus;
    }


    /**
     * Sets the lifecycleStatus value for this ProductSpecification.
     * 
     * @param lifecycleStatus
     */
    public void setLifecycleStatus(java.lang.String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductSpecification)) return false;
        ProductSpecification other = (ProductSpecification) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.productNumber==null && other.getProductNumber()==null) || 
             (this.productNumber!=null &&
              this.productNumber.equals(other.getProductNumber()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.validFor==null && other.getValidFor()==null) || 
             (this.validFor!=null &&
              this.validFor.equals(other.getValidFor()))) &&
            ((this.lifecycleStatus==null && other.getLifecycleStatus()==null) || 
             (this.lifecycleStatus!=null &&
              this.lifecycleStatus.equals(other.getLifecycleStatus())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProductNumber() != null) {
            _hashCode += getProductNumber().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getValidFor() != null) {
            _hashCode += getValidFor().hashCode();
        }
        if (getLifecycleStatus() != null) {
            _hashCode += getLifecycleStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "brand"));
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
        elemField.setFieldName("lifecycleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "lifecycleStatus"));
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
