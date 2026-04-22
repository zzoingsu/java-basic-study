package ch11.exceptionHandling03_printData;

public class ExceptionPractice {
	public static void printLengths(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			
				System.out.println("문자 수: " + arr[i].length());
				System.out.println("[다음 데이터 검사]");
			
		}
	}

	public static void main(String[] args) {
		printLengths(new String[] arr {"java",null,"spring","db"});
	}

}
