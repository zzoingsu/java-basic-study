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
}
	


