package SecondReading.Day5.UserFilteringProgram;

import java.util.List;

public class UserFilteringProgramExample {

	public static void main(String[] args) {
		List<User> users = List.of(
			    new User("winter", 25, "USER"),
			    new User("summer", 17, "ADMIN"),
			    new User("spring", 30, "ADMIN"),
			    new User("fall", 22, "MANAGER")
			);
		
		users.stream()
			.filter(user -> user.getAge()>=20)
			.forEach(user -> System.out.println(user));
		
		users.stream()
			.filter(user -> user.getRole().equals("ADMIN"))
			.forEach(user -> System.out.println(user));
		
		users.stream()
			.forEach(user -> System.out.println(user.getName()));
		
		long count = users.stream()
			.count();
		System.out.println(count);
	
		long ageOver20 = users.stream()
			.filter(user -> user.getAge()>=20)
			.count();
		System.out.println(ageOver20);
	}
	

}
