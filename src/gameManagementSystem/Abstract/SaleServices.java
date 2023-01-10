package gameManagementSystem;

public interface SaleServices {
	
	void sale(Member member,Game game);
	
	void promotionalSale(Member member,Campaign campaign,Game game);

}
