package SeminarApplicationAndNotificationManagementSystem;

import java.util.Scanner;

public class SeminarApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "신청,신청 취소,신청자 목록,정보 출력,종료";
		String[] menuArray = menu.split(","); 
		Seminar seminar = new Seminar("세미나", 50);
		
		
		
		application : while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 신청 | 2. 신청 취소 | 3. 신청자 목록 | 3. 정보 출력 | 4. 종료 ");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택: ");
			int menuNum = Integer.parseInt(sc.nextLine());
			System.out.println("[" + menuArray[menuNum - 1] + "]");
			switch (menuNum) {
			case 1 -> {
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("연락처: ");
				int phoneNumber = Integer.parseInt(sc.nextLine());
				
				System.out.print("상태: ");
			}
			case 2 -> {
				
			}
			case 3 -> {
				
			}
			case 4 -> {
				System.out.println("프로그램을 종료합니다");
				break application;
			}
			
			}
		}
		
	}

}
