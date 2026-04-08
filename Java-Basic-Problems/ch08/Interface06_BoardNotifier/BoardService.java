package ch08.Interface06_BoardNotifier;

public class BoardService {
	Notifier[] notifier;
	
	BoardService(Notifier[] notifier) {
		this.notifier = notifier;
	}
	
	public void registerPost(String title) {
		System.out.println("새 게시글 등록: " + title);
		for( int i = 0; i < notifier.length; i++) {
			System.out.println();
			notifier[i].showSender();
			notifier[i].send(title + " 게시글이 등록되었습니다.");
		}
		
	}

}
