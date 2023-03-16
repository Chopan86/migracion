package com.telefonica.midrange.queryproductService;

public class QueryproductPortTypeProxy implements com.telefonica.midrange.queryproductService.QueryproductPortType {
  private String _endpoint = null;
  private com.telefonica.midrange.queryproductService.QueryproductPortType queryproductPortType = null;
  
  public QueryproductPortTypeProxy() {
    _initQueryproductPortTypeProxy();
  }
  
  public QueryproductPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryproductPortTypeProxy();
  }
  
  private void _initQueryproductPortTypeProxy() {
    try {
      queryproductPortType = (new com.telefonica.midrange.queryproductService.QueryproductServiceLocator()).getqueryproduct();
      if (queryproductPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryproductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryproductPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryproductPortType != null)
      ((javax.xml.rpc.Stub)queryproductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.telefonica.midrange.queryproductService.QueryproductPortType getQueryproductPortType() {
    if (queryproductPortType == null)
      _initQueryproductPortTypeProxy();
    return queryproductPortType;
  }
  
  public com.telefonica.midrange.queryproductService.types.QueryproductResponse consultaQueryProduct(com.telefonica.midrange.queryproductService.types.QueryproductRequest consultaQueryProductRequestParameter) throws java.rmi.RemoteException{
    if (queryproductPortType == null)
      _initQueryproductPortTypeProxy();
    return queryproductPortType.consultaQueryProduct(consultaQueryProductRequestParameter);
  }
  
  
}