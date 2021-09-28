package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This will automate the features according the library you add in the classpath
 * ex: component scanning automatically starts from com.example
 * ex: front-controller is automatically configured if you add spring boot web library
 * ex: server is automatically configured 
 * ex: datasource will be supplied to the jdbctemplate if you add spring data jdbc library
 */
@SpringBootApplication
public class Day5SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day5SpringBootAppApplication.class, args);
	}

}
