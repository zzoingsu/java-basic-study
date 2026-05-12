package ch12.javaBaseModule09_Annotation;

import java.lang.reflect.Method;

public class TestService {
	@RunTest
	public void testLogin() {
		System.out.println("로그인 테스트 실행");
	}
	
	public void testJoin() {
		System.out.println("회원가입 테스트 실행");
	}
	
	@RunTest
	public void testPayment() {
		System.out.println("결제 시스템 실행");
	}
	
	public static void main(String[] args) throws Exception {
		TestService testService = new TestService();
		Class<?> clazz = testService.getClass();
		
		Method[] methods = clazz.getDeclaredMethods();
		int count = 0;
		
		for(Method method : methods) {
			if(method.isAnnotationPresent(RunTest.class)) {
				System.out.println("실행 메소드: " + method.getName());
				method.invoke(testService);
				count++;
			}
		}
		System.out.println("총 실행 개수: " + count);
}
	
}
