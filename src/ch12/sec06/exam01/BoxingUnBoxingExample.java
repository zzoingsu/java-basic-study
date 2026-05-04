package ch12.sec06.exam01;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//UnBoxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산시 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
