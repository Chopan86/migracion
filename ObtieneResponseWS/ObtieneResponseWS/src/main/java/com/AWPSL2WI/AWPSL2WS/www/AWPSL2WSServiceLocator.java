/**
 * AWPSL2WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AWPSL2WI.AWPSL2WS.www;

public class AWPSL2WSServiceLocator extends org.apache.axis.client.Service implements com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSService {

    public AWPSL2WSServiceLocator() {
    }


    public AWPSL2WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWPSL2WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWPSL2WSPort
    private java.lang.String AWPSL2WSPort_address = "http://esb.ctc.cl/services/ListaPSFrontEnd";

    public java.lang.String getAWPSL2WSPortAddress() {
        return AWPSL2WSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWPSL2WSPortWSDDServiceName = "AWPSL2WSPort";

    public java.lang.String getAWPSL2WSPortWSDDServiceName() {
        return AWPSL2WSPortWSDDServiceName;
    }

    public void setAWPSL2WSPortWSDDServiceName(java.lang.String name) {
        AWPSL2WSPortWSDDServiceName = name;
    }

    public com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSPort getAWPSL2WSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWPSL2WSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWPSL2WSPort(endpoint);
    }

    public com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSPort getAWPSL2WSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSHTTPSoapBindingStub _stub = new com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAWPSL2WSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWPSL2WSPortEndpointAddress(java.lang.String address) {
        AWPSL2WSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSHTTPSoapBindingStub _stub = new com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSHTTPSoapBindingStub(new java.net.URL(AWPSL2WSPort_address), this);
                _stub.setPortName(getAWPSL2WSPortWSDDServiceName());
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
        if ("AWPSL2WSPort".equals(inputPortName)) {
            return getAWPSL2WSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.com", "AWPSL2WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.AWPSL2WS.AWPSL2WI.com", "AWPSL2WSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWPSL2WSPort".equals(portName)) {
            setAWPSL2WSPortEndpointAddress(address);
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
