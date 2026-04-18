package ch09.nested06_MemberInfoProgram;

public class Member {
	private String id;
	private String grade;
	
	Member(String id, String grade) {
		this.id = id;
		this.grade = grade;
	}
	class MemberPrinter {
		public void printInfo() {
			System.out.println("아이디: " + id);
			System.out.println("등급: " + grade);
		}
	}

}
