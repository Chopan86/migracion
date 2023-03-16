/**
 * AWLIW8COServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AWMLIP8I.AWLIW8CO.www;

public class AWLIW8COServiceLocator extends org.apache.axis.client.Service implements com.AWMLIP8I.AWLIW8CO.www.AWLIW8COService {

    public AWLIW8COServiceLocator() {
    }


    public AWLIW8COServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWLIW8COServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWLIW8COPort
    private java.lang.String AWLIW8COPort_address = "http://TCHMFPROD.ctc.cl:8080/services/listaPsLineaV8";

    public java.lang.String getAWLIW8COPortAddress() {
        return AWLIW8COPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWLIW8COPortWSDDServiceName = "AWLIW8COPort";

    public java.lang.String getAWLIW8COPortWSDDServiceName() {
        return AWLIW8COPortWSDDServiceName;
    }

    public void setAWLIW8COPortWSDDServiceName(java.lang.String name) {
        AWLIW8COPortWSDDServiceName = name;
    }

    public com.AWMLIP8I.AWLIW8CO.www.AWLIW8COPort getAWLIW8COPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWLIW8COPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWLIW8COPort(endpoint);
    }

    public com.AWMLIP8I.AWLIW8CO.www.AWLIW8COPort getAWLIW8COPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AWMLIP8I.AWLIW8CO.www.AWLIW8COHTTPSoapBindingStub _stub = new com.AWMLIP8I.AWLIW8CO.www.AWLIW8COHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAWLIW8COPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWLIW8COPortEndpointAddress(java.lang.String address) {
        AWLIW8COPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AWMLIP8I.AWLIW8CO.www.AWLIW8COPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AWMLIP8I.AWLIW8CO.www.AWLIW8COHTTPSoapBindingStub _stub = new com.AWMLIP8I.AWLIW8CO.www.AWLIW8COHTTPSoapBindingStub(new java.net.URL(AWLIW8COPort_address), this);
                _stub.setPortName(getAWLIW8COPortWSDDServiceName());
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
        if ("AWLIW8COPort".equals(inputPortName)) {
            return getAWLIW8COPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.com", "AWLIW8COService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.AWLIW8CO.AWMLIP8I.com", "AWLIW8COPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWLIW8COPort".equals(portName)) {
            setAWLIW8COPortEndpointAddress(address);
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
