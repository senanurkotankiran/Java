package eCommerce.core;

import eCommerce.business.abstarcts.UserService;
import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{

	private UserService userService;

	
	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
		
	}
	
	@Override
	public void register(String email) {
		if(userExists(email) == false) {
			userService.add(email);
			
		}else {
			
			User user = userService.get(email);
			
			LoginDto loginDto = new LoginDto();
			loginDto.setEmail(user.getePosta());
			loginDto.setPassword(user.getPassword());
			
			login(loginDto);
		}
		
		
	}

	@Override
	public boolean userExists(String email) {
		if(userService.get(email) != null) {
			return true;
		}	
		else {
			System.out.println("Email zaten mevcut.");
			return false;
		}
	}

	@Override
	public void login(LoginDto loginDto) {
		
		if(loginDto != null && loginDto.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Başarıyla giriş yaptınız.");				
		}
		else {
			System.out.println("Kullanıcı adı veya şifren yanlış.!");
		}
		
	}

}
