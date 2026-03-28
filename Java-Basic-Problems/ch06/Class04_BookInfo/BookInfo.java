package ch06.Class04_BookInfo;

public class BookInfo {

	public static void main(String[] args) {
		Book myBook = new Book("데미안", "헤르만 헤세",13000);
		myBook.showInfo();
		
		Book yourBook = new Book("이방인");
		yourBook.showInfo();
		
		Book newBook = new Book("페스트","카뮈");
		newBook.showInfo();
	}

}
