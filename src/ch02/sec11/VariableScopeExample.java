/**
 * @author zzoingsu
 */
/*
 * title: VariableScopeExample
 *  Date: 2026.03.05
 */
package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10);{     
			int v2 = v1 - 10; 
		
		int v3 = v1 + 5;   // 변수 v2는 if 블록 내부에 있기때문에 블록 외부의 v3는 변수 v2를 사용할수없다
		System.out.println(v2); // 결과출력에서 v2와 블록이 달라서 컴파일에러가뜨면 출력문을 블록내부로 위치시키면 가능하다 
	    System.out.println(v3);
		}
	}
}
