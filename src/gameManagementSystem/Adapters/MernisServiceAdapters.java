package gameManagementSystem;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements IMemberCheckService{

	@Override
	public boolean CheckIfRealMember(Member member) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()), member.getFirstName().toUpperCase() , 
					member.getLastName().toUpperCase(),member.getDateOfBirth());
			
		}catch (NumberFormatException | RemoteException e) {
			
			 e.printStackTrace();
		}
	
		
		return false;
	}

}
