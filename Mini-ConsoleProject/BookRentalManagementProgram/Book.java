package BookRentalManagementProgram;

public class Book {
	private String bookNumber;
	private String title;
	private String author;
	private boolean isBorrowed = false;
	
	Book(String bookNumber, String title, String author) {
		this.bookNumber = bookNumber;
		this.title = title;
		this.author = author;
	}
	
	public String getTitle () {
		return title;
	}
	
	public String getBookNumber () {
		return bookNumber;
	}
	
	public String getAuthor () {
		return author;
	}
	
	public boolean isBorrowed () {
		return isBorrowed;
	}
	
	public static Book findBook(Book books[], String bookNumber) {
		for ( int i = 0; i < books.length; i++) {
			if (books[i] != null && (books[i].getBookNumber().equals(bookNumber))) {
				return books[i]; 
			}
		}
		return null;
	}
	public void borrow () {
		if (!isBorrowed) {
			System.out.println("대여 가능한 도서입니다\n대여 처리되었습니다");
			isBorrowed = true;
		}else {
			System.out.println("현재 대여 중인 도서입니다 ");
		}
	}
	
	public void returnBook () {
		if(isBorrowed) {
			System.out.println("반납 처리되었습니다");
			isBorrowed = false;
		}else {
			System.out.println("이미 반납처리된 도서입니다");
		}
	}
	
	public void showInfo() {
		String borrowStatus = isBorrowed ? "대여중" : "대여가능"; 
		System.out.println("일반책 | 도서번호: " + bookNumber + " | 제목: " + title + " | 저자: " + author + " | 대여 여부: " + borrowStatus);
	}
	
	
}
