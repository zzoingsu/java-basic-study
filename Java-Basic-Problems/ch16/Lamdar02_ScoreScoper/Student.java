package ch16.Lamdar02_ScoreScoper;

public class Student {
	private String name;
	private String score;
	
	public Student(String name, String score) {
		this.name = name;
		this.score = name;
	}
	
	public void printFiltered(Student[] students, Check check) {
		for(int i=0; i<students.length; i++) {
			if(check.checkStudent(students[i])) {
				System.out.println(students[i].name + ": " + students[i].score);
			}
		}
	}

}
