package ch17.Stream01_DeleteDuplication;

import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicationExample {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("김민수", 17));
		list.add(new Person("이서준", 22));
		list.add(new Person("박지훈", 22));
		list.add(new Person("이서준", 22));
		list.add(new Person("최유진", 15));
		list.add(new Person("한지민", 28));
		
		list.stream()
			.filter(Person :: isOver20)
			.map(Person :: getName)
			.distinct()
			.forEach(System.out :: println);
	}

}
