package Entities;

public class Main {

	public static void main(String[] args) {
		GameManager gamemanager = new GameManager();
		Game game1= new Game();
		game1.setGameId(1);
		game1.setGameName("GTA5");
		
		gamemanager.Add(game1);
		gamemanager.Del(game1);
		gamemanager.Update(game1);
		
		System.out.println("------");
		
		Campaign campaign1= new Campaign(1, "Süper İndirim","30 Day");
		CampaignManager campaignmanager= new CampaignManager();
		campaignmanager.Add(campaign1);
		campaignmanager.Delete(campaign1);
		
		System.out.println("------");
		
		Sale sale1 = new Sale(1, 1, 1,1,144.2);
		SaleManager salemanager= new SaleManager();
		salemanager.Add(sale1);
	}

}
