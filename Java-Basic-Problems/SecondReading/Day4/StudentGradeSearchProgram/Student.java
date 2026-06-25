package SecondReading.Day4.StudentGradeSearchProgram;

public class Student {
	private String studentId;
	private String name;
	private int score;
	
	public Student(String studentId, String name, int score) {
		validateString(studentId);
		validateString(name);
		validateScore(score);
		this.studentId = studentId;
		this.name = name;
		this.score = score;
	}
	
	public String getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "학번: " + studentId + ", 이름: " + name + ", 점수: " + score;
	}
	public static void validateString(String str) {
		if(str == null || str.isBlank()) {
			throw new IllegalArgumentException("학번과 이름은 빈칸일 수 없습니다");
		}
	}
	public static void validateScore(int score) {
		if(score<0 || score >100) {
			throw new IllegalArgumentException("점수는 0과 100사이만 등록 가능합니다");
		}
	}
}
