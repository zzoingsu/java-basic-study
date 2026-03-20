package ch04.switch02_MonthAndSeason;

import java.util.Scanner;

public class MonthAndSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월(month) 입력: ");
		int monthInput = Integer.parseInt(sc.nextLine());
		
		
		String seasonStatus;
		seasonStatus = switch(monthInput) {
		case 12, 1, 2 ->"겨울";
		case 3, 4, 5 ->"봄";
		case 6, 7, 8 ->"여름";
		case 9, 10, 11 -> "가을";
		default -> "잘못된 월(month) 입력";
		};
		System.out.println(monthInput + "월은 " + seasonStatus + "입니다");
		sc.close();
	}

}
