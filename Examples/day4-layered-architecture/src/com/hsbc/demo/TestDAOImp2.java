package com.hsbc.demo;

public class TestDAOImp2 implements TestDAO {

	@Override
	public String[] paymentOptions() {
		String[] options = {"PayTM", "NetBanking", 
				"Debit Card", "UPI", "Credit Card"};
		return options;
	}
	
}
