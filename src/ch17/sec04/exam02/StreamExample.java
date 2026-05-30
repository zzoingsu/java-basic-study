package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "김자바", "이자바"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(name -> System.out.print(name + ", "));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(num -> System.out.print(num + ", "));
		
	}

}
