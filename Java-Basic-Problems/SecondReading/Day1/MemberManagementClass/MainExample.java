package SecondReading.Day1.MemberManagementClass;

public class MainExample {

	public static void main(String[] args) {
		User user = new User("winter", "한겨울", 25, "winter@test.com");
		System.out.println(user);
		
		user.setUserAge(-3);
		user.setUserEmail("wrong-email");
		
		System.out.println(user);
	}

}
