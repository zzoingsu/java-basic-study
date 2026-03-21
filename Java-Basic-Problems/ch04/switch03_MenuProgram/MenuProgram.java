package ch04.switch03_MenuProgram;

import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		double result = 0;
		
		while (isRun) {
			System.out.println("-----------------");
			System.out.println("    1. 더하기");
			System.out.println("    2. 빼기");
			System.out.println("    3. 곱하기");
			System.out.println("    4. 나누기");
			System.out.println("    5. 종료");
			System.out.println("-----------------");
			System.out.print("선택> ");
			String inputNumber = sc.nextLine();
			if (inputNumber.equals("5")) {
				isRun = false;
				System.out.println("프로그램을 종료합니다");
			}else {
			System.out.print("첫 번쨰 숫자 입력> ");
			double firstNumber = Integer.parseInt(sc.nextLine());
			System.out.print("두 번쨰 숫자 입력> ");
			int secondNumber = Integer.parseInt(sc.nextLine());
			
			 switch (inputNumber) {
				case "1" -> {
					result =  firstNumber + secondNumber;
				}
				case "2" -> {
					result = firstNumber - secondNumber;
				}
				case "3" -> {
					result = firstNumber * secondNumber;
				}
				case "4" -> {
						if (secondNumber == 0 ) {
							System.out.print("잘못된 숫자입력입니다");
							System.out.println(" ");
							break;
						} else {
							result = firstNumber / secondNumber;
						}
				}
				default ->  {
					System.out.println("잘못된 선택입니다");
				}
			}
			System.out.print("결과: " + result);
			System.out.println(" ");
			System.out.println(" ");
		}
	}
            sc.close();
/*개선및수정방향
 * 1. 잘못된 번호를 눌러도 숫자 입력을 한다 
 * 2. 입력값은 int로 받는데 아래에서는 double로 받음 (통일성 저해)
 *  3. 잘못된 번호를 눌러도 결과값이 나온다
 */
           
           
	}
}