package SeminarApplicationAndNotificationManagementSystem;

public class Seminar {
	private String nameOfSeminar;
	private int capacityOfPeople;
	
	public Seminar(String nameOfSeminar, int capacityOfPeople) {
		this.nameOfSeminar = nameOfSeminar;
		this.capacityOfPeople = capacityOfPeople;
	}
	
	public String getNameOfSeminar() {
		return nameOfSeminar;
	}
	
	public int getCapacityOfPeople() {
		return capacityOfPeople;
	}
	
	public class Applicant {
		private String name;
		private String phoneNumber;
		
		public Applicant(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
		
		public String getName() {
			return name;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
	}
	
		// 배열에 남은 자리가있는지 확인
		public static boolean isArrayFull(Applicant[] applicants) {
			for(int i = 0; i<applicants.length; i++) {
				if(applicants[i] == null) {
					return false;
				}
			}return true;
		}
		
		// 배열에 저장된 정보가있는지 확인
		public static boolean hasStandBy(Applicant[] applicants) {
			for(int i=0; i<applicants.length; i++) {
				if(applicants[i] != null) {
					return true;
				}
			}return false;
		}
		
		// 배열의 중복 확인
		public static int findDuplicate(Applicant[] applicants,String name, String phoneNumber) {
			for (int i=0; i<applicants.length; i++) {
				if(applicants[i] != null && (applicants[i].getName().equals(name) && applicants[i].getPhoneNumber().equals(phoneNumber))) {
					return i;
				}
			}return -1;	
		}
		// 배열 당기기
		public static void shift(Applicant[] applicants, int foundIndex) {
		    for (int i = foundIndex; i < applicants.length - 1; i++) {
		        applicants[i] = applicants[i + 1];
		    }
		    applicants[applicants.length - 1] = null;
		}
	
		// 신청자 목록 출력
		public static void showApplicantsInfo(Seminar.Applicant seminarApplicants[], Seminar.Applicant standByApplicants[]) {
		boolean isArrayEmpty = true;
		for(int i = 0; i < seminarApplicants.length; i++) {
			if(seminarApplicants[i] != null) {
				System.out.println("세미나 신청자 | 이름: [" + seminarApplicants[i].getName() + "] | 연락처: [" + seminarApplicants[i].getPhoneNumber() + "]");
				isArrayEmpty = false;
			}
		}if(isArrayEmpty) {
			System.out.println("[세미나 신청자가 없습니다]");
		}
		// 변수 재사용을 위해 값 초기화
		isArrayEmpty = true;
		for(int i = 0; i < standByApplicants.length; i++) {
			if(standByApplicants[i] != null) {
				System.out.println("대기신청자   | 이름: [" + standByApplicants[i].getName() + "] | 연락처: [" + standByApplicants[i].getPhoneNumber() + "]");
				isArrayEmpty = false;
			}
		}if(isArrayEmpty) {
			System.out.println("[대기신청자가 없습니다]");
			}
		}
	
		public static void showSeminarInfo(Seminar seminar, Seminar.Applicant seminarApplicants[], Seminar.Applicant standByApplicants[]) {
		// 세미나신청 인원 수
		int seminarApplicantsNum = 0; 
		for(int i = 0; i<seminarApplicants.length; i++) {
			if(seminarApplicants[i] != null) {
				seminarApplicantsNum++;
			}
		}
		// 대기신청 인원 수
		int standByApplicantsNum = 0;
		for(int i = 0; i<standByApplicants.length; i++) {
			if(standByApplicants[i] != null) {
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
	


