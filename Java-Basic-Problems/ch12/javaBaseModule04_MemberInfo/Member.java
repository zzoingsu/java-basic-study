package ch12.javaBaseModule04_MemberInfo;

public class Member {
	private String id;
	private String name;
	private int score;
	private String grade;
	
	public Member(String id, String name, int score, String grade) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String gradeScope(int score) {
			if(score > 90) {
				return "A";
			}else if(score > 80) {
				return "B";
			}else if(score > 70) {
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
