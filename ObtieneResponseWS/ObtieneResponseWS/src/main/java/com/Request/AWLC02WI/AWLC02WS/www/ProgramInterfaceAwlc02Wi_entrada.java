/**
 * ProgramInterfaceAwlc02Wi_entrada.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.AWLC02WI.AWLC02WS.www;

public class ProgramInterfaceAwlc02Wi_entrada  implements java.io.Serializable {
    private java.lang.String awlc02Wi_i_area;

    private java.lang.String awlc02Wi_i_num_com;

    private java.lang.String awlc02Wi_i_rut;

    private java.lang.String awlc02Wi_i_dv;

    private java.lang.String awlc02Wi_i_criterio;

    private org.apache.axis.types.UnsignedLong awlc02Wi_i_sec_linea;

    public ProgramInterfaceAwlc02Wi_entrada() {
    }

    public ProgramInterfaceAwlc02Wi_entrada(
           java.lang.String awlc02Wi_i_area,
           java.lang.String awlc02Wi_i_num_com,
           java.lang.String awlc02Wi_i_rut,
           java.lang.String awlc02Wi_i_dv,
           java.lang.String awlc02Wi_i_criterio,
           org.apache.axis.types.UnsignedLong awlc02Wi_i_sec_linea) {
           this.awlc02Wi_i_area = awlc02Wi_i_area;
           this.awlc02Wi_i_num_com = awlc02Wi_i_num_com;
           this.awlc02Wi_i_rut = awlc02Wi_i_rut;
           this.awlc02Wi_i_dv = awlc02Wi_i_dv;
           this.awlc02Wi_i_criterio = awlc02Wi_i_criterio;
           this.awlc02Wi_i_sec_linea = awlc02Wi_i_sec_linea;
    }


    /**
     * Gets the awlc02Wi_i_area value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @return awlc02Wi_i_area
     */
    public java.lang.String getAwlc02Wi_i_area() {
        return awlc02Wi_i_area;
    }


    /**
     * Sets the awlc02Wi_i_area value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @param awlc02Wi_i_area
     */
    public void setAwlc02Wi_i_area(java.lang.String awlc02Wi_i_area) {
        this.awlc02Wi_i_area = awlc02Wi_i_area;
    }


    /**
     * Gets the awlc02Wi_i_num_com value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @return awlc02Wi_i_num_com
     */
    public java.lang.String getAwlc02Wi_i_num_com() {
        return awlc02Wi_i_num_com;
    }


    /**
     * Sets the awlc02Wi_i_num_com value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @param awlc02Wi_i_num_com
     */
    public void setAwlc02Wi_i_num_com(java.lang.String awlc02Wi_i_num_com) {
        this.awlc02Wi_i_num_com = awlc02Wi_i_num_com;
    }


    /**
     * Gets the awlc02Wi_i_rut value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @return awlc02Wi_i_rut
     */
    public java.lang.String getAwlc02Wi_i_rut() {
        return awlc02Wi_i_rut;
    }


    /**
     * Sets the awlc02Wi_i_rut value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @param awlc02Wi_i_rut
     */
    public void setAwlc02Wi_i_rut(java.lang.String awlc02Wi_i_rut) {
        this.awlc02Wi_i_rut = awlc02Wi_i_rut;
    }


    /**
     * Gets the awlc02Wi_i_dv value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @return awlc02Wi_i_dv
     */
    public java.lang.String getAwlc02Wi_i_dv() {
        return awlc02Wi_i_dv;
    }


    /**
     * Sets the awlc02Wi_i_dv value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @param awlc02Wi_i_dv
     */
    public void setAwlc02Wi_i_dv(java.lang.String awlc02Wi_i_dv) {
        this.awlc02Wi_i_dv = awlc02Wi_i_dv;
    }


    /**
     * Gets the awlc02Wi_i_criterio value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @return awlc02Wi_i_criterio
     */
    public java.lang.String getAwlc02Wi_i_criterio() {
        return awlc02Wi_i_criterio;
    }


    /**
     * Sets the awlc02Wi_i_criterio value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @param awlc02Wi_i_criterio
     */
    public void setAwlc02Wi_i_criterio(java.lang.String awlc02Wi_i_criterio) {
        this.awlc02Wi_i_criterio = awlc02Wi_i_criterio;
    }


    /**
     * Gets the awlc02Wi_i_sec_linea value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @return awlc02Wi_i_sec_linea
     */
    public org.apache.axis.types.UnsignedLong getAwlc02Wi_i_sec_linea() {
        return awlc02Wi_i_sec_linea;
    }


    /**
     * Sets the awlc02Wi_i_sec_linea value for this ProgramInterfaceAwlc02Wi_entrada.
     * 
     * @param awlc02Wi_i_sec_linea
     */
    public void setAwlc02Wi_i_sec_linea(org.apache.axis.types.UnsignedLong awlc02Wi_i_sec_linea) {
        this.awlc02Wi_i_sec_linea = awlc02Wi_i_sec_linea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwlc02Wi_entrada)) return false;
        ProgramInterfaceAwlc02Wi_entrada other = (ProgramInterfaceAwlc02Wi_entrada) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awlc02Wi_i_area==null && other.getAwlc02Wi_i_area()==null) || 
             (this.awlc02Wi_i_area!=null &&
              this.awlc02Wi_i_area.equals(other.getAwlc02Wi_i_area()))) &&
            ((this.awlc02Wi_i_num_com==null && other.getAwlc02Wi_i_num_com()==null) || 
             (this.awlc02Wi_i_num_com!=null &&
              this.awlc02Wi_i_num_com.equals(other.getAwlc02Wi_i_num_com()))) &&
            ((this.awlc02Wi_i_rut==null && other.getAwlc02Wi_i_rut()==null) || 
             (this.awlc02Wi_i_rut!=null &&
              this.awlc02Wi_i_rut.equals(other.getAwlc02Wi_i_rut()))) &&
            ((this.awlc02Wi_i_dv==null && other.getAwlc02Wi_i_dv()==null) || 
             (this.awlc02Wi_i_dv!=null &&
              this.awlc02Wi_i_dv.equals(other.getAwlc02Wi_i_dv()))) &&
            ((this.awlc02Wi_i_criterio==null && other.getAwlc02Wi_i_criterio()==null) || 
             (this.awlc02Wi_i_criterio!=null &&
              this.awlc02Wi_i_criterio.equals(other.getAwlc02Wi_i_criterio()))) &&
            ((this.awlc02Wi_i_sec_linea==null && other.getAwlc02Wi_i_sec_linea()==null) || 
             (this.awlc02Wi_i_sec_linea!=null &&
              this.awlc02Wi_i_sec_linea.equals(other.getAwlc02Wi_i_sec_linea())));
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
        if (getAwlc02Wi_i_area() != null) {
            _hashCode += getAwlc02Wi_i_area().hashCode();
        }
        if (getAwlc02Wi_i_num_com() != null) {
            _hashCode += getAwlc02Wi_i_num_com().hashCode();
        }
        if (getAwlc02Wi_i_rut() != null) {
            _hashCode += getAwlc02Wi_i_rut().hashCode();
        }
        if (getAwlc02Wi_i_dv() != null) {
            _hashCode += getAwlc02Wi_i_dv().hashCode();
        }
        if (getAwlc02Wi_i_criterio() != null) {
            _hashCode += getAwlc02Wi_i_criterio().hashCode();
        }
        if (getAwlc02Wi_i_sec_linea() != null) {
            _hashCode += getAwlc02Wi_i_sec_linea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwlc02Wi_entrada.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", ">ProgramInterface>awlc02wi_entrada"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc02Wi_i_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", "awlc02wi_i_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc02Wi_i_num_com");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", "awlc02wi_i_num_com"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc02Wi_i_rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", "awlc02wi_i_rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc02Wi_i_dv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", "awlc02wi_i_dv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc02Wi_i_criterio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", "awlc02wi_i_criterio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awlc02Wi_i_sec_linea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.Request.com", "awlc02wi_i_sec_linea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
