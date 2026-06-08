package ch17.Stream04_SortingExample;

import java.util.Arrays;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(87, 92, 75, 100, 68, 92, 81, 77, 95);
		scores.stream()
			.sorted(
				(s1, s2) -> Integer.compare(s2, s1))
			.limit(3)
			.forEach(System.out :: println);
	}

}
