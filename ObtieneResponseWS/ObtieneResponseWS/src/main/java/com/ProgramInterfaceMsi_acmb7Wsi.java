/**
 * ProgramInterfaceMsi_acmb7Wsi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ProgramInterfaceMsi_acmb7Wsi  implements java.io.Serializable {
    private java.lang.String acmb7Wsi_ac_flag;

    private java.lang.String acmb7Wsi_ac_area;

    private java.lang.String acmb7Wsi_ac_nu_com;

    private java.lang.String acmb7Wsi_ac_id_cli;

    private org.apache.axis.types.UnsignedInt acmb7Wsi_ac_nu_cta;

    public ProgramInterfaceMsi_acmb7Wsi() {
    }

    public ProgramInterfaceMsi_acmb7Wsi(
           java.lang.String acmb7Wsi_ac_flag,
           java.lang.String acmb7Wsi_ac_area,
           java.lang.String acmb7Wsi_ac_nu_com,
           java.lang.String acmb7Wsi_ac_id_cli,
           org.apache.axis.types.UnsignedInt acmb7Wsi_ac_nu_cta) {
           this.acmb7Wsi_ac_flag = acmb7Wsi_ac_flag;
           this.acmb7Wsi_ac_area = acmb7Wsi_ac_area;
           this.acmb7Wsi_ac_nu_com = acmb7Wsi_ac_nu_com;
           this.acmb7Wsi_ac_id_cli = acmb7Wsi_ac_id_cli;
           this.acmb7Wsi_ac_nu_cta = acmb7Wsi_ac_nu_cta;
    }


    /**
     * Gets the acmb7Wsi_ac_flag value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @return acmb7Wsi_ac_flag
     */
    public java.lang.String getAcmb7Wsi_ac_flag() {
        return acmb7Wsi_ac_flag;
    }


    /**
     * Sets the acmb7Wsi_ac_flag value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @param acmb7Wsi_ac_flag
     */
    public void setAcmb7Wsi_ac_flag(java.lang.String acmb7Wsi_ac_flag) {
        this.acmb7Wsi_ac_flag = acmb7Wsi_ac_flag;
    }


    /**
     * Gets the acmb7Wsi_ac_area value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @return acmb7Wsi_ac_area
     */
    public java.lang.String getAcmb7Wsi_ac_area() {
        return acmb7Wsi_ac_area;
    }


    /**
     * Sets the acmb7Wsi_ac_area value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @param acmb7Wsi_ac_area
     */
    public void setAcmb7Wsi_ac_area(java.lang.String acmb7Wsi_ac_area) {
        this.acmb7Wsi_ac_area = acmb7Wsi_ac_area;
    }


    /**
     * Gets the acmb7Wsi_ac_nu_com value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @return acmb7Wsi_ac_nu_com
     */
    public java.lang.String getAcmb7Wsi_ac_nu_com() {
        return acmb7Wsi_ac_nu_com;
    }


    /**
     * Sets the acmb7Wsi_ac_nu_com value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @param acmb7Wsi_ac_nu_com
     */
    public void setAcmb7Wsi_ac_nu_com(java.lang.String acmb7Wsi_ac_nu_com) {
        this.acmb7Wsi_ac_nu_com = acmb7Wsi_ac_nu_com;
    }


    /**
     * Gets the acmb7Wsi_ac_id_cli value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @return acmb7Wsi_ac_id_cli
     */
    public java.lang.String getAcmb7Wsi_ac_id_cli() {
        return acmb7Wsi_ac_id_cli;
    }


    /**
     * Sets the acmb7Wsi_ac_id_cli value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @param acmb7Wsi_ac_id_cli
     */
    public void setAcmb7Wsi_ac_id_cli(java.lang.String acmb7Wsi_ac_id_cli) {
        this.acmb7Wsi_ac_id_cli = acmb7Wsi_ac_id_cli;
    }


    /**
     * Gets the acmb7Wsi_ac_nu_cta value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @return acmb7Wsi_ac_nu_cta
     */
    public org.apache.axis.types.UnsignedInt getAcmb7Wsi_ac_nu_cta() {
        return acmb7Wsi_ac_nu_cta;
    }


    /**
     * Sets the acmb7Wsi_ac_nu_cta value for this ProgramInterfaceMsi_acmb7Wsi.
     * 
     * @param acmb7Wsi_ac_nu_cta
     */
    public void setAcmb7Wsi_ac_nu_cta(org.apache.axis.types.UnsignedInt acmb7Wsi_ac_nu_cta) {
        this.acmb7Wsi_ac_nu_cta = acmb7Wsi_ac_nu_cta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceMsi_acmb7Wsi)) return false;
        ProgramInterfaceMsi_acmb7Wsi other = (ProgramInterfaceMsi_acmb7Wsi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acmb7Wsi_ac_flag==null && other.getAcmb7Wsi_ac_flag()==null) || 
             (this.acmb7Wsi_ac_flag!=null &&
              this.acmb7Wsi_ac_flag.equals(other.getAcmb7Wsi_ac_flag()))) &&
            ((this.acmb7Wsi_ac_area==null && other.getAcmb7Wsi_ac_area()==null) || 
             (this.acmb7Wsi_ac_area!=null &&
              this.acmb7Wsi_ac_area.equals(other.getAcmb7Wsi_ac_area()))) &&
            ((this.acmb7Wsi_ac_nu_com==null && other.getAcmb7Wsi_ac_nu_com()==null) || 
             (this.acmb7Wsi_ac_nu_com!=null &&
              this.acmb7Wsi_ac_nu_com.equals(other.getAcmb7Wsi_ac_nu_com()))) &&
            ((this.acmb7Wsi_ac_id_cli==null && other.getAcmb7Wsi_ac_id_cli()==null) || 
             (this.acmb7Wsi_ac_id_cli!=null &&
              this.acmb7Wsi_ac_id_cli.equals(other.getAcmb7Wsi_ac_id_cli()))) &&
            ((this.acmb7Wsi_ac_nu_cta==null && other.getAcmb7Wsi_ac_nu_cta()==null) || 
             (this.acmb7Wsi_ac_nu_cta!=null &&
              this.acmb7Wsi_ac_nu_cta.equals(other.getAcmb7Wsi_ac_nu_cta())));
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
        if (getAcmb7Wsi_ac_flag() != null) {
            _hashCode += getAcmb7Wsi_ac_flag().hashCode();
        }
        if (getAcmb7Wsi_ac_area() != null) {
            _hashCode += getAcmb7Wsi_ac_area().hashCode();
        }
        if (getAcmb7Wsi_ac_nu_com() != null) {
            _hashCode += getAcmb7Wsi_ac_nu_com().hashCode();
        }
        if (getAcmb7Wsi_ac_id_cli() != null) {
            _hashCode += getAcmb7Wsi_ac_id_cli().hashCode();
        }
        if (getAcmb7Wsi_ac_nu_cta() != null) {
            _hashCode += getAcmb7Wsi_ac_nu_cta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceMsi_acmb7Wsi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Request.com", ">ProgramInterface>msi_acmb7wsi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wsi_ac_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Request.com", "acmb7wsi_ac_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wsi_ac_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Request.com", "acmb7wsi_ac_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wsi_ac_nu_com");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Request.com", "acmb7wsi_ac_nu_com"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wsi_ac_id_cli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Request.com", "acmb7wsi_ac_id_cli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acmb7Wsi_ac_nu_cta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.Request.com", "acmb7wsi_ac_nu_cta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
