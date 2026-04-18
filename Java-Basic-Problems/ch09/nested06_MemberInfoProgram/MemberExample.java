package ch09.nested06_MemberInfoProgram;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member("user01", "VIP");
		Member.MemberPrinter memberPrinter = member.new MemberPrinter();
		memberPrinter.printInfo();
	}

}
