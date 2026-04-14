package MembershipRatingManagement;

import java.util.Scanner;

public class MembershipProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuList = "회원 등록,회원 목록,포인트적립,포인트차감,종료";
		String[] menuArray = menuList.split(",");
		Member[] members = new Member[100];
		
		menu : while(true) {
			System.out.println();
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 회원 등록 | 2. 회원 목록 | 3. 포인트 적립 | 4. 포인트 차감 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");
			int menuNum = Integer.parseInt(sc.nextLine());
			if(menuNum <= 0 || menuNum >= 6) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			System.out.println("[" + menuArray[menuNum - 1] + "]");
			switch(menuNum) {
			case 1 -> {
				boolean isArrayLeft = false;
				for(int i = 0; i < members.length; i++) {
					if(members[i] == null) {
						isArrayLeft = true;
					}
				}
				if(isArrayLeft == false) {
					System.out.println("신규 회원을 받을수없습니다.");
					continue;
				}
				System.out.println("1. 일반회원 | 2. VIP회원");
				System.out.print("선택 >");
				int memberOrVip = Integer.parseInt(sc.nextLine());
				System.out.print("회원번호: ");
				String membershipNumber = sc.nextLine();
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("현재 포인트: ");
				int membershipPoint = Integer.parseInt(sc.nextLine());
				if(memberOrVip == 1) {
					for(int i = 0; i < members.length; i++) {
						if(members[i] == null) {
							members[i] = new Member(membershipNumber, name, membershipPoint);
							continue;
						}
					}
				}
				if(memberOrVip == 2) {
					System.out.print("혜택 이름: ");
					String benefitName = sc.nextLine();
					for(int i = 0; i < members.length; i++) {
						if(members[i] == null) {
							members[i] = new VipMember(membershipNumber, name, membershipPoint,benefitName);
							continue;
						}
					}
				}else {
					System.out.println("잘못된 입력입니다");
					
				}
			}
			case 5 -> {
				System.out.println("프로그램을 종료합니다");
				break menu;
			}
			}
		}
		
	}

}
