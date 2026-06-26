package SecondReading.Day4.BookRentalManagementProgram;

public class BookRentalManagementProgramExample {
	public static void main(String[] args) {
		LibraryManager manager = new LibraryManager();

		manager.addBook(new Book("ISBN001", "이것이 자바다", "신용권"));
		manager.addBook(new Book("ISBN002", "혼자 공부하는 자바", "신용권"));
		manager.addBook(new Book("ISBN001", "중복 도서", "누군가"));

		manager.borrowBook("ISBN001");
		manager.borrowBook("ISBN001");
		manager.borrowBook("ISBN999");

		manager.printBorrowedBooks();

		manager.returnBook("ISBN001");
		manager.returnBook("ISBN001");

		manager.printAllBooks();
	}

}
