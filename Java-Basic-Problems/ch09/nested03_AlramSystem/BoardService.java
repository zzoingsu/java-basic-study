package ch09.nested03_AlramSystem;

public class BoardService {
	
	public class EmailNotifier implements Notifier {
		@Override
		public void send(String message) {
			System.out.println("이메일 전송: [" + message+"]");
		}
	}
	public class MessageNotifier implements Notifier {
		@Override
		public void send(String message) {
			System.out.println("문자 전송: [" + message + "]");
		}
	}
	public class AppPushNotifier implements Notifier {
		@Override
		public void send(String message) {
			System.out.println("앱푸시 전송: [" + message + "]");
		}
	}
}
