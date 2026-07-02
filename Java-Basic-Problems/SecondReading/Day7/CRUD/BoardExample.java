package SecondReading.Day7.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;

public class BoardExample {
	Scanner sc = new Scanner(System.in);
	private Connection conn;
	private BoardDao boardDao;
	
	public BoardExample() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mysql_basic_study",
					"root", 
					"1234"
					);
			boardDao = new BoardDao(conn);
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	public void list() {
		System.out.println();
		System.out.println("[게시글 목록]");
		System.out.println("--------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date" , "title");
		System.out.println("--------------------------------------------------------");
		try {
			List<Board> boards = boardDao.findAll();
			for(Board board : boards) {
				System.out.printf(
					"%-6s%-12s%-16s%-40s\n",
					board.getBno(),
					board.getBwriter(),
					board.getBdate(),
					board.getBtitle()
							);
			}	mainMenu();
		} catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		System.out.println();
		
		switch(menuNo) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		}
	}
	
	public void create() {
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: ");
		board.setBtitle(sc.nextLine());
		System.out.print("내용: ");
		board.setBcontent(sc.nextLine());
		System.out.print("작성자: ");
		board.setBwriter(sc.nextLine());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("보조 메뉴: 1. Ok | 2. Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				boardDao.insert(board);
			}catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		list();
	}
	
	public void read() {
		System.out.println("[게시물 읽기]");
		System.out.print("bno: ");
		int bno = Integer.parseInt(sc.nextLine());
		try {
			Board board = boardDao.findByBno(bno);
			if (board == null) {
			    System.out.println("해당 게시물이 없습니다.");
			    list();
			    return;
			}
				System.out.println("##########");
				System.out.println("번호: "  + board.getBno());
				System.out.println("제목: "  + board.getBtitle());
				System.out.println("내용: "  + board.getBcontent());
				System.out.println("작성자: "  + board.getBwriter());
				System.out.println("날짜: "  + board.getBdate());
				System.out.println("--------------------------------------------------------");
				System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
				System.out.print("메뉴 선택: ");
				String menuNo = sc.nextLine();
				System.out.println();
				
				switch(menuNo) {
				case "1" -> update(board);
				case "2" -> delete(board);
				case "3" -> list();
				}
		}catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("--------------------------------------------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
			boardDao.clear();
			} catch(Exception e) {
				e.printStackTrace();
				exit();
			}
		} list();
	}
	
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch( Exception e) { e.printStackTrace();}
		}
		System.out.println("(*** 게시판 종료 ***");
		System.exit(0);
	}
	
	public void update(Board board) {
		System.out.println("[수정 내용 입력]");
		System.out.print("제목: ");
		board.setBtitle(sc.nextLine());
		System.out.println("내용: ");
		board.setBcontent(sc.nextLine());
		System.out.println("작성자");
		board.setBwriter(sc.nextLine());
		System.out.println("--------------------------------------------------------");
		System.out.println("보조 메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴 선택: ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
			boardDao.update(board);
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		} list();
	}
	
	public void delete(Board board) {
		try {
			boardDao.delete(board.getBno());
		}catch (Exception e) {
			e.printStackTrace();
			exit();
		} list();
	}

	public static void main(String[] args) {
	BoardExample boardExample = new BoardExample();
	boardExample.list();

	}
}
