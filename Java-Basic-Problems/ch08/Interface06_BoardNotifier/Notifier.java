package ch08.Interface06_BoardNotifier;

public interface Notifier {
	void send(String message);
	
	default void showSender() {
		System.out.println("알림 시스템을 실행합니다");
	}

}
