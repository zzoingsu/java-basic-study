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
				System.out.println("1. 일반책 | 2. 전자책");
				System.out.print("선택 > ");
				int bookOrEBook = Integer.parseInt(sc.nextLine());
				if(bookOrEBook <= 0 || bookOrEBook >= 3) {
					System.out.println("잘못된 번호가 입력되었습니다\n다시 입력해주시길 바랍니다");
					continue;
				}
					System.out.print("도서번호: ");
					String bookNumber = sc.nextLine();
					System.out.print("제목: ");
					String title = sc.nextLine();
					System.out.print("저자: ");
					String author = sc.nextLine();
						if(bookOrEBook == 1) {
							for(int i = 0; i < books.length; i++) {
								if (books[i] == null) {
									for ( int n = 0; n < books.length; n++) {
										if (books[n] != null && books[n].bookNumber.equals(bookNumber)) {
											System.out.println("중복된 도서번호입니다\n다시 시도해주시길 바랍니다");
											continue;
										}
									}
									books[i] = new Book(bookNumber, title, author);
									System.out.println("등록 완료");
									break;
										}
									}
								
						}if (bookOrEBook == 2) {
					System.out.print("파일크기(MB): ");
					int fileSize = Integer.parseInt(sc.nextLine());
						for (int i = 0; i < books.length; i++) {
							if (books[i] == null) {
								for ( int n = 0; n < books.length; n++) {
									if (books[n] != null && books[n].bookNumber.equals(bookNumber)) {
										System.out.println("중복된 도서번호입니다\n다시 시도해주시길 바랍니다");
										continue;
									}
								}
								books[i] = new EBook(bookNumber, title, author, fileSize);
								System.out.println("등록 완료");
								break;
							}
						}
				}
						
					}
			
			case 2 -> {
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						if (books[i] instanceof EBook eBook) {
							System.out.println();
							eBook.showInfo();
							continue;
						} if (books[i] instanceof Book book) {
							System.out.println();
							book.showInfo();
							continue;
						}
					}
				}
			}
			case 3 -> {
				System.out.print("도서번호 입력: ");
				String bookNumber = sc.nextLine();
				Book bookNumberMatched = Book.bookNumberMatch(books, bookNumber);
				if (bookNumberMatched != null) {
				bookNumberMatched.borrow(bookNumberMatched, bookNumber);
				continue;
				}else {
					System.out.println("일치하는 도서번호가 존재하지않습니다");
				}
			}
			case 4 -> {
				System.out.print("도서번호 입력: ");
				String bookNumber = sc.nextLine();
				Book bookNumberMatched = Book.bookNumberMatch(books, bookNumber);
				if (bookNumberMatched != null) {
					bookNumberMatched.returnBook(bookNumberMatched, bookNumber);
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
	}
/** 예외처리 구상
 * 1. 메뉴 오입력
 * 2. 대여,반납 도서번호 오입력  
 * 3. 일반책 전자책 선택시 오입력
 */
}
