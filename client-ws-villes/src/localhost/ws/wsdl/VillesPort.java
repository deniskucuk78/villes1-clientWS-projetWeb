/**
 * VillesPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ws.wsdl;

public interface VillesPort extends java.rmi.Remote {
    public localhost.ws.xsd.Ville getVilleByID(int id) throws java.rmi.RemoteException;
    public localhost.ws.xsd.Ville[] getVillesByCP(java.lang.String cp) throws java.rmi.RemoteException;
}
