/**
 * APELAFACServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.WSPMS.APELAFAC.www;

public class APELAFACServiceLocator extends org.apache.axis.client.Service implements com.WSPMS.APELAFAC.www.APELAFACService {

    public APELAFACServiceLocator() {
    }


    public APELAFACServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public APELAFACServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for APELAFACPort
    private java.lang.String APELAFACPort_address = "http://esbd3.tchile.local:6060/F/services/PMSServices";

    public java.lang.String getAPELAFACPortAddress() {
        return APELAFACPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APELAFACPortWSDDServiceName = "APELAFACPort";

    public java.lang.String getAPELAFACPortWSDDServiceName() {
        return APELAFACPortWSDDServiceName;
    }

    public void setAPELAFACPortWSDDServiceName(java.lang.String name) {
        APELAFACPortWSDDServiceName = name;
    }

    public com.WSPMS.APELAFAC.www.APELAFACPort getAPELAFACPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APELAFACPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPELAFACPort(endpoint);
    }

    public com.WSPMS.APELAFAC.www.APELAFACPort getAPELAFACPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.WSPMS.APELAFAC.www.APELAFACHTTPSoapBindingStub _stub = new com.WSPMS.APELAFAC.www.APELAFACHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAPELAFACPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPELAFACPortEndpointAddress(java.lang.String address) {
        APELAFACPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.WSPMS.APELAFAC.www.APELAFACPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.WSPMS.APELAFAC.www.APELAFACHTTPSoapBindingStub _stub = new com.WSPMS.APELAFAC.www.APELAFACHTTPSoapBindingStub(new java.net.URL(APELAFACPort_address), this);
                _stub.setPortName(getAPELAFACPortWSDDServiceName());
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
        if ("APELAFACPort".equals(inputPortName)) {
            return getAPELAFACPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.APELAFAC.WSPMS.com", "APELAFACService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.APELAFAC.WSPMS.com", "APELAFACPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("APELAFACPort".equals(portName)) {
            setAPELAFACPortEndpointAddress(address);
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
