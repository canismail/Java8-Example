package com.can.java8.example;

import java.util.function.BiFunction;

public class MethodReference {

	/*
	 * 
	 * System.out::println == x -> System.out.println(x); Math::pow == (x, y) ->
	 * Math.pow(x, y) String::compareToIgnoreCase == (x, y) ->
	 * x.compareToIgnoreCase(y)
	 * 
	 * *
	 */

	@FunctionalInterface
	interface MyFunctionalInterface {
		public void test();
	}

	public MethodReference() {
		System.out.println("Constructor method call");
	}

	public static void myThread1() {
		System.out.println("Thread1 running..");
	}

	public static String doSomeStuff(String s1, String s2) {
		return s1.concat("-").concat(s2);
	}

	public void myThread2() {
		System.out.println("Thread2 running..");
	}

	public static void main(String[] args) {

		/**
		 * 1-) Reference to Static methods.
		 * 
		 * Runnable class is functional interface. We refer to our static method
		 * */

		Thread t = new Thread(MethodReference::myThread1);

		t.run();

		// Older Version :
		// Runnable r1 = new Runnable() {
		// public void run() {
		// System.out.println("Thread1 is running...");
		// }
		// };

		BiFunction<String, String, String> biFunction = MethodReference::doSomeStuff;

		System.out.println(biFunction.apply("java8", "example"));

		// ---------------------ooo------------------------- //

		/**
		 * 2-) Reference to Instance Method
		 * 
		 * */

		Thread t2 = new Thread(new MethodReference()::myThread2);
		t2.run();

		// ---------------------ooo------------------------- //

		/**
		 * 3-) Reference to Constructor
		 * 
		 * */

		MyFunctionalInterface myFunctionalInterface = MethodReference::new;

		myFunctionalInterface.test();

	}

}
