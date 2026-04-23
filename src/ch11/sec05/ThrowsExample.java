package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		}catch(Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
	}
	
	public static void findClass() throws Exception {
		Class.forName("java.lang.String2");
	}

}
