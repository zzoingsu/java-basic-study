package ch16.Lambda02_ScoreScoper;

public class PrintFilteredExample {

	public static void main(String[] args) {
		Student[] students = {
			    new Student("김철수", 90),
			    new Student("박민준", 85),
			    new Student("이수진", 72),
			    new Student("최영희", 55),
			    new Student("정다은", 95)
			};
		System.out.println("[80점 이상]");
		Student.printFiltered(students, student -> student.getScore() >= 80);
		System.out.println();
		
		System.out.println("[이름 3글자]");
		Student.printFiltered(students, student -> student.getName().length() == 3);
		System.out.println();
		
		System.out.println("[60점 미만]");
		Student.printFiltered(students, student -> student.getScore() < 60);
	}

}
