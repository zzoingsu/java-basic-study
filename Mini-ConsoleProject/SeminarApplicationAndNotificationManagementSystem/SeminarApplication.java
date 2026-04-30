package SeminarApplicationAndNotificationManagementSystem;

import java.util.Scanner;

public class SeminarApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "신청,신청 취소,신청자 목록,정보 출력,종료";
		String[] menuArray = menu.split(","); 
		Seminar seminar = new Seminar("취업박람회 세미나",3);
		Seminar.Applicant[] seminarApplicants = new Seminar.Applicant[seminar.getCapcityOfPeople()];
		Seminar.Applicant[] standByApplicants = new Seminar.Applicant[seminar.getCapcityOfPeople()];
		
		application : while(true) {
			System.out.println();
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 신청 | 2. 신청 취소 | 3. 신청자 목록 | 4. 정보 출력 | 5. 종료 ");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			// 예외처리
			if (menuNum<1 || 5<menuNum ) {
				System.out.println("[잘못된 입력입니다]");
				continue;
			}
			System.out.println("  [" + menuArray[menuNum - 1] + "]");
			switch (menuNum) {
			
			case 1 -> {// 각각의 배열에 빈자리가있는지 확인
				boolean isSeminarFull = Seminar.isArrayFull(seminarApplicants);
				boolean isStandByFull = Seminar.isArrayFull(standByApplicants);
				
				// 모든 배열에 빈자리가 없을떄 
				if(isSeminarFull && isStandByFull) {
					System.out.println("[신청이 마감되었습니다]");
					break;
				}
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("연락처: ");
				int phoneNumber = Integer.parseInt(sc.nextLine());
				// 중복검사
				int findSeminarDuplicate = Seminar.findDuplicate(seminarApplicants, name, phoneNumber);
				int findStandByDuplicate = Seminar.findDuplicate(standByApplicants, name, phoneNumber);
				if(findSeminarDuplicate != -1 || findStandByDuplicate != -1) {
					System.out.println("[신청자 정보와 중복됩니다]");
					continue;
				}
				// 세미나 정원 이내일때
				if(!isSeminarFull) {
					for(int i = 0; i<seminarApplicants.length; i++) {
						if(seminarApplicants[i] == null) {
							seminarApplicants[i] = seminar.new Applicant(name, phoneNumber);
							System.out.println("[세미나가 신청되었습니다]");
							break;
						}
					}
				}
				// 세미나 정원 초과일때
				if(isSeminarFull) {
					for(int i = 0; i<standByApplicants.length; i++) {
						if(standByApplicants[i] == null) {
							standByApplicants[i] = seminar.new Applicant(name, phoneNumber);
							System.out.println("[세미나 신청인원 초과로 인해 대기신청자로 접수되었습니다]");
							System.out.println("[대기번호 " + (i+1) + "번]");
							break;
						}
					}
				}
				 /** 
				    boolean isSeminarLeft = false;
					boolean isArrayLeft = false;
				    for(int i = 0; i < seminarApplicants.length; i++) {
					if(seminarApplicants[i] == null) {
						seminarApplicants[i] = seminar.new Applicant(name,phoneNumber);
						isSeminarLeft = true;
						System.out.println("[세미나가 신청되었습니다]");
						break;
					}
				}
				  if(!isSeminarLeft) {
					for(int i = 0; i < standByApplicants.length; i++) {
						if(standByApplicants[i] == null) {
							standByApplicants[i] = seminar.new Applicant(name,phoneNumber);
							System.out.println("[세미나 신청인원 초과로 인해 대기신청자로 접수되었습니다]");
							System.out.println("[대기번호 " +(i+1)+ "번]");
							isArrayLeft = true;
							break;
						}
					}
					if(!isArrayLeft) {
						System.out.println("[대기인원이 마감되었습니다]");
					}
				}
				*/
			}
			case 2 -> {
				System.out.println("[1. 세미나 신청자 | 2. 대기신청자 ]");
				System.out.print("선택 >");
				int choosenNum = Integer.parseInt(sc.nextLine());
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("연락처: ");
				int phoneNumber = Integer.parseInt(sc.nextLine());
				// 세미나 신청자일 경우
				if(choosenNum == 1) {
					// 중복검사
					int foundIndex = Seminar.findDuplicate(standByApplicants, name, phoneNumber);
					if(foundIndex == -1) {
						System.out.println("[일치하는 회원이 없습니다]");
						continue;
					}
						boolean hasStandBy = Seminar.hasStandBy(standByApplicants);
						//대기신청자가 존재하지않을 경우
						if(!hasStandBy) {
							seminarApplicants[foundIndex] = null;
						//대기신청자가 존재할 경우
						}else {
							for(int i=0; i<standByApplicants.length; i++) {
								if(standByApplicants[i] != null) {
									seminarApplicants[foundIndex] = seminar.new Applicant(standByApplicants[i].name, standByApplicants[i].phoneNumber);
									standByApplicants[i] = null;
									break;
								
							}
						}
					}
					// 대기신청자일 경우
				}if(choosenNum == 2) {
					// 중복검사
					int foundIndex = Seminar.findDuplicate(standByApplicants, name, phoneNumber);
					if(foundIndex != -1) {
						standByApplicants[foundIndex] = null;
					}
				}
			
				System.out.println("[신청이 취소되었습니다]");
				}
			
						/**
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
					*/
			
			case 3 -> {
				Seminar.showApplicantsInfo(seminarApplicants, standByApplicants);
				// 신청자 정보 출력
				
			}
			case 4 -> {
				Seminar.showSeminarInfo(seminar, seminarApplicants, standByApplicants);
				// 세미나 정보 출력
			}
			case 5-> {
				System.out.println("[프로그램을 종료합니다]");
				break application;
				}
			}
		}
		sc.close();
	}
}
