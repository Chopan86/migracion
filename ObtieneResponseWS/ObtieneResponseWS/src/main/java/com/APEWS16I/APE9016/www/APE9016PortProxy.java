package com.APEWS16I.APE9016.www;

public class APE9016PortProxy implements com.APEWS16I.APE9016.www.APE9016Port {
  private String _endpoint = null;
  private com.APEWS16I.APE9016.www.APE9016Port aPE9016Port = null;
  
  public APE9016PortProxy() {
    _initAPE9016PortProxy();
  }
  
  public APE9016PortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPE9016PortProxy();
  }
  
  private void _initAPE9016PortProxy() {
    try {
      aPE9016Port = (new com.APEWS16I.APE9016.www.APE9016ServiceLocator()).getAPE9016Port();
      if (aPE9016Port != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPE9016Port)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPE9016Port)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPE9016Port != null)
      ((javax.xml.rpc.Stub)aPE9016Port)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.APEWS16I.APE9016.www.APE9016Port getAPE9016Port() {
    if (aPE9016Port == null)
      _initAPE9016PortProxy();
    return aPE9016Port;
  }
  
  public com.Response.APEWS16I.APE9016.www.ProgramInterfaceMso_registro APE9016Operation(com.Request.APEWS16I.APE9016.www.ProgramInterfaceMsi_registro msi_registro) throws java.rmi.RemoteException{
    if (aPE9016Port == null)
      _initAPE9016PortProxy();
    return aPE9016Port.APE9016Operation(msi_registro);
  }
  
  
}