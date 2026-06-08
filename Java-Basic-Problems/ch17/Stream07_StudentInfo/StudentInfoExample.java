package ch17.Stream07_StudentInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentInfoExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("김민수", "컴공", 87));
		studentList.add(new Student("이서준", "전자", 61));
		studentList.add(new Student("박지훈", "컴공", 92));
		studentList.add(new Student("최유진", "경영", 55));
		studentList.add(new Student("한지민", "전자", 77));
		studentList.add(new Student("강도윤", "컴공", 100));
		studentList.add(new Student("윤서아", "경영", 81));
		studentList.add(new Student("정하늘", "전자", 95));
		
		System.out.println("[80점이상 학생]");
		studentList.stream()
				.filter(s -> s.getScore() >= 80)
				.map(Student :: getName)
				.sorted()
				.forEach(System.out :: println);
		System.out.println();
		
		Map<String, List<String>> map = studentList.stream()
				.filter(s -> s.getScore() >= 80)
				.collect(
						Collectors.groupingBy(Student :: getMajor, Collectors.mapping(Student :: getName, Collectors.toList()
						 )));
		System.out.println(map);
		System.out.println();
		
		int max = studentList.stream()
				.mapToInt(Student :: getScore)
				.max()
				.getAsInt();
		System.out.println("최고 점수: " + max);
	}

}
