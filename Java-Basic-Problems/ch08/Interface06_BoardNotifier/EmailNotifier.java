package ch08.Interface06_BoardNotifier;

public class EmailNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("이메일 전송: [" +  message + "]");
	}

}
