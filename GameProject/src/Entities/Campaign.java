package Entities;

public class Campaign {
	private int campaignId;
	private String campaignName;
	private String campaignExhibitionDate;
	
	public Campaign () {};
	public Campaign(int campaignId, String campaignName, String campaignExhibitionDate) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignExhibitionDate = campaignExhibitionDate;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampaignExhibitionDate() {
		return campaignExhibitionDate;
	}
	public void setCampaignExhibitionDate(String campaignExhibitionDate) {
		this.campaignExhibitionDate = campaignExhibitionDate;
	}
}
