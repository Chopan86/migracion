/**
 * QueryproductServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.telefonica.midrange.queryproductService;

public class QueryproductServiceLocator extends org.apache.axis.client.Service implements com.telefonica.midrange.queryproductService.QueryproductService {

    public QueryproductServiceLocator() {
    }


    public QueryproductServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryproductServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for queryproduct
    private java.lang.String queryproduct_address = "http://localhost:8080/QueryProductWEB/services/queryproduct";

    public java.lang.String getqueryproductAddress() {
        return queryproduct_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String queryproductWSDDServiceName = "queryproduct";

    public java.lang.String getqueryproductWSDDServiceName() {
        return queryproductWSDDServiceName;
    }

    public void setqueryproductWSDDServiceName(java.lang.String name) {
        queryproductWSDDServiceName = name;
    }

    public com.telefonica.midrange.queryproductService.QueryproductPortType getqueryproduct() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(queryproduct_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getqueryproduct(endpoint);
    }

    public com.telefonica.midrange.queryproductService.QueryproductPortType getqueryproduct(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.telefonica.midrange.queryproductService.QueryproductBindingStub _stub = new com.telefonica.midrange.queryproductService.QueryproductBindingStub(portAddress, this);
            _stub.setPortName(getqueryproductWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setqueryproductEndpointAddress(java.lang.String address) {
        queryproduct_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.telefonica.midrange.queryproductService.QueryproductPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.telefonica.midrange.queryproductService.QueryproductBindingStub _stub = new com.telefonica.midrange.queryproductService.QueryproductBindingStub(new java.net.URL(queryproduct_address), this);
                _stub.setPortName(getqueryproductWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("queryproduct".equals(inputPortName)) {
            return getqueryproduct();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService", "queryproductService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://midrange.telefonica.com/queryproductService", "queryproduct"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("queryproduct".equals(portName)) {
            setqueryproductEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
