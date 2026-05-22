package ch15.Collection05_WebPage;

import java.util.Stack;

public class WebHistoryExample {

	public static void main(String[] args) {
		Stack<String> history = new Stack<>();
		
		history.push("google.com");
		history.push("naver.com");
		history.push("github.com");
		history.push("openai.com");
		
		System.out.println("[방문기록]");
		for(String s : history) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("현재 페이지: " + history.peek());
		System.out.println();
		
		for(int i=0; i<4; i++) {
			goBack(history);
	}
	}
	public static void goBack(Stack<String> history) {
		if(history.size() > 1) {
			System.out.println("뒤로 가기: " + history.pop() + "제거");
			System.out.println("현재 페이지: " + history.peek());
		} else {
			System.out.println("더 이상 뒤로 갈수없습니다");
			System.out.println("현재 페이지: " + history.peek());
		}
	}

}
