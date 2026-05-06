package ch12.javaBaseModule04_MemberInfo;

public class MemberInfo {

	public static void main(String[] args) {
		String data = "user01:홍길동:85,user02:김자바:92,user03:이코딩:77,user04:박테스트:100";
		Member member;
		String[] array = data.split(",");
		for (int i=0; i<array.length; i++) {
			String[] dataInfo = array[i].split(":");
			String id = dataInfo[0];
			String name = dataInfo[1];
			int score = Integer.parseInt(dataInfo[2]);
			System.out.println(score);
			member = new Member(dataInfo[0], dataInfo[1], score);
		}
		
	}

}
