/**
 * Title: AssignmentOperatorExample
 * Date: 2026.03.12
 * @author zzoingsu
 */
package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10; // result에 10을 더하고 더한값을 result에 저장
		System.out.println("result: "+ result);
		result -= 5;  // 연산을 마친값을 result에 저장  
		System.out.println("result: "+ result);
		result *= 3;
		System.out.println("result: "+ result);
		result /= 5;
		System.out.println("result: "+ result);
		result %= 3;
		System.out.println("result: "+ result);
		// 연산이 완료된 값을 바로 변수에 저장한다	
	}

}
