package ch12.javaBaseModule05_PassWord;

public class Password {

	public static void main(String[] args) {
		String name = "홍길동";
		String phoneNum = "010-1234-5678";
		
		String firstWord = String.valueOf(name.charAt(0));
		String midFourNum = phoneNum.substring(9, 13);
		String lastFourNum = String.valueOf((int)(Math.random()*9000) + 1000);
		String passWord = firstWord + "-" + midFourNum + "-" + lastFourNum; 
		System.out.println("임시 비밀번호: " + passWord);
	}

}
