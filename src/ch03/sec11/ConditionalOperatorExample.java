/**
 * Title: ConditionalOperatorExample
 * Date: 2026.03.12
 * @author zzoingsu
 */
package ch03.sec11;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score >= 90) ? 'A' : ( (score >= 80) ? 'B' : 'c');
		System.out.println(score + "점은 " +grade + "등급입니다");
		// ? 앞의 부분은 식의 조건에 해 : 앞부분은 참일떄 출력되는 부분 : 뒷부분은 거짓일떄 출력되는부분
		// 이때 실제로 출력 되는것은 문자이기때문에 char 타입을 사용한다 
	}

}
