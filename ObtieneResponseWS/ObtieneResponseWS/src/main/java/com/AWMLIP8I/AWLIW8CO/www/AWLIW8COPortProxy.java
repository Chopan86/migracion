package com.AWMLIP8I.AWLIW8CO.www;

public class AWLIW8COPortProxy implements com.AWMLIP8I.AWLIW8CO.www.AWLIW8COPort {
  private String _endpoint = null;
  private com.AWMLIP8I.AWLIW8CO.www.AWLIW8COPort aWLIW8COPort = null;
  
  public AWLIW8COPortProxy() {
    _initAWLIW8COPortProxy();
  }
  
  public AWLIW8COPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAWLIW8COPortProxy();
  }
  
  private void _initAWLIW8COPortProxy() {
    try {
      aWLIW8COPort = (new com.AWMLIP8I.AWLIW8CO.www.AWLIW8COServiceLocator()).getAWLIW8COPort();
      if (aWLIW8COPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aWLIW8COPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aWLIW8COPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aWLIW8COPort != null)
      ((javax.xml.rpc.Stub)aWLIW8COPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.AWMLIP8I.AWLIW8CO.www.AWLIW8COPort getAWLIW8COPort() {
    if (aWLIW8COPort == null)
      _initAWLIW8COPortProxy();
    return aWLIW8COPort;
  }
  
  public com.Response.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_salida AWLIW8COOperation(com.Request.AWMLIP8I.AWLIW8CO.www.ProgramInterfaceAwlip8Co_entrada awlip8Co_entrada) throws java.rmi.RemoteException{
    if (aWLIW8COPort == null)
      _initAWLIW8COPortProxy();
    return aWLIW8COPort.AWLIW8COOperation(awlip8Co_entrada);
  }
  
  
}