package ch04.if03_RideAvailability;

import java.util.Scanner;

public class RideAvailability {

	public static void main(String[] args) {
		// 나혼자_version
		System.out.print("이름 입력: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("나이 입력: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("키 입력: ");
		int tall = Integer.parseInt(sc.nextLine());
		
		String result;
		if (age >= 12 && tall >= 140) {
			result = "탑승가능";
		} else if (age >= 12 && tall <= 140) {
			result = "나이는 통과 키 미달";
		}else if (age <= 12 && tall >= 140) {
			result = "나이 미달 키는 통과";
		}else {
			result = "나이 미달 키 미달";
		}
		System.out.printf(
				"이름: %s\n나이: %d\n키: %d\n결과: %s", 
				name, age, tall, result
		);
		sc.close();
/** 개선및 수정 방향
 * 1. else if 에서 불필요하게 &&가 들어갔다 && 없이 바로 (age >= 12) 했어도 자동으로 걸러진다
 */
		//개선및수정_version
		System.out.print("이름 입력: ");
		Scanner scn = new Scanner(System.in);
		String name1 = scn.nextLine();
		System.out.print("나이 입력: ");
		int age1 = Integer.parseInt(scn.nextLine());
		System.out.print("키 입력: ");
		int tall1 = Integer.parseInt(scn.nextLine());
		
		String result1;
		if (age1 >= 12 && tall1 >= 140) {
			result1 = "탑승가능";
		} else if (age1 >= 12 ) {
			result1 = "나이는 통과 키 미달";
		}else if (tall1 >= 140) {
			result1 = "나이 미달 키는 통과";
		}else {
			result1 = "나이 미달 키 미달";
		}
		System.out.printf(
				"이름: %s\n나이: %d\n키: %d\n결과: %s", 
				name1, age1, tall1, result1
		);
		scn.close();
	}

}
