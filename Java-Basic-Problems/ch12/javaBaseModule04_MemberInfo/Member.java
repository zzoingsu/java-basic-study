package ch12.javaBaseModule04_MemberInfo;

public class Member {
	private String id;
	private String name;
	private int score;
	private String grade;
	
	public Member(String id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.grade = gradeScope(score);
	}
	
	public int getScore() {
		return score;
	}
	
	private String gradeScope(int score) {
			if(score >= 90) {
				return "A";
			}else if(score >= 80) {
				return "B";
			}else if(score >= 70) {
				return "C";
			}else {
				return "D";
			
		} 
	}
	@Override
	public String toString() {
		return "회원ID: " + id + ", 이름: " + name + ", 점수: " + score + ", 등급: " + grade;
	}

}
