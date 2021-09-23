package com.hsbc.java8.streams;

import java.util.Arrays;
import java.util.List;

public class Dishes {
	private String name;
	private double price;
	private String type;
	public Dishes(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public Dishes() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Dishes [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	public static List<Dishes> getDishes() {
		List<Dishes> dishes = Arrays.asList(new Dishes("Grill", 180, "NonVeg"), 
				new Dishes("Tandoor Chicken", 190, "NonVeg"), 
				new Dishes("Pepper Chicken", 150, "NonVeg"), 
				new Dishes("Palak Chicken", 250, "NonVeg"), 
				new Dishes("Chicken Roll", 120, "NonVeg"), 
				new Dishes("Paneer Biriyani", 150, "Veg"), 
				new Dishes("Aloo Biriyani", 120, "Veg"), 
				new Dishes("Veg Biriyani", 100, "Veg"), 
				new Dishes("Aloo Gobi", 80, "Veg"), 
				new Dishes("Garlic Bread", 130, "Veg"), 
				new Dishes("Pasta", 80, "Veg"), 
				new Dishes("Roti", 40, "Veg")
				);
		return dishes;
	}
	
}
