package ch04.if04_LargestNumberOutput;

import java.util.Scanner;

public class LargestNumberOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수입력: ");
		int firstNumber = Integer.parseInt(sc.nextLine());
		System.out.print("두번쨰 정수입력: ");
		int secondNumber = Integer.parseInt(sc.nextLine());
		System.out.print("세번째 정수입력: ");
		int thirdNumber = Integer.parseInt(sc.nextLine());
		
		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			 if (firstNumber == secondNumber || firstNumber == thirdNumber) {
				System.out.println("최대값: " + firstNumber + "(중복 있음)");
					}else {
						System.out.println("최대값: "+ firstNumber);
					}
			}else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
				if (secondNumber == firstNumber || secondNumber == thirdNumber) {
				System.out.println("최대값: " + secondNumber + "(중복 있음)");
					}else {
						System.out.println("최대값: "+ secondNumber);
					}
			}else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
				if (thirdNumber == firstNumber || thirdNumber == secondNumber) {
				System.out.println("최대값: " + thirdNumber + "(중복 있음)");
					}else{
						System.out.println("최대값: "+ thirdNumber);
					}
		}
		sc.close();
	}
}
