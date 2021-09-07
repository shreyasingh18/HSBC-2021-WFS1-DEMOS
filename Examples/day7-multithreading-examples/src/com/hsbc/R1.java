package com.hsbc;

public class R1 implements Runnable {

	@Override
	public void run() {
		System.out.println("run() method starts");
		test();
		System.out.println("run() method ends");
	}

	public void test() {
		Thread t = Thread.currentThread();
		for(int i = 1; i <= 100; i++) {
			System.out.println("i = "+i+" Thread Name: "+t.getName());
		}
	}
}
