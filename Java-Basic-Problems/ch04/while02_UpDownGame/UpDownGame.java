package ch04.while02_UpDownGame;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		System.out.println("*게임정보*\n랜덤한 숫자는 1부터 100까지! 랜덤한 숫자를 맞춰보세요!\n");
		int randomNumber = (int)(Math.random()*100 + 1);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String resultStatus;
		while (true) {
			System.out.print("숫자 입력> ");
			int inputNumber = Integer.parseInt(sc.nextLine());
			count++;
			if (randomNumber == inputNumber) {
				System.out.println("정답입니다!");
				sc.close();
				break;
			}else if (inputNumber < randomNumber) {
				 resultStatus = "UP!";
			}else {
				 resultStatus = "DOWN!";
			}
			System.out.println("결과> " + resultStatus);
			System.out.println();
		}
		System.out.println("시도횟수: " + count);
		sc.close();
/*개선및 수정방향
 * 1.Scanner을 재사용하는건 자원 낭비
 */
	}

}
