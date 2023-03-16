/**
 * ProductInvolvementRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class ProductInvolvementRole  implements java.io.Serializable {
    private java.lang.String involvementRole;

    private com.telefonica.midrange.queryproductService.types.ValidFor validFor;

    private com.telefonica.midrange.queryproductService.types.PartyRole partyRole;

    private java.lang.String involvementIdentificationRole;

    private com.telefonica.midrange.queryproductService.types.CustomerAccount customerAccount;

    private java.lang.String resourceRole;

    public ProductInvolvementRole() {
    }

    public ProductInvolvementRole(
           java.lang.String involvementRole,
           com.telefonica.midrange.queryproductService.types.ValidFor validFor,
           com.telefonica.midrange.queryproductService.types.PartyRole partyRole,
           java.lang.String involvementIdentificationRole,
           com.telefonica.midrange.queryproductService.types.CustomerAccount customerAccount,
           java.lang.String resourceRole) {
           this.involvementRole = involvementRole;
           this.validFor = validFor;
           this.partyRole = partyRole;
           this.involvementIdentificationRole = involvementIdentificationRole;
           this.customerAccount = customerAccount;
           this.resourceRole = resourceRole;
    }


    /**
     * Gets the involvementRole value for this ProductInvolvementRole.
     * 
     * @return involvementRole
     */
    public java.lang.String getInvolvementRole() {
        return involvementRole;
    }


    /**
     * Sets the involvementRole value for this ProductInvolvementRole.
     * 
     * @param involvementRole
     */
    public void setInvolvementRole(java.lang.String involvementRole) {
        this.involvementRole = involvementRole;
    }


    /**
     * Gets the validFor value for this ProductInvolvementRole.
     * 
     * @return validFor
     */
    public com.telefonica.midrange.queryproductService.types.ValidFor getValidFor() {
        return validFor;
    }


    /**
     * Sets the validFor value for this ProductInvolvementRole.
     * 
     * @param validFor
     */
    public void setValidFor(com.telefonica.midrange.queryproductService.types.ValidFor validFor) {
        this.validFor = validFor;
    }


    /**
     * Gets the partyRole value for this ProductInvolvementRole.
     * 
     * @return partyRole
     */
    public com.telefonica.midrange.queryproductService.types.PartyRole getPartyRole() {
        return partyRole;
    }


    /**
     * Sets the partyRole value for this ProductInvolvementRole.
     * 
     * @param partyRole
     */
    public void setPartyRole(com.telefonica.midrange.queryproductService.types.PartyRole partyRole) {
        this.partyRole = partyRole;
    }


    /**
     * Gets the involvementIdentificationRole value for this ProductInvolvementRole.
     * 
     * @return involvementIdentificationRole
     */
    public java.lang.String getInvolvementIdentificationRole() {
        return involvementIdentificationRole;
    }


    /**
     * Sets the involvementIdentificationRole value for this ProductInvolvementRole.
     * 
     * @param involvementIdentificationRole
     */
    public void setInvolvementIdentificationRole(java.lang.String involvementIdentificationRole) {
        this.involvementIdentificationRole = involvementIdentificationRole;
    }


    /**
     * Gets the customerAccount value for this ProductInvolvementRole.
     * 
     * @return customerAccount
     */
    public com.telefonica.midrange.queryproductService.types.CustomerAccount getCustomerAccount() {
        return customerAccount;
    }


    /**
     * Sets the customerAccount value for this ProductInvolvementRole.
     * 
     * @param customerAccount
     */
    public void setCustomerAccount(com.telefonica.midrange.queryproductService.types.CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }


    /**
     * Gets the resourceRole value for this ProductInvolvementRole.
     * 
     * @return resourceRole
     */
    public java.lang.String getResourceRole() {
        return resourceRole;
    }


    /**
     * Sets the resourceRole value for this ProductInvolvementRole.
     * 
     * @param resourceRole
     */
    public void setResourceRole(java.lang.String resourceRole) {
        this.resourceRole = resourceRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductInvolvementRole)) return false;
        ProductInvolvementRole other = (ProductInvolvementRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.involvementRole==null && other.getInvolvementRole()==null) || 
             (this.involvementRole!=null &&
              this.involvementRole.equals(other.getInvolvementRole()))) &&
            ((this.validFor==null && other.getValidFor()==null) || 
             (this.validFor!=null &&
              this.validFor.equals(other.getValidFor()))) &&
            ((this.partyRole==null && other.getPartyRole()==null) || 
             (this.partyRole!=null &&
              this.partyRole.equals(other.getPartyRole()))) &&
            ((this.involvementIdentificationRole==null && other.getInvolvementIdentificationRole()==null) || 
             (this.involvementIdentificationRole!=null &&
              this.involvementIdentificationRole.equals(other.getInvolvementIdentificationRole()))) &&
            ((this.customerAccount==null && other.getCustomerAccount()==null) || 
             (this.customerAccount!=null &&
              this.customerAccount.equals(other.getCustomerAccount()))) &&
            ((this.resourceRole==null && other.getResourceRole()==null) || 
             (this.resourceRole!=null &&
              this.resourceRole.equals(other.getResourceRole())));
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
        if (getInvolvementRole() != null) {
            _hashCode += getInvolvementRole().hashCode();
        }
        if (getValidFor() != null) {
            _hashCode += getValidFor().hashCode();
        }
        if (getPartyRole() != null) {
            _hashCode += getPartyRole().hashCode();
        }
        if (getInvolvementIdentificationRole() != null) {
            _hashCode += getInvolvementIdentificationRole().hashCode();
        }
        if (getCustomerAccount() != null) {
            _hashCode += getCustomerAccount().hashCode();
        }
        if (getResourceRole() != null) {
            _hashCode += getResourceRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductInvolvementRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productInvolvementRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("involvementRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "involvementRole"));
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
        elemField.setFieldName("partyRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "partyRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "partyRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("involvementIdentificationRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "involvementIdentificationRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "customerAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "customerAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "resourceRole"));
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
