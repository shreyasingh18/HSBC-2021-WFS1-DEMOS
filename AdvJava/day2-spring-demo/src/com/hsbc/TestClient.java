package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		/*
		 * Old approach
		 */
		System.out.println("---- old approach ----");
		Identifier i1 = new Aadhar();
		i1.display();
		/*
		 * Spring approach using ApplicationContext get the object
		 */
		System.out.println("---- spring approach ----");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Identifier id = (Identifier) ctx.getBean("i1");
		id.display();
		
		// to avoid resource leak warning
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
