package SecondReading.Day5.UserFilteringProgram;

public class User {
	private String name;
	private int age;
	private String role;
	
	public User(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getRole() {
		return role;
	}
	@Override
	public String toString() {
		return "[이름: " + name + ", 나이: " + age + ", 역할: " + role + "]";
	}
}
