package ch05.Array05_ScoreManagement;

public class ScoreManagementProgram {

	public static void main(String[] args) {
		String[] names = {"김철수", "이영희", "박민수", "최지훈"};
		int[] scores = {88, 92, 76, 92};
		
		int totalSum = 0;
		int scoreAtLeast80 = 0;
		int indexOfMaxNum = 0;
		int maxNumber = scores[0];
		for (int i = 0; i < scores.length; i++) {  // 최고점수 학생이 두명 이상일때는?
			if (maxNumber < scores[i]) {
				maxNumber = scores[i];
				indexOfMaxNum = i;
			} 
			if (scores[i] >= 80) {
				scoreAtLeast80++;
			}
			totalSum += scores[i];
			System.out.println(names[i] + ":" + scores[i]);
		}
		double avgScore = (double)totalSum / scores.length;
		
		System.out.printf("평균: %.2f\n최고 점수 학생: %s\n80점 이상 학생수: %d",
				avgScore, names[indexOfMaxNum], scoreAtLeast80
		);
	}

}
