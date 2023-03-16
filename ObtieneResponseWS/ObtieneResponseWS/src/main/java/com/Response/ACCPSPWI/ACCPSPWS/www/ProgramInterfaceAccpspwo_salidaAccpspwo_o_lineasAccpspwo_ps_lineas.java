/**
 * ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.ACCPSPWI.ACCPSPWS.www;

public class ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt accpspwo_o_ps;

    private java.lang.String accpspwo_o_desc;

    private java.lang.String accpspwo_o_cod_fam;

    private org.apache.axis.types.UnsignedInt accpspwo_o_subgr2;

    public ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas() {
    }

    public ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas(
           org.apache.axis.types.UnsignedInt accpspwo_o_ps,
           java.lang.String accpspwo_o_desc,
           java.lang.String accpspwo_o_cod_fam,
           org.apache.axis.types.UnsignedInt accpspwo_o_subgr2) {
           this.accpspwo_o_ps = accpspwo_o_ps;
           this.accpspwo_o_desc = accpspwo_o_desc;
           this.accpspwo_o_cod_fam = accpspwo_o_cod_fam;
           this.accpspwo_o_subgr2 = accpspwo_o_subgr2;
    }


    /**
     * Gets the accpspwo_o_ps value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @return accpspwo_o_ps
     */
    public org.apache.axis.types.UnsignedInt getAccpspwo_o_ps() {
        return accpspwo_o_ps;
    }


    /**
     * Sets the accpspwo_o_ps value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @param accpspwo_o_ps
     */
    public void setAccpspwo_o_ps(org.apache.axis.types.UnsignedInt accpspwo_o_ps) {
        this.accpspwo_o_ps = accpspwo_o_ps;
    }


    /**
     * Gets the accpspwo_o_desc value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @return accpspwo_o_desc
     */
    public java.lang.String getAccpspwo_o_desc() {
        return accpspwo_o_desc;
    }


    /**
     * Sets the accpspwo_o_desc value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @param accpspwo_o_desc
     */
    public void setAccpspwo_o_desc(java.lang.String accpspwo_o_desc) {
        this.accpspwo_o_desc = accpspwo_o_desc;
    }


    /**
     * Gets the accpspwo_o_cod_fam value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @return accpspwo_o_cod_fam
     */
    public java.lang.String getAccpspwo_o_cod_fam() {
        return accpspwo_o_cod_fam;
    }


    /**
     * Sets the accpspwo_o_cod_fam value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @param accpspwo_o_cod_fam
     */
    public void setAccpspwo_o_cod_fam(java.lang.String accpspwo_o_cod_fam) {
        this.accpspwo_o_cod_fam = accpspwo_o_cod_fam;
    }


    /**
     * Gets the accpspwo_o_subgr2 value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @return accpspwo_o_subgr2
     */
    public org.apache.axis.types.UnsignedInt getAccpspwo_o_subgr2() {
        return accpspwo_o_subgr2;
    }


    /**
     * Sets the accpspwo_o_subgr2 value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.
     * 
     * @param accpspwo_o_subgr2
     */
    public void setAccpspwo_o_subgr2(org.apache.axis.types.UnsignedInt accpspwo_o_subgr2) {
        this.accpspwo_o_subgr2 = accpspwo_o_subgr2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas)) return false;
        ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas other = (ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accpspwo_o_ps==null && other.getAccpspwo_o_ps()==null) || 
             (this.accpspwo_o_ps!=null &&
              this.accpspwo_o_ps.equals(other.getAccpspwo_o_ps()))) &&
            ((this.accpspwo_o_desc==null && other.getAccpspwo_o_desc()==null) || 
             (this.accpspwo_o_desc!=null &&
              this.accpspwo_o_desc.equals(other.getAccpspwo_o_desc()))) &&
            ((this.accpspwo_o_cod_fam==null && other.getAccpspwo_o_cod_fam()==null) || 
             (this.accpspwo_o_cod_fam!=null &&
              this.accpspwo_o_cod_fam.equals(other.getAccpspwo_o_cod_fam()))) &&
            ((this.accpspwo_o_subgr2==null && other.getAccpspwo_o_subgr2()==null) || 
             (this.accpspwo_o_subgr2!=null &&
              this.accpspwo_o_subgr2.equals(other.getAccpspwo_o_subgr2())));
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
        if (getAccpspwo_o_ps() != null) {
            _hashCode += getAccpspwo_o_ps().hashCode();
        }
        if (getAccpspwo_o_desc() != null) {
            _hashCode += getAccpspwo_o_desc().hashCode();
        }
        if (getAccpspwo_o_cod_fam() != null) {
            _hashCode += getAccpspwo_o_cod_fam().hashCode();
        }
        if (getAccpspwo_o_subgr2() != null) {
            _hashCode += getAccpspwo_o_subgr2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_cod_fam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_cod_fam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_subgr2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_subgr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
