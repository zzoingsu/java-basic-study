package ch08.Interface06_BoardNotifier;

public class AppPushNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("앱푸시 전송: [" +  message + "]");
	}

}
