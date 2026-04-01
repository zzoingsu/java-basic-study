package ch07.Extends04_VideoPlayer;

public class MediaMain {

	public static void main(String[] args) {
		Media myMedia = new Music();
		Media yourMedia = new Video();
		
		myMedia.play();
		yourMedia.play();
		
		
	}

}
