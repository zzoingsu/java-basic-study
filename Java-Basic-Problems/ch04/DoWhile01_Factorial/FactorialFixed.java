package ch04.DoWhile01_Factorial;

import java.util.Scanner;

public class FactorialFixed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력> ");
		int inputNumber = Integer.parseInt(sc.nextLine());
		int i = 0;
		int result = 1;
		if (inputNumber == 0) {
			System.out.println("0! = 1");
		}else if (inputNumber < 0) {
			System.out.println("음수는 팩토리얼이 정의되지 않습니다");
		}else {
		do {
			result *= inputNumber - i;
			i++;
		} while (inputNumber > i);   
		
		System.out.println(inputNumber + "! = " + result);
		}
		sc.close();
	}
	
}
