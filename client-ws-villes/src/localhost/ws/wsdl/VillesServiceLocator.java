/**
 * VillesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ws.wsdl;

public class VillesServiceLocator extends org.apache.axis.client.Service implements localhost.ws.wsdl.VillesService {

    public VillesServiceLocator() {
    }


    public VillesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VillesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VillesPort
    private java.lang.String VillesPort_address = "http://www.webservices.antislashn.org/villes_ws.php";

    public java.lang.String getVillesPortAddress() {
        return VillesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VillesPortWSDDServiceName = "VillesPort";

    public java.lang.String getVillesPortWSDDServiceName() {
        return VillesPortWSDDServiceName;
    }

    public void setVillesPortWSDDServiceName(java.lang.String name) {
        VillesPortWSDDServiceName = name;
    }

    public localhost.ws.wsdl.VillesPort getVillesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VillesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVillesPort(endpoint);
    }

    public localhost.ws.wsdl.VillesPort getVillesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.ws.wsdl.VillesBindingStub _stub = new localhost.ws.wsdl.VillesBindingStub(portAddress, this);
            _stub.setPortName(getVillesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVillesPortEndpointAddress(java.lang.String address) {
        VillesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.ws.wsdl.VillesPort.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.ws.wsdl.VillesBindingStub _stub = new localhost.ws.wsdl.VillesBindingStub(new java.net.URL(VillesPort_address), this);
                _stub.setPortName(getVillesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("VillesPort".equals(inputPortName)) {
            return getVillesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.localhost/wsdl", "VillesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.localhost/wsdl", "VillesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VillesPort".equals(portName)) {
            setVillesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
