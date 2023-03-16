/**
 * ProductCapacity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class ProductCapacity  implements java.io.Serializable {
    private java.lang.String plannedOrActualCapacity;

    private java.lang.Long capacityAmount;

    private java.lang.Long capacityAmountFrom;

    private java.lang.Long capacityAmountTo;

    private java.lang.String rangeInterval;

    public ProductCapacity() {
    }

    public ProductCapacity(
           java.lang.String plannedOrActualCapacity,
           java.lang.Long capacityAmount,
           java.lang.Long capacityAmountFrom,
           java.lang.Long capacityAmountTo,
           java.lang.String rangeInterval) {
           this.plannedOrActualCapacity = plannedOrActualCapacity;
           this.capacityAmount = capacityAmount;
           this.capacityAmountFrom = capacityAmountFrom;
           this.capacityAmountTo = capacityAmountTo;
           this.rangeInterval = rangeInterval;
    }


    /**
     * Gets the plannedOrActualCapacity value for this ProductCapacity.
     * 
     * @return plannedOrActualCapacity
     */
    public java.lang.String getPlannedOrActualCapacity() {
        return plannedOrActualCapacity;
    }


    /**
     * Sets the plannedOrActualCapacity value for this ProductCapacity.
     * 
     * @param plannedOrActualCapacity
     */
    public void setPlannedOrActualCapacity(java.lang.String plannedOrActualCapacity) {
        this.plannedOrActualCapacity = plannedOrActualCapacity;
    }


    /**
     * Gets the capacityAmount value for this ProductCapacity.
     * 
     * @return capacityAmount
     */
    public java.lang.Long getCapacityAmount() {
        return capacityAmount;
    }


    /**
     * Sets the capacityAmount value for this ProductCapacity.
     * 
     * @param capacityAmount
     */
    public void setCapacityAmount(java.lang.Long capacityAmount) {
        this.capacityAmount = capacityAmount;
    }


    /**
     * Gets the capacityAmountFrom value for this ProductCapacity.
     * 
     * @return capacityAmountFrom
     */
    public java.lang.Long getCapacityAmountFrom() {
        return capacityAmountFrom;
    }


    /**
     * Sets the capacityAmountFrom value for this ProductCapacity.
     * 
     * @param capacityAmountFrom
     */
    public void setCapacityAmountFrom(java.lang.Long capacityAmountFrom) {
        this.capacityAmountFrom = capacityAmountFrom;
    }


    /**
     * Gets the capacityAmountTo value for this ProductCapacity.
     * 
     * @return capacityAmountTo
     */
    public java.lang.Long getCapacityAmountTo() {
        return capacityAmountTo;
    }


    /**
     * Sets the capacityAmountTo value for this ProductCapacity.
     * 
     * @param capacityAmountTo
     */
    public void setCapacityAmountTo(java.lang.Long capacityAmountTo) {
        this.capacityAmountTo = capacityAmountTo;
    }


    /**
     * Gets the rangeInterval value for this ProductCapacity.
     * 
     * @return rangeInterval
     */
    public java.lang.String getRangeInterval() {
        return rangeInterval;
    }


    /**
     * Sets the rangeInterval value for this ProductCapacity.
     * 
     * @param rangeInterval
     */
    public void setRangeInterval(java.lang.String rangeInterval) {
        this.rangeInterval = rangeInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCapacity)) return false;
        ProductCapacity other = (ProductCapacity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plannedOrActualCapacity==null && other.getPlannedOrActualCapacity()==null) || 
             (this.plannedOrActualCapacity!=null &&
              this.plannedOrActualCapacity.equals(other.getPlannedOrActualCapacity()))) &&
            ((this.capacityAmount==null && other.getCapacityAmount()==null) || 
             (this.capacityAmount!=null &&
              this.capacityAmount.equals(other.getCapacityAmount()))) &&
            ((this.capacityAmountFrom==null && other.getCapacityAmountFrom()==null) || 
             (this.capacityAmountFrom!=null &&
              this.capacityAmountFrom.equals(other.getCapacityAmountFrom()))) &&
            ((this.capacityAmountTo==null && other.getCapacityAmountTo()==null) || 
             (this.capacityAmountTo!=null &&
              this.capacityAmountTo.equals(other.getCapacityAmountTo()))) &&
            ((this.rangeInterval==null && other.getRangeInterval()==null) || 
             (this.rangeInterval!=null &&
              this.rangeInterval.equals(other.getRangeInterval())));
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
        if (getPlannedOrActualCapacity() != null) {
            _hashCode += getPlannedOrActualCapacity().hashCode();
        }
        if (getCapacityAmount() != null) {
            _hashCode += getCapacityAmount().hashCode();
        }
        if (getCapacityAmountFrom() != null) {
            _hashCode += getCapacityAmountFrom().hashCode();
        }
        if (getCapacityAmountTo() != null) {
            _hashCode += getCapacityAmountTo().hashCode();
        }
        if (getRangeInterval() != null) {
            _hashCode += getRangeInterval().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCapacity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "productCapacity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedOrActualCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "plannedOrActualCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "capacityAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityAmountFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "capacityAmountFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityAmountTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "capacityAmountTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "rangeInterval"));
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
