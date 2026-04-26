package SeminarApplicationAndNotificationManagementSystem;

public class Seminar {
	private String nameOfSeminar;
	private int capacityOfPeople;
	
	Seminar(String nameOfSeminar, int capacityOfPeople) {
		this.nameOfSeminar = nameOfSeminar;
		this.capacityOfPeople = capacityOfPeople;
	}
	
	public String getNameOfSeminar() {
		return nameOfSeminar;
	}
	
	public int getCapcityOfPeople() {
		return capacityOfPeople;
	}
	
	public class Applicant {
		String name;
		int phoneNumber;
		String status;
		
		Applicant(String name, int phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		
		public static boolean isArrayFull(Applicant[] applicants) {
			boolean isArrayFull = true;
			for(int i = 0; i<applicants.length; i++) {
				if(applicants[i] == null) {
					isArrayFull = false;
					break;
				}
			}if(isArrayFull) { 
				return true;
			}else {
				return false;
			}
		}// 배열에 남은 자리가있는지 확인한다
		
		public static int findDuplicate(Applicant[] applicants,String name, int phoneNumber) {
			for (int i = 0; i < applicants.length; i++) {
				if(applicants[i] == null) {
					continue;
				}
				if(applicants[i] != null && (applicants[i].name.equals(name) && applicants[i].phoneNumber == phoneNumber)) {
					return i;
				}
			}return -1;	
		}
	}// 배열의 중복을 확인한다
	
	public static void showApplicantsInfo(Seminar.Applicant seminarApplicants[], Seminar.Applicant standByApplicants[]) {
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
				System.out.println("대기신청자   | 이름: [" + standByApplicants[i].name + "] | 연락처: [" + standByApplicants[i].phoneNumber + "]");
				isArrayEmpty = false;
			}
		}if(isArrayEmpty) {
			System.out.println("대기신청자가 없습니다");
		}
	}
	
	public static void showSeminarInfo(Seminar seminar, Seminar.Applicant seminarApplicants[], Seminar.Applicant standByApplicants[]) {
		int seminarApplicantsNum = 0; 
		for(int i = 0; i<seminarApplicants.length; i++) {
			if(seminarApplicants[i] != null) {
				seminarApplicantsNum++;
			}
		}// 세미나신청 인원
		int standByApplicantsNum = 0;
		for(int i = 0; i<standByApplicants.length; i++) {
			if(standByApplicants[i] != null) {
				standByApplicantsNum++;
			}
		} // 대기신청 인원
		System.out.println("세미나 이름: [" + seminar.getNameOfSeminar() + "]" );
		System.out.println("정원: " + seminar.getCapcityOfPeople() + "명");
		System.out.println("전체 신청자 수: " + (seminarApplicantsNum + standByApplicantsNum) + "명");
		System.out.println("신청완료 수: " + seminarApplicantsNum+ "명");
		System.out.println("대기신청 수: " + standByApplicantsNum + "명");
		System.out.println("남은 좌석 수: " + (seminar.getCapcityOfPeople() - seminarApplicantsNum + "석"));
	}
}
	


