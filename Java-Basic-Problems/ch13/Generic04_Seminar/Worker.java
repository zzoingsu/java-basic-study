package ch13.Generic04_Seminar;

public class Worker extends Person {
	private String office;
	
	public Worker(String name, int phoneNumber, String office) {
		super(name, phoneNumber);
		this.office = office;
	}
	public String getOffice() {
		return office;
	}
	
	
	public void showInfo() {
		System.out.println("이름: " + getName() + "전화번호: " + getPhoneNumber() + "회사명: " + office);
	}

}
