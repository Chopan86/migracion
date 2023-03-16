/**
 * ProgramInterfaceAccpspwo_salida.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.Response.ACCPSPWI.ACCPSPWS.www;

public class ProgramInterfaceAccpspwo_salida  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt accpspwo_o_cod_error;

    private java.lang.String accpspwo_o_desc_error;

    private java.lang.String accpspwo_o_programa;

    private org.apache.axis.types.UnsignedInt accpspwo_o_cod_db;

    private com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas[] accpspwo_o_lineas;

    public ProgramInterfaceAccpspwo_salida() {
    }

    public ProgramInterfaceAccpspwo_salida(
           org.apache.axis.types.UnsignedInt accpspwo_o_cod_error,
           java.lang.String accpspwo_o_desc_error,
           java.lang.String accpspwo_o_programa,
           org.apache.axis.types.UnsignedInt accpspwo_o_cod_db,
           com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas[] accpspwo_o_lineas) {
           this.accpspwo_o_cod_error = accpspwo_o_cod_error;
           this.accpspwo_o_desc_error = accpspwo_o_desc_error;
           this.accpspwo_o_programa = accpspwo_o_programa;
           this.accpspwo_o_cod_db = accpspwo_o_cod_db;
           this.accpspwo_o_lineas = accpspwo_o_lineas;
    }


    /**
     * Gets the accpspwo_o_cod_error value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @return accpspwo_o_cod_error
     */
    public org.apache.axis.types.UnsignedInt getAccpspwo_o_cod_error() {
        return accpspwo_o_cod_error;
    }


    /**
     * Sets the accpspwo_o_cod_error value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @param accpspwo_o_cod_error
     */
    public void setAccpspwo_o_cod_error(org.apache.axis.types.UnsignedInt accpspwo_o_cod_error) {
        this.accpspwo_o_cod_error = accpspwo_o_cod_error;
    }


    /**
     * Gets the accpspwo_o_desc_error value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @return accpspwo_o_desc_error
     */
    public java.lang.String getAccpspwo_o_desc_error() {
        return accpspwo_o_desc_error;
    }


    /**
     * Sets the accpspwo_o_desc_error value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @param accpspwo_o_desc_error
     */
    public void setAccpspwo_o_desc_error(java.lang.String accpspwo_o_desc_error) {
        this.accpspwo_o_desc_error = accpspwo_o_desc_error;
    }


    /**
     * Gets the accpspwo_o_programa value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @return accpspwo_o_programa
     */
    public java.lang.String getAccpspwo_o_programa() {
        return accpspwo_o_programa;
    }


    /**
     * Sets the accpspwo_o_programa value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @param accpspwo_o_programa
     */
    public void setAccpspwo_o_programa(java.lang.String accpspwo_o_programa) {
        this.accpspwo_o_programa = accpspwo_o_programa;
    }


    /**
     * Gets the accpspwo_o_cod_db value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @return accpspwo_o_cod_db
     */
    public org.apache.axis.types.UnsignedInt getAccpspwo_o_cod_db() {
        return accpspwo_o_cod_db;
    }


    /**
     * Sets the accpspwo_o_cod_db value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @param accpspwo_o_cod_db
     */
    public void setAccpspwo_o_cod_db(org.apache.axis.types.UnsignedInt accpspwo_o_cod_db) {
        this.accpspwo_o_cod_db = accpspwo_o_cod_db;
    }


    /**
     * Gets the accpspwo_o_lineas value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @return accpspwo_o_lineas
     */
    public com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas[] getAccpspwo_o_lineas() {
        return accpspwo_o_lineas;
    }


    /**
     * Sets the accpspwo_o_lineas value for this ProgramInterfaceAccpspwo_salida.
     * 
     * @param accpspwo_o_lineas
     */
    public void setAccpspwo_o_lineas(com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas[] accpspwo_o_lineas) {
        this.accpspwo_o_lineas = accpspwo_o_lineas;
    }

    public com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas getAccpspwo_o_lineas(int i) {
        return this.accpspwo_o_lineas[i];
    }

    public void setAccpspwo_o_lineas(int i, com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salidaAccpspwo_o_lineas _value) {
        this.accpspwo_o_lineas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgramInterfaceAccpspwo_salida)) return false;
        ProgramInterfaceAccpspwo_salida other = (ProgramInterfaceAccpspwo_salida) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accpspwo_o_cod_error==null && other.getAccpspwo_o_cod_error()==null) || 
             (this.accpspwo_o_cod_error!=null &&
              this.accpspwo_o_cod_error.equals(other.getAccpspwo_o_cod_error()))) &&
            ((this.accpspwo_o_desc_error==null && other.getAccpspwo_o_desc_error()==null) || 
             (this.accpspwo_o_desc_error!=null &&
              this.accpspwo_o_desc_error.equals(other.getAccpspwo_o_desc_error()))) &&
            ((this.accpspwo_o_programa==null && other.getAccpspwo_o_programa()==null) || 
             (this.accpspwo_o_programa!=null &&
              this.accpspwo_o_programa.equals(other.getAccpspwo_o_programa()))) &&
            ((this.accpspwo_o_cod_db==null && other.getAccpspwo_o_cod_db()==null) || 
             (this.accpspwo_o_cod_db!=null &&
              this.accpspwo_o_cod_db.equals(other.getAccpspwo_o_cod_db()))) &&
            ((this.accpspwo_o_lineas==null && other.getAccpspwo_o_lineas()==null) || 
             (this.accpspwo_o_lineas!=null &&
              java.util.Arrays.equals(this.accpspwo_o_lineas, other.getAccpspwo_o_lineas())));
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
        if (getAccpspwo_o_cod_error() != null) {
            _hashCode += getAccpspwo_o_cod_error().hashCode();
        }
        if (getAccpspwo_o_desc_error() != null) {
            _hashCode += getAccpspwo_o_desc_error().hashCode();
        }
        if (getAccpspwo_o_programa() != null) {
            _hashCode += getAccpspwo_o_programa().hashCode();
        }
        if (getAccpspwo_o_cod_db() != null) {
            _hashCode += getAccpspwo_o_cod_db().hashCode();
        }
        if (getAccpspwo_o_lineas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccpspwo_o_lineas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccpspwo_o_lineas(), i);
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
        new org.apache.axis.description.TypeDesc(ProgramInterfaceAccpspwo_salida.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">ProgramInterface>accpspwo_salida"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_cod_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_cod_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_desc_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_desc_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_programa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_programa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_cod_db");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_cod_db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accpspwo_o_lineas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", "accpspwo_o_lineas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.Response.com", ">>ProgramInterface>accpspwo_salida>accpspwo_o_lineas"));
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
