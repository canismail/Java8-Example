package com.can.java8.example;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
	
	/**
	 * why functional interface has to one abstract method ?
	 * 
	 * interface TestInterface {
		    void first();
		    void second(); // this is only distinguished from first() by method name
		    String third(); // maybe you could say in this instance "well the return type is different"
		    Object fourth(); // but a String is an Object, too !
       }

       void test() {
         // which method are you implementing, first or second ?
         TestInterface a = () -> System.out.println("Ido mein ado mein");
         // which method are you implementing, third or fourth ?
         TestInterface b = () -> "Ido mein ado mein";
       }
	 *  
	 * 
	 **/

	/**
	 * A functional interface is an interface that has just one abstract method,
	 * and thus represents a single function contract.
	 * */
	@FunctionalInterface
	interface Calculation {
		public int sum(int a, int b);
	}

	public static void main(String[] args) {

		/**
		 * 1- For anonymous class
		 * */
		// OLD Version
		Calculation s1 = new Calculation() {

			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};

		System.out.println(s1.sum(10, 10));

		// Lambda Version
		Calculation s2 = (a, b) -> {
			return a + b;
			// a+ b;
		};

		System.out.println(s2.sum(15, 15));

		// --------------------ooo----------------------//

		List<String> list = new ArrayList<String>();
		list.add("java6");
		list.add("java7");
		list.add("java8");

		list.stream().forEach((str) -> System.out.println(str));

	}
}
