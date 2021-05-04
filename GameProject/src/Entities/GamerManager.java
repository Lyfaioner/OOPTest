package Entities;

public class GamerManager implements GamerService{

	@Override
	public void Register(Gamer gamer) {
		System.out.println("Oyuncu Eklendi:" + gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi:"+ gamer.getFirstName() + gamer.getLastName());
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Oyuncu Bilgileri Güncellendi");
		
	}

}
