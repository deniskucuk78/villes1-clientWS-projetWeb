import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import localhost.ws.wsdl.VillesPort;
import localhost.ws.wsdl.VillesService;
import localhost.ws.wsdl.VillesServiceLocator;
import localhost.ws.xsd.Ville;

public class MainClientWS {

	public static void main(String[] args) throws ServiceException, RemoteException {
		
		VillesService service = new VillesServiceLocator();
		VillesPort port = service.getVillesPort();
		Ville v1 = port.getVilleByID(2056);
		Ville[] villes = port.getVillesByCP("972");
		System.out.println(v1.getNom()+ " - " + v1.getCodePostal());
		for (Ville v : villes)
		{
			System.out.println(v.getNom()+ " - " + v.getCodePostal());
		}
		
		
	}

}
