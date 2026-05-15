package ch13.Generic03_ScoreBox;

public class ScoreBoxExample {

	public static void main(String[] args) {
		ScoreBox<Integer> scores = new ScoreBox<>(5);

		scores.add(80);
		scores.add(90);
		scores.add(70);

		System.out.println(scores.average()); 
		System.out.println(scores.getMax());  
		System.out.println(scores.size());    


		ScoreBox<Double> doubleScores = new ScoreBox<>(3);

		doubleScores.add(3.5);
		doubleScores.add(4.0);
		doubleScores.add(2.5);

		System.out.println(doubleScores.average()); 
		System.out.println(doubleScores.getMax());  

	}

}
