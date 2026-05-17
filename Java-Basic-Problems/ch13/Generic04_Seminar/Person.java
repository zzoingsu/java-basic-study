package ch13.Generic04_Seminar;

public class Person {
	private String name;
	private int phoneNumber;
	
	public Person(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("이름: " + name + "전화번호: " + phoneNumber );
	}
	
	

}
