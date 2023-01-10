package gameManagementSystem;

public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " İsimli yeni kampanyaya özel :" + " satın aldığınız ilk 3 oyun için %20 İndirimli");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "İsimli kampanya silindi");

		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ "İsimli kampanyanın indirimi %30 olarak güncellendi yeni fiyat :" + " " + campaign.getDiscountedPrice());

		
	}
	
	

}
