package SeminarApplicationAndNotificationManagementSystem;

import java.util.Scanner;

public class SeminarApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "신청,신청 취소,신청자 목록,정보 출력,종료";
		String[] menuArray = menu.split(","); 
		Seminar seminar = new Seminar("세미나", 50);
		Seminar.Applicant[] seminarApplicants = new Seminar.Applicant[1];
		Seminar.Applicant[] standByApplicants = new Seminar.Applicant[1];
		boolean isSeminarLeft = false;
		boolean isArrayLeft = false;
		
		application : while(true) {
			System.out.println();
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 신청 | 2. 신청 취소 | 3. 신청자 목록 | 4. 정보 출력 | 5. 종료 ");
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
				int findDuplicate = Seminar.Applicant.findDuplicate(seminarApplicants, name, phoneNumber);
				if(findDuplicate != -1) {
					System.out.println("신청자 정보와 중복됩니다");
					continue;
				}
				for(int i = 0; i < seminarApplicants.length; i++) {
					if(seminarApplicants[i] == null) {
						seminarApplicants[i] = seminar.new Applicant(name,phoneNumber);
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
							System.out.println("세미나 신청인원 초과로 인해 대기신청자로 접수되었습니다");
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
				boolean isArrayEmpty = true;
				System.out.println("[1. 세미나 신청자 | 2. 대기신청자 ]");
				System.out.print("선택 >");
				int choosenNum = Integer.parseInt(sc.nextLine());
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("연락처: ");
				int phoneNumber = Integer.parseInt(sc.nextLine());
				
				if(choosenNum == 1) {
					int foundIndex = Seminar.Applicant.findDuplicate(seminarApplicants, name, phoneNumber);
					// 중복검사
					if(foundIndex == -1) {
						System.out.println("일치하는 회원이 없습니다");
						continue;
					}else {
						for(int i = 0; i < standByApplicants.length; i++) {
							if(standByApplicants[i] != null) {
								isArrayEmpty = false;
								break;
							}
						}if(!isArrayEmpty) {
							for(int i = 0; i < standByApplicants.length; i++) {
								if(standByApplicants[i] != null) {
									seminarApplicants[foundIndex] = seminar.new Applicant(standByApplicants[i].name, standByApplicants[i].phoneNumber);
									standByApplicants[i] = null;
									break;
									// 대기신청자가 있을때 세미나 신청취소자 배열인덱스에 대기신청자 정보 넣기
								}
							}
						}if(isArrayEmpty) {
							seminarApplicants[foundIndex] = null;
							// 대기신청자가 없을때 처리
					}
				}if(choosenNum == 2) {
					foundIndex = Seminar.Applicant.findDuplicate(standByApplicants, name, phoneNumber);
					if(foundIndex != -1) {
						standByApplicants[foundIndex] = null;
						
					}
				}
			}
				System.out.println("신청이 취소되었습니다");
			}
			case 3 -> {
				Seminar.showInfo(seminarApplicants, standByApplicants);
				
			}
			case 4 -> {
				// 세미나 정보 출력
			}
			case 5-> {
				System.out.println("프로그램을 종료합니다");
				break application;
			}
			
			}
		}
		sc.close();
	}

}
