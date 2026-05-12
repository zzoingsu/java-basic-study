package ch12.javaBaseModule10_Annotation;

import java.lang.reflect.Method;

public class TaskService {
	@Todo
	public void cleanRoom() {
		System.out.println("방청소");
	}
	
	public void playGame() {
		System.out.println("게임");
	}
	
	@Todo
	public void studyJava() {
		System.out.println("자바 공부");
	}
	
	public static void main(String[] args) throws Exception {
		TaskService taskService = new TaskService();
		Class<?> clazz = taskService.getClass();
		
		Method[] methods = clazz.getDeclaredMethods();
		int count = 0;
		
		for(Method method : methods) {
			if(method.isAnnotationPresent(Todo.class)) {
				System.out.println("실행 메소드: " + method.getName());
				count++;
			}
		}
		System.out.println("총 개수: " + count);
	}

}
