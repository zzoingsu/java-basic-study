package MembershipRatingManagement;

public class Member {
	private String membershipNumber;
	private String name;
	private int membershipPoint;
	
	Member(String membershipNumber, String name, int membershipPoint) {
		this.membershipNumber = membershipNumber;
		this.name = name;
		this.membershipPoint = membershipPoint;
	}
	
	public String getMembershipNumber() {
		return membershipNumber;
	}
	public String getName() {
		return name;
	}
	public int getMembershipPoint() {
		return membershipPoint;
	}
	
	
	public static Member duplicationCheck(Member[] members, String membershipNumber) {
		for(int i = 0; i < members.length; i++) {
			if(members[i] == null) {
				continue;
			}
			if(members[i].membershipNumber.equals(membershipNumber)) {
				return members[i];
			}
		}
		return null;
	}
	
	public void showInfo() {
				System.out.println(
						"일반회원 | 회원번호: " + membershipNumber + " | 이름: " + name + " | 포인트: " + membershipPoint
						);
			}
	
	public void pointsEarned(int earnedPoints) {
		if(earnedPoints > 0) {
		membershipPoint += earnedPoints;
		System.out.println("적립되었습니다\t보유량: " + getMembershipPoint());
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void pointsDeducted(int deductedPoints) {
		if(deductedPoints > 0) {
			if(membershipPoint >= deductedPoints) {
				membershipPoint -= deductedPoints;
				System.out.println("차감되었습니다\t보유량: " + getMembershipPoint());
			}else {
				System.out.println("포인트가 부족합니다.");
			}
		}else {
			System.out.println("잘못된 입력입니다");
		}
	}
	

}
