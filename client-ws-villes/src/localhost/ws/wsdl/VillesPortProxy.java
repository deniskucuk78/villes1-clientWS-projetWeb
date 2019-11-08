package localhost.ws.wsdl;

public class VillesPortProxy implements localhost.ws.wsdl.VillesPort {
  private String _endpoint = null;
  private localhost.ws.wsdl.VillesPort villesPort = null;
  
  public VillesPortProxy() {
    _initVillesPortProxy();
  }
  
  public VillesPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initVillesPortProxy();
  }
  
  private void _initVillesPortProxy() {
    try {
      villesPort = (new localhost.ws.wsdl.VillesServiceLocator()).getVillesPort();
      if (villesPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)villesPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)villesPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (villesPort != null)
      ((javax.xml.rpc.Stub)villesPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.ws.wsdl.VillesPort getVillesPort() {
    if (villesPort == null)
      _initVillesPortProxy();
    return villesPort;
  }
  
  public localhost.ws.xsd.Ville getVilleByID(int id) throws java.rmi.RemoteException{
    if (villesPort == null)
      _initVillesPortProxy();
    return villesPort.getVilleByID(id);
  }
  
  public localhost.ws.xsd.Ville[] getVillesByCP(java.lang.String cp) throws java.rmi.RemoteException{
    if (villesPort == null)
      _initVillesPortProxy();
    return villesPort.getVillesByCP(cp);
  }
  
  
}