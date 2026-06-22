package SecondReading.Day3.MembershipExceptionHandlingProgram;

public class MembershipExceptionHandlingProgramExample {

	public static void main(String[] args) {
		try {
		    User user = new User("winter", "12345678", 20);
		    System.out.println(user);
		} catch (InvalidUserException e) {
		    System.out.println("회원 가입 실패: " + e.getMessage());
		}

		try {
		    User user = new User("", "1234", 10);
		    System.out.println(user);
		} catch (InvalidUserException e) {
		    System.out.println("회원 가입 실패: " + e.getMessage());
		}

	}

}
