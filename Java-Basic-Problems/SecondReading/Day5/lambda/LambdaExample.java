package SecondReading.Day5.lambda;

import java.util.function.*;

public class LambdaExample {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (num -> (num%2) == 0);
		Consumer<String> printer = (str -> System.out.println(str));
		Function<String, Integer> lengthFunction = (str -> str.length());
		Supplier<String> messageSupplier = (()-> "오늘은 람다 공부하는 날");
		
		System.out.println(isEven.test(10));
		printer.accept("hello");
		System.out.println(lengthFunction.apply("lambda"));
		System.out.println(messageSupplier.get());

	}

}