package SeminarApplicationAndNotificationManagementSystem;

public class Seminar {
	private String nameOfSeminar;
	private int capacityOfPeople;
	
	Seminar(String nameOfSeminar, int capacityOfPeople) {
		this.nameOfSeminar = nameOfSeminar;
		this.capacityOfPeople = capacityOfPeople;
	}
	public class applicant {
		String name;
		String phoneNumber;
		String status;
		
		applicant(String name, String phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}

	}

}
