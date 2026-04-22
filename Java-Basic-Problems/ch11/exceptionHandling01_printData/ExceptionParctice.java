package ch11.exceptionHandling01_printData;

public class ExceptionParctice {
	public static void printData(String data) {
		try {
			System.out.println("문자 수 : " + data.length());
		}catch(NullPointerException e) {
			System.out.println("null 값이 들어왔습니다");
		}finally {
			System.out.println("[실행 종료]");
		}
	}
	public static void main(String[] args) {
		printData("hello");
		System.out.println();
		printData(null);
	}

}
