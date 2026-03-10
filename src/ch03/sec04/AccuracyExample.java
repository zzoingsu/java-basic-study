/**
 * Title: AccuracyExample
 * Date: 2026.03.09
 * @author zzoingsu
 */
package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - pieceUnit * number; 
		System.out.println("사과 1개에서 남은 양: "+ result);  
		// 컴퓨터는 실수를 정확하게 저장하지 못하기 때문에 정확한 계산이 필요할때는 정수연산으로 변경해야한다 
		
		int apple1 = 1;
		int totalPiece = apple1 * 10;
		int number1 = 7;
		
		int result1 = totalPiece - number1;
		System.out.println("10조각에서 남은양: "+ result1);
		System.out.println("사과1개에서 남은양: "+ result1 / 10.0); 
		// 10.0을 사용해야 실수로 연산이 되기때문에 소수점을 포함한 실수를 사용한다  
	}

}
