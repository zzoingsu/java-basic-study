package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 로드 성공");
		}catch(Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
	}
	
	public static void findClass() throws Exception {
		Class.forName("java.lang.String");
		Class.forName("java.lang.String2");
	}

}
