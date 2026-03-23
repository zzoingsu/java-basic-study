package ch05.sec06;

public class ArrayType {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 셍성
		String season[] = { "Spring","Summer","Fall","Winter" };
		// 배열의 항목값 읽기
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		// 인덱스 1번 항목값 변경
		season [1] = "여름";
		System.out.println("season1: " + season[1]);
		System.out.println();
		// 배열 변수 선언과 배열 생성
		int[] score = { 83, 90,87};
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += score[i];
	}
		System.out.println("총합: " + sum);
		double avgScore = sum / 3.0;
		System.out.println("평균: " + avgScore);
		
		int[] scores ;
		scores = new int[] { 83,90,87};
		int sum1 = 0;
		for (int n = 0; n < 3; n++) {
			sum1 += scores[n];
		}
		System.out.println("총합: " + sum1);
		printItem(new int[] {83, 90, 87});
}
	public static void printItem ( int [] scores) {
		for (int i = 0; i < 3; i++) {
		System.out.println("score[" + i + "]" + scores[i]);
		}
	}
}