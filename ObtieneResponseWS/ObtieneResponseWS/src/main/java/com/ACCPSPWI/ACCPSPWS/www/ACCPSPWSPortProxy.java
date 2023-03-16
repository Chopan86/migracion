package com.ACCPSPWI.ACCPSPWS.www;

public class ACCPSPWSPortProxy implements com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort {
  private String _endpoint = null;
  private com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort aCCPSPWSPort = null;
  
  public ACCPSPWSPortProxy() {
    _initACCPSPWSPortProxy();
  }
  
  public ACCPSPWSPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initACCPSPWSPortProxy();
  }
  
  private void _initACCPSPWSPortProxy() {
    try {
      aCCPSPWSPort = (new com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSServiceLocator()).getACCPSPWSPort();
      if (aCCPSPWSPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aCCPSPWSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aCCPSPWSPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aCCPSPWSPort != null)
      ((javax.xml.rpc.Stub)aCCPSPWSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSPort getACCPSPWSPort() {
    if (aCCPSPWSPort == null)
      _initACCPSPWSPortProxy();
    return aCCPSPWSPort;
  }
  
  public com.Response.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwo_salida ACCPSPWSOperation(com.Request.ACCPSPWI.ACCPSPWS.www.ProgramInterfaceAccpspwi_entradaAccpspwi_i_lineas[] accpspwi_entrada) throws java.rmi.RemoteException{
    if (aCCPSPWSPort == null)
      _initACCPSPWSPortProxy();
    return aCCPSPWSPort.ACCPSPWSOperation(accpspwi_entrada);
  }
  
  
}