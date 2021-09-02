package com.hsbc.demo;

public class TestControllerView {

	public static void main(String[] args) {
		// as a controller you need Service instance
		// getting service instance without factory pattern
		//TestService service = new TestServiceImpl1();
		
		/*
		 * Using Service instance with factory pattern
		 * 
		 */
		ServiceFactory factory = new ServiceFactory();
		TestService service = factory.getServiceInstance();
		// Get the dao instance based on the option, here TestDAO dao = factory.getDAOInstance("1");
		// The above service needs to take dao instance i.e., factory.getServiceInstance(dao);
		String[] options = service.fetchPaymentOptions();
		System.out.println("List of payment options:-");
		for(String option : options) {
			System.out.println(option);
		}
	}

}
