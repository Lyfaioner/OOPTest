package Entities;

public class GameManager implements GameService{

	@Override
	public void Add(Game game) {
		System.out.println("Oyun Eklendi:" + game.getGameName());
		
	}

	@Override
	public void Del(Game game) {
		System.out.println("Oyun Silindi:" + game.getGameName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun Güncellendi:" + game.getGameName());
		
	}

}
