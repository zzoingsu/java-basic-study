package ch04.while01_MenuCalculate;

import java.util.Scanner;

public class MenuCalculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRun =true;
		double sum = 0;
		double count = 0;
		
		while(isRun) {
			System.out.print("숫자 입력>");
			int inputNumber = Integer.parseInt(sc.nextLine());
			sum += inputNumber;
			count++;
			if (inputNumber < 0) {
				isRun = false;
			}
		}
		double avgNumber = sum / count;
		System.out.printf("평균> %.2f", avgNumber);
		sc.close();
/** 개선및수정 방향
 * 1. 음수가 sum과 count에 포함됨
 * 2. 종료시점이 너무 늦음 
 * 3. count가 0일때 처리에러
 */
	}

}
