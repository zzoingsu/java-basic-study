package ch16.Lambda04_EventProcessingSystem;

public class EventProcessingSystemExample {

	public static void main(String[] args) {
		Event[] events = {
				new Event("LOGIN", "김철수", "웹 사이트 접속", 1),
			    new Event("PAYMENT", "박민준", "30000원 결제", 2),
			    new Event("MESSAGE", "이수진", "관리자에게 문의 메시지 전송", 1),
			    new Event("ERROR", "정다은", "서버 연결 실패", 5),
			    new Event("LOGOUT", "김철수", "사용자 로그아웃", 1),
			    new Event("ERROR", "최영희", "결제 승인 실패", 3),
			    new Event("SIGNUP", "오민재", "신규 회원가입", 1)
		};
		
		Event[] loginEvent = new Event[events.length];
		int count = 0;
		for(int i=0; i<events.length; i++) {
			if(events[i].getEventType().equals("LOGIN")) {
				loginEvent[count] = events[i];
				count++;
			}
		}
		EventProcesser eventProcesser = new EventProcesser();
		eventProcesser.registerHandler(events, event -> {
			return "";
		});
	}

}
