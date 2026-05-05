package ch12.javaBaseModule04_MemberInfo;

public class Member {
	private String id;
	private String name;
	private int score;
	
	public Member(String id, String name, int score) {
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
	
	public void printInfo(String[] dataInfo) {
		for(int i=0; i< dataInfo.length; i++) {
			
		}
	}

}
