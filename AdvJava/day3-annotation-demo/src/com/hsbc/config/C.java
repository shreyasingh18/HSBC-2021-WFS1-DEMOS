package com.hsbc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {

	@Autowired
	private A a;
	@Autowired
	private B b;
	
	public void test() {
		a.hello();
		b.welcome();
	}
}
