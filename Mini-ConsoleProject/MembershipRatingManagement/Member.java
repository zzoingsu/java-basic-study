package MembershipRatingManagement;

public class Member {
	private String membershipNumber;
	private String name;
	private int membershipPoint;
	public Member duplicationCheck;
	
	Member(Member[] members, String membershipNumber, String name, int membershipPoint) {
		this.membershipNumber = membershipNumber;
		this.name = name;
		this.membershipPoint = membershipPoint;
	}
	public Member duplicationCheck(Member[] members, String membershipNumber) {
		for(int i = 0; i < members.length; i++) {
			if (members[i].membershipNumber == membershipNumber) {
				return members[i];
			}
		}
		return null;
	}

}
