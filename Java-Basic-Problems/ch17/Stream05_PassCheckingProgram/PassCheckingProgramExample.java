package ch17.Stream05_PassCheckingProgram;

import java.util.ArrayList;
import java.util.List;

public class PassCheckingProgramExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김민수", 87));
		studentList.add(new Student("이서준", 61));
		studentList.add(new Student("박지훈", 92));
		studentList.add(new Student("최유진", 55));
		studentList.add(new Student("한지민", 77));
		
		boolean result = studentList.stream()
				.mapToInt(s -> s.getScore())
				.anyMatch(s -> s >= 90);
		System.out.println("90점 이상 학생 존재 여부: " + result);
		
		result = studentList.stream()
				.mapToInt(s -> s.getScore())
				.allMatch(s -> s >= 60);
		System.out.println("전원 60점 이상 여부: " + result);
		
		double avg = studentList.stream()
				.mapToInt(s -> s.getScore())
				.average()
				.orElse(0.0);
		System.out.println("평균 점수: " + avg);
	}

}
