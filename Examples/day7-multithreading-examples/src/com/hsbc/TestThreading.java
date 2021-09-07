package com.hsbc;

public class TestThreading {

	public static void main(String[] args) {
		System.out.println("------main starts---------");
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		t1.setName("A");
		Thread t2 = new Thread(r1);
		t2.setName("B");
		Thread t3 = new Thread(r1);
		t3.setName("C");
		t1.start(); // registers in the CPU Thread Schedular
		t2.start();
		t3.start();
		System.out.println("------main ends---------");	
	}
}
