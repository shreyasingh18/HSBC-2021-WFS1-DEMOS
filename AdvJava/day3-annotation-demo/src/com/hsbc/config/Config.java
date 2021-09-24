package com.hsbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public A createA() {
		return new A();
	}
	@Bean
	public B createB() {
		return new B();
	}
}
