/**
 * ProductBundle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class ProductBundle  implements java.io.Serializable {
    private java.lang.String idType;

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String productStatus;

    private java.lang.String productSerialNumber;

    private com.telefonica.midrange.queryproductService.types.ValidFor validFor;

    private com.telefonica.midrange.queryproductService.types.ProductCapacity productCapacity;

    private com.telefonica.midrange.queryproductService.types.ProductOffering[] productOffering;

    private com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] productCharacteristic;

    private com.telefonica.midrange.queryproductService.types.Place place;

    private com.telefonica.midrange.queryproductService.types.ProductInvolvementRole productInvolvementRole;

    private com.telefonica.midrange.queryproductService.types.CustomerFacingService[] customerFacingService;

    private com.telefonica.midrange.queryproductService.types.ProductPrice productPrice;

    private com.telefonica.midrange.queryproductService.types.ProductSpecification productSpecification;

    public ProductBundle() {
    }

    public ProductBundle(
           java.lang.String idType,
           java.lang.String id,
           java.lang.String name,
           java.lang.String description,
           java.lang.String productStatus,
           java.lang.String productSerialNumber,
           com.telefonica.midrange.queryproductService.types.ValidFor validFor,
           com.telefonica.midrange.queryproductService.types.ProductCapacity productCapacity,
           com.telefonica.midrange.queryproductService.types.ProductOffering[] productOffering,
           com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] productCharacteristic,
           com.telefonica.midrange.queryproductService.types.Place place,
           com.telefonica.midrange.queryproductService.types.ProductInvolvementRole productInvolvementRole,
           com.telefonica.midrange.queryproductService.types.CustomerFacingService[] customerFacingService,
           com.telefonica.midrange.queryproductService.types.ProductPrice productPrice,
           com.telefonica.midrange.queryproductService.types.ProductSpecification productSpecification) {
           this.idType = idType;
           this.id = id;
           this.name = name;
           this.description = description;
           this.productStatus = productStatus;
           this.productSerialNumber = productSerialNumber;
           this.validFor = validFor;
           this.productCapacity = productCapacity;
           this.productOffering = productOffering;
           this.productCharacteristic = productCharacteristic;
           this.place = place;
           this.productInvolvementRole = productInvolvementRole;
           this.customerFacingService = customerFacingService;
           this.productPrice = productPrice;
           this.productSpecification = productSpecification;
    }


    /**
     * Gets the idType value for this ProductBundle.
     * 
     * @return idType
     */
    public java.lang.String getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this ProductBundle.
     * 
     * @param idType
     */
    public void setIdType(java.lang.String idType) {
        this.idType = idType;
    }


    /**
     * Gets the id value for this ProductBundle.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ProductBundle.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ProductBundle.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProductBundle.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ProductBundle.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductBundle.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the productStatus value for this ProductBundle.
     * 
     * @return productStatus
     */
    public java.lang.String getProductStatus() {
        return productStatus;
    }


    /**
     * Sets the productStatus value for this ProductBundle.
     * 
     * @param productStatus
     */
    public void setProductStatus(java.lang.String productStatus) {
        this.productStatus = productStatus;
    }


    /**
     * Gets the productSerialNumber value for this ProductBundle.
     * 
     * @return productSerialNumber
     */
    public java.lang.String getProductSerialNumber() {
        return productSerialNumber;
    }


    /**
     * Sets the productSerialNumber value for this ProductBundle.
     * 
     * @param productSerialNumber
     */
    public void setProductSerialNumber(java.lang.String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }


    /**
     * Gets the validFor value for this ProductBundle.
     * 
     * @return validFor
     */
    public com.telefonica.midrange.queryproductService.types.ValidFor getValidFor() {
        return validFor;
    }


    /**
     * Sets the validFor value for this ProductBundle.
     * 
     * @param validFor
     */
    public void setValidFor(com.telefonica.midrange.queryproductService.types.ValidFor validFor) {
        this.validFor = validFor;
    }


    /**
     * Gets the productCapacity value for this ProductBundle.
     * 
     * @return productCapacity
     */
    public com.telefonica.midrange.queryproductService.types.ProductCapacity getProductCapacity() {
        return productCapacity;
    }


    /**
     * Sets the productCapacity value for this ProductBundle.
     * 
     * @param productCapacity
     */
    public void setProductCapacity(com.telefonica.midrange.queryproductService.types.ProductCapacity productCapacity) {
        this.productCapacity = productCapacity;
    }


    /**
     * Gets the productOffering value for this ProductBundle.
     * 
     * @return productOffering
     */
    public com.telefonica.midrange.queryproductService.types.ProductOffering[] getProductOffering() {
        return productOffering;
    }


    /**
     * Sets the productOffering value for this ProductBundle.
     * 
     * @param productOffering
     */
    public void setProductOffering(com.telefonica.midrange.queryproductService.types.ProductOffering[] productOffering) {
        this.productOffering = productOffering;
    }

    public com.telefonica.midrange.queryproductService.types.ProductOffering getProductOffering(int i) {
        return this.productOffering[i];
    }

    public void setProductOffering(int i, com.telefonica.midrange.queryproductService.types.ProductOffering _value) {
        this.productOffering[i] = _value;
    }


    /**
     * Gets the productCharacteristic value for this ProductBundle.
     * 
     * @return productCharacteristic
     */
    public com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] getProductCharacteristic() {
        return productCharacteristic;
    }


    /**
     * Sets the productCharacteristic value for this ProductBundle.
     * 
     * @param productCharacteristic
     */
    public void setProductCharacteristic(com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] productCharacteristic) {
        this.productCharacteristic = productCharacteristic;
    }

    public com.telefonica.midrange.queryproductService.types.ProductCharacteristic getProductCharacteristic(int i) {
        return this.productCharacteristic[i];
    }

    public void setProductCharacteristic(int i, com.telefonica.midrange.queryproductService.types.ProductCharacteristic _value) {
        this.productCharacteristic[i] = _value;
    }


    /**
     * Gets the place value for this ProductBundle.
     * 
     * @return place
     */
    public com.telefonica.midrange.queryproductService.types.Place getPlace() {
        return place;
    }


    /**
     * Sets the place value for this ProductBundle.
     * 
     * @param place
     */
    public void setPlace(com.telefonica.midrange.queryproductService.types.Place place) {
        this.place = place;
    }


    /**
     * Gets the productInvolvementRole value for this ProductBundle.
     * 
     * @return productInvolvementRole
     */
    public com.telefonica.midrange.queryproductService.types.ProductInvolvementRole getProductInvolvementRole() {
        return productInvolvementRole;
    }


    /**
     * Sets the productInvolvementRole value for this ProductBundle.
     * 
     * @param productInvolvementRole
     */
    public void setProductInvolvementRole(com.telefonica.midrange.queryproductService.types.ProductInvolvementRole productInvolvementRole) {
        this.productInvolvementRole = productInvolvementRole;
    }


    /**
     * Gets the customerFacingService value for this ProductBundle.
     * 
     * @return customerFacingService
     */
    public com.telefonica.midrange.queryproductService.types.CustomerFacingService[] getCustomerFacingService() {
        return customerFacingService;
    }


    /**
     * Sets the customerFacingService value for this ProductBundle.
     * 
     * @param customerFacingService
     */
    public void setCustomerFacingService(com.telefonica.midrange.queryproductService.types.CustomerFacingService[] customerFacingService) {
        this.customerFacingService = customerFacingService;
    }

    public com.telefonica.midrange.queryproductService.types.CustomerFacingService getCustomerFacingService(int i) {
        return this.customerFacingService[i];
    }

    public void setCustomerFacingService(int i, com.telefonica.midrange.queryproductService.types.CustomerFacingService _value) {
        this.customerFacingService[i] = _value;
    }


    /**
     * Gets the productPrice value for this ProductBundle.
     * 
     * @return productPrice
     */
    public com.telefonica.midrange.queryproductService.types.ProductPrice getProductPrice() {
        return productPrice;
    }


    /**
     * Sets the productPrice value for this ProductBundle.
     * 
     * @param productPrice
     */
    public void setProductPrice(com.telefonica.midrange.queryproductService.types.ProductPrice productPrice) {
        this.productPrice = productPrice;
    }


    /**
     * Gets the productSpecification value for this ProductBundle.
     * 
     * @return productSpecification
     */
    public com.telefonica.midrange.queryproductService.types.ProductSpecification getProductSpecification() {
        return productSpecification;
    }


    /**
     * Sets the productSpecification value for this ProductBundle.
     * 
     * @param productSpecification
     */
    public void setProductSpecification(com.telefonica.midrange.queryproductService.types.ProductSpecification productSpecification) {
        this.productSpecification = productSpecification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductBundle)) return false;
        ProductBundle other = (ProductBundle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.productStatus==null && other.getProductStatus()==null) || 
             (this.productStatus!=null &&
              this.productStatus.equals(other.getProductStatus()))) &&
            ((this.productSerialNumber==null && other.getProductSerialNumber()==null) || 
             (this.productSerialNumber!=null &&
              this.productSerialNumber.equals(other.getProductSerialNumber()))) &&
            ((this.validFor==null && other.getValidFor()==null) || 
             (this.validFor!=null &&
              this.validFor.equals(other.getValidFor()))) &&
            ((this.productCapacity==null && other.getProductCapacity()==null) || 
             (this.productCapacity!=null &&
              this.productCapacity.equals(other.getProductCapacity()))) &&
            ((this.productOffering==null && other.getProductOffering()==null) || 
             (this.productOffering!=null &&
              java.util.Arrays.equals(this.productOffering, other.getProductOffering()))) &&
            ((this.productCharacteristic==null && other.getProductCharacteristic()==null) || 
             (this.productCharacteristic!=null &&
              java.util.Arrays.equals(this.productCharacteristic, other.getProductCharacteristic()))) &&
            ((this.place==null && other.getPlace()==null) || 
             (this.place!=null &&
              this.place.equals(other.getPlace()))) &&
            ((this.productInvolvementRole==null && other.getProductInvolvementRole()==null) || 
             (this.productInvolvementRole!=null &&
              this.productInvolvementRole.equals(other.getProductInvolvementRole()))) &&
            ((this.customerFacingService==null && other.getCustomerFacingService()==null) || 
             (this.customerFacingService!=null &&
              java.util.Arrays.equals(this.customerFacingService, other.getCustomerFacingService()))) &&
            ((this.productPrice==null && other.getProductPrice()==null) || 
             (this.productPrice!=null &&
              this.productPrice.equals(other.getProductPrice()))) &&
            ((this.productSpecification==null && other.getProductSpecification()==null) || 
             (this.productSpecification!=null &&
              this.productSpecification.equals(other.getProductSpecification())));
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
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getProductStatus() != null) {
            _hashCode += getProductStatus().hashCode();
        }
        if (getProductSerialNumber() != null) {
            _hashCode += getProductSerialNumber().hashCode();
        }
        if (getValidFor() != null) {
            _hashCode += getValidFor().hashCode();
        }
        if (getProductCapacity() != null) {
            _hashCode += getProductCapacity().hashCode();
        }
        if (getProductOffering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductOffering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductOffering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductCharacteristic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductCharacteristic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductCharacteristic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlace() != null) {
            _hashCode += getPlace().hashCode();
        }
        if (getProductInvolvementRole() != null) {
            _hashCode += getProductInvolvementRole().hashCode();
        }
        if (getCustomerFacingService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerFacingService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerFacingService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductPrice() != null) {
            _hashCode += getProductPrice().hashCode();
        }
        if (getProductSpecification() != null) {
            _hashCode += getProductSpecification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductBundle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productBundle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "idType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("productStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productSerialNumber"));
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
        elemField.setFieldName("productCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCapacity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOffering");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productOffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productOffering"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCharacteristic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCharacteristic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCharacteristic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("place");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "place"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "place"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInvolvementRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productInvolvementRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productInvolvementRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerFacingService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "customerFacingService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "customerFacingService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productPrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productSpecification"));
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
