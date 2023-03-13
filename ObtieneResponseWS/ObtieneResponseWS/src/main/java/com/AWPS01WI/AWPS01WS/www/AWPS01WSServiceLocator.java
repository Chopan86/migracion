/**
 * AWPS01WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AWPS01WI.AWPS01WS.www;

public class AWPS01WSServiceLocator extends org.apache.axis.client.Service implements com.AWPS01WI.AWPS01WS.www.AWPS01WSService {

    public AWPS01WSServiceLocator() {
    }


    public AWPS01WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWPS01WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWPS01WSPort
    private java.lang.String AWPS01WSPort_address = "http://esb2.ctc.cl:8081/services/consultaPSporLinea";

    public java.lang.String getAWPS01WSPortAddress() {
        return AWPS01WSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWPS01WSPortWSDDServiceName = "AWPS01WSPort";

    public java.lang.String getAWPS01WSPortWSDDServiceName() {
        return AWPS01WSPortWSDDServiceName;
    }

    public void setAWPS01WSPortWSDDServiceName(java.lang.String name) {
        AWPS01WSPortWSDDServiceName = name;
    }

    public com.AWPS01WI.AWPS01WS.www.AWPS01WSPort getAWPS01WSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWPS01WSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWPS01WSPort(endpoint);
    }

    public com.AWPS01WI.AWPS01WS.www.AWPS01WSPort getAWPS01WSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AWPS01WI.AWPS01WS.www.AWPS01WSHTTPSoapBindingStub _stub = new com.AWPS01WI.AWPS01WS.www.AWPS01WSHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAWPS01WSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWPS01WSPortEndpointAddress(java.lang.String address) {
        AWPS01WSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AWPS01WI.AWPS01WS.www.AWPS01WSPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AWPS01WI.AWPS01WS.www.AWPS01WSHTTPSoapBindingStub _stub = new com.AWPS01WI.AWPS01WS.www.AWPS01WSHTTPSoapBindingStub(new java.net.URL(AWPS01WSPort_address), this);
                _stub.setPortName(getAWPS01WSPortWSDDServiceName());
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
        if ("AWPS01WSPort".equals(inputPortName)) {
            return getAWPS01WSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.com", "AWPS01WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.AWPS01WS.AWPS01WI.com", "AWPS01WSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWPS01WSPort".equals(portName)) {
            setAWPS01WSPortEndpointAddress(address);
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
