package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	public InMemoryUserDao() {
		super();
		User user1= new User(1, "Sena","Kotankiran","senakotankiran@gmail.com","123456",true);
		User user2= new User(2, "Furkan","Besirli","furkanbesirli@gmail.com","789564",true);
		User user3= new User(3, "Bade","Yılmaz","badeyilmaz@gmail.com","521486",true);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

	
	
	
	@Override
	public void add(User user) {
		users.add(user);
		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanici güncellendi " + user.getFullName());
		
	}

	@Override
	public void delete(int userId) {
		System.out.println("Kullanici silindi " + userId);
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}




	@Override
	public User get(String email) {
		User users = null;
		
		return users;
	}

}
