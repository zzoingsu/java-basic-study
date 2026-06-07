package SeminarApplicationAndNotificationManagementSystem;

import java.util.List;

public class SeminarRegister {
	// 중복검사
	public int findDuplicate(List<Seminar.Applicant> applicants, String name, String phoneNumber) {
		for(int i=0; i<applicants.size(); i++) {
			if(applicants.get(i) != null && applicants.get(i).getName().equals(name) && applicants.get(i).getPhoneNumber().equals(phoneNumber)) {
				return i;
			}
		}
		return -1;
	}
	
	// 배열 자리 확인
	public boolean isFull(List<Seminar.Applicant> applicants, int capacity) {
		return applicants.size() >= capacity;
	}
	
	// 배열에 저장된 정보가 있는지 확인
	public boolean hasStandBy(List<Seminar.Applicant> applicants) {
		for(int i=0; i<applicants.size(); i++) {
			if(applicants.get(i) != null) {
				return true;
			}
		}
		return false;
	}
	
	// 신청자 목록 출력
	public void showApplicantsInfo(List<Seminar.Applicant> seminarApplicants, List<Seminar.Applicant> standByApplicants) {
	boolean isArrayEmpty = true;
		for(int i = 0; i < seminarApplicants.size(); i++) {
			if(seminarApplicants.get(i) != null) {
				System.out.println("세미나 신청자 | 이름: [" + seminarApplicants.get(i).getName() + "] | 연락처: [" + seminarApplicants.get(i).getPhoneNumber() + "]");
				isArrayEmpty = false;
			}
		}if(isArrayEmpty) {
				System.out.println("[세미나 신청자가 없습니다]");
			}
			// 변수 재사용을 위해 값 초기화
			isArrayEmpty = true;
				for(int i = 0; i < standByApplicants.size(); i++) {
					if(standByApplicants.get(i) != null) {
						System.out.println("대기신청자   | 이름: [" + standByApplicants.get(i).getName() + "] | 연락처: [" + standByApplicants.get(i).getPhoneNumber() + "]");
						isArrayEmpty = false;
					}
			}if(isArrayEmpty) {
				System.out.println("[대기신청자가 없습니다]");
				}
			}
	
	// 정보 출력	
	public void showSeminarInfo(Seminar seminar, List<Seminar.Applicant> seminarApplicants, List<Seminar.Applicant> standByApplicants) {
		// 세미나신청 인원 수
		int seminarApplicantsNum = 0; 
		for(int i = 0; i<seminarApplicants.size(); i++) {
			if(seminarApplicants.get(i) != null) {
				seminarApplicantsNum++;
				}
			}
		// 대기신청 인원 수
		int standByApplicantsNum = 0;
		for(int i = 0; i<standByApplicants.size(); i++) {
			if(standByApplicants.get(i) != null) {
				standByApplicantsNum++;
				}
			} 
		System.out.println("세미나 이름: [" + seminar.getNameOfSeminar() + "]" );
		System.out.println("정원: " + seminar.getCapacityOfPeople() + "명");
		System.out.println("전체 신청자 수: " + (seminarApplicantsNum + standByApplicantsNum) + "명");
		System.out.println("신청완료 수: " + seminarApplicantsNum+ "명");
		System.out.println("대기신청 수: " + standByApplicantsNum + "명");
		System.out.println("남은 좌석 수: " + (seminar.getCapacityOfPeople() - seminarApplicantsNum) + "석");
		}
}
