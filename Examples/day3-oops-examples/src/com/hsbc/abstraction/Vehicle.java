package com.hsbc.abstraction;

// Shared between two developers
// Developer1 uses Vehicle Reference & Developer2 implements it
public interface Vehicle {
	String mileage(); // returns mileage of the vehicle
	String wheels(); // returns number of wheels
}
