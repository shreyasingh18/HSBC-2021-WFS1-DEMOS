package com.hsbc;

public class Booking implements Runnable{

	private static int ticketCounter = 1;
	
	@Override
	public void run() {
		bookTicket();
	}
	
	
	public synchronized void bookTicket() {
		Thread t = Thread.currentThread();
			//Thread.sleep(1000);
		if(ticketCounter != 0) {
			System.out.println(t.getName()+" booked ticket");
			ticketCounter--;
		} else {
			System.out.println(t.getName()+" didn't get the ticket");
		}
		System.out.println("---- Booking completd ------");
	}

}
