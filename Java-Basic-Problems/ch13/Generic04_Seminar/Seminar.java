package ch13.Generic04_Seminar;

public class Seminar <T extends Person> {
	private T[] applicants;
	private int size = 0;
	
	public Seminar(T[] applicants) {
		this.applicants = applicants;
	}
	
	public void register(String name, int phoneNumber) {
		if(isFull()) { 
			System.out.println("남은 공간이 없습니다");
		} else {
		for(int i=0; i<applicants.length; i++) {
		if(applicants != null && applicants[i].getPhoneNumber() == phoneNumber) {
			System.out.println("중복된 전화번호 입니다");
			} 
		if(applicants != null && applicants[i].getPhoneNumber() != phoneNumber) {
				
			}
		}
	}
	}
	
	public boolean isFull() {
		return size == applicants.length;
	}
}
