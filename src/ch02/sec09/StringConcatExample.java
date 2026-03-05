/**
 * @author zzoingsu
 */
/*
 * title: StringConcatExample
 *  Date: 2026.03.04
 */
package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산 
		int result1 = 10 + 2 + 8;
		System.out.println("result1: "+ result1);
		//결합 연산
		String result2 = 10 + 2 + "8";   // 연산중 문자열이있으면 문자열로 자동타입변환되어 문자로 변환후 연산된다  
		System.out.println("result: "+ result2);
		String result3 = 10 + "2" + 8;   // 연산은 기본적으로 왼쪽에서 오른쪽으로 가는데 앞에 문자열이 있으면 그 뒤에도 문자로 변환되어 연산한다  
		System.out.println("result3: "+ result3);
		String result4 = "10" + 2 + 8;
		System.out.println("result4: "+ result4);
		String result5 = "10" + (2 + 8);   // 괄호 먼저 연산한후 문자로 변환되어 연산한다 
		System.out.println("result5: "+ result5);
	}

}
