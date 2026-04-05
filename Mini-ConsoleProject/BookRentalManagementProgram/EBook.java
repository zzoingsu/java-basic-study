package BookRentalManagementProgram;

public class EBook extends Book {
	private int fileSize;
	
	EBook(String bookNumber, String title, String author, int fileSize) {
		super(bookNumber, title, author);
		this.fileSize = fileSize;
	}
	
	@Override
	public void showInfo() {
		String borrowStatus = isBorrowed() ? "대여중" : "대여가능"; 
		System.out.println("전자책 | 도서번호: " + getBookNumber() + " | 제목: " + getTitle() + " |  저자: " + getAuthor() + " |  파일크기: " + fileSize + "MB" + " | 대여 여부: " + borrowStatus);
	}

}
