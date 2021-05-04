package Entities;

public class CampaignManager implements CampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println("Kampanya Eklendi:"+ campaign.getCampaignName());
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println("Kampanya Silindi:"+ campaign.getCampaignName());
		
	}

	@Override
	public void changeExhibitionDate(Campaign campaign) {
		System.out.println("Kampanya Kullanım Süresi Değiştirildi");	
	}

}
