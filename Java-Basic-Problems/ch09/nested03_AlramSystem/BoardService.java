package ch09.nested03_AlramSystem;

public class BoardService {
	public void register(String title, Notifier notifier) {
		notifier.send("게시글 등록: " + title);
	}
	
}
