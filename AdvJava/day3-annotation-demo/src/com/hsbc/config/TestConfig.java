package com.hsbc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfig {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		C c = (C)ctx.getBean("c");
		c.test();
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
