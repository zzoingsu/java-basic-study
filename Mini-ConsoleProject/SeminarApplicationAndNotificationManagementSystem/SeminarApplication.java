package SeminarApplicationAndNotificationManagementSystem;

import java.util.Scanner;

public class SeminarApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "신청,신청 취소,신청자 목록,정보 출력,종료";
		String[] menuArray = menu.split(","); 
		Seminar seminar = new Seminar("세미나", 50);
		Seminar.Applicant[] applicants = new Seminar.Applicant[50];
		Seminar.Applicant[] standByApplicants = new Seminar.Applicant[100];
		boolean isSeminarLeft = false;
		boolean isArrayLeft = false;
		
		application : while(true) {
			System.out.println();
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 신청 | 2. 신청 취소 | 3. 신청자 목록 | 3. 정보 출력 | 4. 종료 ");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			System.out.println("   [" + menuArray[menuNum - 1] + "]");
			switch (menuNum) {
			case 1 -> {
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("연락처: ");
				int phoneNumber = Integer.parseInt(sc.nextLine());
				Seminar.Applicant findDuplicate = Seminar.Applicant.findDuplicate(applicants, name, phoneNumber);
				if(findDuplicate != null) {
					System.out.println("신청자 정보와 중복됩니다");
					continue;
				}
				for(int i = 0; i < applicants.length; i++) {
					if(applicants[i] == null) {
						applicants[i] = seminar.new Applicant(name,phoneNumber);
						isSeminarLeft = true;
						System.out.println("세미나가 신청되었습니다");
						break;
					}else {
						isSeminarLeft = false;
					}
				}if(!isSeminarLeft) {
					for(int i = 0; i < standByApplicants.length; i++) {
						if(standByApplicants[i] == null) {
							standByApplicants[i] = seminar.new Applicant(name,phoneNumber);
							System.out.println("세미나 신청인원 초과로 대기신청자로 접수되었습니다");
							System.out.println("대기번호 " +(i+1)+ "번");
							isArrayLeft = true;
							break;
						}
					}
					if(!isArrayLeft) {
						System.out.println("대기인원이 마감되었습니다");
					}
				}
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
		sc.close();
	}

}
