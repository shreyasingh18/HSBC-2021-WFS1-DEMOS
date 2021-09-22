package com.hsbc.java8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today: "+today);
		LocalTime time = LocalTime.now();
		System.out.println("Time: "+time);
		LocalDate another = LocalDate.of(1978, 4, 24);
		System.out.println(another.isBefore(today));
		System.out.println("Month: "+today.getMonth());
		Period period = Period.between(another, today);
		System.out.println("Year: "+period.getYears());
		System.out.println("Months: "+period.getMonths());
		System.out.println("Days: "+period.getDays());
	}
}
