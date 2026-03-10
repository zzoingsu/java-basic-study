/**
 * Title: AverageProblem
 * Date: 2026.03.09
 * @author zzoingsu
 */
// 사용자로부터 이름,국어성적,영어성적,수학성적을 입력받고 점수의 총점과평균을 구하시오
// 조건: Scanner 사용, 점수는 정수로 출력, 평균은 소수점두자리까지 출력 
package Problem04;

import java.util.Scanner;

public class AverageProblem {
//나혼자_version
	public static void main(String[] args) {  {
		System.out.print("동작시작\n이름입력: ");
		Scanner scn = new Scanner(System.in);
		String nameData = scn.nextLine();
		
		System.out.print("국어성적 입력: ");
		String lng_Data = scn.nextLine();
		int lngScore = Integer.parseInt(lng_Data);
		
		System.out.print("수학성적 입력: ");
		String math_Data = scn.nextLine();
		int mathScore = Integer.parseInt(math_Data);
		
		System.out.print("영어성적 입력: ");
		String eng_Data = scn.nextLine();
		int engScore = Integer.parseInt(eng_Data);
		
		int totalScore = lngScore + mathScore + engScore;
		double averageScore = (lngScore + mathScore + engScore)/3;
		System.out.printf("%1$s님의성적\n총점: %2$d\n평균: %3$.2f\n",nameData,totalScore,averageScore);
		
	}
//개선및수정방향
// 1.평균값을구할때 괄호 내부는 정수타입이라서 정확하게 계산되지않는다 따라서 이를 double로 바꿔야한다
// 2.변수명이 어색하 보통 언더바는 사용하지않는다 생략필요 

//개선및수정_version
		System.out.print("동작시작\n이름입력: ");
		Scanner sc = new Scanner(System.in);
		String nameData2 = sc.nextLine();
		
		System.out.print("국어성적 입력: ");
		String lngData = sc.nextLine();
		int lngScore2 = Integer.parseInt(lngData);
		
		System.out.print("수학성적 입력: ");
		String mathData = sc.nextLine();
		int mathScore2 = Integer.parseInt(mathData);
		
		System.out.print("영어성적 입력:");
		String engData = sc.nextLine();
		int engScore2 = Integer.parseInt(engData);
		
		int totalScore2 = lngScore2+mathScore2+engScore2;
		double averageScore2 = totalScore2/3.0;
		System.out.printf("%s님의 성적\n총점; %d\n평균: %.2f", nameData2,totalScore2,averageScore2);
		
	}

}
