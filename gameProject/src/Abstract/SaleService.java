package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public interface SaleService {
	void sell(Gamer gamer, Game game, Sale sale,Campaign campaign);
}
