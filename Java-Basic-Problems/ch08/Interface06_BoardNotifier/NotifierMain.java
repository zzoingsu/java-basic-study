package ch08.Interface06_BoardNotifier;

public class NotifierMain {

	public static void main(String[] args) {
		Notifier[] notifier = {
				new EmailNotifier(),
				new SmsNotifier(),
				new AppPushNotifier()
		};
		BoardService boardService = new BoardService(notifier);
		boardService.registerPost("자바 인터페이스 정리");
		
	}

}
