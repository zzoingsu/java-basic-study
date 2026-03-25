package ch05.Array04_StringAnalyizing;

public class StringAnalizing {

	public static void main(String[] args) {
		String data = "김철수, 90, 85, 77";
		
		String[] dataStr = data.split(",");
		String name = dataStr[0];

		String stringNumber = "";
		int totalSum = 0;
		for (int i = 1; i < dataStr.length; i++) {
			stringNumber = String.valueOf(dataStr[i]);
			totalSum = Integer.parseInt(dataStr[i]);
		}
		double avgScore = (double)totalSum / dataStr.length;
		int largestNumber = dataStr[1];
		for ( int i = 1; i < dataStr.length; i++) {
			if ()
		}
		
		
	}

}
