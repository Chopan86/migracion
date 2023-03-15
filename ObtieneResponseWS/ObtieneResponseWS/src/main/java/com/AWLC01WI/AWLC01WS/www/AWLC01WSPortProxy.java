package com.AWLC01WI.AWLC01WS.www;

public class AWLC01WSPortProxy implements com.AWLC01WI.AWLC01WS.www.AWLC01WSPort {
  private String _endpoint = null;
  private com.AWLC01WI.AWLC01WS.www.AWLC01WSPort aWLC01WSPort = null;
  
  public AWLC01WSPortProxy() {
    _initAWLC01WSPortProxy();
  }
  
  public AWLC01WSPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAWLC01WSPortProxy();
  }
  
  private void _initAWLC01WSPortProxy() {
    try {
      aWLC01WSPort = (new com.AWLC01WI.AWLC01WS.www.AWLC01WSServiceLocator()).getAWLC01WSPort();
      if (aWLC01WSPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aWLC01WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aWLC01WSPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aWLC01WSPort != null)
      ((javax.xml.rpc.Stub)aWLC01WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AWLC01WI.AWLC01WS.www.AWLC01WSPort getAWLC01WSPort() {
    if (aWLC01WSPort == null)
      _initAWLC01WSPortProxy();
    return aWLC01WSPort;
  }
  
  public com.Response.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_salida AWLC01WSOperation(com.Request.AWLC01WI.AWLC01WS.www.ProgramInterfaceAwlc01Z3_entrada awlc01Z3_entrada) throws java.rmi.RemoteException{
    if (aWLC01WSPort == null)
      _initAWLC01WSPortProxy();
    return aWLC01WSPort.AWLC01WSOperation(awlc01Z3_entrada);
  }
  
  
}