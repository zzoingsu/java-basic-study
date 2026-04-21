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
}
	


