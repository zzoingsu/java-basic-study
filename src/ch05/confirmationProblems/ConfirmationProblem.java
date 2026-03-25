package ch05.confirmationProblems;

import java.util.Scanner;

public class ConfirmationProblem {

	public static void main(String[] args) {
		// 문제 7번
		int[] array = {1, 5, 3, 8, 2};
		int largestNum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (largestNum < array[i]) {
				largestNum = array[i];
			}
		}
		System.out.println("최대값: " + largestNum);
		
		// 문제 8번
		int[][]scores = {
			{95, 86}, 
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		int totalSum = 0;
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			for(int score  : scores[i] ) {
				totalSum += score;
				count++;
			}
		}
		double avgScore = (double) totalSum / count++;
		System.out.println("전체합: " + totalSum + " 평균값: " + avgScore);
		//문제 9번
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = 0;
		int[] scr = null;
		
		menu : while(true) {
			System.out.println();
			System.out.println("---------------------------------------------------------");
			System.out.println("  1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");
			int inputData = Integer.parseInt(sc.nextLine());
				switch(inputData) {
			
				case 1 -> {
					System.out.print("학생 수> ");
					int inputStudents = Integer.parseInt(sc.nextLine());
					if (inputStudents <= 0) {
						System.out.println("잘못된 입력입니다");
					}else {
						numberOfStudents = inputStudents;
					}
				}
				case 2 -> {
					if (numberOfStudents <= 0) {
						System.out.println("학생 수 먼저 입력해야 합니다");
					}else {
					scr = new int[numberOfStudents];
					for (int i = 0; i< numberOfStudents; i++) {
						System.out.print("scores[" + i + "]> ");
						int scoreData = Integer.parseInt(sc.nextLine());
						scr[i] = scoreData;
						}
					}
				}
				case 3 -> {
					if (numberOfStudents <= 0 || scr == null) {
						System.out.println("학생 수 혹은 점수 먼저 입력해야합니다");
					}else {
					for( int i = 0; i < numberOfStudents; i++) {
						System.out.println("scores[" + i + "]: " + scr[i]);
						}
					}
				}
				case 4 -> {
					if (numberOfStudents <= 0 || scr == null) {
						System.out.println("학생 수 혹은 점수 먼저 입력해야합니다");
						}else {
							int largestNumber = scr[0];
							int sum = 0;
					for ( int i = 0; i < numberOfStudents; i++) {
						sum += scr[i];
						if(largestNumber < scr[i]) {
							largestNumber = scr[i];
							}
						}
					
					double avgNumber = (double)sum / numberOfStudents;
					System.out.printf("최고 점수: %d\n점수 평균: %.2f",largestNumber, avgNumber);
						}
				}
				
				case 5 -> {
					System.out.println("프로그램 종료");
					break menu;
					}
				default -> System.out.println("잘못된 번호입니다");
				}
				
		}
		sc.close();
	}

}
