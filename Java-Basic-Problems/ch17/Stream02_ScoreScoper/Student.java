package ch17.Stream02_ScoreScoper;

public class Student {
	private String name;
	private int score;
	private String major;
	
	public Student(String name, int score, String major) {
		this.name = name;
		this.score = score;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String getMajor() {
		return major;
	}
	public boolean isOver70() {
		return score >= 70;
	}
	public String outputFormat() {
		return "이름: " + name + " / 전공: " + major;
	}

}
