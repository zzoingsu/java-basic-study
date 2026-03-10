/**
 * Title:SignOperatorExample
 * Date: 2026.03.09
 * @author zzoingsu
 */
package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 부호연산자 
		byte a = 100;
		int result1 = -a;  // 부호연산자도 연산으로 취급되기때문에 정수타입중 int보다 작은 타입들은 int를 사용해야한다  
		System.out.println("result1: "+result1);
		
		int x = -100;
		int result2 = -x;
		System.out.println("result2: "+result2);
		
		byte y =100;
		int result3 = -y;
		System.out.println("result3: "+result3);
		// 증감연산자
		int x2 = 1;
		int y2 = 1;
		int result4 = ++x2 + 10; // 전치연산자는 1을 더한후 연산을 진행 
		int result5 = y2++ + 10; // 후치연산자는 연산이 끝나고 변수의값에 1을 더한다 따라서 y2에 저장된값은2가 된다  
		System.out.println("result4: "+result4);
		System.out.println("result5: "+result5);
		
		int x3 = 10;
		int y3 = 10;
		int z3;
		
		++x3;
		x3++;
		System.out.println("X3: "+ x3);
		--y3;
		y3--;
		System.out.println("Y3: "+ y3);
		z3 = x3++;
		System.out.println("Z3: "+ z3);
		System.out.println("X3: "+ x3);
		z3 = ++x3;
		System.out.println("Z3: "+ z3);
		System.out.println("X3: "+ x3);
		z3 = ++x3 + y3++;
		System.out.println("X3: "+ x3);
		System.out.println("Y3: "+ y3);
		System.out.println("Z3: "+ z3);
		
	}

}
