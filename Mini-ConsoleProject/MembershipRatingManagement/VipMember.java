package MembershipRatingManagement;

public class VipMember extends Member { 
	private String benefitName;
	
	VipMember(String membershipNumber, String name, int membershipPoint, String benefitName) {
		super(membershipNumber, name, membershipPoint);
		this.benefitName = benefitName;
	}
	
	@Override
	public void showInfo(Member[] members) {
		for(int i = 0; i < members.length; i ++) {
			if(members[i] != null) {
				System.out.println(
						"VIP회원 | 회원번호: "+getMembershipNumber()+" | 이름: "+getName()+" | 포인트: "+getMembershipPoint()+" | 혜택: "+benefitName
						);
			}
		}
	}

}
