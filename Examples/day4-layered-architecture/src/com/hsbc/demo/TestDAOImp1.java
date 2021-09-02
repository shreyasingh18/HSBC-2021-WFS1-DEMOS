package com.hsbc.demo;

public class TestDAOImp1 implements TestDAO {

	@Override
	public String[] paymentOptions() {
		String[] options = {"NetBanking", "Credit Card"};
		return options;
	}

}
