package javaReactDay3Hw;

public class UserManager {
	
	public void login(User user) {
		System.out.println("Logged in to the site: " + user.getFirstName() + user.getLastName());
	}
	
	public void loginMultiple(User[] users) {
		for(User user : users) {
			login(user);
		}
	}

	

}
