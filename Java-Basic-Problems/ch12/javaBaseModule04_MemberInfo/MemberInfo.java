package ch12.javaBaseModule04_MemberInfo;

public class MemberInfo {

	public static void main(String[] args) {
		String data = "user01:홍길동:85,user02:김자바:92,user03:이코딩:77,user04:박테스트:100";
		String[] array = data.split(",");
		Member[] members = new Member[array.length];
		String grade = null;
		
		for (int i=0; i<array.length; i++) {
			String[] dataInfo = array[i].split(":");
			int score = Integer.parseInt(dataInfo[2]);
			grade = members[i].gradeScope(score);
			members[i] = new Member(dataInfo[0], dataInfo[1], score, grade);
		}
		
	}

}
