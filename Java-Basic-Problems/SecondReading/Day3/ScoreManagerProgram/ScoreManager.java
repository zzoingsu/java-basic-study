package SecondReading.Day3.ScoreManagerProgram;

import java.util.Arrays;

public class ScoreManager {
	private String studentName;
	private int[] scores;
	
	public ScoreManager(String studentName, int[] scores) throws InvalidScoreException {
		invalidStudentName(studentName);
		invalidScore(scores);
		this.studentName = studentName;
		this.scores = scores;
	}
	public double getAverage() {
		int totalSum=0;
		for(int i=0; i<scores.length; i++) {
			totalSum += scores[i];
		}
		return (double)totalSum / scores.length;
	}
	public int getMaxScore() {
		int maxScore = scores[0];
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		return maxScore;
	}
	public int getMinScore() {
		int minScore = scores[0];
		for(int i=0; i<scores.length; i++) {
			if(scores[i] < minScore) {
				minScore = scores[i];
			}
		}
		return minScore;
	}
	public int[] getSortedScores() {
		int[] copiedScores = Arrays.copyOf(scores, scores.length);
		Arrays.sort(copiedScores);
		return copiedScores;
	}
	@Override
	public String toString() {
		return "ScoreManager{studentName='" + studentName + "', scores=[" + Arrays.toString(scores) + "]";
	}
	
	
	public static void invalidStudentName(String studentName) throws InvalidScoreException {
		if(studentName == null || studentName.isBlank()) {
			throw new InvalidScoreException("이름이 조건에 맞지 않습니다");
		}
	}
	public static void invalidScore(int[] scores) throws InvalidScoreException {
		for(int i=0; i<scores.length; i++) {
			if(scores.length<1 || (scores[i]<0 || scores[i]>100)) {
				throw new InvalidScoreException("점수가 조건에 맞지 않습니다");
			}
		}
	}
}
