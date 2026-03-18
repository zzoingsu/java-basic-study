/** 
 * Title: AverageBasedRatingDiscrimination
 * Date: 2026.03.17
 * @author zzoingsu 
 */


 package ch04.if02_AverageBasedRating;

import java.util.Scanner;

public class AverageBasedRatingDiscrimination {
// 나혼자_version
	public static void main(String[] args) {
		System.out.print("동작시작\n이름 입력: ");
		Scanner sc = new Scanner(System.in);
		String nameData = sc.nextLine();
		
		System.out.print("국어점수 입력: ");
		int korScore = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력: ");
		int engScore = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력: ");
		int mathScore = Integer.parseInt(sc.nextLine());
		
		int totalScore = korScore + engScore + mathScore;
		double avgScore = totalScore / 3.0;
		String grade;
		
		if (avgScore >= 90) {
			grade = "A";
		}else if (avgScore >= 80) {
			grade = "B";
		}else if (avgScore >= 70) {
			grade = "C";
		}else {
			grade = "D";
		}
		String retestStatus;
		if (avgScore >= 60) {
			retestStatus = "재시험 대상 아님\n\n\n";
		}else {
			retestStatus = "재시험 대상\n\n\n";
		}
		
		System.out.printf(
				"이름: %s\n총점: %d\n평균: %.2f\n등급: %s\n재시험 여부: %s",
				nameData, totalScore, avgScore, grade, retestStatus
		);
	
		
		
/* 개선및수정 방향
 * 1.nameData는 좀 어색하다 -> name
 * 2. 재시험 여부 판별하는 조건식에서 지금 방식도 틀린건 아니지만 삼항연산자를 사용하면 더 간단하게 정리가능
 */
		
//개선및수정_version
		System.out.print("이름입력: ");
		Scanner scn = new Scanner (System.in);
		String name = scn.nextLine();
		
		System.out.print("국어점수 입력: ");
		int korScr = Integer.parseInt(scn.nextLine());
		System.out.print("영어점수 입력: ");
		int engScr = Integer.parseInt(scn.nextLine());
		System.out.print("수학점수 입력: ");
		int mathScr = Integer.parseInt(scn.nextLine());
		
		int totalScr = korScr + engScr + mathScr;
		double avgScr = totalScr / 3.0;
		
		String rating;
		if (avgScr >= 90) {
			rating = "A";
		}else if (avgScr >= 80) {
			rating = "B";
		}else if (avgScr >= 70) {
			rating = "C";
		}else {
			rating = "D";
		}
		
		String retest = (avgScr >= 60) ? "재시험 대상 아님" : "재시험 대상";
		
		System.out.printf(
				"이름: %s\n총점: %d\n평균: %.2f\n등급: %s\n재시험여부: %s\n", 
				name, totalScr, avgScr, rating, retest
		);
		scn.close();
		sc.close();
	}

}
