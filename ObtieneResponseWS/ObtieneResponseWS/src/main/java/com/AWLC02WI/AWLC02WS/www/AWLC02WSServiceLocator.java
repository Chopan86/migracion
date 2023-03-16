/**
 * AWLC02WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AWLC02WI.AWLC02WS.www;

public class AWLC02WSServiceLocator extends org.apache.axis.client.Service implements com.AWLC02WI.AWLC02WS.www.AWLC02WSService {

    public AWLC02WSServiceLocator() {
    }


    public AWLC02WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWLC02WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWLC02WSPort
    private java.lang.String AWLC02WSPort_address = "http://esb.ctc.cl/services/consultaClienteRutLineaC";

    public java.lang.String getAWLC02WSPortAddress() {
        return AWLC02WSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWLC02WSPortWSDDServiceName = "AWLC02WSPort";

    public java.lang.String getAWLC02WSPortWSDDServiceName() {
        return AWLC02WSPortWSDDServiceName;
    }

    public void setAWLC02WSPortWSDDServiceName(java.lang.String name) {
        AWLC02WSPortWSDDServiceName = name;
    }

    public com.AWLC02WI.AWLC02WS.www.AWLC02WSPort getAWLC02WSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWLC02WSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWLC02WSPort(endpoint);
    }

    public com.AWLC02WI.AWLC02WS.www.AWLC02WSPort getAWLC02WSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AWLC02WI.AWLC02WS.www.AWLC02WSHTTPSoapBindingStub _stub = new com.AWLC02WI.AWLC02WS.www.AWLC02WSHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAWLC02WSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWLC02WSPortEndpointAddress(java.lang.String address) {
        AWLC02WSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AWLC02WI.AWLC02WS.www.AWLC02WSPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AWLC02WI.AWLC02WS.www.AWLC02WSHTTPSoapBindingStub _stub = new com.AWLC02WI.AWLC02WS.www.AWLC02WSHTTPSoapBindingStub(new java.net.URL(AWLC02WSPort_address), this);
                _stub.setPortName(getAWLC02WSPortWSDDServiceName());
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
        if ("AWLC02WSPort".equals(inputPortName)) {
            return getAWLC02WSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.com", "AWLC02WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.AWLC02WS.AWLC02WI.com", "AWLC02WSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWLC02WSPort".equals(portName)) {
            setAWLC02WSPortEndpointAddress(address);
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
