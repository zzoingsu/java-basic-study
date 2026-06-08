package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김자바", "여", 87));
		totalList.add(new Student("이자바", "남", 95));
		totalList.add(new Student("박자바", "여", 93));
		
		List<Student> maleList = totalList.stream()
									.filter(s -> s.getSex().equals("남"))
									.toList();
		maleList.stream()
			.forEach(n -> System.out.println(n.getName()));
		System.out.println();
		
		Map<String, Integer> map = totalList.stream()
										.collect(
												Collectors.toMap(
														s -> s.getName(), 
														s -> s.getScore()
														)
												);
		System.out.println(map);
										
	}

}
