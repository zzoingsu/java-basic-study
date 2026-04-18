package ch09.nested03_AlramSystem;

public class BoardServiceExample {

	public static void main(String[] args) {
		BoardService service = new BoardService();
		service.register("자바 공부", new Notifier() {
			@Override
			public void send(String message) {
				System.out.println("이메일 전송: [" + message + "]");
			}
		});
	}

}
