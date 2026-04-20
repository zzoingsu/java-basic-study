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

	}
	

}
