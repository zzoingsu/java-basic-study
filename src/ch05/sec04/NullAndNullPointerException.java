package ch05.sec04;

public class NullAndNullPointerException {

	public static void main(String[] args) {
		
		String hobby = "여행";
		hobby = null;  // String 객체를 쓰레기로 만듦
		System.out.println(hobby);
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: "+ kind2); // 쓰레기가 되지않음
	}

}
