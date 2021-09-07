package com.hsbc;

public class TestSynchronization {

	public static void main(String[] args) {
		Booking booking = new Booking();
		Thread t1 = new Thread(booking, "A");
		Thread t2 = new Thread(booking, "B");
		Thread t3 = new Thread(booking, "C");
		t1.start();
		t2.start();
		t3.start();
	}

}
