package ch09.nested05_Movie;

public class MovieService {
	public void book(String movieTitle, int personCount) {
		class Ticket {
			public void printTicket() {
				System.out.println("영화 제목 :" + movieTitle);
				System.out.println("인원 수: " + personCount);
				System.out.println("예매가 완료되었습니다");
			}
		}
		Ticket ticket = new Ticket();
		ticket.printTicket();
	}

}
