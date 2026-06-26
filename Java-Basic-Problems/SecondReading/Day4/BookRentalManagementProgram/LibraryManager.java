package SecondReading.Day4.BookRentalManagementProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LibraryManager {
	private Map<String, Book> bookMap = new HashMap<>();
	private Set<String> borrowedIsbns = new HashSet<>();
	
	public void addBook(Book book) {
		if(validateBook(book)) {return;}
		if(bookMap.containsKey(book.getIsbn())) {
			System.out.println("중복된 도서입니다");
			return;
		}
		bookMap.put(book.getIsbn(), book);
	}
	
	public Book findBookByIsbn(String isbn) {
		if(!validateNull(isbn)) {return null;}
		if(validateIsbn(isbn, bookMap)) {return null;}
		return bookMap.get(isbn);
	}
	
	public void borrowBook(String isbn) {
		if(validateNull(isbn)) {return;}
		if(!validateIsbn(isbn, bookMap)) {return;}
		if(borrowedIsbns.contains(isbn)) {
			System.out.println("이미 대여중인 도서입니다");
			return;
		}
		Book book = bookMap.get(isbn);
		borrowedIsbns.add(isbn);
		book.setBorrowed(true);
		System.out.println("대여처리 되었습니다");
	}
	
	public void returnBook(String isbn) {
		if(validateNull(isbn)) {return;}
		if(!validateIsbn(isbn, bookMap)) {return;}
		if(!borrowedIsbns.contains(isbn)) {
			System.out.println("대여중인 도서가 아닙니다");
			return;
		}
		Book book = bookMap.get(isbn);
		borrowedIsbns.remove(isbn);
		book.setBorrowed(false);
		System.out.println("반납처리 되었습니다");
	}
	
	public void printAllBooks() {
		for(Book book : bookMap.values()) {
			System.out.println(book);
		}
	}
	
	public void printBorrowedBooks() {
		for(String borrowedIsbn : borrowedIsbns) {
			System.out.println(bookMap.get(borrowedIsbn));
		}
	}
	
	public static boolean validateBook(Book book) {
		if(book == null) {
			System.out.println("정보를 입력해야 합니다");
			return true;
		}
		return false;
	}
	public static boolean validateNull(String str) {
		if(str == null) {
			System.out.println("정보를 입력해야 합니다");
			return true;
		}
		return false;
	}
	public static boolean validateIsbn(String isbn, Map<String, Book> bookMap) {
		if(!bookMap.containsKey(isbn)) {
			System.out.println("해당 도서가 존재하지 않습니다");
			return false;
		}
		return true;
	}
}
