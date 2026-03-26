package ch06.sec08.example01;

public class CalculatorExample {

	public static void main(String[] args) {
		// calculator 객체 생성
		Calculator myCal = new Calculator();
		
		// 리턴값이 없는 메소드 호출
		myCal.powerOn();
		
		// plus 호출 시 5와 6을 매개값으로 제공하고,
		// 덧셈 결과를 리턴받아 result에 대입
		int result1 = myCal.plus(5, 6);
		System.out.println(result1);
		
		// divide 호출시 10과 4를 매개값으로 제공하고,
		// 결과를 리턴받아 result에 대입
		double result2 = myCal.divide(10, 4);
		System.out.println(result2);
		
		myCal.powerOff();
	}

}
