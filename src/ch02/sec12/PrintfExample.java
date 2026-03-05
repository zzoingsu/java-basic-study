/**
 * @author zzoingsu
 */
/*
 * title: PrintfExample
 *  Date: 2026.03.05
 */
package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
	System.out.printf("이름: %s\t", "zzoingsu");   // 출력값이 문자열이기를 원하면 괄호안 출력 내용에 "를 넣어야한다 (println과 다르지않음)
	System.out.printf("나이: %d\t", 23);           // 출력값이 숫자로 나오길 원하면 "를 사용하지않지만 숫자인 문자로 출력하려면 %d가 아니라 %s를 사용한다 
	
	System.out.printf("\nID: %2$s\tE-mail: %1$s\n","nininick@naver.com","zzoingsu");
	// 형식문자열의 값이 두개 이상일 경우 순서를 지정해야하지만 지정하지않으면 컴파일에러는 아니지만 의도대로 출력되지않는다 
	// 지정하지않고 나오는 순서는 제공된 값의 순서이다 
    // 형식문자열은 하나의로 인식되아야하기 때문에 "를 사용해서 나누면 의도대로 나오지않는다 
	// 형식문자열 내부 출력하고싶은문자중 %는 항상 앞에 위치해야한다 
	// 형식문자열 속 값의순번 $의위치는 %바로 뒤이다
	
	int value = 123;
	System.out.printf("상품의 가격: %1$d\n", value);
	System.out.printf("상품의 가격: %6d\n", value);     // width 를 사용할떄 앞에 공란을 사용하고싶을때는 출력값의 정수자리수를 변환문자 앞에 두어야한다 
	System.out.printf("상품의 가격: %-6d\n", value);    // 의도가 변수값 뒤를 공란 으로 두는것이기때문에 -를 사용했는데 이때 -의 위치가 width 앞에 위치해야한다  
	System.out.printf("상품의 가격: %06d\n", value);    // 변수값 앞의 공란을 0으로 두고싶을때는 width 앞에 0을 위치해야한다 
	System.out.printf("반지름이 %2$d인 원의 넓이: \t%1$6.3f\n ", 314.16,10);   // $표시는 숫가 기호보다 앞으로위치해야한다 
	System.out.printf("%1$3d | %2$s\t |\t %3$s", 1,"zzoingsu","king");
	
	
	}

}
