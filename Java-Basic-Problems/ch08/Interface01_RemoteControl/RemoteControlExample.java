package ch08.Interface01_RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.turnOff();
	}

}
