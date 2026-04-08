package ch08.Interface05_RemoteControl;

public class RemoteControlMain {

	public static void main(String[] args) {
		User user = new User();
		RemoteControl rc = new SmartTV();
		user.useRemote(rc);
		
		Searchable searchable = new SmartTV();
		user.useSearch(searchable, "자바 인터페이스");
		
		if(rc instanceof Searchable  search) {
			search.search("Spring boot");
		}
		
		
		
	}

}
