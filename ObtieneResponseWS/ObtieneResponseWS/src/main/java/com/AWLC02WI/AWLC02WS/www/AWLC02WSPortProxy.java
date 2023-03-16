package com.AWLC02WI.AWLC02WS.www;

public class AWLC02WSPortProxy implements com.AWLC02WI.AWLC02WS.www.AWLC02WSPort {
  private String _endpoint = null;
  private com.AWLC02WI.AWLC02WS.www.AWLC02WSPort aWLC02WSPort = null;
  
  public AWLC02WSPortProxy() {
    _initAWLC02WSPortProxy();
  }
  
  public AWLC02WSPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAWLC02WSPortProxy();
  }
  
  private void _initAWLC02WSPortProxy() {
    try {
      aWLC02WSPort = (new com.AWLC02WI.AWLC02WS.www.AWLC02WSServiceLocator()).getAWLC02WSPort();
      if (aWLC02WSPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aWLC02WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aWLC02WSPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aWLC02WSPort != null)
      ((javax.xml.rpc.Stub)aWLC02WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AWLC02WI.AWLC02WS.www.AWLC02WSPort getAWLC02WSPort() {
    if (aWLC02WSPort == null)
      _initAWLC02WSPortProxy();
    return aWLC02WSPort;
  }
  
  public com.Response.AWLC02WI.AWLC02WS.www.ProgramInterfaceAwlc02Wo_salida AWLC02WSOperation(com.Request.AWLC02WI.AWLC02WS.www.ProgramInterfaceAwlc02Wi_entrada awlc02Wi_entrada) throws java.rmi.RemoteException{
    if (aWLC02WSPort == null)
      _initAWLC02WSPortProxy();
    return aWLC02WSPort.AWLC02WSOperation(awlc02Wi_entrada);
  }
  
  
}