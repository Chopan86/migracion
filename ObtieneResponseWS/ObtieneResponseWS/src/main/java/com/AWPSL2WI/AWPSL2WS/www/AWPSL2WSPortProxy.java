package com.AWPSL2WI.AWPSL2WS.www;

public class AWPSL2WSPortProxy implements com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSPort {
  private String _endpoint = null;
  private com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSPort aWPSL2WSPort = null;
  
  public AWPSL2WSPortProxy() {
    _initAWPSL2WSPortProxy();
  }
  
  public AWPSL2WSPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAWPSL2WSPortProxy();
  }
  
  private void _initAWPSL2WSPortProxy() {
    try {
      aWPSL2WSPort = (new com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSServiceLocator()).getAWPSL2WSPort();
      if (aWPSL2WSPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aWPSL2WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aWPSL2WSPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aWPSL2WSPort != null)
      ((javax.xml.rpc.Stub)aWPSL2WSPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSPort getAWPSL2WSPort() {
    if (aWPSL2WSPort == null)
      _initAWPSL2WSPortProxy();
    return aWPSL2WSPort;
  }
  
  public com.Response.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wo AWPSL2WSOperation(com.Request.AWPSL2WI.AWPSL2WS.www.ProgramInterfaceAwpsl2Wi awpsl2Wi) throws java.rmi.RemoteException{
    if (aWPSL2WSPort == null)
      _initAWPSL2WSPortProxy();
    return aWPSL2WSPort.AWPSL2WSOperation(awpsl2Wi);
  }
  
  
}