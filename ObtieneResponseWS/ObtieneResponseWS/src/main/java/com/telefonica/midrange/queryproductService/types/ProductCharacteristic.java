/**
 * ProductCharacteristic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class ProductCharacteristic  implements java.io.Serializable {
    private java.lang.String idPs;

    private java.lang.String descPs;

    private java.lang.String idFam;

    private java.lang.String descFam;

    private java.lang.String idSubg1;

    private java.lang.String descSubg1;

    private java.lang.String idSubg2;

    private java.lang.String descSubg2;

    private java.lang.String talla;

    private com.telefonica.midrange.queryproductService.types.ValidFor validFor;

    public ProductCharacteristic() {
    }

    public ProductCharacteristic(
           java.lang.String idPs,
           java.lang.String descPs,
           java.lang.String idFam,
           java.lang.String descFam,
           java.lang.String idSubg1,
           java.lang.String descSubg1,
           java.lang.String idSubg2,
           java.lang.String descSubg2,
           java.lang.String talla,
           com.telefonica.midrange.queryproductService.types.ValidFor validFor) {
           this.idPs = idPs;
           this.descPs = descPs;
           this.idFam = idFam;
           this.descFam = descFam;
           this.idSubg1 = idSubg1;
           this.descSubg1 = descSubg1;
           this.idSubg2 = idSubg2;
           this.descSubg2 = descSubg2;
           this.talla = talla;
           this.validFor = validFor;
    }


    /**
     * Gets the idPs value for this ProductCharacteristic.
     * 
     * @return idPs
     */
    public java.lang.String getIdPs() {
        return idPs;
    }


    /**
     * Sets the idPs value for this ProductCharacteristic.
     * 
     * @param idPs
     */
    public void setIdPs(java.lang.String idPs) {
        this.idPs = idPs;
    }


    /**
     * Gets the descPs value for this ProductCharacteristic.
     * 
     * @return descPs
     */
    public java.lang.String getDescPs() {
        return descPs;
    }


    /**
     * Sets the descPs value for this ProductCharacteristic.
     * 
     * @param descPs
     */
    public void setDescPs(java.lang.String descPs) {
        this.descPs = descPs;
    }


    /**
     * Gets the idFam value for this ProductCharacteristic.
     * 
     * @return idFam
     */
    public java.lang.String getIdFam() {
        return idFam;
    }


    /**
     * Sets the idFam value for this ProductCharacteristic.
     * 
     * @param idFam
     */
    public void setIdFam(java.lang.String idFam) {
        this.idFam = idFam;
    }


    /**
     * Gets the descFam value for this ProductCharacteristic.
     * 
     * @return descFam
     */
    public java.lang.String getDescFam() {
        return descFam;
    }


    /**
     * Sets the descFam value for this ProductCharacteristic.
     * 
     * @param descFam
     */
    public void setDescFam(java.lang.String descFam) {
        this.descFam = descFam;
    }


    /**
     * Gets the idSubg1 value for this ProductCharacteristic.
     * 
     * @return idSubg1
     */
    public java.lang.String getIdSubg1() {
        return idSubg1;
    }


    /**
     * Sets the idSubg1 value for this ProductCharacteristic.
     * 
     * @param idSubg1
     */
    public void setIdSubg1(java.lang.String idSubg1) {
        this.idSubg1 = idSubg1;
    }


    /**
     * Gets the descSubg1 value for this ProductCharacteristic.
     * 
     * @return descSubg1
     */
    public java.lang.String getDescSubg1() {
        return descSubg1;
    }


    /**
     * Sets the descSubg1 value for this ProductCharacteristic.
     * 
     * @param descSubg1
     */
    public void setDescSubg1(java.lang.String descSubg1) {
        this.descSubg1 = descSubg1;
    }


    /**
     * Gets the idSubg2 value for this ProductCharacteristic.
     * 
     * @return idSubg2
     */
    public java.lang.String getIdSubg2() {
        return idSubg2;
    }


    /**
     * Sets the idSubg2 value for this ProductCharacteristic.
     * 
     * @param idSubg2
     */
    public void setIdSubg2(java.lang.String idSubg2) {
        this.idSubg2 = idSubg2;
    }


    /**
     * Gets the descSubg2 value for this ProductCharacteristic.
     * 
     * @return descSubg2
     */
    public java.lang.String getDescSubg2() {
        return descSubg2;
    }


    /**
     * Sets the descSubg2 value for this ProductCharacteristic.
     * 
     * @param descSubg2
     */
    public void setDescSubg2(java.lang.String descSubg2) {
        this.descSubg2 = descSubg2;
    }


    /**
     * Gets the talla value for this ProductCharacteristic.
     * 
     * @return talla
     */
    public java.lang.String getTalla() {
        return talla;
    }


    /**
     * Sets the talla value for this ProductCharacteristic.
     * 
     * @param talla
     */
    public void setTalla(java.lang.String talla) {
        this.talla = talla;
    }


    /**
     * Gets the validFor value for this ProductCharacteristic.
     * 
     * @return validFor
     */
    public com.telefonica.midrange.queryproductService.types.ValidFor getValidFor() {
        return validFor;
    }


    /**
     * Sets the validFor value for this ProductCharacteristic.
     * 
     * @param validFor
     */
    public void setValidFor(com.telefonica.midrange.queryproductService.types.ValidFor validFor) {
        this.validFor = validFor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCharacteristic)) return false;
        ProductCharacteristic other = (ProductCharacteristic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPs==null && other.getIdPs()==null) || 
             (this.idPs!=null &&
              this.idPs.equals(other.getIdPs()))) &&
            ((this.descPs==null && other.getDescPs()==null) || 
             (this.descPs!=null &&
              this.descPs.equals(other.getDescPs()))) &&
            ((this.idFam==null && other.getIdFam()==null) || 
             (this.idFam!=null &&
              this.idFam.equals(other.getIdFam()))) &&
            ((this.descFam==null && other.getDescFam()==null) || 
             (this.descFam!=null &&
              this.descFam.equals(other.getDescFam()))) &&
            ((this.idSubg1==null && other.getIdSubg1()==null) || 
             (this.idSubg1!=null &&
              this.idSubg1.equals(other.getIdSubg1()))) &&
            ((this.descSubg1==null && other.getDescSubg1()==null) || 
             (this.descSubg1!=null &&
              this.descSubg1.equals(other.getDescSubg1()))) &&
            ((this.idSubg2==null && other.getIdSubg2()==null) || 
             (this.idSubg2!=null &&
              this.idSubg2.equals(other.getIdSubg2()))) &&
            ((this.descSubg2==null && other.getDescSubg2()==null) || 
             (this.descSubg2!=null &&
              this.descSubg2.equals(other.getDescSubg2()))) &&
            ((this.talla==null && other.getTalla()==null) || 
             (this.talla!=null &&
              this.talla.equals(other.getTalla()))) &&
            ((this.validFor==null && other.getValidFor()==null) || 
             (this.validFor!=null &&
              this.validFor.equals(other.getValidFor())));
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
        if (getIdPs() != null) {
            _hashCode += getIdPs().hashCode();
        }
        if (getDescPs() != null) {
            _hashCode += getDescPs().hashCode();
        }
        if (getIdFam() != null) {
            _hashCode += getIdFam().hashCode();
        }
        if (getDescFam() != null) {
            _hashCode += getDescFam().hashCode();
        }
        if (getIdSubg1() != null) {
            _hashCode += getIdSubg1().hashCode();
        }
        if (getDescSubg1() != null) {
            _hashCode += getDescSubg1().hashCode();
        }
        if (getIdSubg2() != null) {
            _hashCode += getIdSubg2().hashCode();
        }
        if (getDescSubg2() != null) {
            _hashCode += getDescSubg2().hashCode();
        }
        if (getTalla() != null) {
            _hashCode += getTalla().hashCode();
        }
        if (getValidFor() != null) {
            _hashCode += getValidFor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCharacteristic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCharacteristic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "idPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "descPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idFam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "idFam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descFam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "descFam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubg1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "idSubg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descSubg1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "descSubg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubg2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "idSubg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descSubg2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "descSubg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("talla");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "talla"));
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
