/**
 * ProgramInterfaceAwpsl2Wi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.AWPSL2WI.AWPSL2WS.www;

public class ProgramInterfaceAwpsl2Wi  implements java.io.Serializable {
    private java.lang.String awpsl2Wi_area;

    private java.lang.String awpsl2Wi_num_com;

    private String awpsl2Wi_cod_ps;

    private java.lang.String awpsl2Wi_fec_ini_li;

    public ProgramInterfaceAwpsl2Wi() {
    }

    public ProgramInterfaceAwpsl2Wi(
           java.lang.String awpsl2Wi_area,
           java.lang.String awpsl2Wi_num_com,
           java.lang.String awpsl2Wi_cod_ps,
           java.lang.String awpsl2Wi_fec_ini_li) {
           this.awpsl2Wi_area = awpsl2Wi_area;
           this.awpsl2Wi_num_com = awpsl2Wi_num_com;
           this.awpsl2Wi_cod_ps = awpsl2Wi_cod_ps;
           this.awpsl2Wi_fec_ini_li = awpsl2Wi_fec_ini_li;
    }


    /**
     * Gets the awpsl2Wi_area value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @return awpsl2Wi_area
     */
    public java.lang.String getAwpsl2Wi_area() {
        return awpsl2Wi_area;
    }


    /**
     * Sets the awpsl2Wi_area value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @param awpsl2Wi_area
     */
    public void setAwpsl2Wi_area(java.lang.String awpsl2Wi_area) {
        this.awpsl2Wi_area = awpsl2Wi_area;
    }


    /**
     * Gets the awpsl2Wi_num_com value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @return awpsl2Wi_num_com
     */
    public java.lang.String getAwpsl2Wi_num_com() {
        return awpsl2Wi_num_com;
    }


    /**
     * Sets the awpsl2Wi_num_com value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @param awpsl2Wi_num_com
     */
    public void setAwpsl2Wi_num_com(java.lang.String awpsl2Wi_num_com) {
        this.awpsl2Wi_num_com = awpsl2Wi_num_com;
    }


    /**
     * Gets the awpsl2Wi_cod_ps value for this ProgramInterfaceAwpsl2Wi.
     *
     * @return awpsl2Wi_cod_ps
     */
    public String getAwpsl2Wi_cod_ps() {
        return awpsl2Wi_cod_ps;
    }


    /**
     * Sets the awpsl2Wi_cod_ps value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @param awpsl2Wi_cod_ps
     */
    public void setAwpsl2Wi_cod_ps(String awpsl2Wi_cod_ps) {
        this.awpsl2Wi_cod_ps = awpsl2Wi_cod_ps;
    }


    /**
     * Gets the awpsl2Wi_fec_ini_li value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @return awpsl2Wi_fec_ini_li
     */
    public java.lang.String getAwpsl2Wi_fec_ini_li() {
        return awpsl2Wi_fec_ini_li;
    }


    /**
     * Sets the awpsl2Wi_fec_ini_li value for this ProgramInterfaceAwpsl2Wi.
     * 
     * @param awpsl2Wi_fec_ini_li
     */
    public void setAwpsl2Wi_fec_ini_li(java.lang.String awpsl2Wi_fec_ini_li) {
        this.awpsl2Wi_fec_ini_li = awpsl2Wi_fec_ini_li;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwpsl2Wi)) return false;
        ProgramInterfaceAwpsl2Wi other = (ProgramInterfaceAwpsl2Wi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awpsl2Wi_area==null && other.getAwpsl2Wi_area()==null) || 
             (this.awpsl2Wi_area!=null &&
              this.awpsl2Wi_area.equals(other.getAwpsl2Wi_area()))) &&
            ((this.awpsl2Wi_num_com==null && other.getAwpsl2Wi_num_com()==null) || 
             (this.awpsl2Wi_num_com!=null &&
              this.awpsl2Wi_num_com.equals(other.getAwpsl2Wi_num_com()))) &&
            ((this.awpsl2Wi_cod_ps==null && other.getAwpsl2Wi_cod_ps()==null) || 
             (this.awpsl2Wi_cod_ps!=null &&
              this.awpsl2Wi_cod_ps.equals(other.getAwpsl2Wi_cod_ps()))) &&
            ((this.awpsl2Wi_fec_ini_li==null && other.getAwpsl2Wi_fec_ini_li()==null) || 
             (this.awpsl2Wi_fec_ini_li!=null &&
              this.awpsl2Wi_fec_ini_li.equals(other.getAwpsl2Wi_fec_ini_li())));
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
        if (getAwpsl2Wi_area() != null) {
            _hashCode += getAwpsl2Wi_area().hashCode();
        }
        if (getAwpsl2Wi_num_com() != null) {
            _hashCode += getAwpsl2Wi_num_com().hashCode();
        }
        if (getAwpsl2Wi_cod_ps() != null) {
            _hashCode += getAwpsl2Wi_cod_ps().hashCode();
        }
        if (getAwpsl2Wi_fec_ini_li() != null) {
            _hashCode += getAwpsl2Wi_fec_ini_li().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwpsl2Wi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Request.com", ">ProgramInterface>awpsl2wi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awpsl2Wi_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Request.com", "awpsl2wi_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awpsl2Wi_num_com");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Request.com", "awpsl2wi_num_com"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awpsl2Wi_cod_ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Request.com", "awpsl2wi_cod_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awpsl2Wi_fec_ini_li");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Request.com", "awpsl2wi_fec_ini_li"));
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
