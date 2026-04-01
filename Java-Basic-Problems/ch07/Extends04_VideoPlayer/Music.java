package ch07.Extends04_VideoPlayer;

public class Music extends Media {
	@Override
	public void play() {
		System.out.println("음악을 재생합니다");
	}
	
	public void showSinger() {
		System.out.println("가수 정보를 표시합니다");
		}

}
