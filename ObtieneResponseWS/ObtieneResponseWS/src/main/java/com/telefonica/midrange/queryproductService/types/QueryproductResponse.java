/**
 * QueryproductResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService.types;

public class QueryproductResponse  implements java.io.Serializable {
    private com.telefonica.midrange.queryproductService.types.ResponseMsj responseMsj;

    private com.telefonica.midrange.queryproductService.types.Product[] responseData;

    public QueryproductResponse() {
    }

    public QueryproductResponse(
           com.telefonica.midrange.queryproductService.types.ResponseMsj responseMsj,
           com.telefonica.midrange.queryproductService.types.Product[] responseData) {
           this.responseMsj = responseMsj;
           this.responseData = responseData;
    }


    /**
     * Gets the responseMsj value for this QueryproductResponse.
     * 
     * @return responseMsj
     */
    public com.telefonica.midrange.queryproductService.types.ResponseMsj getResponseMsj() {
        return responseMsj;
    }


    /**
     * Sets the responseMsj value for this QueryproductResponse.
     * 
     * @param responseMsj
     */
    public void setResponseMsj(com.telefonica.midrange.queryproductService.types.ResponseMsj responseMsj) {
        this.responseMsj = responseMsj;
    }


    /**
     * Gets the responseData value for this QueryproductResponse.
     * 
     * @return responseData
     */
    public com.telefonica.midrange.queryproductService.types.Product[] getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this QueryproductResponse.
     * 
     * @param responseData
     */
    public void setResponseData(com.telefonica.midrange.queryproductService.types.Product[] responseData) {
        this.responseData = responseData;
    }

    public com.telefonica.midrange.queryproductService.types.Product getResponseData(int i) {
        return this.responseData[i];
    }

    public void setResponseData(int i, com.telefonica.midrange.queryproductService.types.Product _value) {
        this.responseData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryproductResponse)) return false;
        QueryproductResponse other = (QueryproductResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseMsj==null && other.getResponseMsj()==null) || 
             (this.responseMsj!=null &&
              this.responseMsj.equals(other.getResponseMsj()))) &&
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              java.util.Arrays.equals(this.responseData, other.getResponseData())));
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
        if (getResponseMsj() != null) {
            _hashCode += getResponseMsj().hashCode();
        }
        if (getResponseData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseData(), i);
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
        new org.apache.axis.description.TypeDesc(QueryproductResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "queryproductResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseMsj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "ResponseMsj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "ResponseMsj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService/types", "product"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
