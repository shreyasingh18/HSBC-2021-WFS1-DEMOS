package com.hsbc.demo;

public class TestServiceImpl1 implements TestService {

	// without using factory pattern
	private TestDAO dao;
	public TestServiceImpl1() {
		DAOFactory factory = new DAOFactory();
		dao = factory.getDAOInstance();
	}
	// this has to call dao.paymentOptions();
	@Override
	public String[] fetchPaymentOptions() {
		return dao.paymentOptions();
	}

}
