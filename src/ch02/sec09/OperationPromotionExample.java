package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte x = 10;
		byte y = 20;
		int result = x + y;   //리터널이 아닌 변수끼리의 연산중 int보다 작은 타입은 int로 취급되기 때문에 byte result가 나오면 컴파일에러가 나온다 
		System.out.println(result);   // 리터널끼리의 연산은 커마일과정중에 연산하기때문에 byte result 가능 
		int a = 10;
		long b = 20;
		long result1 = a+b;   // 항상 int가 사용되는것이 아닌 int 보다 큰타입이 연산에 사용되면 큰 타입을 사용한다 
		System.out.println(result1);
		
		int intvalue = 10;
		double doublevalue = 3.14;
		double result2 = intvalue + doublevalue;   // 정수타입인 int와 실수타입인 double 타입을 연산할때 result의 타입은 double 타입을 사용한다 
		System.out.println(result2);
		int result3 = (int)doublevalue + intvalue;
		System.out.println(result3);   // 이와같은 상황에서 int 타입으로 연산하고 싶을때는 double 타입을 강제타입변환 시킨후 연산한다 
		
		int a1 = 1;
		int a2 = 2;
		int result4 = a1 / a2;   // 수학에서 1을 2로 나누면 0.5가 나오지만 int 는 정수타입이기 때문에 0이 출력된다 
		System.out.println(result4);   // 원래 연산인 0.5를 출력하려면 result의 타입을 실수타입으로 바꾸고 연산식속 변수의 타입을 실수로 바꿔야한다  
		double result5 = (double) a1 / (double) a2;   // result의 타입만 실수타입으로 바꾸면 정수와 정수의 연산 결과인 0.0이 나오기때문에 연산식 속 변수의타입또한 실수 타입으로 바꿔야한다 
		System.out.println(result5);// (double)(a1/a2)로 연산을하면 0.0이 나오는데 이는 괄호먼저 연산을 하니 두 변수의 타입은 바뀌지않은 상태에서 결과의 타입만 실수로 나오게된다 
// 연산식에서의 타입 변화
		byte result6 = 10 + 20;
		System.out.println("result6: " + result6);
		byte v1 = 10;
		byte v2 = 20;
		int result7 = v1 + v2;
		System.out.println("result7: " + result7);
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result8 = v3 + v4 + v5;
		System.out.println("result8; " + result8);
		char v6 = 'A';
		char v7 = 1;
		int result9 = v6 + v7;  // 변수끼리의 연산중 int보다 작은 타입은 int로 취급되기 때문에 char result 로 연산하면 컴파일 에러가 나온다 
		System.out.println("result9: " + result9);
		System.out.println("result9-1: " +(char)result9);   //새로 강제타입변환하고 결과값 선언해도 되기는하는데 출력할때 괄호 써서 바로 출력할수있다 
		int v8 = 10;
		int result10 = v8 / 4;
		System.out.println("result10: " + result10);
		int v9 = 10;
		double result11 = v9 / 4.0;
		System.out.println("result11: " + result11);
		int v10 = 1;
		int v11 = 2;
		double result12 = (double) v10 / v11;
		System.out.println("result12; " + result12);
		
		
	}

}
