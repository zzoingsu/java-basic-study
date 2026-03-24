package ch05.advancedFor01_TotalSum;

public class TotalSum {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		int sum = 0;
		for( int number : numbers) {
			sum += number;
		}
		System.out.println("총합: " + sum);
	}
}
