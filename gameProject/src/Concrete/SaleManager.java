package Concrete;

import Abstract.SaleService;
import Abstract.VerificationService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class SaleManager implements SaleService{

	VerificationService verificationService;
    public SaleManager(VerificationService verificationService) {
        this.verificationService = verificationService;

    }
	@Override
	public void sell(Gamer gamer, Game game, Sale sale, Campaign campaign) {
		  if(verificationService.confirmed(gamer) && campaign != null) {
			  
			  double salePrice= game.getPrice() - (game.getPrice()*campaign.getDiscount()/100) ;
			  
	            System.out.println(gamer.getFirstName() + " "+ gamer.getLastName() +" ( "+ gamer.getUsername()+ " ) kullanicisi "+ game.getGameName()+ " oyununu satin aldi. "
	            		+ "Uygulanan kampanya : "+ campaign.getCampaignName()+ " Sepet tutariniz : " + salePrice);


	        }else if(verificationService.confirmed(gamer) && campaign == null) {
	        	System.out.println("Satin alma basarili fakat uygun kampanya bulunumadi. Seper tutariniz : " + game.getPrice());
	        }
		  else {
	            System.out.println("Kullanici dogrulanamadigi icin oyununu satin alma islemi basarisiz oldu.");

	        }
		
	}

		
	}

