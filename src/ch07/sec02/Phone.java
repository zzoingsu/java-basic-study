package ch07.sec02;

public class Phone {
	// 필드 선언
	String model;
	String color;
	
	//메소드 선언
	void bell () {
		System.out.println("벨이 울립니다");
	}
	
	void sendVoice (String message) {
		System.out.println("자기: " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방> " + message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다");
	}

}
