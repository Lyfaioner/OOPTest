package Entities;

public class Sale {
	private int saleId;
	private int gameId;
	private int campaignId;
	private int id;
	private Double price;
	public Sale() {};
	
	public Sale(int saleId, int gameId, int campaignId, int id, Double price) {
		super();
		this.saleId = saleId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.id = id;
		this.price = price;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
