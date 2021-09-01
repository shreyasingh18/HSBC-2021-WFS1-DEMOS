package com.hsbc.abstraction;

// It can extends Car and get wheels() implementation
// but compiler knows that mileage() is incomplete, hence you need
// to complete here or else you need to make Innova also abstract
public class Innova extends Car {

	@Override
	public String mileage() {
		System.out.println("mileage is implemented in Innova class");
		return "20kpl";
	}

}
