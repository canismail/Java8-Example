package com.can.java8.example;

public class DefaultAndStaticMethods {

	interface myInterface {
		void someStuf();

		default void defaultMethod1() {
			System.out.println("Hi from default Method-1");
		}

		default void defaultMethod2() {
			System.out.println("Hi from default Method-2");
		}

		static void staticMethod1() {
			System.out.println("Hello from static Metho-1");
		}

		static void staticMetho2() {
			System.out.println("Hello from static Metho-2");
		}

	}

}
