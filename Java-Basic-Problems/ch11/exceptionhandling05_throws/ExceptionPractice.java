package ch11.exceptionhandling05_throws;

public class ExceptionPractice {
	public static void findClass (String className) throws Exception {
		Class.forName(className);
	}

	public static void main(String[] args) {
		try {
		findClass("java.lang.String");
		}catch (Exception e) {
			
		}
		
		try {
		findClass("java.lang.String");
		}catch (Exception e) {
			
		}
	}

}
