package com.can.java8.example;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaces {

	public static void main(String[] args) {

		// T: denotes the type of the input argument
		// R: denotes the return type of the function

		// 1: Function<T, R>
		// To transform arguments in returnable value.
		// - R apply(T t)
		// - andThen(Function<? super R, ? extends V> after)
		// - compose(Function<? super V, ? extends T> before)
		// - static <T> Function<T, T> identity()

		Function<Integer, String> convertToString = a -> a + "";
		System.out.println(convertToString.apply(5));

		System.out.println(convertToString.andThen(a -> new BigDecimal(a))
				.compose(b -> new Integer((int) b) * 2).apply(10));

		// --------------------------oooo--------------------------//

		// 2: Consumer<T>
		// Accept arguments but do not return any values.

		// --------------------------oooo--------------------------//

		Consumer<Integer> cons = a -> System.out.println(a);
		cons.accept(10);

		// --------------------------oooo--------------------------//

		// 3: Predicate
		// To perform a test and return a Boolean value.
		Predicate<Integer> pre = a -> a > 5;
		System.out.println(pre);

		// --------------------------oooo--------------------------//

		// 4: Supplier
		// Do not accept any arguments but return a value.

		Supplier<Integer> supp = () -> new Integer(5);
		System.out.println(supp);

	}

}
