/**
 * ACCPSPWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ACCPSPWI.ACCPSPWS.www;

public class ACCPSPWSServiceLocator extends org.apache.axis.client.Service implements com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSService {

    public ACCPSPWSServiceLocator() {
    }


    public ACCPSPWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ACCPSPWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ACCPSPWSPort
    private java.lang.String ACCPSPWSPort_address = "http://esb.ctc.cl/services/ConsultaPSPrincipalesLineas";

    public java.lang.String getACCPSPWSPortAddress() {
        return ACCPSPWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ACCPSPWSPortWSDDServiceName = "ACCPSPWSPort";

    public java.lang.String getACCPSPWSPortWSDDServiceName() {
        return ACCPSPWSPortWSDDServiceName;
    }

    public void setACCPSPWSPortWSDDServiceName(java.lang.String name) {
        ACCPSPWSPortWSDDServiceName = name;
    }

    public com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort getACCPSPWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ACCPSPWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getACCPSPWSPort(endpoint);
    }

    public com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort getACCPSPWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSHTTPSoapBindingStub _stub = new com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSHTTPSoapBindingStub(portAddress, this);
            _stub.setPortName(getACCPSPWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setACCPSPWSPortEndpointAddress(java.lang.String address) {
        ACCPSPWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSHTTPSoapBindingStub _stub = new com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSHTTPSoapBindingStub(new java.net.URL(ACCPSPWSPort_address), this);
                _stub.setPortName(getACCPSPWSPortWSDDServiceName());
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
        if ("ACCPSPWSPort".equals(inputPortName)) {
            return getACCPSPWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.com", "ACCPSPWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.ACCPSPWS.ACCPSPWI.com", "ACCPSPWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ACCPSPWSPort".equals(portName)) {
            setACCPSPWSPortEndpointAddress(address);
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
