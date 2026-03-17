/**
 * Title: ScoreJudgeProblem
 * Date: 2026.03.16
 * @author zzoingsu
 */
// 사용자로부터 이름과 3과목 점수를 입력받아 다음을 출력하라(이름,국어,영어,수학)
// 출력 예시 이름: 총점: 평균: 평균 80이상인가: 60이상90이하인가: 합격여부: (합격조건 평균70이상)
package Problem11;

import java.util.Scanner;

public class ScoreJudgeProblem {
// 나혼자_version
	public static void main(String[] args) {
		System.out.print("동작시작\n이름입력: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("국어점수 입력: ");
		int korScore = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력: ");
		int engScore = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력: ");
		int mathScore = Integer.parseInt(sc.nextLine());
		
		int totalScore = korScore + engScore + mathScore;
		double avgScore = totalScore / 3.0;
		boolean over80 = avgScore >= 80;
		boolean between60And90 = avgScore >= 60 && avgScore <= 90;
		String pass = (avgScore >= 70) ? "합격" : "불합격";
		
		System.out.printf(
				"\n이름: %s\n총점: %d\n평균: %.2f\n평균 80 이상인가: %b\n평균 60 이상 90 이하인가: %b\n합격여부: %s\n\n\n", 
				name, totalScore, avgScore, over80, between60And90, pass
		);
/** 개선및수정방향
 *  1. sc.close 넣는 습관기르기
 *  2. boolean 변수명 over80은 초과처럼 보여서 -> isAvgAtLeast80
 *  3. String 변수명 pass는 boolean처럼 보일수있어서 -> passStatus
 **/
 // 개선및수정_version
		System.out.print("동작시작\n이름입력: ");
		Scanner scn = new Scanner(System.in);
		String nameData = scn.nextLine();
		
		System.out.print("국어점수 입력: ");
		int korScr = Integer.parseInt(scn.nextLine());
		System.out.print("영어점수 입력: ");
		int engScr = Integer.parseInt(scn.nextLine());
		System.out.print("수학점수 입력: ");
		int mathScr = Integer.parseInt(scn.nextLine());
		
		int totalScr = korScr + engScr + mathScr;
		double avgScr = totalScr / 3.0;
		boolean isAvgAtLeast80 = avgScr >= 80;
		boolean isAvgBetween60And90 = avgScr >= 60 && avgScr <= 90;
		String passStatus = avgScr >= 70 ? "합격" : "불합격";
		
		System.out.printf(
				"이름: %s\n총점: %d\n평균: %.2f\n평균 80이상인가: %b\n평균 60이상 90이하인가: %b\n합격여부: %s", 
				nameData, totalScr, avgScr, isAvgAtLeast80, isAvgBetween60And90, passStatus 
		);
		scn.close();
		sc.close();
		
	}

}
