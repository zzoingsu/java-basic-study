package SecondReading.Day4.MemberMangerProgram;

public class MemberMangerProgramExample {

	public static void main(String[] args) {
		UserManager manager = new UserManager();

		manager.addUser(new User("winter", "한겨울", 25));
		manager.addUser(new User("summer", "한여름", 26));
		manager.addUser(new User("winter", "중복회원", 30));

		manager.printAllUsers();

		User foundUser = manager.findUserById("summer");
		System.out.println("검색 결과: " + foundUser);

		manager.removeUserById("winter");
		manager.printAllUsers();

	}

}
