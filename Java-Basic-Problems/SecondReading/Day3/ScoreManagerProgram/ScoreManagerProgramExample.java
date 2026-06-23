package SecondReading.Day3.ScoreManagerProgram;

import java.util.Arrays;

public class ScoreManagerProgramExample {

	public static void main(String[] args) {
		try {
		    int[] scores = {85, 90, 70, 100, 95};
		    ScoreManager manager = new ScoreManager("김자바", scores);

		    System.out.println(manager);
		    System.out.println("평균: " + manager.getAverage());
		    System.out.println("최고 점수: " + manager.getMaxScore());
		    System.out.println("최저 점수: " + manager.getMinScore());
		    System.out.println("정렬된 점수: " + Arrays.toString(manager.getSortedScores()));
		} catch (InvalidScoreException e) {
		    System.out.println("성적 처리 실패: " + e.getMessage());
		}


	}

}
