/**
 * Title: CompareOperatorExample
 * Date: 2026.03.10
 * @author zzoingsu
 */
package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = ( num1 == num2 ); // num1과 num2의 값이 같은가? (boolean은 사용할때 ()를 사용해야한다)
		boolean result2 = ( num1 != num2 ); // num1과 num2의값이 다른가? 
		boolean result3 = ( num1 <= num2 ); // num1의 값이 num2의 값 보다 작거나같은가?
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
		System.out.println("result3: "+ result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // char 타입에 저장된 문자가 유니코드로 전환되어 유니코드의 값크기를 비교한다 
		System.out.println("result4: " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = ( num3 == num4); // 이떄 int 타입이 자동 타입변환되어서 double 타입으로 바뀐다
		System.out.println("result5: " + result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = ( num5 == num6 ); // 실수를 부동소수점방식으로 저장하기때문에 float에 저장된 0.1의 값과 double에 저장된 0.1의 값이 다르다 
		boolean result7 = ( num5 == (float)num6 ); // 이렇게 강제타입변환을 해줘야 둘에저장된 0.1의 값이 같음으로 나온다 
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		String str1 = "자바";
		String str2 = "자바 ";
		boolean result8 = (str1.equals(str2)); // 문자열끼리의 비교 
		boolean result9 = (!str1.equals(str2));// 문자열에서 공란도 문자열로 인식하기때문에 str1과 str2는 다르다고 나온다 
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
	}

}
