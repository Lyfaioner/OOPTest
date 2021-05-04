package Entities;

public class SaleManager implements SaleService{

	Game game=new Game();
	@Override
	public void Add(Sale sale) {
	System.out.println("Oyun Satışa Eklendi");	
		
	}

	@Override
	public void Remove(Sale sale) {
		System.out.println("Oyun Satıştan Kaldırıldı");
		
	}

	@Override
	public void changeSalePrice(Sale sale) {
		System.out.println("Oyunun satış fiyatı değiştirildi.");
		
	}

}
