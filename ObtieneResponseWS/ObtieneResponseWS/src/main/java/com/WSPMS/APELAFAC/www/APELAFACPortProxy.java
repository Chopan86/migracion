package com.WSPMS.APELAFAC.www;

public class APELAFACPortProxy implements com.WSPMS.APELAFAC.www.APELAFACPort {
  private String _endpoint = null;
  private com.WSPMS.APELAFAC.www.APELAFACPort aPELAFACPort = null;
  
  public APELAFACPortProxy() {
    _initAPELAFACPortProxy();
  }
  
  public APELAFACPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAPELAFACPortProxy();
  }
  
  private void _initAPELAFACPortProxy() {
    try {
      aPELAFACPort = (new com.WSPMS.APELAFAC.www.APELAFACServiceLocator()).getAPELAFACPort();
      if (aPELAFACPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aPELAFACPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aPELAFACPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aPELAFACPort != null)
      ((javax.xml.rpc.Stub)aPELAFACPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.WSPMS.APELAFAC.www.APELAFACPort getAPELAFACPort() {
    if (aPELAFACPort == null)
      _initAPELAFACPortProxy();
    return aPELAFACPort;
  }
  
  public com.Response.WSPMS.APELAFAC.www.ProgramInterfaceApel_afac_pms_o APELAFACOperation(com.Request.WSPMS.APELAFAC.www.ProgramInterfaceApel_afac_pms_i apel_afac_pms_i) throws java.rmi.RemoteException{
    if (aPELAFACPort == null)
      _initAPELAFACPortProxy();
    return aPELAFACPort.APELAFACOperation(apel_afac_pms_i);
  }
  
  
}