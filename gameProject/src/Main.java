import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.VerificationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;


public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1,"House Flipper",30);
		Game game2 = new Game(2,"Paper Please",18);
		Game game3 = new Game(3,"Portal 2",60);
		
		Game[] games = {game1, game2, game3};		
		
		GameManager gameManager = new GameManager();
		gameManager.addMultiple(games);
		gameManager.update(game2);
		gameManager.delete(game3);
		
		System.out.println("==================================================================");
		
		Gamer gamer1 = new Gamer(1,"Sena","Kotankiran","12345678901","srskk12@gmail.com","sena","123456","12.02.2002");
		Gamer gamer2 = new Gamer(2,"Furkan","Besirli","23564789451","frkNNN@gmail.com","furkan","654321","29.01.2002");
		Gamer gamer3 = new Gamer(3,"Bade","","48754874","bade@gmail.com","bade","4587551","12.03.2030");
		
		Gamer[] gamers = {gamer1, gamer2};
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.registerMultiple(gamers);
		gamerManager.update(gamer2);
		gamerManager.delete(gamer1);
		
		System.out.println("==================================================================");
		
		Campaign campaign1 = new Campaign(1,"Yeni Sezon Kampanyası",10);
		Campaign campaign2 = new Campaign(2,"Sezon Sonu Kampanyası",20);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignInformation(campaign1);
		campaignManager.campaignInformation(campaign2);
		
		
		System.out.println("==================================================================");

		Sale sale1 = new Sale(1);
		Sale sale2 = new Sale(2);
		Sale sale3 = new Sale(3);
		
		SaleManager saleManager  = new SaleManager(new VerificationManager());
		saleManager.sell(gamer1, game1, sale1,campaign1);
		saleManager.sell(gamer2, game3, sale2, null);
		saleManager.sell(gamer3, game2, sale3, campaign2);
	}

}
