package ch09.Nested01_ScorePrinter;

public class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	class ScorePrinter {
			public void printInfo() {
			System.out.println("이름: "+name+"\n점수: "+score);
		}
	}
	

}
