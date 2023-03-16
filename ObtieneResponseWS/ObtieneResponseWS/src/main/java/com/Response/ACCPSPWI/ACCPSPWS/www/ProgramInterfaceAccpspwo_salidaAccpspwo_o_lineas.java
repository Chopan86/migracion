/**
 * ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.ACCPSPWI.ACCPSPWS.www;

import cl.tchile.adapter.StringAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas implements java.io.Serializable {
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String accpspwo_o_area;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String accpspwo_o_fono;

    private com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas[] accpspwo_ps_lineas;

    public ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas() {
    }

    public ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas(
        java.lang.String accpspwo_o_area,
        java.lang.String accpspwo_o_fono,
        com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas[] accpspwo_ps_lineas) {
        this.accpspwo_o_area = accpspwo_o_area;
        this.accpspwo_o_fono = accpspwo_o_fono;
        this.accpspwo_ps_lineas = accpspwo_ps_lineas;
    }

    /**
     * Gets the accpspwo_o_area value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.
     *
     * @return accpspwo_o_area
     */
    public java.lang.String getAccpspwo_o_area() {
        return accpspwo_o_area;
    }

    /**
     * Sets the accpspwo_o_area value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.
     *
     * @param accpspwo_o_area
     */
    public void setAccpspwo_o_area(java.lang.String accpspwo_o_area) {
        this.accpspwo_o_area = accpspwo_o_area;
    }

    /**
     * Gets the accpspwo_o_fono value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.
     *
     * @return accpspwo_o_fono
     */
    public java.lang.String getAccpspwo_o_fono() {
        return accpspwo_o_fono;
    }

    /**
     * Sets the accpspwo_o_fono value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.
     *
     * @param accpspwo_o_fono
     */
    public void setAccpspwo_o_fono(java.lang.String accpspwo_o_fono) {
        this.accpspwo_o_fono = accpspwo_o_fono;
    }

    /**
     * Gets the accpspwo_ps_lineas value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.
     *
     * @return accpspwo_ps_lineas
     */
    public com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas[] getAccpspwo_ps_lineas() {
        return accpspwo_ps_lineas;
    }

    /**
     * Sets the accpspwo_ps_lineas value for this ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.
     *
     * @param accpspwo_ps_lineas
     */
    public void setAccpspwo_ps_lineas(
        com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas[] accpspwo_ps_lineas) {
        this.accpspwo_ps_lineas = accpspwo_ps_lineas;
    }

    public com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas getAccpspwo_ps_lineas(
        int i) {
        return this.accpspwo_ps_lineas[i];
    }

    public void setAccpspwo_ps_lineas(int i,
        com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineasAccpspwo_ps_lineas _value) {
        this.accpspwo_ps_lineas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas))
            return false;
        ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas other = (ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.accpspwo_o_area == null && other.getAccpspwo_o_area() == null) ||
                (this.accpspwo_o_area != null &&
                    this.accpspwo_o_area.equals(other.getAccpspwo_o_area()))) &&
            ((this.accpspwo_o_fono == null && other.getAccpspwo_o_fono() == null) ||
                (this.accpspwo_o_fono != null &&
                    this.accpspwo_o_fono.equals(other.getAccpspwo_o_fono()))) &&
            ((this.accpspwo_ps_lineas == null && other.getAccpspwo_ps_lineas() == null) ||
                (this.accpspwo_ps_lineas != null &&
                    java.util.Arrays.equals(this.accpspwo_ps_lineas, other.getAccpspwo_ps_lineas())));
        __equalsCalc = null;
        return _equals;
    }

    @XmlTransient
    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAccpspwo_o_area() != null) {
            _hashCode += getAccpspwo_o_area().hashCode();
        }
        if (getAccpspwo_o_fono() != null) {
            _hashCode += getAccpspwo_o_fono().hashCode();
        }
        if (getAccpspwo_ps_lineas() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAccpspwo_ps_lineas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccpspwo_ps_lineas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com",
            ">>ProgramInterface>accpspwo_salida>accpspwo_o_lineas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_area");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_fono");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_fono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_ps_lineas");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_ps_lineas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com",
            ">>>ProgramInterface>accpspwo_salida>accpspwo_o_lineas>accpspwo_ps_lineas"));
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
            new org.apache.axis.encoding.ser.BeanSerializer(
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
            new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }

}
