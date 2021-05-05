package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " sisteme kayıt edildi! sifre : " + 
		  gamer.getPassword() + " olmak uzere veri tabanina kaydedildi...");
		
	}

	public void registerMultiple(Gamer[] gamers) {
		for(Gamer gamerDondur : gamers) {
			register(gamerDondur);
		}
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgileriniz güncellendi : " + gamer.getUsername());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " kisisi sistemden silindi.");
		
	}

}
