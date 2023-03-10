/**
 * ProgramInterfaceAwpsl2Wo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.AWPSL2WI.AWPSL2WS.www;

public class ProgramInterfaceAwpsl2Wo  implements java.io.Serializable {
    private com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_salida awpsl2Wo_salida;

    private com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_lista_ps[] awpsl2Wo_lista_ps;

    public ProgramInterfaceAwpsl2Wo() {
    }

    public ProgramInterfaceAwpsl2Wo(
           com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_salida awpsl2Wo_salida,
           com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_lista_ps[] awpsl2Wo_lista_ps) {
           this.awpsl2Wo_salida = awpsl2Wo_salida;
           this.awpsl2Wo_lista_ps = awpsl2Wo_lista_ps;
    }


    /**
     * Gets the awpsl2Wo_salida value for this ProgramInterfaceAwpsl2Wo.
     * 
     * @return awpsl2Wo_salida
     */
    public com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_salida getAwpsl2Wo_salida() {
        return awpsl2Wo_salida;
    }


    /**
     * Sets the awpsl2Wo_salida value for this ProgramInterfaceAwpsl2Wo.
     * 
     * @param awpsl2Wo_salida
     */
    public void setAwpsl2Wo_salida(com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_salida awpsl2Wo_salida) {
        this.awpsl2Wo_salida = awpsl2Wo_salida;
    }


    /**
     * Gets the awpsl2Wo_lista_ps value for this ProgramInterfaceAwpsl2Wo.
     * 
     * @return awpsl2Wo_lista_ps
     */
    public com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_lista_ps[] getAwpsl2Wo_lista_ps() {
        return awpsl2Wo_lista_ps;
    }


    /**
     * Sets the awpsl2Wo_lista_ps value for this ProgramInterfaceAwpsl2Wo.
     * 
     * @param awpsl2Wo_lista_ps
     */
    public void setAwpsl2Wo_lista_ps(com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_lista_ps[] awpsl2Wo_lista_ps) {
        this.awpsl2Wo_lista_ps = awpsl2Wo_lista_ps;
    }

    public com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_lista_ps getAwpsl2Wo_lista_ps(int i) {
        return this.awpsl2Wo_lista_ps[i];
    }

    public void setAwpsl2Wo_lista_ps(int i, com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2WoAwpsl2Wo_lista_ps _value) {
        this.awpsl2Wo_lista_ps[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAwpsl2Wo)) return false;
        ProgramInterfaceAwpsl2Wo other = (ProgramInterfaceAwpsl2Wo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awpsl2Wo_salida==null && other.getAwpsl2Wo_salida()==null) || 
             (this.awpsl2Wo_salida!=null &&
              this.awpsl2Wo_salida.equals(other.getAwpsl2Wo_salida()))) &&
            ((this.awpsl2Wo_lista_ps==null && other.getAwpsl2Wo_lista_ps()==null) || 
             (this.awpsl2Wo_lista_ps!=null &&
              java.util.Arrays.equals(this.awpsl2Wo_lista_ps, other.getAwpsl2Wo_lista_ps())));
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
        if (getAwpsl2Wo_salida() != null) {
            _hashCode += getAwpsl2Wo_salida().hashCode();
        }
        if (getAwpsl2Wo_lista_ps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAwpsl2Wo_lista_ps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwpsl2Wo_lista_ps(), i);
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
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAwpsl2Wo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Response.com", ">ProgramInterface>awpsl2wo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awpsl2Wo_salida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Response.com", "awpsl2wo_salida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Response.com", ">>ProgramInterface>awpsl2wo>awpsl2wo_salida"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awpsl2Wo_lista_ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Response.com", "awpsl2wo_lista_ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.Response.com", ">>ProgramInterface>awpsl2wo>awpsl2wo_lista_ps"));
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
