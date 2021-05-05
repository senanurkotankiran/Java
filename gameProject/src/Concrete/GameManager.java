package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
	
	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getGameName() + " Fiyatı : " + game.getPrice());
		
	}

	public void addMultiple(Game[] games) {
		for(Game gameDondur : games) {
			add(gameDondur);
		}
	}
	
	@Override
	public void update(Game game) {
		System.out.println("Oyun icerigi guncellendi : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun sistemden kaldirildi! id : " + game.getId() + " Silinen oyun adi : " + game.getGameName());
		
	}

	

}
