package com.can.java8.example;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("examples");

		list.forEach(System.out::println);

		list.forEach(s -> System.out.println(s));
		
		list.stream().forEachOrdered(System.out::println);
		
	}
}
