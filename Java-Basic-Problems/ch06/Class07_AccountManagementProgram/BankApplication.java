package ch06.Class07_AccountManagementProgram;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		bankApplication : while (true) {
			System.out.println("");
			System.out.println("---------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2. 게좌 목록 | 3. 예금 | 4. 출금 | 5. 입금 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print(" 선택 > ");
			int menuNumber = Integer.parseInt(sc.nextLine());
			System.out.println("--------");
			
			break bankApplication;
		}
	}

}
