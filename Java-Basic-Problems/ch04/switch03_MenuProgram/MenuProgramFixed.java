package ch04.switch03_MenuProgram;

import java.util.Scanner; 

public class MenuProgramFixed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while (isRun) {
			System.out.println("----------------");
			System.out.println("   1. 더하기 ");
			System.out.println("   2. 빼기");
			System.out.println("   3. 곱하기");
			System.out.println("   4. 나누기");
			System.out.println("   5. 종료");
			System.out.println("----------------");
			System.out.print("선택> ");
			int inputNumber = Integer.parseInt(sc.nextLine());
		if (inputNumber == 5) {
			System.out.print("프로그램 종료");
			isRun = false;
			continue;
		}else if(inputNumber < 1 || 5 < inputNumber) {
			System.out.print("잘못된 숫자 입력");
			continue;
		}			
			System.out.print("첫 번쨰 숫자 입력 > ");
			double firstNumber = Double.parseDouble(sc.nextLine());
			System.out.print("두 번쨰 숫자 입력 > ");
			double secondNumber = Double.parseDouble(sc.nextLine());
			
			if(inputNumber == 4 && secondNumber == 0) {
				System.out.print("0으로 나눌수 없습니다");
				continue;
			}
			
			double result = switch (inputNumber) {
			case 1 -> firstNumber + secondNumber;
			case 2 -> firstNumber - secondNumber;
			case 3 -> firstNumber * secondNumber;
			case 4 -> firstNumber / secondNumber;
			default -> 0;
			};
			System.out.println("결과: " + result);
			
		
			sc.close();
		}
		
	}

}
