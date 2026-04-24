package ch11.exceptionHandling05_throws;

public class ExceptionPractice {
	public static void findClass (String className) throws Exception {
		Class.forName(className);
		System.out.println("클래스 로드 성공: " + className);
	}

	public static void main(String[] args) {
		try {
		findClass("java.lang.String");
		findClass("java.lang.String2");
		}catch (Exception e) {
			System.out.println("클래스 로드 실패");
		}
	}
}
