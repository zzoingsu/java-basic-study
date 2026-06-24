package SecondReading.Day4.MemberMangerProgram;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	private List<User> users = new ArrayList<>();
	
	public void addUser(User user) {
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
			}
		}
	}
}
