package ch04.DoWhile01_Factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력> ");
		int inputNumber = Integer.parseInt(sc.nextLine());
		int i = 0;
		int sum = 1;
		
		do {
			sum *= inputNumber - i;
			i++;
		} while (inputNumber > i);    //i가 증가하면서 inputNumber번 반복하도록 제어한다
		
		System.out.println(inputNumber + "! = " + sum);
		sc.close();
		
/*개선및수정 방향 
 * 1. 0! 일때 값이 정확하게 나오지않음
 * 2. 변수명은 sum 보다 result가 어울림
 * 3. 음수일떄 대응이 없음
 */
	}
}