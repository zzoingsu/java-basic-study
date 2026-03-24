package ch05.Array03_StringTypeAnalysis;

public class stringTypeAnalysis {

	public static void main(String[] args) {
		String data = "990517-1234567";
		
		int dataLength = data.length();
		int hypenIndex = data.indexOf("-");
		char sexNum = data.charAt(7);
		String birthDate = data.substring(0,6);
		String deletHypen = data.replace("-","");
		boolean isHypenContains = data.contains("-");
		String[] splitNumber = data.split("-");
		
		System.out.printf(
				"전체 길이: %d\n-위치: %d\n성별 숫자: %c\n생년월일: %s\n하이픈제거: %s\n-포함여부: %b\n앞부분: %s\n뒷부분: %s\n" ,
				dataLength, hypenIndex, sexNum, birthDate, deletHypen, isHypenContains, splitNumber[0], splitNumber[1]
		);
	}

}
