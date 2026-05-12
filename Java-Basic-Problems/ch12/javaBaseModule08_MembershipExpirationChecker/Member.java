package ch12.javaBaseModule08_MembershipExpirationChecker;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Member {
	
	private String id;
	private String name;
	private LocalDate joinDate;
	private LocalDate expireDate;
	private String status;
	private long remainingDays;
	

	public Member(String id, String name, LocalDate joinDate, LocalDate today) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
		this.expireDate = expireDateCalculator(joinDate);
		this.status = expireCheck(expireDate, today);
		this.remainingDays = remainDaysCheck(expireDate, today);
	}

	private LocalDate expireDateCalculator(LocalDate joinDate) {
		return joinDate.plusDays(14);
	}
	
	private String expireCheck(LocalDate expireDate, LocalDate today) {
		return today.isAfter(expireDate) ? "만료" : "사용 가능"; 
	}
	
	private long remainDaysCheck(LocalDate expireDate, LocalDate today) {
		long remainDaysCheck = ChronoUnit.DAYS.between(today, expireDate);
		if(remainDaysCheck < 0) {
			remainDaysCheck = 0;
		}
		return remainDaysCheck;
	}
	
	@Override
	public String toString() {
		return "회원 ID: " + id
				+ ", 이름: " + name
				+ ", 가입일: " + joinDate
				+ ", 상태: " + status
				+ ", 남은 기간: " + remainingDays + "일";
	}
}
