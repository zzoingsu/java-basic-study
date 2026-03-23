package ch05.Array01_SumAndAvgOfArray;

public class SumAndAvgOfArray {

	public static void main(String[] args) {
		int[] scores = {90, 80, 70, 100, 60 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avgScore = (double)sum / scores.length;
		
		System.out.printf("총합: %d\n평균: %.2f", sum, avgScore);
		
/** 개선및수정 방향
 * 1. 보통 괄호를 끝낼때 공란을 두지않는다 이건 스타일 문제이지만 가독성은 보통의 경우가 좋다
 */
	}

}
