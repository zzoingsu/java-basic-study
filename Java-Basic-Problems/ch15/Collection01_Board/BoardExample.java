package ch15.Collection01_Board;

import java.util.ArrayList;
import java.util.List;

public class BoardExample {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("자바 공부", "컬랙션 복습", "홍길동"));
		list.add(new Board("HTML 공부", "생성자 복습", "김자바"));
		list.add(new Board("CSS 공부", "그리드 이해", "이자바"));
		list.add(new Board("JavaScipt 공부", "문법 복습", "박자바"));
		list.add(new Board("Spring 공부", "MVC 구조 이해", "최자바"));
		
		for(Board b : list) {
			System.out.println(b);
		}
		System.out.println();
		int size = list.size();
		System.out.println("총 게시글 수: " + size);
		
		System.out.println("[홍길동 작성 게시물]");
		for(Board b : list) {
			if(b.isWrittenBy("홍길동")) {
			System.out.println(b);
			}
		}
	}

}
