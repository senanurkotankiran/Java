package eCommerce;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.AmazonMailManagerAdapter;
import eCommerce.core.GoogleMailMAnagerAdapter;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		//UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
				User user2=new User(4, "Aytug", "Çakmak", "aytugcakmak@gmail.com", "123654", true);
				//userManager.add(user2);
				
				//User kaan = new User(2, "Kaan", "Yılmaz", "kaanyilmaz@gmail.com", "147258", false);
				//userManager.update(kaan);
				
				InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
				GoogleMailMAnagerAdapter googleMailManagerAdapter = new GoogleMailMAnagerAdapter();
				AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

				
				AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
				//authManager.register(user2);
				authManager.register(user2);
				UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
				
				userManager.getAll();
				//userManager.getAll();	
}
}
