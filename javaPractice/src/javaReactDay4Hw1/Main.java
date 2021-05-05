package javaReactDay4Hw1;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Senanur");
		customer.setLastName("Kotankiran");
		customer.setNationalityId("123456789");
		customer.setDateOfBirthday(new Date(2002/2/12));
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);

	}

}
