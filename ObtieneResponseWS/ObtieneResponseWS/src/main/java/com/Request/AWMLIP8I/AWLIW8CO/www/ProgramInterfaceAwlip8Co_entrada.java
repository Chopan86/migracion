/**
 * ProgramInterfaceAwlip8Co_entrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.AWMLIP8I.AWLIW8CO.www;

public class ProgramInterfaceAwlip8Co_entrada  implements java.io.Serializable {
    private java.lang.String awlip8Co_i_area;

    private java.lang.String awlip8Co_i_num_com;

    private org.apache.axis.types.UnsignedInt awlip8Co_i_cod_ps;

    private org.apache.axis.types.UnsignedLong awlip8Co_i_sec_ps;

    private java.lang.String filler1;

    public ProgramInterfaceAwlip8Co_entrada() {
    }

    public ProgramInterfaceAwlip8Co_entrada(
           java.lang.String awlip8Co_i_area,
           java.lang.String awlip8Co_i_num_com,
           org.apache.axis.types.UnsignedInt awlip8Co_i_cod_ps,
           org.apache.axis.types.UnsignedLong awlip8Co_i_sec_ps,
           java.lang.String filler1) {
           this.awlip8Co_i_area = awlip8Co_i_area;
           this.awlip8Co_i_num_com = awlip8Co_i_num_com;
           this.awlip8Co_i_cod_ps = awlip8Co_i_cod_ps;
           this.awlip8Co_i_sec_ps = awlip8Co_i_sec_ps;
           this.filler1 = filler1;
    }


    /**
     * Gets the awlip8Co_i_area value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @return awlip8Co_i_area
     */
    public java.lang.String getAwlip8Co_i_area() {
        return awlip8Co_i_area;
    }


    /**
     * Sets the awlip8Co_i_area value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @param awlip8Co_i_area
     */
    public void setAwlip8Co_i_area(java.lang.String awlip8Co_i_area) {
        this.awlip8Co_i_area = awlip8Co_i_area;
    }


    /**
     * Gets the awlip8Co_i_num_com value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @return awlip8Co_i_num_com
     */
    public java.lang.String getAwlip8Co_i_num_com() {
        return awlip8Co_i_num_com;
    }


    /**
     * Sets the awlip8Co_i_num_com value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @param awlip8Co_i_num_com
     */
    public void setAwlip8Co_i_num_com(java.lang.String awlip8Co_i_num_com) {
        this.awlip8Co_i_num_com = awlip8Co_i_num_com;
    }


    /**
     * Gets the awlip8Co_i_cod_ps value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @return awlip8Co_i_cod_ps
     */
    public org.apache.axis.types.UnsignedInt getAwlip8Co_i_cod_ps() {
        return awlip8Co_i_cod_ps;
    }


    /**
     * Sets the awlip8Co_i_cod_ps value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @param awlip8Co_i_cod_ps
     */
    public void setAwlip8Co_i_cod_ps(org.apache.axis.types.UnsignedInt awlip8Co_i_cod_ps) {
        this.awlip8Co_i_cod_ps = awlip8Co_i_cod_ps;
    }


    /**
     * Gets the awlip8Co_i_sec_ps value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @return awlip8Co_i_sec_ps
     */
    public org.apache.axis.types.UnsignedLong getAwlip8Co_i_sec_ps() {
        return awlip8Co_i_sec_ps;
    }


    /**
     * Sets the awlip8Co_i_sec_ps value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @param awlip8Co_i_sec_ps
     */
    public void setAwlip8Co_i_sec_ps(org.apache.axis.types.UnsignedLong awlip8Co_i_sec_ps) {
        this.awlip8Co_i_sec_ps = awlip8Co_i_sec_ps;
    }


    /**
     * Gets the filler1 value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @return filler1
     */
    public java.lang.String getFiller1() {
        return filler1;
    }


    /**
     * Sets the filler1 value for this ProgramInterfaceAwlip8Co_entrada.
     * 
     * @param filler1
     */
    public void setFiller1(java.lang.String filler1) {
        this.filler1 = filler1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwlip8Co_entrada)) return false;
        ProgramInterfaceAwlip8Co_entrada other = (ProgramInterfaceAwlip8Co_entrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awlip8Co_i_area==null && other.getAwlip8Co_i_area()==null) || 
             (this.awlip8Co_i_area!=null &&
              this.awlip8Co_i_area.equals(other.getAwlip8Co_i_area()))) &&
            ((this.awlip8Co_i_num_com==null && other.getAwlip8Co_i_num_com()==null) || 
             (this.awlip8Co_i_num_com!=null &&
              this.awlip8Co_i_num_com.equals(other.getAwlip8Co_i_num_com()))) &&
            ((this.awlip8Co_i_cod_ps==null && other.getAwlip8Co_i_cod_ps()==null) || 
             (this.awlip8Co_i_cod_ps!=null &&
              this.awlip8Co_i_cod_ps.equals(other.getAwlip8Co_i_cod_ps()))) &&
            ((this.awlip8Co_i_sec_ps==null && other.getAwlip8Co_i_sec_ps()==null) || 
             (this.awlip8Co_i_sec_ps!=null &&
              this.awlip8Co_i_sec_ps.equals(other.getAwlip8Co_i_sec_ps()))) &&
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
        if (getAwlip8Co_i_area() != null) {
            _hashCode += getAwlip8Co_i_area().hashCode();
        }
        if (getAwlip8Co_i_num_com() != null) {
            _hashCode += getAwlip8Co_i_num_com().hashCode();
        }
        if (getAwlip8Co_i_cod_ps() != null) {
            _hashCode += getAwlip8Co_i_cod_ps().hashCode();
        }
        if (getAwlip8Co_i_sec_ps() != null) {
            _hashCode += getAwlip8Co_i_sec_ps().hashCode();
        }
        if (getFiller1() != null) {
            _hashCode += getFiller1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwlip8Co_entrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Request.com", ">ProgramInterface>awlip8co_entrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_i_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Request.com", "awlip8co_i_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_i_num_com");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Request.com", "awlip8co_i_num_com"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_i_cod_ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Request.com", "awlip8co_i_cod_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlip8Co_i_sec_ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Request.com", "awlip8co_i_sec_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.Request.com", "filler1"));
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
