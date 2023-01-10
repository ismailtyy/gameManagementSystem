package gameManagementSystem;

public class BaseSaleManager implements SaleServices{
	@Override
	public void sale(Member member,Game game) {
		System.out.println("Değerli üyemiz sayın : " + member.getFirstName() + " " + member.getLastName() + " : " + game.getGameName() +" " +"Adlı oyunu aldı");
		
	}
	
	@Override
	public void promotionalSale(Member member,Campaign campaign,Game game) {
		System.out.println(member.getFirstName()+" adlı üyeye : " + "  " +campaign.getCampaignName()+" kampanyasıyla "
	+game.getGameName()+"oyunu satıldı");
	}

}
