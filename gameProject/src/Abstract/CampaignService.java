package Abstract;

import Entities.Campaign;

public interface CampaignService {
	
	void campaignInformation(Campaign campaign);
	void update(Campaign campaign);
	void finish(Campaign campaign);
}
