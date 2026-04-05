package BookRentalManagementProgram;

import java.util.Scanner;

public class LibraryApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "책 등록,책 목록,대여,반납,종료";
		String[] menuArray = menu.split(",");
		Book[] books = new Book[100];
		
		bookApplication : while(true) {
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("1. 책 등록 | 2. 책 목록 | 3.대여 | 4. 반납 | 5. 종료 ");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			int menuNumber = Integer.parseInt(sc.nextLine());
			if (menuNumber <= 0 || menuNumber >= 6) {
				System.out.println("잘못된 번호가 입력되었습니다\n다시 입력해주길 바랍니다");
				continue;
			}
			System.out.println("[" + menuArray[menuNumber - 1] + "]");
			
			switch(menuNumber) {
			case 1 -> {
				boolean isArrayLeft = false;
				for ( int i = 0;i < books.length; i++) {
					if (books[i] == null) {
						isArrayLeft = true; 
						break;
					}
				}
				if(!isArrayLeft) {
					System.out.println("더이상 책을 등록할수없습니다");
					continue;
				}
				System.out.println("1. 일반책 | 2. 전자책");
				System.out.print("선택 > ");
				int bookOrEBook = Integer.parseInt(sc.nextLine());
				if(bookOrEBook <= 0 || bookOrEBook >= 3) {
					System.out.println("잘못된 번호가 입력되었습니다\n다시 입력해주시길 바랍니다");
					continue;
				}
					System.out.print("도서번호: ");
					String bookNumber = sc.nextLine();
					if (Book.findBook(books, bookNumber) != null) {
						System.out.println("중복된 도서번호 입니다");
						continue;
					}
					System.out.print("제목: ");
					String title = sc.nextLine();
					System.out.print("저자: ");
					String author = sc.nextLine();
					Book newBook;
					
						if(bookOrEBook == 1) {
							 newBook = new Book(bookNumber, title, author);
						}else {
					System.out.print("파일크기(MB): ");
					int fileSize = Integer.parseInt(sc.nextLine());
					newBook = new EBook(bookNumber, title, author, fileSize);
						}
						
					 for (int i = 0; i < books.length; i++) {
									if (books[i] == null) {
										books[i] = newBook;
										System.out.println("등록 완료");
										break;	
							}
						}
					}
			
			case 2 -> {
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
							System.out.println();
							books[i].showInfo();
					}
				}
			}
			case 3 -> {
				System.out.print("도서번호 입력: ");
				String bookNumber = sc.nextLine();
				Book matchedBook = Book.findBook(books, bookNumber);
				if (matchedBook != null) {
				matchedBook.borrow();
				continue;
				}else {
					System.out.println("일치하는 도서번호가 존재하지않습니다");
				}
			}
			case 4 -> {
				System.out.print("도서번호 입력: ");
				String bookNumber = sc.nextLine();
				Book matchedBook = Book.findBook(books, bookNumber);
				if (matchedBook != null) {
					matchedBook.returnBook();
					continue;
				}else {
					System.out.println("일치하는 도서번호가 존재하지않습니다");
				}
			}
			case 5 -> {
				System.out.println("프로그램 종료");
				break bookApplication;
			}
			}
		}
		sc.close();
	}
/** 예외처리 구상
 * 1. 메뉴 오입력
 * 2. 대여,반납 도서번호 오입력  
 * 3. 일반책 전자책 선택시 오입력
 */
}
