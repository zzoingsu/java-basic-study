package ch06.Class07_AccountManagementProgram;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "계좌 생성,계좌 목록,예금,출금,종료";
		String[] menuArray = menu.split(",");
		Account[] accounts =new Account[100];   
		int accountNumberCount = 0;
		for(int i = 0; i < accounts.length; i++) {
		bankApplication : while (true) {
			System.out.println("");
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print(" 선택 > ");
			int menuNumber = Integer.parseInt(sc.nextLine());
			System.out.println("-----------------");
			

			if (menuNumber <= 0 || menuNumber >= 6 ) {
				System.out.println("잘못된 번호 입력입니다");
				System.out.println("---------------");
				continue;
			}
			if (myAccount == null && (menuNumber <= 4 && menuNumber > 1)) {
				System.out.println("계좌없이 사용 할수없는 서비스입니다");
				System.out.println("---------------");
				continue;
			}else {
				System.out.println("    "+ menuArray[menuNumber - 1]);
				System.out.println("---------------");
			}
		
			
			
	
			switch (menuNumber) {
			case 1 -> {	
				
				System.out.print("계좌 번호: ");
				int accountNumber = Integer.parseInt(sc.nextLine());
				System.out.print("계좌주: ");
				String accountHolder = sc.nextLine();
				System.out.print("초기 입금액: ");
				int initialDeposit = Integer.parseInt(sc.nextLine());
				if (initialDeposit < 0) {
					System.out.println("잘못된 입금 금액입니다");
				}
					for ()
				myAccount = new Account(accountNumber, accountHolder, initialDeposit);
				System.out.println("계좌가 생성되었습니다");
				continue;
			}
			case 2 -> {
				myAccount.showAccountInfo();
				continue;
			}
			case 3 -> {
				System.out.print("계좌번호: ");
				int depositAccount = Integer.parseInt(sc.nextLine());
				boolean isMatched = myAccount.checkAccountNumber(depositAccount);
				
				if (isMatched) {
					System.out.print("예금액: ");
					int depositMoney = Integer.parseInt(sc.nextLine());
					myAccount.deposit(depositMoney);
					continue;
				}else {
					System.out.println("일치하는 계좌가 없습니다");
					continue;
				}
			}
			case 4 -> {
				System.out.print("계좌번호: ");
				int withdrawAccount = Integer.parseInt(sc.nextLine());
				boolean isMatched = myAccount.checkAccountNumber(withdrawAccount);
				
				if (isMatched) {
					System.out.print("출금액: ");
					int withdrawMoney = Integer.parseInt(sc.nextLine());
					myAccount.withDraw(withdrawMoney);
				}else {
					System.out.println("일치하는 계좌가 없습니다");
					continue;
				}
			}
			case 5 -> {
				System.out.println("프로그램 종료");
				break bankApplication;
				}
			}
			}
			
		}
		sc.close();
	}
	// 계좌가 계속 초기화되는 오류발생 -> 반복문 외부에 위치함으로 해결
	// 계좌 생성은 가능하지만 계좌를 만드는 사람이 여러명일 경우 오류발생
	// 만약 계좌를 생성하지않고 계좌목록이나 다른 기타 활동시 예외처리 필요 -> 예외처리 완료
	// 계좌번호를 잘못 입력했을시 출력 필요 -> 출력이 반복되는 버그 발생 -> 클래스와 메인에서 중복해서 출력됨을 확인후 수정완료 
	
	/** 다계좌 버전 흐름구상
	 * 1.계좌 객체를 배열로 처리
	 * 2. 예외처리에서 하나라도 null이 아닐때로 수정
	 * 3. 계좌 객체를 생성후 배열에 저장
	 * 4. 계좌 목록에서의 배열출력(null제외)
	 * 5. 입출금 계좌 확인
	 * 
	 */
	}

