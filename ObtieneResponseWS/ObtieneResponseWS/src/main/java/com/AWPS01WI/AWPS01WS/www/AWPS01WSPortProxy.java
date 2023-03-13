package com.AWPS01WI.AWPS01WS.www;

public class AWPS01WSPortProxy implements com.AWPS01WI.AWPS01WS.www.AWPS01WSPort {
  private String _endpoint = null;
  private com.AWPS01WI.AWPS01WS.www.AWPS01WSPort aWPS01WSPort = null;
  
  public AWPS01WSPortProxy() {
    _initAWPS01WSPortProxy();
  }
  
  public AWPS01WSPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAWPS01WSPortProxy();
  }
  
  private void _initAWPS01WSPortProxy() {
    try {
      aWPS01WSPort = (new com.AWPS01WI.AWPS01WS.www.AWPS01WSServiceLocator()).getAWPS01WSPort();
      if (aWPS01WSPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aWPS01WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aWPS01WSPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aWPS01WSPort != null)
      ((javax.xml.rpc.Stub)aWPS01WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AWPS01WI.AWPS01WS.www.AWPS01WSPort getAWPS01WSPort() {
    if (aWPS01WSPort == null)
      _initAWPS01WSPortProxy();
    return aWPS01WSPort;
  }
  
  public com.Response.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_salida AWPS01WSOperation(com.Request.AWPS01WI.AWPS01WS.www.ProgramInterfaceAwps01Co_entrada awps01Co_entrada) throws java.rmi.RemoteException{
    if (aWPS01WSPort == null)
      _initAWPS01WSPortProxy();
    return aWPS01WSPort.AWPS01WSOperation(awps01Co_entrada);
  }
  
  
}