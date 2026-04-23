package ch11.exceptionHandling03_printData;

public class ExceptionPractice {
	public static void printLengths(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			try {
				System.out.println("문자 수: " + arr[i].length());
			}catch(NullPointerException e) {
				System.out.println("null 데이터가 있습니다");
			}finally {
				System.out.println("[다음 데이터 검사]");
			}
		}
	}

	public static void main(String[] args) {
		printLengths(new String[] {"java",null,"spring","db"});
	}

}
