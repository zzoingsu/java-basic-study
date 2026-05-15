package ch13.Generic03_ScoreBox;

public class ScoreBox <T extends Number> {
	private T[] scores;
	private int size;
	
	public ScoreBox(int capacity) {
		this.scores = (T[]) new Number[capacity];
		this.size = 0;
	}
	
	public void add(T score) {
		if(isFull()) {
			System.out.println("배열에 자리가 없습니다");
			return;
		}
		scores[size] = score;
		size++;
	}
	
	public double average() {
		if(size == 0) {
			return 0.0;
		}
		double scoreSum = 0;
		for(int i=0; i<size; i++) {
			scoreSum += scores[i].doubleValue();
		}
		return scoreSum/size;
	}
	
	public boolean isFull() {
		return size == scores.length;
	}
	
	public T getMax() {
		if(size == 0) {
			return null;
		}
		T max = scores[0];
		for(int i=0; i<size; i++) {
			 if(max.doubleValue() < scores[i].doubleValue()) {
				 max = scores[i];
			 }
		}
		return max;
	}
	
	public int size() {
		return size;
	}

}
