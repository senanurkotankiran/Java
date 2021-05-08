package eCommerce.business.abstarcts;


import eCommerce.entities.concretes.LoginDto;
import eCommerce.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user , String token);
	boolean userExists(String email);
	void login(LoginDto loginDto);
}
 