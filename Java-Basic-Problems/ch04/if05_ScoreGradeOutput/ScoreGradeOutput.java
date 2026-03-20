package ch04.if05_ScoreGradeOutput;

import java.util.Scanner;

public class ScoreGradeOutput {

	public static void main(String[] args) {
		//나혼자_version
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력: ");
		int korScore = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력: ");
		int engScore = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력: ");
		int mathScore = Integer.parseInt(sc.nextLine());
		
		double avgScore = (korScore + engScore + mathScore) / 3.0;
		boolean isScoreOver40 = (korScore >= 40 && engScore >= 40) && mathScore >= 40;
		
		String passStatus;
		if (avgScore >= 60 && isScoreOver40)  {
			passStatus = "합격"; 
			if (avgScore >= 90) {
			passStatus ="우수합격";
			}
		}else {
			passStatus = "불합격";
		}
		System.out.println("합격여부: " + passStatus);
		sc.close();
/* 수정및개선 방향
 * 1. 우수합격 로직이 합격안에 중첩되어있음 -> 결과를 한번에 정하기
 * 
 *      수정및개선_version 
 *		String passStatus;
 * 		if (avgScore >= 60 && isScoreOver40) { 
 * 			if(avgScore >= 90) {
 * 				passStatus = "우수합격";
 * 			}else  {	
 * 				passStatus = "합격";
 */
		
		
		
	}

}
