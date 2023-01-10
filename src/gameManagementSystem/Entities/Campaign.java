package gameManagementSystem;

public class Campaign {
	private int id;
	private String campaignName;
	private int discountedPrice;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName) {
		this.id = id;
		this.campaignName = campaignName;
		this.discountedPrice = discountedPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

}
