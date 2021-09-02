package com.hsbc.demo;

// this returns the Service instance
public class ServiceFactory {
	public TestService getServiceInstance() {
		TestService service = new TestServiceImpl1();
		// the above constructor should be modified to take TestDAO as a parameter
		return service;
	}
}
