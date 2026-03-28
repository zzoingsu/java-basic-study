package ch06.Class04_BookInfo;

public class Book {
	String title;
	String author;
	int price;
	
	Book(String title) {
		this(title,"미상",0);
	}
	Book(String title, String author) {
		this(title, author, 0);
	}
	Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void showInfo() {
		System.out.printf("제목: %s, 저자: %s, 가격: %d원", title, author, price);
	}

}
