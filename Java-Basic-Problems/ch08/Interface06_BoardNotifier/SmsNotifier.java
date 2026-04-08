package ch08.Interface06_BoardNotifier;

public class SmsNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("문자 전송: [" +  message + "]");
	}

}
