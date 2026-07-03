package BookManagementProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

public class BookExample {
	Scanner sc = new Scanner(System.in);
	private Connection conn;
	private BookDao bookDao;
	
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
		System.out.println();
		try {
			List<Book> list = bookDao.findAll();
			for(Book book : list) {
				System.out.printf(
						"%-6s%-12s%-16d%-16s%-40s\n",
						book.getBook_Id(),
						book.getAuthor(),
						book.getPrice(),
						book.getCreated_At(),
						book.getTitle()
								);
			}
			mainMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void mainMenu() {
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		switch(menuNo) {
		
		}
	}
	
	public static void main(String[] args) {
		BookExample bookExample = new BookExample();
		bookExample.list();
	}
	
}
