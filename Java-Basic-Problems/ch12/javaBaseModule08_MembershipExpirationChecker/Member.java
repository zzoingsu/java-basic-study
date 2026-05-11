package ch12.javaBaseModule08_MembershipExpirationChecker;

import java.time.LocalDate;

public class Member {
	
	private String id;
	private String name;
	private LocalDate joinDate;
	private LocalDate expireDate;
	private String status;
	private long remainingDays;

	public Member(String id, String name, LocalDate joinDate) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
		this.expireDate = expireDateCalculator(joinDate);
		
	}
	
	public LocalDate expireDateCalculator(LocalDate joinDate) {
		return joinDate.plusDays(14);
	}
	
	
}
