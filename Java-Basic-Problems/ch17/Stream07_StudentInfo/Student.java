package ch17.Stream07_StudentInfo;

public class Student {
	private String name;
    private String major;
    private int score;

    public Student(String name, String major, int score) {
        this.name = name;
        this.major = major;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getScore() {
        return score;
    }
}
