package ch05.Array02_FindingMaximumNumber;

public class FindingMaxiumNumberFixed {

	public static void main(String[] args) {
		int [] scores = {65, 82, 90, 74, 88, 59, 100};
		int largestNumber = scores[0];
		int over80 = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 80) {
				over80++;
			}
			if ( largestNumber < scores[i]) {
				largestNumber = scores[i];
			}
		}
		System.out.printf("최대값: %d\n80점 이상 개수: %d", largestNumber, over80);
	}

}
