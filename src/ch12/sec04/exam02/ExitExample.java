package ch12.sec04.exam02;

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.out.println("시스템 강제 종료");
				System.exit(0);
			}
		}
	}

}
