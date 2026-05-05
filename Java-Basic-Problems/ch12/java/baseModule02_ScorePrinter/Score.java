package ch12.java.baseModule02_ScorePrinter;

public class Score {
	public static void main(String[] args) {
		String data = "90,80,75,100,60";
		String[] dataArray = data.split(",");
		int sum = 0;
		int max = 0;
		int min = 100;
		
		for(int i=0; i<dataArray.length; i++) {
			int score = Integer.parseInt(dataArray[i]);
			
			sum += score;
			max = Math.max(max, score);
			min = Math.min(min, score);
		}
		double avg = (double)sum / dataArray.length;
		System.out.printf(
				"합계: %d\n평균: %.2f\n최고점: %d\n최저점: %d" ,
				sum, avg, max, min
				);
	}

}
