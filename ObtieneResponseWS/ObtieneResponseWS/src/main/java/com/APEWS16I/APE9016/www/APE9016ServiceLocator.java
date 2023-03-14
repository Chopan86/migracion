/**
 * APE9016ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.APEWS16I.APE9016.www;

public class APE9016ServiceLocator extends org.apache.axis.client.Service implements com.APEWS16I.APE9016.www.APE9016Service {

    public APE9016ServiceLocator() {
    }


    public APE9016ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public APE9016ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for APE9016Port
    private java.lang.String APE9016Port_address = "http://TCHMFPROD.ctc.cl:8080/services/consultaApelAlturas";

    public java.lang.String getAPE9016PortAddress() {
        return APE9016Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String APE9016PortWSDDServiceName = "APE9016Port";

    public java.lang.String getAPE9016PortWSDDServiceName() {
        return APE9016PortWSDDServiceName;
    }

    public void setAPE9016PortWSDDServiceName(java.lang.String name) {
        APE9016PortWSDDServiceName = name;
    }

    public com.APEWS16I.APE9016.www.APE9016Port getAPE9016Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(APE9016Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAPE9016Port(endpoint);
    }

    public com.APEWS16I.APE9016.www.APE9016Port getAPE9016Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.APEWS16I.APE9016.www.APE9016HTTPSoapBindingStub _stub = new com.APEWS16I.APE9016.www.APE9016HTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getAPE9016PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAPE9016PortEndpointAddress(java.lang.String address) {
        APE9016Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.APEWS16I.APE9016.www.APE9016Port.class.isAssignableFrom(serviceEndpointInterface)) {
                com.APEWS16I.APE9016.www.APE9016HTTPSoapBindingStub _stub = new com.APEWS16I.APE9016.www.APE9016HTTPSoapBindingStub(new java.net.URL(APE9016Port_address), this);
                _stub.setPortName(getAPE9016PortWSDDServiceName());
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
        if ("APE9016Port".equals(inputPortName)) {
            return getAPE9016Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.com", "APE9016Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.APE9016.APEWS16I.com", "APE9016Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("APE9016Port".equals(portName)) {
            setAPE9016PortEndpointAddress(address);
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
