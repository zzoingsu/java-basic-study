package ch16.Lambda02_ScoreScoper;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	public static void printFiltered(Student[] students, Check check) {
		for(int i=0; i<students.length; i++) {
			if(check.checkStudent(students[i])) {
				System.out.println(students[i].name + ": " + students[i].score);
			}
		}
	}

}
