package ch08.Interface05_RemoteControl;

public class SmartTV implements RemoteControl, Searchable {
	@Override
	public void turnOn() {
		System.out.println("스마트TV 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트TV 전원을 끕니다.");
	}
	
	@Override
	public void search(String keyword) {
	System.out.println(keyword + "를 검색합니다");	
	}

}
