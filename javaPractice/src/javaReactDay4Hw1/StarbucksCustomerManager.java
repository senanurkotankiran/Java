package javaReactDay4Hw1;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager (CustomerCheckService customerCheckService) {
		
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(_customerCheckService.CheckIfRealPerson(customer)){
			
			super.save(customer);
			
		} else {
			System.out.println("Not a valid person");
		}
		
	}

}
