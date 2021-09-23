package com.hsbc.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestStream4 {
	public static void main(String[] args) {
		List<Dishes> list = Dishes.getDishes();
		System.out.println("---- For Each with anonymous class ------");
		list.stream().forEach(new Consumer<Dishes>() {
			public void accept(Dishes dish) {
				System.out.println(dish);
			}
		});
		System.out.println("----For Each with lambda expression ----");
		list.stream().forEach(dish -> System.out.println(dish));
		// add all the veg dishes in one list & non-veg dishes in another list
		
		List<Dishes> veg = new ArrayList<Dishes>();
		List<Dishes> nonveg = new ArrayList<Dishes>();
		for(Dishes dish : list) {
			if(dish.getType().equals("Veg")) {
				veg.add(dish);
			} 
			if(dish.getType().equals("NonVeg")) {
				nonveg.add(dish);
			}
		}
		// add all the veg dishes into a list & non-veg into another list using stream
		List<Dishes> vegList = list.stream().filter(dish -> dish.getType().equals("Veg")).collect(Collectors.toList());
		List<Dishes> nonVegList = list.stream().filter(dish -> dish.getType().equals("NonVeg")).collect(Collectors.toList());
		System.out.println("Veg Items Count: "+vegList.size());
		System.out.println("Non Veg Items Count: "+nonVegList.size());
		// sorting the Veg items based on price in descending order
		list.stream().filter(item -> item.getType().equals("Veg"))
		.sorted((d1, d2) -> Double.compare(d2.getPrice(), d1.getPrice())).forEach(dish -> System.out.println(dish));
		
	}
}
