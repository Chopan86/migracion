/**
 * ProgramInterfaceMsi_registroMsi_entrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.APEWS16I.APE9016.www;

public class ProgramInterfaceMsi_registroMsi_entrada  implements java.io.Serializable {
    private java.lang.String msi_ciu;

    private java.lang.String msi_cll;

    private java.lang.String msi_alt;

    private java.lang.String filler1;

    private java.lang.String filler2;

    public ProgramInterfaceMsi_registroMsi_entrada() {
    }

    public ProgramInterfaceMsi_registroMsi_entrada(
           java.lang.String msi_ciu,
           java.lang.String msi_cll,
           java.lang.String msi_alt,
           java.lang.String filler1,
           java.lang.String filler2) {
           this.msi_ciu = msi_ciu;
           this.msi_cll = msi_cll;
           this.msi_alt = msi_alt;
           this.filler1 = filler1;
           this.filler2 = filler2;
    }


    /**
     * Gets the msi_ciu value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @return msi_ciu
     */
    public java.lang.String getMsi_ciu() {
        return msi_ciu;
    }


    /**
     * Sets the msi_ciu value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @param msi_ciu
     */
    public void setMsi_ciu(java.lang.String msi_ciu) {
        this.msi_ciu = msi_ciu;
    }


    /**
     * Gets the msi_cll value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @return msi_cll
     */
    public java.lang.String getMsi_cll() {
        return msi_cll;
    }


    /**
     * Sets the msi_cll value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @param msi_cll
     */
    public void setMsi_cll(java.lang.String msi_cll) {
        this.msi_cll = msi_cll;
    }


    /**
     * Gets the msi_alt value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @return msi_alt
     */
    public java.lang.String getMsi_alt() {
        return msi_alt;
    }


    /**
     * Sets the msi_alt value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @param msi_alt
     */
    public void setMsi_alt(java.lang.String msi_alt) {
        this.msi_alt = msi_alt;
    }


    /**
     * Gets the filler1 value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @return filler1
     */
    public java.lang.String getFiller1() {
        return filler1;
    }


    /**
     * Sets the filler1 value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @param filler1
     */
    public void setFiller1(java.lang.String filler1) {
        this.filler1 = filler1;
    }


    /**
     * Gets the filler2 value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @return filler2
     */
    public java.lang.String getFiller2() {
        return filler2;
    }


    /**
     * Sets the filler2 value for this ProgramInterfaceMsi_registroMsi_entrada.
     * 
     * @param filler2
     */
    public void setFiller2(java.lang.String filler2) {
        this.filler2 = filler2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMsi_registroMsi_entrada)) return false;
        ProgramInterfaceMsi_registroMsi_entrada other = (ProgramInterfaceMsi_registroMsi_entrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.msi_ciu==null && other.getMsi_ciu()==null) || 
             (this.msi_ciu!=null &&
              this.msi_ciu.equals(other.getMsi_ciu()))) &&
            ((this.msi_cll==null && other.getMsi_cll()==null) || 
             (this.msi_cll!=null &&
              this.msi_cll.equals(other.getMsi_cll()))) &&
            ((this.msi_alt==null && other.getMsi_alt()==null) || 
             (this.msi_alt!=null &&
              this.msi_alt.equals(other.getMsi_alt()))) &&
            ((this.filler1==null && other.getFiller1()==null) || 
             (this.filler1!=null &&
              this.filler1.equals(other.getFiller1()))) &&
            ((this.filler2==null && other.getFiller2()==null) || 
             (this.filler2!=null &&
              this.filler2.equals(other.getFiller2())));
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
        if (getMsi_ciu() != null) {
            _hashCode += getMsi_ciu().hashCode();
        }
        if (getMsi_cll() != null) {
            _hashCode += getMsi_cll().hashCode();
        }
        if (getMsi_alt() != null) {
            _hashCode += getMsi_alt().hashCode();
        }
        if (getFiller1() != null) {
            _hashCode += getFiller1().hashCode();
        }
        if (getFiller2() != null) {
            _hashCode += getFiller2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMsi_registroMsi_entrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", ">>ProgramInterface>msi_registro>msi_entrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msi_ciu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", "msi_ciu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msi_cll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", "msi_cll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msi_alt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", "msi_alt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", "filler1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.Request.com", "filler2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
