/**
 * Title: OperationCombinationProblem
 * Date: 2026.03.11
 * @author zzoingsu 
 */
// 세 개 점수를 입력받아 다음을 출력하시오 (총점, 평균, 평균이 80 이상인가, 평균이 60 이상이고 90 이하인가)
package ch03.Operator05_OperationCombination;

import java.util.Scanner;

public class OperationCombination {
// 나혼자_version
	public static void main(String[] args) {
	System.out.print("동작시작\n국어점수 입력: ");
	Scanner sc = new Scanner(System.in);
	int lngScore = Integer.parseInt(sc.nextLine());
	System.out.print("영어점수 입력: ");
	int engScore = Integer.parseInt(sc.nextLine());
	System.out.print("수학점수 입력: ");
	int mathScore = Integer.parseInt(sc.nextLine());
	
	int totalScore = lngScore + engScore + mathScore;
	double averageScore = (double)totalScore / 3.0;
	boolean averageScoreGreaterThan80 = averageScore >= 80.0;
	boolean averageScoreGreaterThan60LessThan90 = averageScore >= 60 && averageScore <= 90;
	
	System.out.printf("총점: %d\n평균: %.2f\n평균이 80 이상인가: %b\n평균이 60 이상 90 이하인가: %b\n\n\n",
			         totalScore, averageScore, averageScoreGreaterThan80, averageScoreGreaterThan60LessThan90);
	/*개선및수정 방향
	 * 1. 변수명이 너무 길다 -> 길면 이해하기는 좋은데 이번엔 너무길어서 가독성을 낮춘다 averageScore -> avgScore 처럼 바꿀필
	 * 2. 국어성적을 lngScore 이라고 했는데 이건 영어인지 국어인지 애매해서 -> korscore이 더 정확하다 
	 * 3. 출력문에서 60이상 90이하는 말이 어색하다 
	 * 4. sc.close 넣는 습관 길러야한다  
	 */
	
//개선및수정_version
	System.out.print("동작시작\n국어점수 입력: ");
	Scanner scn = new Scanner(System.in);
	int korScr = Integer.parseInt(scn.nextLine());
	System.out.print("영어점수 입력: ");
	int engScr =Integer.parseInt(scn.nextLine());
	System.out.print("수학점수 입력: ");
	int mathScr = Integer.parseInt(scn.nextLine());
	
	int totalScr = korScr + engScr + mathScr;
	double avgScr = totalScr / 3.0;
	boolean avgAtLeast80 = avgScr >= 80;
	boolean avgBetween60And90 = avgScr >= 60 && avgScr <= 90;
	
	System.out.printf("총점: %d\n평균: %.2f\n평균이 80 이상인가: %b\n평균이 60 이상이고 90 이하인가: %b\n", 
						   totalScr, avgScr, avgAtLeast80, avgBetween60And90);
	scn.close();
	sc.close();
	/*수정한것
	 * lngScore->korScore 이러면 국어인지 영어인지 애매한 영역을제거함 
	 * 변수명 averageScore, averageScoreGreaterThan80, averageScoreGreaterThan60LessThan90
	 * ->avgScr, avgAtLeast80, avgBetween60And90 으로 정리 
	 * sc.close(); 추가 
	 */
	}

}
