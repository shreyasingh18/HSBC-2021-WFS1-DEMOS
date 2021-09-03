package com.hsbc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetSimpleType {
	// try the example using ArrayList, LinkedList, PriorityQueue
	public static void main(String[] args) {
		// we can create instance of HashSet, LinkedHashSet & TreeSet
		//Set<Integer> integerSet = new HashSet<Integer>();
		//Set<Integer> integerSet = new TreeSet<Integer>();
		Set<Integer> integerSet = new LinkedHashSet<Integer>();
		integerSet.add(80);
		integerSet.add(70);
		integerSet.add(10);
		integerSet.add(20);
		integerSet.add(20);
		integerSet.add(20);
		integerSet.add(20);
		integerSet.add(30);
		System.out.println("Size: "+integerSet.size()); // checks the size of the Set
		for(int x : integerSet) {
			System.out.println(x);
		}
		System.out.println("---------------");
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("Hello");
		stringSet.add("Hi");
		stringSet.add("Welcome");
		System.out.println("Size: "+stringSet.size());
		for(String s : stringSet) {
			System.out.println(s);
		}
	}

}
