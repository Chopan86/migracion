/**
 * AWLC01WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.AWLC01WI.AWLC01WS.www;

public class AWLC01WSServiceLocator extends org.apache.axis.client.Service implements com.AWLC01WI.AWLC01WS.www.AWLC01WSService {

    public AWLC01WSServiceLocator() {
    }


    public AWLC01WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWLC01WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWLC01WSPort
    private java.lang.String AWLC01WSPort_address = "http://esb0.ctc.cl:8082/services/consultaClienteRutLinea";

    public java.lang.String getAWLC01WSPortAddress() {
        return AWLC01WSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWLC01WSPortWSDDServiceName = "AWLC01WSPort";

    public java.lang.String getAWLC01WSPortWSDDServiceName() {
        return AWLC01WSPortWSDDServiceName;
    }

    public void setAWLC01WSPortWSDDServiceName(java.lang.String name) {
        AWLC01WSPortWSDDServiceName = name;
    }

    public com.AWLC01WI.AWLC01WS.www.AWLC01WSPort getAWLC01WSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWLC01WSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWLC01WSPort(endpoint);
    }

    public com.AWLC01WI.AWLC01WS.www.AWLC01WSPort getAWLC01WSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub _stub = new com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAWLC01WSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWLC01WSPortEndpointAddress(java.lang.String address) {
        AWLC01WSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.AWLC01WI.AWLC01WS.www.AWLC01WSPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub _stub = new com.AWLC01WI.AWLC01WS.www.AWLC01WSHTTPSoapBindingStub(new java.net.URL(AWLC01WSPort_address), this);
                _stub.setPortName(getAWLC01WSPortWSDDServiceName());
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
        if ("AWLC01WSPort".equals(inputPortName)) {
            return getAWLC01WSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.com", "AWLC01WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.AWLC01WS.AWLC01WI.com", "AWLC01WSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWLC01WSPort".equals(portName)) {
            setAWLC01WSPortEndpointAddress(address);
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
