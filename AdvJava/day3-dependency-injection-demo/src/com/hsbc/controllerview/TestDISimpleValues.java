package com.hsbc.controllerview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.dao.Datasource;

public class TestDISimpleValues {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Datasource ds = (Datasource)context.getBean("i3");
		System.out.println("Url: "+ds.getUrl());
		System.out.println("Username: "+ds.getUsername());
		System.out.println("Password: "+ds.getPassword());
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
