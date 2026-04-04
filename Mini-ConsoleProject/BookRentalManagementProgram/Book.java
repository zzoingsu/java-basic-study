package BookRentalManagementProgram;

public class Book {
	String bookNumber;
	String title;
	String author;
	boolean isBorrowed = false;
	
	Book(String bookNumber, String title, String author) {
		this.bookNumber = bookNumber;
		this.title = title;
		this.author = author;
	}
	
	public static Book bookNumberMatch(Book books[], String bookNumber) {
		for ( int i = 0; i < books.length; i++) {
			if (books[i] != null && (books[i].bookNumber.equals(bookNumber))) {
				return books[i]; 
			}
		}
		return null;
	}
	public void borrow ( Book bookNumberMatched, String bookNumber) {
		if (!isBorrowed) {
			System.out.println("대여 가능한 도서입니다\n대여 처리되었습니다");
			isBorrowed = true;
		}else {
			System.out.println("현재 대여 중인 도서입니다 ");
		}
	}
	
	public void returnBook (Book bookNumberMatched, String bookNumber) {
		if(isBorrowed) {
			System.out.println("반납 처리되었습니다");
			isBorrowed = false;
		}else {
			System.out.println("이미 반납처리된 도서입니다");
		}
	}
	
	public void showInfo() {
		System.out.println("일반책 | 도서번호: " + bookNumber + " | 제목: " + title + " | 저자: " + author + " | 대여 여부: " + isBorrowed);
	}
	
	
}
