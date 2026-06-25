package SecondReading.Day4.MemberMangerProgram;

public class User {
	private String userId;
	private String name;
	private int age;
	
	public User(String userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "회원아이디: " + userId + ", 회원 이름: " + name + ", 회원 나이: " + age;
	}
	
}
