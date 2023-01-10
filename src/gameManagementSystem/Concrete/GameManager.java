package gameManagementSystem;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + "  " + "Adlı oyun : " + game.getPrice() + " TL " +  " fiyatıyla sisteme eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "Adlı oyunun fiyatı güncellendi yeni fiyat : " + game.getPrice() );
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "Adlı oyun sistemden silindi");
	}

}
