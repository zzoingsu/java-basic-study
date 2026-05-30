package SeminarApplicationAndNotificationManagementSystem;

public class SeminarRegister {
	
	// 중복검사
	public int findDuplicate(Seminar.Applicant[] applicants, String name, String phoneNumber) {
		for(int i=0; i<applicants.length; i++) {
			if(applicants[i] != null && applicants[i].getName().equals(name) && applicants[i].getPhoneNumber().equals(phoneNumber)) {
				return i;
			}
		}
		return -1;
	}
	
	// 배열 자리 확인
	public boolean isFull(Seminar.Applicant[] applicants) {
		for(int i=0; i<applicants.length; i++) {
			if(applicants[i]== null) {
				return true;
			}
		}
		return false;
	}
	
	// 배열에 저장된 정보가 있는지 확인
	public boolean hasStandBy(Seminar.Applicant applicants[]) {
		for(int i=0; i<applicants.length; i++) {
			if(applicants[i] != null) {
				return true;
			}
		}
		return false;
	}

}
