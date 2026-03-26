package ch06.sec08.example02;

public class ComputerExample {

	public static void main(String[] args) {
		// Computer 객체 생성
		Computer myCom = new Computer();
		
		// sum 메소드 호출시 1,2,3을 제공하고 
		// 합산결과를 리턴받아 result1에 대입
		int result1 = myCom.sum(1, 2, 3);
		System.out.println(result1);

		int result2 = myCom.sum(new int[] {1,2,3,4,5,});
		System.out.println(result2);
	}

}
