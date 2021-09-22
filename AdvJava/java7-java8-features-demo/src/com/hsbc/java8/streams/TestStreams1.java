package com.hsbc.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreams1 {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("Mango");
		strings.add("Apple");
		strings.add("Orange");
		strings.add("Avacod");
		strings.add("Banana");
		strings.add("Pineapple");
		System.out.println("---- printing all items using forEach() -----");
		strings.forEach(x -> System.out.println(x));
		List<String> filteredString = strings.stream()
		.filter((s) ->	s.length() > 5)
		.sorted((s1, s2) -> s1.compareTo(s2))
		.collect(Collectors.toList());
		System.out.println("-----printing all items using forEach()------");
		filteredString.forEach(item -> System.out.println(item));
	}

}
