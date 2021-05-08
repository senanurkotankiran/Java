package eCommerce.core;

import eCommerce.googleEmailService.GoogleMailManager;

public class GoogleMailMAnagerAdapter implements EmailService {

	private GoogleMailManager googleMailManager;
	
	public GoogleMailMAnagerAdapter() {
		this.googleMailManager = new GoogleMailManager();
	}
	
	@Override
	public void send(String email, String message) {	
		googleMailManager.send(email, message);
	}

}
