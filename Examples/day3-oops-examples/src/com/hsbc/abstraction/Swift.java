package com.hsbc.abstraction;

public class Swift extends Car {

	@Override
	public String mileage() {
		System.out.println("mileage is implemented in Swift class");
		return "23kpl";
	}

}
