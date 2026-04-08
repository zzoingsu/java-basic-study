package ch08.Interface05_RemoteControl;

public class User {
	
	public void useRemote(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void useSearch(Searchable searchable, String keyword) {
		searchable.search(keyword);
	}

}
