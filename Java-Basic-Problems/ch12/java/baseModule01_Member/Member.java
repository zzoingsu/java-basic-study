package ch12.java.baseModule01_Member;

public class Member {
	private String id;
	private String name;
	private int score;
	
	public Member(String id , String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "회원ID: " + id + ", 이름: " + name + ", 점수: " + score;
	}

}
