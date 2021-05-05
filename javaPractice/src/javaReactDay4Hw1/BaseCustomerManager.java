package javaReactDay4Hw1;

public abstract class BaseCustomerManager implements CustomerServise {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to db : "+ customer.firstName);
		
	}

}
