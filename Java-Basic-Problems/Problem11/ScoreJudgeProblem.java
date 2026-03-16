// 사용자로부터 이름과 3과목 점수를 입력받아 다음을 출력하라(이름,국어,영어,수학)
// 출력 예시 이름: 총점: 평균: 평균 80이상인가: 60이상90이하인가: 합격여부: (합격조건 평균70이상)
package Problem11;

import java.util.Scanner;

public class ScoreJudgeProblem {

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
				"\n이름: %s\n총점: %d\n평균: %.2f\n평균 80이상인가: %b\n평균 60 이상 90이하인가: %b\n합격여부: %s"
		, name, totalScore, avgScore, over80, between60And90, pass);

	}

}
