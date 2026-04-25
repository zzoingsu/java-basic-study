package SeminarApplicationAndNotificationManagementSystem;

public class Seminar {
	private String nameOfSeminar;
	private int capacityOfPeople;
	
	Seminar(String nameOfSeminar, int capacityOfPeople) {
		this.nameOfSeminar = nameOfSeminar;
		this.capacityOfPeople = capacityOfPeople;
	}
	public class Applicant {
		String name;
		int phoneNumber;
		String status;
		
		Applicant(String name, int phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		public static Applicant findDuplicate(Applicant applicants[],String name, int phoneNumber) {
			for (int i = 0; i < applicants.length; i++) {
				if(applicants[i] == null) {
					continue;
				}
				if(applicants[i].name.equals(name) && applicants[i].phoneNumber == phoneNumber) {
					return applicants[i];
				}
			}return null;	
		}
	}
	
	public static void showInfo(Seminar.Applicant seminarApplicants[], Seminar.Applicant standByApplicants[]) {
		boolean isArrayEmpty = true;
		for(int i = 0; i < seminarApplicants.length; i++) {
			if(seminarApplicants[i] != null) {
				System.out.println("세미나 신청자 | 이름: [" + seminarApplicants[i].name + "] | 연락처: [" + seminarApplicants[i].phoneNumber + "]");
				isArrayEmpty = false;
			}
		}if(isArrayEmpty) {
			System.out.println("세미나 신청자가 없습니다");
		}
		isArrayEmpty = true;
		// 변수 재사용을 위해 값 초기화
		for(int i = 0; i < standByApplicants.length; i++) {
			if(standByApplicants[i] != null) {
				System.out.println("대기신청자    | 이름: [" + standByApplicants[i].name + "] | 연락처: [" + standByApplicants[i].phoneNumber + "]");
				isArrayEmpty = false;
			}
		}if(isArrayEmpty) {
			System.out.println("대기신청자가 없습니다");
		}
	}
}
	


