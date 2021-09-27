package com.hsbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		TestBean t1 = (TestBean)ctx.getBean("i1");
		t1.demo();
		TestBean t2 = (TestBean)ctx.getBean("i1");
		t2.demo();
		TestBean t3 = (TestBean)ctx.getBean("i1");
		t3.demo();
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
