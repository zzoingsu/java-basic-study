package SecondReading.Day4.StudentGradeSearchProgram;

public class StudentGradeSearchProgramExample {

	public static void main(String[] args) {
		StudentScoreManager manager = new StudentScoreManager();

		manager.addStudent(new Student("S001", "김자바", 85));
		manager.addStudent(new Student("S002", "이자바", 90));
		manager.addStudent(new Student("S001", "중복", 70));

		manager.updateScore("S002", 95);
		manager.updateScore("S003", 100);

		System.out.println(manager.findStudent("S002"));

		manager.printAllStudents();


	}

}
