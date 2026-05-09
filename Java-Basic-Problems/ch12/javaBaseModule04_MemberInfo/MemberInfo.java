package ch12.javaBaseModule04_MemberInfo;

public class MemberInfo {

	public static void main(String[] args) {
		String data = "user01:홍길동:85,user02:김자바:92,user03:이코딩:77,user04:박테스트:100";
		String[] array = data.split(",");
		Member[] members = new Member[array.length];
		int max = 0;
		int min = 100;
		int sum = 0;
		
		for (int i=0; i<array.length; i++) {
			String[] dataInfo = array[i].split(":");
			int score = Integer.parseInt(dataInfo[2]);
			
			members[i] = new Member(dataInfo[0], dataInfo[1], score);
			
			max = Math.max(max, members[i].getScore());
			min = Math.min(min, members[i].getScore());
			sum += members[i].getScore();
			System.out.println(members[i]);
		}
			double avg = (double)sum / array.length;
			System.out.println("총점: " + sum);
			System.out.printf("평균: %.2f\n" , avg);
			System.out.println("최고점: " + max);
			System.out.println("최저점: " + min);
		
	}

}
