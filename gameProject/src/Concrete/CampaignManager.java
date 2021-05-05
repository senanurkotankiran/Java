package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;


public class CampaignManager implements CampaignService {

	@Override
	public void campaignInformation(Campaign campaign) {
		
			System.out.println(" Yeni kampanyalar sisteme eklendi " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {

		System.out.println(" Yeni kampanyalar sistemde guncellenmistir " + campaign.getDiscount());
		
	}

	@Override
	public void finish(Campaign campaign) {

		System.out.println("Suresi doldugu icin kampanya bitmistir. " + campaign.getCampaignName());
		
	}


}
