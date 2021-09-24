package com.hsbc.viewcontroller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ViewController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*
		 * JdbcTemplate must be used in DAO layer not here, we are using it in the wrong place
		 */
		JdbcTemplate temp = (JdbcTemplate)context.getBean("jdbcTemplate");
		temp.update("insert into employee values(?,?,?)", 100, "Raj", 35200);
		System.out.println("Done!");
		((ClassPathXmlApplicationContext)context).close();
	}

}
