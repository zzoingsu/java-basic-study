package ch11.exceptionHandling02_printData;

public class ExceptionPractice {
	public static void checkClass(String className) {
		try {
			Class.forName(className);
			System.out.println("클래스가 존재합니다: " + className);
		}catch(ClassNotFoundException e){
			System.out.println("클래스를 찾을 수 없습니다: " +  className);
		}
	}
	public static void main(String[] args) {
		checkClass("java.lang.String");
		checkClass("java.lang.String2");
	}

}
