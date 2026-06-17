package SecondReading.Day1.MemberManagementClass;

public class User {
	private String userid;
	private String userName;
	private int userAge;
	private String userEmail;
	
	public User(String userId, String userName, int userAge, String userEmail) {
		if(userAge < 0) {
			throw new IllegalArgumentException("나이는 0보다 작을수 없습니다");
		} 
		if(userEmail == null || !userEmail.contains("@")) {
            throw new IllegalArgumentException("이메일 형식이 올바르지 않습니다.");
        }
		
		this.userid = userId;
		this.userName = userName;
		setUserAge(userAge);
		setUserEmail(userEmail);
	}
	public void setUserAge(int userAge) {
		if(userAge < 0) {
			System.out.println("나이는 0보다 작을 수 없습니다");
			return;
		}this.userAge = userAge;
	}
	public void setUserEmail(String userEmail) {
		if(!userEmail.contains("@")) {
			System.out.println("이메일은 @를 포함해야 합니다");
			return;
		}
		this.userEmail = userEmail;
	}
	@Override
	public String toString() {
		return userid + "\t"+ userName +"\t"+ userAge +"\t"+ userEmail;
	}

}
