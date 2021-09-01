package com.hsbc.abstraction;

// Car know only wheels() method logics
public abstract class Car implements Vehicle {

	@Override
	public String wheels() {
		System.out.println("wheels is implemented in Car class");
		return "4 Wheeler";
	}
	
	// now the method mileage() is incomplete i.e., abstract
	
}
