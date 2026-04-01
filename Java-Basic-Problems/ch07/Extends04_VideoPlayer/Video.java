package ch07.Extends04_VideoPlayer;

public class Video extends Media {
	@Override
	public void play() {
		System.out.println("영상을 재생합니다");
	}
	
	public void showResolution() {
		System.out.println("해상도 정보를 출력합니다");
	}

}
