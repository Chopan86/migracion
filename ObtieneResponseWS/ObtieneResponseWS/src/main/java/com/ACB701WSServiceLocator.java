/**
 * ACB701WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public class ACB701WSServiceLocator extends org.apache.axis.client.Service implements com.ACB701WSService {

    public ACB701WSServiceLocator() {
    }


    public ACB701WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ACB701WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ACB701WSPort
    private java.lang.String ACB701WSPort_address = "http://esb.ctc.cl/services/ConsultaDatosClienteCuenta";

    public java.lang.String getACB701WSPortAddress() {
        return ACB701WSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ACB701WSPortWSDDServiceName = "ACB701WSPort";

    public java.lang.String getACB701WSPortWSDDServiceName() {
        return ACB701WSPortWSDDServiceName;
    }

    public void setACB701WSPortWSDDServiceName(java.lang.String name) {
        ACB701WSPortWSDDServiceName = name;
    }

    public com.ACB701WSPort_PortType getACB701WSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ACB701WSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getACB701WSPort(endpoint);
    }

    public com.ACB701WSPort_PortType getACB701WSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ACB701WSHTTPSoapBindingStub _stub = new com.ACB701WSHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getACB701WSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setACB701WSPortEndpointAddress(java.lang.String address) {
        ACB701WSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ACB701WSPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ACB701WSHTTPSoapBindingStub _stub = new com.ACB701WSHTTPSoapBindingStub(new java.net.URL(ACB701WSPort_address), this);
                _stub.setPortName(getACB701WSPortWSDDServiceName());
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
        if ("ACB701WSPort".equals(inputPortName)) {
            return getACB701WSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.com", "ACB701WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.ACB701WS.ACMB7WSI.com", "ACB701WSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ACB701WSPort".equals(portName)) {
            setACB701WSPortEndpointAddress(address);
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
