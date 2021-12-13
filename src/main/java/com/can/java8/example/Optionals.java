package com.can.java8.example;

import java.util.Optional;

public class Optionals {

	public static void main(String[] args) {

		/**
		 * Optinal methos : 
		 * 1- empty : create empty optional object. 
		 * 2- of : if value null throw exception.
		 * 3- ofNullable : value can be null.
		 * 
		 * */

		
		// Integer numara = null;
		 Integer numara = 5;

		 Optional<Integer> opt = Optional.ofNullable(numara);
		//Optional<Integer> opt = Optional.of(numara);

		opt.ifPresent(num -> {
			System.out.println("Result: " + Math.pow(num, 2));
		});
		
		System.out.println(Optional.ofNullable(numara).orElse(58));
		
		Optional.ofNullable(numara).orElseThrow(RuntimeException::new);
				
		
	}

}
