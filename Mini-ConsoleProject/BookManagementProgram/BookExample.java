package BookManagementProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

public class BookExample {
	Scanner sc = new Scanner(System.in);
	private Connection conn;
	private BookDao bookDao;
	
	public static void main(String[] args) {
		BookExample bookExample = new BookExample();
		bookExample.list();
	}
	
	public BookExample() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql_basic_study",
					"root", 
					"1234"
					);
			bookDao = new BookDao(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void list() {
		System.out.println("[도서 목록]");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%-6s%-16s%-16s%-16s%-40s\n", "id", "author", "price ", "date" , "title");
		System.out.println("-------------------------------------------------------------");
		try {
			List<Book> list = bookDao.findAll();
			for(Book book : list) {
				System.out.printf(
						"%-6s%-16s%-16d%-16s%-40s\n",
						book.getBookId(),
						book.getAuthor(),
						book.getPrice(),
						book.getCreatedAt(),
						book.getTitle()
								);
			}
			mainMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mainMenu() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		switch(menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		default -> System.out.println("***잘못된 입력입니다***");
		}
	}
	
	public void create() {
		System.out.println("[새 도서 입력]");
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("저자: ");
		String author = sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			Book book = new Book();
			book.setTitle(title);
			book.setAuthor(author);
			book.setPrice(price);
			try {
				bookDao.insert(book);	
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		list();
	}
	public void read() {
		System.out.println("[도서 읽기]");
		System.out.print("book_id: ");
		int book_id = Integer.parseInt(sc.nextLine());
		try {
			Book book = bookDao.findById(book_id);	
			if(book != null) {
				System.out.println("##########");
				System.out.println("번호: " + book.getBookId());
				System.out.println("제목: " + book.getTitle());
				System.out.println("저자: " + book.getAuthor());
				System.out.println("가격: " + book.getPrice());
				System.out.println("등록일: " + book.getCreatedAt());
				System.out.println("##########");
			}
			if (book == null) {
			    System.out.println("해당 도서가 없습니다");
			    list();
			    return;
			}
			System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
			System.out.print("메뉴 선택: ");
			String menuNo = sc.nextLine();
			switch(menuNo) {
			case "1" -> update(book_id);
			case "2" -> delete(book_id);
			case "3" -> list();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(int book_id) {
		System.out.println("[수정 내용 입력]");
		System.out.print("제목: ");
		String title = sc.nextLine();
		System.out.print("저자: ");
		String author = sc.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(sc.nextLine());
	
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		book.setBookId(book_id);
		
		System.out.println();
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				bookDao.update(book);
			} catch(Exception e) {
				e.printStackTrace();
			}	
		}
		list();
	}
	
	public void delete(int book_id) {
		System.out.println("[도서 삭제]");
		Book book = new Book();
		book.setBookId(book_id);
		try {
			bookDao.delete(book);
		} catch(Exception e) {
			e.printStackTrace();
		}
		list();
	}
	
	public void clear() {
		System.out.println("[도서 전체 삭제]");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				bookDao.clear();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		list();
	}
	
	public void exit() {
		System.out.println("[프로그램 종료]");
		sc.close();
		try {
			conn.close();	
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
}
