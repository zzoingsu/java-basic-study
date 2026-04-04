package BookRentalManagementProgram;

public class EBook extends Book {
	int fileSize;
	
	EBook(String bookNumber, String title, String author, int fileSize) {
		super(bookNumber, title, author);
		this.fileSize = fileSize;
	}
	@Override
	public void showInfo() {
		System.out.println("전자책 | 도서번호: " + bookNumber + " | 제목: " + title + " |  저자: " + author + " |  파일크기: " + fileSize + "MB" + " | 대여 여부: " + isBorrowed);
	}

}
