package gameManagementSystem;



public class Main {

	public static void main(String[] args) {
		Member member = new Member(1, "İsmail", "Toy", "1111111111111", 2002);
		
		Member member2 = new Member(2,"İnci","....","11000000000",2001);
		
		Game game = new Game(1, "Crysis",50);
		Game game2 = new Game(2, "NFS Most Wanted",30);

		Campaign campaign = new Campaign(1, "Yeni oyuncuya özel");
	
		
		MemberManager manager = new MemberManager(new MernisServiceAdapters());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		BaseSaleManager baseSaleManager = new BaseSaleManager();
		
		
		manager.add(member2);
		
		gameManager.add(game);
		
		campaignManager.newCampaign(campaign);
		
		baseSaleManager.sale(member, game);
		
		baseSaleManager.promotionalSale(member2, campaign, game2);
		
		
		
		

	}

}
