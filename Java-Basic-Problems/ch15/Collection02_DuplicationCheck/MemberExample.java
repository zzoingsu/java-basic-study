package ch15.Collection02_DuplicationCheck;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		Set<Member> list = new HashSet<>();
		
		list.add(new Member("user01", "홍길동", "010-1111-1111"));
		list.add(new Member("user02", "김자바", "010-2222-2222"));
		list.add(new Member("user03", "이코딩", "010-3333-3333"));
		list.add(new Member("user01", "박중복", "010-9999-9999"));
		list.add(new Member("user04", "최백엔", "010-4444-4444"));
		
		for(Member m : list) {
			System.out.println(m);
		}
		
		int size = list.size();
		System.out.println("총 회원 수: " + size);
	}

}
