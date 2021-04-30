package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "12345";
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "78910";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "999999";

		
		CustomerManager customerManager = new CustomerManager();
		/*customerManager.add(corporateCustomer);
		customerManager.add(individualCustomer);
		customerManager.add(sendikaCustomer);*/
		
		Customer[] customers = {individualCustomer, corporateCustomer, sendikaCustomer};
		customerManager.addMultiple(customers);
	}



}
