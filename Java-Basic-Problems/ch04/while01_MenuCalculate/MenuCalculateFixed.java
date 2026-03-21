package ch04.while01_MenuCalculate;

import java.util.Scanner;

public class MenuCalculateFixed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double count = 0;
		
		while(true) {
			System.out.print("숫자 입력>");
			int inputNumber = Integer.parseInt(sc.nextLine());
			
				if (inputNumber < 0) {
					break;
				}
				sum += inputNumber;
				count++;
		}
				if (count == 0) {
					System.out.println("잘못된 입력입니다");
				}else {
					double avgNumber = sum / count;
					System.out.printf("평균> %.2f", avgNumber);
			}
		sc.close();
	}
	
}
