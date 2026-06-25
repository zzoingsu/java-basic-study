package SecondReading.Day4.BookRentalManagementProgram;

import java.util.Map;
import java.util.Set;

public class LibraryManager {
	private Map<String, Book> bookMap;
	private Set<String> borrowedIsbns;
	
	public void addBook(Book book) {
		if(book == null) {
			System.out.println("도서 정보를 입력해야합니다");
			return;
		}
		if(bookMap.containsKey(book.getIsbn())) {
			System.out.println("중복된 도서입니다");
			return;
		}
		bookMap.put(book.getIsbn(), book);
	}
	
	public Book findBookByIsbn(String isbn) {
		if(!bookMap.containsKey(isbn)) {
			System.out.println("해당 도서가 존재하지 않습니다");
			return null;
		}
		return bookMap.get(isbn);
	}
	
	public void borrowBook(String isbn) {
		if(!bookMap.containsKey(isbn)) {
			System.out.println("해당 도서가 존재하지 않습니다");
			return;
		}
		if(borrowedIsbns.contains(isbn)) {
			System.out.println("이미 대여중인 도서입니다");
		}
		Book book = bookMap.get(isbn);
		borrowedIsbns.add(isbn);
		book.setBorrowed(true);
	}
	
	public void returnBook(String isbn) {
		if(!borrowedIsbns.contains(isbn)) {
			System.out.println("대여중인 도서가 아닙니다");
		}
		Book book = bookMap.get(isbn);
		borrowedIsbns.remove(isbn);
		book.setBorrowed(false);
	}
	
	public void printAllBooks() {
		for(Book book : bookMap.values()) {
			System.out.println(book);
		}
	}
	
	public void printBorrowedBooks() {
		for(String borrowedIsbn : borrowedIsbns) {
			System.out.println(borrowedIsbn);
		}
	}
}
