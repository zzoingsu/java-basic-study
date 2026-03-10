/**
 * Title: ArithmeticOperatorExample
 * Date: 2026.03.09
 * @author zzoingsu
 */
package ch03.sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		long v4 = 10l;
		
		int result1 = v1 + v2;   // Byte의 연산은 int로 자동타입변환후 연산 
		System.out.println("result1: "+ result1);
		long result2 = v1 + v2 -v4;  // long의 연산은 다른 타입들을 자동변환 시킨후 연산 
		System.out.println("result2: " + result2);
		double result3 = (double)v1 / v2;  // 결과가 실수로 나오기떄문에 실수타입으로 변환후 연산 
		System.out.println("result3: " + result3);
		int result4 = v1 % v2;   
		System.out.println("result4: " + result4);
	}

}
