package Concrete;

import Abstract.VerificationService;
import Entities.Gamer;

public class VerificationManager implements VerificationService {

	@Override
	public boolean confirmed(Gamer gamer) {
		if(		
			gamer.getNationalityId().isEmpty() || 
			gamer.getFirstName().isEmpty() ||
			gamer.getLastName().isEmpty() ||
			gamer.getUsername().isEmpty() ||
			gamer.getDateOfBirthday().isEmpty() ||
			gamer.getEmail().isEmpty() ||
			gamer.getPassword().isEmpty()
				) {
			return false;
			
		}else {
			return true;
		}
	}

}
