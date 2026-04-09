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
	
	
	public Member duplicationCheck(Member[] members, String membershipNumber) {
		for(int i = 0; i < members.length; i++) {
			if (members[i].membershipNumber == membershipNumber) {
				return members[i];
			}
		}
		return null;
	}
	
	public void showInfo(Member[] members) {
		for(int i = 0; i < members.length; i ++) {
			if(members[i] != null) {
				System.out.println(
						"일반회원 | 회원번호: " + membershipNumber + " | 이름: " + name + " | 포인트: " + membershipPoint
						);
			}
		}
	}
	
	public void pointsEarned(int earnedPoints) {
		if(earnedPoints > 0) {
		membershipPoint += earnedPoints;
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void pointsDeducted(int deductedPoints) {
		if(deductedPoints > 0) {
			if(membershipPoint > deductedPoints) {
				membershipPoint -= deductedPoints;
			}else {
				System.out.println("포인트가 부족합니다.");
			}
		}else {
			System.out.println("잘못된 입력입니다");
		}
	}
	

}
