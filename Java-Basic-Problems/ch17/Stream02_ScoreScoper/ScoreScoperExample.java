package ch17.Stream02_ScoreScoper;

import java.util.ArrayList;
import java.util.List;

public class ScoreScoperExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("김민수", 87, "컴공"));
		list.add(new Student("이서준", 61, "전자"));
		list.add(new Student("박지훈", 92, "컴공"));
		list.add(new Student("최유진", 55, "경영"));
		list.add(new Student("한지민", 77, "전자"));
		
		list.stream()
			.filter(Student :: isOver70)
			.map(Student :: outputFormat)
			.forEach(System.out :: println);
	}

}
