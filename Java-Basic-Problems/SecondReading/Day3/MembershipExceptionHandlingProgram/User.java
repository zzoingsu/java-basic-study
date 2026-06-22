package SecondReading.Day3.MembershipExceptionHandlingProgram;

public class User {
	private String userId;
	private String password;
	private int age;
	
	public User(String userId, String password, int age) throws InvalidUserException {
		validateUserId(userId);
		validatePassword(password);
		validateAge(age);
		
		this.userId = userId;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User{userId='" + userId + "', password='" +password + "', age=" + age + "}";
	}
	
	public static void validateUserId(String userId) throws InvalidUserException {
		if(userId == null || userId.isBlank()) {
			throw new InvalidUserException("아이디는 비어 있을 수 없습니다.");
		}
	}
	public static void validatePassword(String password) throws InvalidUserException {
		if(password == null || password.length()<8) {
			throw new InvalidUserException("비밀번호는 8자 이상이여야 합니다");
		}
	}
	public static void validateAge(int age) throws InvalidUserException {
		if(age<14) {
			throw new InvalidUserException("나이는 14세 이상이여야 합니다");
		}
	}
}
