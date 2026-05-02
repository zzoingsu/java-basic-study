package SeminarApplicationAndNotificationManagementSystem;

public class smsNotifier implements Notifier {
	@Override
	public void send(String message) {
		System.out.println("[문자]" + message);
	}

}
