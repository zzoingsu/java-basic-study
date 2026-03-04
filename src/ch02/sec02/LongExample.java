package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;   // int 타입 변수를 설정하고 int 범위 값을 대입하고 l을 붙히면 컴파일러가 난다  
		long var2 = 20l;  // 정수타입 변수는 기본적으로 int 취급이기때문에 long 타입 변수를 사용하고 싶을때는 l 을 붙혀야한다 
		long var3 = 10000000000L;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
