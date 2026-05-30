package ch17.sec03;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("김자바", 20),
				new Student("이자바", 30)
				);
		
		/*
		Stream<Student> studentStream = list.stream();
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균 점수: " + avg);
		*/
		
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		System.out.println("평균점수: " + avg);
	}

}
