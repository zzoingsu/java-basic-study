package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김바자");
		list.add("이자바");
		list.add("이자바");
		list.add("이바자");
		
		list.stream()
		.distinct()
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		list.stream()
		.filter(n -> n.startsWith("이"))
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		list.stream()
		.distinct()
		.filter(n -> n.startsWith("이"))
		.forEach(name -> System.out.println(name));
	}

}
