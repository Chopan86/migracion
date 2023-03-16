/**
 * ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Request.ACCPSPWI.ACCPSPWS.www;

public class ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas  implements java.io.Serializable {
    private java.lang.String accpspwi_i_area;

    private java.lang.String accpspwi_i_num_com;

    private java.lang.String accpspwi_i_ini_vi;

    public ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas() {
    }

    public ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas(
           java.lang.String accpspwi_i_area,
           java.lang.String accpspwi_i_num_com,
           java.lang.String accpspwi_i_ini_vi) {
           this.accpspwi_i_area = accpspwi_i_area;
           this.accpspwi_i_num_com = accpspwi_i_num_com;
           this.accpspwi_i_ini_vi = accpspwi_i_ini_vi;
    }


    /**
     * Gets the accpspwi_i_area value for this ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.
     * 
     * @return accpspwi_i_area
     */
    public java.lang.String getAccpspwi_i_area() {
        return accpspwi_i_area;
    }


    /**
     * Sets the accpspwi_i_area value for this ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.
     * 
     * @param accpspwi_i_area
     */
    public void setAccpspwi_i_area(java.lang.String accpspwi_i_area) {
        this.accpspwi_i_area = accpspwi_i_area;
    }


    /**
     * Gets the accpspwi_i_num_com value for this ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.
     * 
     * @return accpspwi_i_num_com
     */
    public java.lang.String getAccpspwi_i_num_com() {
        return accpspwi_i_num_com;
    }


    /**
     * Sets the accpspwi_i_num_com value for this ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.
     * 
     * @param accpspwi_i_num_com
     */
    public void setAccpspwi_i_num_com(java.lang.String accpspwi_i_num_com) {
        this.accpspwi_i_num_com = accpspwi_i_num_com;
    }


    /**
     * Gets the accpspwi_i_ini_vi value for this ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.
     * 
     * @return accpspwi_i_ini_vi
     */
    public java.lang.String getAccpspwi_i_ini_vi() {
        return accpspwi_i_ini_vi;
    }


    /**
     * Sets the accpspwi_i_ini_vi value for this ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.
     * 
     * @param accpspwi_i_ini_vi
     */
    public void setAccpspwi_i_ini_vi(java.lang.String accpspwi_i_ini_vi) {
        this.accpspwi_i_ini_vi = accpspwi_i_ini_vi;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas)) return false;
        ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas other = (ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accpspwi_i_area==null && other.getAccpspwi_i_area()==null) || 
             (this.accpspwi_i_area!=null &&
              this.accpspwi_i_area.equals(other.getAccpspwi_i_area()))) &&
            ((this.accpspwi_i_num_com==null && other.getAccpspwi_i_num_com()==null) || 
             (this.accpspwi_i_num_com!=null &&
              this.accpspwi_i_num_com.equals(other.getAccpspwi_i_num_com()))) &&
            ((this.accpspwi_i_ini_vi==null && other.getAccpspwi_i_ini_vi()==null) || 
             (this.accpspwi_i_ini_vi!=null &&
              this.accpspwi_i_ini_vi.equals(other.getAccpspwi_i_ini_vi())));
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
        if (getAccpspwi_i_area() != null) {
            _hashCode += getAccpspwi_i_area().hashCode();
        }
        if (getAccpspwi_i_num_com() != null) {
            _hashCode += getAccpspwi_i_num_com().hashCode();
        }
        if (getAccpspwi_i_ini_vi() != null) {
            _hashCode += getAccpspwi_i_ini_vi().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", ">>ProgramInterface>accpspwi_entrada>accpspwi_i_lineas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwi_i_area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "accpspwi_i_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwi_i_num_com");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "accpspwi_i_num_com"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwi_i_ini_vi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Request.com", "accpspwi_i_ini_vi"));
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
