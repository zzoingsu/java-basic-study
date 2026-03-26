package ch05.Array04_StringAnalyizing;

public class StringAnalizing {

	public static void main(String[] args) {
		String data = "김철수,90,85,77";
		
		String[] arrayData = data.split(",");
		int[] intArray = new int[arrayData.length-1];
		for (int i = 1; i < arrayData.length; i++) {
			intArray[i -1] = Integer.parseInt(arrayData[i]);
		}
		
		String name = arrayData[0];

		int totalSum = 0;
		for (int i = 0; i < intArray.length; i++) {
			totalSum += intArray[i];
		}
		double avgScore = (double)totalSum / intArray.length;
		
		int largestNumber = intArray[0];
		for ( int i = 0; i < intArray.length; i++) {
			if (largestNumber < intArray[i]) {
				largestNumber = intArray[i];
				}
			}
		System.out.printf(
				"이름: %s\n총합: %d\n평균: %.2f\n최고 점수: %d",
				name, totalSum, avgScore, largestNumber
		);
		
	}

}
