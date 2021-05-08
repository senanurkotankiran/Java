package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstarcts.UserService;
import eCommerce.core.EmailService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailService emailService;
	
	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;

	}

	@Override
	public void add(User user) {
	
			userDao.add(user);
			System.out.println("Log: " + user.getePosta());
			emailService.send(user.getePosta(), "Kayit oldunuz");
	
		
		
	}
	
	@Override
	public void add(String email) {
		
			User user =new User();
			user.setePosta(email);
			userDao.add(user);
			System.out.println("Log2: " + user.getePosta());
			emailService.send(email,"Kayıt oldunuz.");
			
	}

	@Override
	public void update(User user) {
		if(userValidate(user)) {
			userDao.update(user);
		}
		
	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);
		
	}

	@Override
	public List<User> getAll() {
		
		for (User user : userDao.getAll()) {
			System.out.println(user.getId()  + " " + user.getePosta() + " " + user.getFullName());
		}
		return userDao.getAll();
	}

	@Override
	public User get(String email) {
		
		
		return userDao.get(email);
	}
	
	public boolean userValidate(User user) {
		
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
			
		} else {
			System.out.println("Adiniz ve soyadınız minimum 2 karakter olmali.");
			return false;
		}
	}

	

}
