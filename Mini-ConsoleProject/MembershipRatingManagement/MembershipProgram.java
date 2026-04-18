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
						break;
					}
				}
				if(isArrayLeft == false) {
					System.out.println("신규 회원을 받을수없습니다.");
					continue;
				}
				System.out.println("1. 일반회원 | 2. VIP회원");
				System.out.print("선택 >");
				int memberOrVip = Integer.parseInt(sc.nextLine());
				if(memberOrVip <= 0 || memberOrVip >= 3) {
					System.out.println("잘못된 입력입니다");
					continue;
				}
				System.out.print("회원번호: ");
				String membershipNumber = sc.nextLine();
				Member checkedNumber = Member.duplicationCheck(members, membershipNumber);
				if(checkedNumber != null) {
					System.out.println("중복된 회원번호입니다");
					continue;
				}
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("현재 포인트: ");
				int membershipPoint = Integer.parseInt(sc.nextLine());
				if(memberOrVip == 1) {
					for(int i = 0; i < members.length; i++) {
						if(members[i] == null) {
							members[i] = new Member(membershipNumber, name, membershipPoint);
							break;
						}
					}
				}
				if(memberOrVip == 2) {
					System.out.print("혜택 이름: ");
					String benefitName = sc.nextLine();
					for(int i = 0; i < members.length; i++) {
						if(members[i] == null) {
							members[i] = new VipMember(membershipNumber, name, membershipPoint,benefitName);
							break;
						}
					}
				}
				System.out.println("등록 완료");
				
			}
			case 2 -> {
				boolean isNoMember = true;
				for(int i = 0; i < members.length; i++) {
					if(members[i] != null) {
						members[i].showInfo();
						isNoMember = false;
					}
				}
				if(isNoMember) {
					System.out.println("등록된 회원이 없습니다");
				}
			}
			case 3 -> {
				System.out.print("회원번호 입력: ");
				String MembershipNumber = sc.nextLine();
				Member checkedNumber = Member.duplicationCheck(members, MembershipNumber);
				if(checkedNumber == null) {
					System.out.println("일치하는 회원번호가 존재하지 않습니다");
					continue;
				}else {
					System.out.print("적립포인트: ");
					int earnedPoint = Integer.parseInt(sc.nextLine());
					checkedNumber.pointsEarned(earnedPoint);
				}
			}
			case 4 -> {
				System.out.print("회원번호 입력: ");
				String MembershipNumber = sc.nextLine();
				Member checkedNumber = Member.duplicationCheck(members, MembershipNumber);
				if(checkedNumber == null) {
					System.out.println("일치하는 회원번호가 존재하지 않습니다");
					continue;
				}else {
					System.out.print("차감포인트: ");
					int earnedPoint = Integer.parseInt(sc.nextLine());
					checkedNumber.pointsDeducted(earnedPoint);
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


