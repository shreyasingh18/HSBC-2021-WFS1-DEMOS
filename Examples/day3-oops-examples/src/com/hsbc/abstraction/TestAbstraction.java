package com.hsbc.abstraction;

// Assuming Developer1 wants to use the interface
class UI { 
	public void printVehicleDetails(Vehicle v) {
		// Developer1 wants to print in the console
		System.out.println("Mileage: "+v.mileage());
		System.out.println("Wheels: "+v.wheels());
	}
}

// Assuming User is selecting the  UI.printVehicleDetails
public class TestAbstraction {
	public static void main(String[] args) {
		UI ui = new UI();
		// user wants to see innova details
		Innova inv = new Innova();
		ui.printVehicleDetails(inv); // Vehicle v = new Innova();
		System.out.println("------------------");
		Swift swf = new Swift();
		ui.printVehicleDetails(swf); // Vehicle v = new Swift();
	}
}
