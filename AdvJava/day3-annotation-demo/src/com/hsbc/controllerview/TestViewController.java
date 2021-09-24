package com.hsbc.controllerview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.service.EmployeeService;

public class TestViewController {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// Controller needs service and call some methods of service
		EmployeeService service = (EmployeeService) ctx.getBean("employeeServiceImpl");
		service.store();
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
