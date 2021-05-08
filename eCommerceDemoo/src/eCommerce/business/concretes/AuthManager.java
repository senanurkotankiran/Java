package eCommerce.business.concretes;


import eCommerce.business.abstarcts.AuthService;
import eCommerce.business.abstarcts.UserService;
import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;

	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
		
	}
	
	@Override
	public void register(User user) {

		if(userValidate(user) 
				&& passwordValidate(user.getPassword())
				&& userExists(user.getePosta()) == false
				&& eCommerce.core.utils.Utils.emailValidate(user.getePosta())) {
			
			userService.add(user);

		}
		else {
			System.out.println("Kayit basarisiz");
		}
	}

	@Override
	public void verify(User user, String token) {
		if(user != null && token.length()>15) {
			
			User existUser  = userService.get(user.getePosta());
			existUser.setVerify(true);
			
			userService.update(existUser);
			System.out.println("Email dogrulandi");
		}
		else {
			System.out.println("Email dogrulanmadi");
		}
		
	}

	@Override
	public void login(LoginDto loginDto) {
		User user = userService.get(loginDto.getEmail());
		
		if(user != null && user.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Basariyla giris yaptiniz");
		}else {
			System.out.println("Eposta veya sifreniz yanlis!");
		}
	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);
		
		if(user == null) {
			return false;
		}	
		else {
			System.out.println("Email zaten mevcut. " + email);
			return true;
		}
		
	}
	
	public boolean userValidate(User user) {
		
		if(user != null 
				&& !user.getFirstName().isEmpty() 
				&& !user.getLastName().isEmpty()
				&& !user.getePosta().isEmpty()
				&& !user.getPassword().isEmpty()){
			return true;
		}else {
			System.out.println("Kullanici bilgilerinde eksik var.");
			return false;
		}
		
	}
	
	public boolean passwordValidate(String password) {
		if(password.length() >= 6) {
			return true;
			
		}else {
			System.out.println("Sifreniz 6 karakter veya daha uzun olmalidir.");
			return false;
		}
	}
	
}
