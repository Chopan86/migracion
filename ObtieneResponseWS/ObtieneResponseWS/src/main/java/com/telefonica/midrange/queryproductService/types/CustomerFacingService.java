/**
 * CustomerFacingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class CustomerFacingService  implements java.io.Serializable {
    private java.lang.Boolean isServiceEnabled;

    private java.lang.Boolean hasStarted;

    private java.lang.Boolean isMandatory;

    private java.math.BigInteger startMode;

    private java.lang.Boolean isStateful;

    private java.lang.String commonName;

    private java.lang.String description;

    private java.lang.String objectID;

    private java.math.BigInteger cfsStatus;

    private com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] productCharacteristic;

    public CustomerFacingService() {
    }

    public CustomerFacingService(
           java.lang.Boolean isServiceEnabled,
           java.lang.Boolean hasStarted,
           java.lang.Boolean isMandatory,
           java.math.BigInteger startMode,
           java.lang.Boolean isStateful,
           java.lang.String commonName,
           java.lang.String description,
           java.lang.String objectID,
           java.math.BigInteger cfsStatus,
           com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] productCharacteristic) {
           this.isServiceEnabled = isServiceEnabled;
           this.hasStarted = hasStarted;
           this.isMandatory = isMandatory;
           this.startMode = startMode;
           this.isStateful = isStateful;
           this.commonName = commonName;
           this.description = description;
           this.objectID = objectID;
           this.cfsStatus = cfsStatus;
           this.productCharacteristic = productCharacteristic;
    }


    /**
     * Gets the isServiceEnabled value for this CustomerFacingService.
     * 
     * @return isServiceEnabled
     */
    public java.lang.Boolean getIsServiceEnabled() {
        return isServiceEnabled;
    }


    /**
     * Sets the isServiceEnabled value for this CustomerFacingService.
     * 
     * @param isServiceEnabled
     */
    public void setIsServiceEnabled(java.lang.Boolean isServiceEnabled) {
        this.isServiceEnabled = isServiceEnabled;
    }


    /**
     * Gets the hasStarted value for this CustomerFacingService.
     * 
     * @return hasStarted
     */
    public java.lang.Boolean getHasStarted() {
        return hasStarted;
    }


    /**
     * Sets the hasStarted value for this CustomerFacingService.
     * 
     * @param hasStarted
     */
    public void setHasStarted(java.lang.Boolean hasStarted) {
        this.hasStarted = hasStarted;
    }


    /**
     * Gets the isMandatory value for this CustomerFacingService.
     * 
     * @return isMandatory
     */
    public java.lang.Boolean getIsMandatory() {
        return isMandatory;
    }


    /**
     * Sets the isMandatory value for this CustomerFacingService.
     * 
     * @param isMandatory
     */
    public void setIsMandatory(java.lang.Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }


    /**
     * Gets the startMode value for this CustomerFacingService.
     * 
     * @return startMode
     */
    public java.math.BigInteger getStartMode() {
        return startMode;
    }


    /**
     * Sets the startMode value for this CustomerFacingService.
     * 
     * @param startMode
     */
    public void setStartMode(java.math.BigInteger startMode) {
        this.startMode = startMode;
    }


    /**
     * Gets the isStateful value for this CustomerFacingService.
     * 
     * @return isStateful
     */
    public java.lang.Boolean getIsStateful() {
        return isStateful;
    }


    /**
     * Sets the isStateful value for this CustomerFacingService.
     * 
     * @param isStateful
     */
    public void setIsStateful(java.lang.Boolean isStateful) {
        this.isStateful = isStateful;
    }


    /**
     * Gets the commonName value for this CustomerFacingService.
     * 
     * @return commonName
     */
    public java.lang.String getCommonName() {
        return commonName;
    }


    /**
     * Sets the commonName value for this CustomerFacingService.
     * 
     * @param commonName
     */
    public void setCommonName(java.lang.String commonName) {
        this.commonName = commonName;
    }


    /**
     * Gets the description value for this CustomerFacingService.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomerFacingService.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the objectID value for this CustomerFacingService.
     * 
     * @return objectID
     */
    public java.lang.String getObjectID() {
        return objectID;
    }


    /**
     * Sets the objectID value for this CustomerFacingService.
     * 
     * @param objectID
     */
    public void setObjectID(java.lang.String objectID) {
        this.objectID = objectID;
    }


    /**
     * Gets the cfsStatus value for this CustomerFacingService.
     * 
     * @return cfsStatus
     */
    public java.math.BigInteger getCfsStatus() {
        return cfsStatus;
    }


    /**
     * Sets the cfsStatus value for this CustomerFacingService.
     * 
     * @param cfsStatus
     */
    public void setCfsStatus(java.math.BigInteger cfsStatus) {
        this.cfsStatus = cfsStatus;
    }


    /**
     * Gets the productCharacteristic value for this CustomerFacingService.
     * 
     * @return productCharacteristic
     */
    public com.telefonica.midrange.queryproductService.types.ProductCharacteristic[] getProductCharacteristic() {
        return productCharacteristic;
    }


    /**
     * Sets the productCharacteristic value for this CustomerFacingService.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerFacingService)) return false;
        CustomerFacingService other = (CustomerFacingService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isServiceEnabled==null && other.getIsServiceEnabled()==null) || 
             (this.isServiceEnabled!=null &&
              this.isServiceEnabled.equals(other.getIsServiceEnabled()))) &&
            ((this.hasStarted==null && other.getHasStarted()==null) || 
             (this.hasStarted!=null &&
              this.hasStarted.equals(other.getHasStarted()))) &&
            ((this.isMandatory==null && other.getIsMandatory()==null) || 
             (this.isMandatory!=null &&
              this.isMandatory.equals(other.getIsMandatory()))) &&
            ((this.startMode==null && other.getStartMode()==null) || 
             (this.startMode!=null &&
              this.startMode.equals(other.getStartMode()))) &&
            ((this.isStateful==null && other.getIsStateful()==null) || 
             (this.isStateful!=null &&
              this.isStateful.equals(other.getIsStateful()))) &&
            ((this.commonName==null && other.getCommonName()==null) || 
             (this.commonName!=null &&
              this.commonName.equals(other.getCommonName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.objectID==null && other.getObjectID()==null) || 
             (this.objectID!=null &&
              this.objectID.equals(other.getObjectID()))) &&
            ((this.cfsStatus==null && other.getCfsStatus()==null) || 
             (this.cfsStatus!=null &&
              this.cfsStatus.equals(other.getCfsStatus()))) &&
            ((this.productCharacteristic==null && other.getProductCharacteristic()==null) || 
             (this.productCharacteristic!=null &&
              java.util.Arrays.equals(this.productCharacteristic, other.getProductCharacteristic())));
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
        if (getIsServiceEnabled() != null) {
            _hashCode += getIsServiceEnabled().hashCode();
        }
        if (getHasStarted() != null) {
            _hashCode += getHasStarted().hashCode();
        }
        if (getIsMandatory() != null) {
            _hashCode += getIsMandatory().hashCode();
        }
        if (getStartMode() != null) {
            _hashCode += getStartMode().hashCode();
        }
        if (getIsStateful() != null) {
            _hashCode += getIsStateful().hashCode();
        }
        if (getCommonName() != null) {
            _hashCode += getCommonName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getObjectID() != null) {
            _hashCode += getObjectID().hashCode();
        }
        if (getCfsStatus() != null) {
            _hashCode += getCfsStatus().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerFacingService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "customerFacingService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isServiceEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "isServiceEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "hasStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "isMandatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "startMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStateful");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "isStateful"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "commonName"));
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
        elemField.setFieldName("objectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "objectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "cfsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCharacteristic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCharacteristic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCharacteristic"));
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
