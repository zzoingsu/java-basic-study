package ch12.javaBaseModule08_MembershipExpirationChecker;

import java.time.LocalDate;

public class MembershipExpirationChecker {

	public static void main(String[] args) {
		String data = "user01:홍길동:2026-05-01,user02:김자바:2026-04-20,user03:이코딩:2026-05-09";
		LocalDate today = LocalDate.of(2026, 5, 9);
		String[] array = data.split(",");
		Member[] member = new Member[array.length];
		
		for(int i=0; i<array.length; i++) {
			String[] memberInfo = array[i].split(":");
			LocalDate joinDate = LocalDate.parse(memberInfo[2]);
			member[i] = new Member(memberInfo[0], memberInfo[1], joinDate, today);
			System.out.println(member[i]);
		}
	}

}
