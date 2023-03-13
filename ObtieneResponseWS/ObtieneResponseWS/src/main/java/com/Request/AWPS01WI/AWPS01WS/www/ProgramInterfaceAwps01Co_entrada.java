/**
 * ProgramInterfaceAwps01Co_entrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.AWPS01WI.AWPS01WS.www;

public class ProgramInterfaceAwps01Co_entrada  implements java.io.Serializable {
    private java.lang.String awps01Co_i_area;

    private java.lang.String awps01Co_i_num_com;

    private org.apache.axis.types.UnsignedInt awps01Co_i_cod_ps;

    private java.lang.String awps01Co_i_fec_ini_li;

    private java.lang.String filler1;

    public ProgramInterfaceAwps01Co_entrada() {
    }

    public ProgramInterfaceAwps01Co_entrada(
           java.lang.String awps01Co_i_area,
           java.lang.String awps01Co_i_num_com,
           org.apache.axis.types.UnsignedInt awps01Co_i_cod_ps,
           java.lang.String awps01Co_i_fec_ini_li,
           java.lang.String filler1) {
           this.awps01Co_i_area = awps01Co_i_area;
           this.awps01Co_i_num_com = awps01Co_i_num_com;
           this.awps01Co_i_cod_ps = awps01Co_i_cod_ps;
           this.awps01Co_i_fec_ini_li = awps01Co_i_fec_ini_li;
           this.filler1 = filler1;
    }


    /**
     * Gets the awps01Co_i_area value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @return awps01Co_i_area
     */
    public java.lang.String getAwps01Co_i_area() {
        return awps01Co_i_area;
    }


    /**
     * Sets the awps01Co_i_area value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @param awps01Co_i_area
     */
    public void setAwps01Co_i_area(java.lang.String awps01Co_i_area) {
        this.awps01Co_i_area = awps01Co_i_area;
    }


    /**
     * Gets the awps01Co_i_num_com value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @return awps01Co_i_num_com
     */
    public java.lang.String getAwps01Co_i_num_com() {
        return awps01Co_i_num_com;
    }


    /**
     * Sets the awps01Co_i_num_com value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @param awps01Co_i_num_com
     */
    public void setAwps01Co_i_num_com(java.lang.String awps01Co_i_num_com) {
        this.awps01Co_i_num_com = awps01Co_i_num_com;
    }


    /**
     * Gets the awps01Co_i_cod_ps value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @return awps01Co_i_cod_ps
     */
    public org.apache.axis.types.UnsignedInt getAwps01Co_i_cod_ps() {
        return awps01Co_i_cod_ps;
    }


    /**
     * Sets the awps01Co_i_cod_ps value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @param awps01Co_i_cod_ps
     */
    public void setAwps01Co_i_cod_ps(org.apache.axis.types.UnsignedInt awps01Co_i_cod_ps) {
        this.awps01Co_i_cod_ps = awps01Co_i_cod_ps;
    }


    /**
     * Gets the awps01Co_i_fec_ini_li value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @return awps01Co_i_fec_ini_li
     */
    public java.lang.String getAwps01Co_i_fec_ini_li() {
        return awps01Co_i_fec_ini_li;
    }


    /**
     * Sets the awps01Co_i_fec_ini_li value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @param awps01Co_i_fec_ini_li
     */
    public void setAwps01Co_i_fec_ini_li(java.lang.String awps01Co_i_fec_ini_li) {
        this.awps01Co_i_fec_ini_li = awps01Co_i_fec_ini_li;
    }


    /**
     * Gets the filler1 value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @return filler1
     */
    public java.lang.String getFiller1() {
        return filler1;
    }


    /**
     * Sets the filler1 value for this ProgramInterfaceAwps01Co_entrada.
     * 
     * @param filler1
     */
    public void setFiller1(java.lang.String filler1) {
        this.filler1 = filler1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwps01Co_entrada)) return false;
        ProgramInterfaceAwps01Co_entrada other = (ProgramInterfaceAwps01Co_entrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awps01Co_i_area==null && other.getAwps01Co_i_area()==null) || 
             (this.awps01Co_i_area!=null &&
              this.awps01Co_i_area.equals(other.getAwps01Co_i_area()))) &&
            ((this.awps01Co_i_num_com==null && other.getAwps01Co_i_num_com()==null) || 
             (this.awps01Co_i_num_com!=null &&
              this.awps01Co_i_num_com.equals(other.getAwps01Co_i_num_com()))) &&
            ((this.awps01Co_i_cod_ps==null && other.getAwps01Co_i_cod_ps()==null) || 
             (this.awps01Co_i_cod_ps!=null &&
              this.awps01Co_i_cod_ps.equals(other.getAwps01Co_i_cod_ps()))) &&
            ((this.awps01Co_i_fec_ini_li==null && other.getAwps01Co_i_fec_ini_li()==null) || 
             (this.awps01Co_i_fec_ini_li!=null &&
              this.awps01Co_i_fec_ini_li.equals(other.getAwps01Co_i_fec_ini_li()))) &&
            ((this.filler1==null && other.getFiller1()==null) || 
             (this.filler1!=null &&
              this.filler1.equals(other.getFiller1())));
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
        if (getAwps01Co_i_area() != null) {
            _hashCode += getAwps01Co_i_area().hashCode();
        }
        if (getAwps01Co_i_num_com() != null) {
            _hashCode += getAwps01Co_i_num_com().hashCode();
        }
        if (getAwps01Co_i_cod_ps() != null) {
            _hashCode += getAwps01Co_i_cod_ps().hashCode();
        }
        if (getAwps01Co_i_fec_ini_li() != null) {
            _hashCode += getAwps01Co_i_fec_ini_li().hashCode();
        }
        if (getFiller1() != null) {
            _hashCode += getFiller1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwps01Co_entrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Request.com", ">ProgramInterface>awps01co_entrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_i_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Request.com", "awps01co_i_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_i_num_com");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Request.com", "awps01co_i_num_com"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_i_cod_ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Request.com", "awps01co_i_cod_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_i_fec_ini_li");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Request.com", "awps01co_i_fec_ini_li"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Request.com", "filler1"));
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
