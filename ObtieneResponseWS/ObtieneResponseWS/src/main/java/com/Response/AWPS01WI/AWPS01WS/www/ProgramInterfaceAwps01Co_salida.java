/**
 * ProgramInterfaceAwps01Co_salida.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.AWPS01WI.AWPS01WS.www;

import cl.tchile.adapter.StringAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ProgramInterfaceAwps01Co_salida implements java.io.Serializable {
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awps01Co_o_cod_ret;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awps01Co_o_desc_cod_ret;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awps01Co_o_finpaginacion;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awps01Co_o_numregistros;

    private com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salidaAwps01Co_o_pi_cliente[] awps01Co_o_pi_cliente;
    @XmlJavaTypeAdapter(StringAdapter.class)
    private java.lang.String awps01Co_o_plan_minuto;

    public ProgramInterfaceAwps01Co_salida() {
    }

    public ProgramInterfaceAwps01Co_salida(
        java.lang.String awps01Co_o_cod_ret,
        java.lang.String awps01Co_o_desc_cod_ret,
        java.lang.String awps01Co_o_finpaginacion,
        java.lang.String awps01Co_o_numregistros,
        com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salidaAwps01Co_o_pi_cliente[] awps01Co_o_pi_cliente,
        java.lang.String awps01Co_o_plan_minuto) {
        this.awps01Co_o_cod_ret = awps01Co_o_cod_ret;
        this.awps01Co_o_desc_cod_ret = awps01Co_o_desc_cod_ret;
        this.awps01Co_o_finpaginacion = awps01Co_o_finpaginacion;
        this.awps01Co_o_numregistros = awps01Co_o_numregistros;
        this.awps01Co_o_pi_cliente = awps01Co_o_pi_cliente;
        this.awps01Co_o_plan_minuto = awps01Co_o_plan_minuto;
    }

    /**
     * Gets the awps01Co_o_cod_ret value for this ProgramInterfaceAwps01Co_salida.
     *
     * @return awps01Co_o_cod_ret
     */
    public java.lang.String getAwps01Co_o_cod_ret() {
        return awps01Co_o_cod_ret;
    }

    /**
     * Sets the awps01Co_o_cod_ret value for this ProgramInterfaceAwps01Co_salida.
     *
     * @param awps01Co_o_cod_ret
     */
    public void setAwps01Co_o_cod_ret(java.lang.String awps01Co_o_cod_ret) {
        this.awps01Co_o_cod_ret = awps01Co_o_cod_ret;
    }

    /**
     * Gets the awps01Co_o_desc_cod_ret value for this ProgramInterfaceAwps01Co_salida.
     *
     * @return awps01Co_o_desc_cod_ret
     */
    public java.lang.String getAwps01Co_o_desc_cod_ret() {
        return awps01Co_o_desc_cod_ret;
    }

    /**
     * Sets the awps01Co_o_desc_cod_ret value for this ProgramInterfaceAwps01Co_salida.
     *
     * @param awps01Co_o_desc_cod_ret
     */
    public void setAwps01Co_o_desc_cod_ret(java.lang.String awps01Co_o_desc_cod_ret) {
        this.awps01Co_o_desc_cod_ret = awps01Co_o_desc_cod_ret;
    }

    /**
     * Gets the awps01Co_o_finpaginacion value for this ProgramInterfaceAwps01Co_salida.
     *
     * @return awps01Co_o_finpaginacion
     */
    public java.lang.String getAwps01Co_o_finpaginacion() {
        return awps01Co_o_finpaginacion;
    }

    /**
     * Sets the awps01Co_o_finpaginacion value for this ProgramInterfaceAwps01Co_salida.
     *
     * @param awps01Co_o_finpaginacion
     */
    public void setAwps01Co_o_finpaginacion(java.lang.String awps01Co_o_finpaginacion) {
        this.awps01Co_o_finpaginacion = awps01Co_o_finpaginacion;
    }

    /**
     * Gets the awps01Co_o_numregistros value for this ProgramInterfaceAwps01Co_salida.
     *
     * @return awps01Co_o_numregistros
     */
    public java.lang.String getAwps01Co_o_numregistros() {
        return awps01Co_o_numregistros;
    }

    /**
     * Sets the awps01Co_o_numregistros value for this ProgramInterfaceAwps01Co_salida.
     *
     * @param awps01Co_o_numregistros
     */
    public void setAwps01Co_o_numregistros(java.lang.String awps01Co_o_numregistros) {
        this.awps01Co_o_numregistros = awps01Co_o_numregistros;
    }

    /**
     * Gets the awps01Co_o_pi_cliente value for this ProgramInterfaceAwps01Co_salida.
     *
     * @return awps01Co_o_pi_cliente
     */
    public com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salidaAwps01Co_o_pi_cliente[] getAwps01Co_o_pi_cliente() {
        return awps01Co_o_pi_cliente;
    }

    /**
     * Sets the awps01Co_o_pi_cliente value for this ProgramInterfaceAwps01Co_salida.
     *
     * @param awps01Co_o_pi_cliente
     */
    public void setAwps01Co_o_pi_cliente(
        com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salidaAwps01Co_o_pi_cliente[] awps01Co_o_pi_cliente) {
        this.awps01Co_o_pi_cliente = awps01Co_o_pi_cliente;
    }

    public com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salidaAwps01Co_o_pi_cliente getAwps01Co_o_pi_cliente(
        int i) {
        return this.awps01Co_o_pi_cliente[i];
    }

    public void setAwps01Co_o_pi_cliente(int i,
        com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salidaAwps01Co_o_pi_cliente _value) {
        this.awps01Co_o_pi_cliente[i] = _value;
    }

    /**
     * Gets the awps01Co_o_plan_minuto value for this ProgramInterfaceAwps01Co_salida.
     *
     * @return awps01Co_o_plan_minuto
     */
    public java.lang.String getAwps01Co_o_plan_minuto() {
        return awps01Co_o_plan_minuto;
    }

    /**
     * Sets the awps01Co_o_plan_minuto value for this ProgramInterfaceAwps01Co_salida.
     *
     * @param awps01Co_o_plan_minuto
     */
    public void setAwps01Co_o_plan_minuto(java.lang.String awps01Co_o_plan_minuto) {
        this.awps01Co_o_plan_minuto = awps01Co_o_plan_minuto;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwps01Co_salida))
            return false;
        ProgramInterfaceAwps01Co_salida other = (ProgramInterfaceAwps01Co_salida) obj;
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
            ((this.awps01Co_o_cod_ret == null && other.getAwps01Co_o_cod_ret() == null) ||
                (this.awps01Co_o_cod_ret != null &&
                    this.awps01Co_o_cod_ret.equals(other.getAwps01Co_o_cod_ret()))) &&
            ((this.awps01Co_o_desc_cod_ret == null && other.getAwps01Co_o_desc_cod_ret() == null) ||
                (this.awps01Co_o_desc_cod_ret != null &&
                    this.awps01Co_o_desc_cod_ret.equals(other.getAwps01Co_o_desc_cod_ret()))) &&
            ((this.awps01Co_o_finpaginacion == null && other.getAwps01Co_o_finpaginacion() == null) ||
                (this.awps01Co_o_finpaginacion != null &&
                    this.awps01Co_o_finpaginacion.equals(other.getAwps01Co_o_finpaginacion()))) &&
            ((this.awps01Co_o_numregistros == null && other.getAwps01Co_o_numregistros() == null) ||
                (this.awps01Co_o_numregistros != null &&
                    this.awps01Co_o_numregistros.equals(other.getAwps01Co_o_numregistros()))) &&
            ((this.awps01Co_o_pi_cliente == null && other.getAwps01Co_o_pi_cliente() == null) ||
                (this.awps01Co_o_pi_cliente != null &&
                    java.util.Arrays.equals(this.awps01Co_o_pi_cliente, other.getAwps01Co_o_pi_cliente()))) &&
            ((this.awps01Co_o_plan_minuto == null && other.getAwps01Co_o_plan_minuto() == null) ||
                (this.awps01Co_o_plan_minuto != null &&
                    this.awps01Co_o_plan_minuto.equals(other.getAwps01Co_o_plan_minuto())));
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
        if (getAwps01Co_o_cod_ret() != null) {
            _hashCode += getAwps01Co_o_cod_ret().hashCode();
        }
        if (getAwps01Co_o_desc_cod_ret() != null) {
            _hashCode += getAwps01Co_o_desc_cod_ret().hashCode();
        }
        if (getAwps01Co_o_finpaginacion() != null) {
            _hashCode += getAwps01Co_o_finpaginacion().hashCode();
        }
        if (getAwps01Co_o_numregistros() != null) {
            _hashCode += getAwps01Co_o_numregistros().hashCode();
        }
        if (getAwps01Co_o_pi_cliente() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAwps01Co_o_pi_cliente());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwps01Co_o_pi_cliente(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAwps01Co_o_plan_minuto() != null) {
            _hashCode += getAwps01Co_o_plan_minuto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwps01Co_salida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com",
            ">ProgramInterface>awps01co_salida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_o_cod_ret");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com", "awps01co_o_cod_ret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_o_desc_cod_ret");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com", "awps01co_o_desc_cod_ret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_o_finpaginacion");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com", "awps01co_o_finpaginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_o_numregistros");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com", "awps01co_o_numregistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_o_pi_cliente");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com", "awps01co_o_pi_cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com",
            ">>ProgramInterface>awps01co_salida>awps01co_o_pi_cliente"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awps01Co_o_plan_minuto");
        elemField.setXmlName(
            new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.Response.com", "awps01co_o_plan_minuto"));
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
