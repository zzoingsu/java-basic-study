package SecondReading.Day4.MemberMangerProgram;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users = new ArrayList<>();
	
	public void addUser(User user) {
		validateAge(user.getAge());
		validateUserId(user.getUserId(), users);
		users.add(user);
	}
	public void printAllUsers() {
		for(int i=0; i<users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
	public User findUserById(String userId) {
			for(int i=0; i<users.size(); i++) {
				if(users.get(i).getUserId().equals(userId)) {
					return users.get(i);
				}
			}
		return null;
	}
	public void removeUserById(String userId) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getUserId().equals(userId)) {
				users.remove(i);
				return;
			} 
		}
		System.out.println("일치하는 회원이 없습니다");
	}
	public static void validateAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("나이는 0보다 작을 수 없습니다");
		}
	}
	public static void validateUserId(String userId, List<User> users) {
		if(userId == null || userId.isBlank()) {
			throw new IllegalArgumentException("이름은 빈칸일 수 없습니다");
		}
		for(User user : users) {
			if(user.getUserId().equals(userId)) {
				throw new IllegalArgumentException("중복된 아이디입니다");
			}
		}
	}
}
