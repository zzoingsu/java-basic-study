package ch13.Generic04_Seminar;

public class Student extends Person {
	private String school;
	
	public Student(String name, int phoneNumber, String school) {
		super(name, phoneNumber);
		this.school = school;
	}
	public String getSchool() {
		return school;
	}
	
	@Override
	public void showInfo() {
		System.out.println("이름: " + getName() + "전화번호: " + getPhoneNumber() + "학교명: " + school);
	}

}
