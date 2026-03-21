package ch04.DoWhile02_MenuCalculate;

import java.util.Scanner;

public class MenuCalculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		int sum = 0;
		do {
			System.out.println();
			System.out.println("----------메뉴----------");
			System.out.println("     1. 숫자 입력");
			System.out.println("     2. 합계 출력");
			System.out.println("     3. 종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			int menuNumber = Integer.parseInt(sc.nextLine());
			switch (menuNumber) {
			case 1 -> {
				System.out.print("숫자 입력> ");
					int inputNumber = Integer.parseInt(sc.nextLine());
					sum += inputNumber;
			}
			case 2 -> System.out.println("현재 합계 > " + sum);
			case 3 -> {
				System.out.println("프로그램 종료");
				isRun = false;
			}
			default -> System.out.println("잘못된 번호입니다");
			}
			
		}while(isRun);
		sc.close();
	}
}
