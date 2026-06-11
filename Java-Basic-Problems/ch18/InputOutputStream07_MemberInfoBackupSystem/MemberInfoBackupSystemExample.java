package ch18.InputOutputStream07_MemberInfoBackupSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MemberInfoBackupSystemExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/zzoingsu/temp/test/member.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List<Member> memberList = new ArrayList<>(); 
		memberList.add(new Member("winter", "김민수", 23));
		memberList.add(new Member("summer", "이서준", 25));
		memberList.add(new Member("spring", "박지훈", 22));
		memberList.add(new Member("autumn", "최유진", 19));
		memberList.add(new Member("sky", "한지민", 31));
		
		oos.writeInt(memberList.size());
		for(int i=0; i< memberList.size(); i++) {
			oos.writeObject(memberList.get(i));
		}
		System.out.println("파일 저장 완료");
		System.out.println();
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("/Users/zzoingsu/temp/test/member.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Member> readMemberList = new ArrayList<>();
		int count = (int)ois.readInt();
		for(int i=0; i<=count; i++) {
			readMemberList.add((Member)ois.readObject());
		}
		ois.close();
		
		System.out.println("[20세 이상 회원]");
		readMemberList.stream()
					  .filter(m -> m.getAge() >= 20)
					  .sorted((s1,s2) -> Integer.compare(s1.getAge(), s2.getAge()))
					  .forEach(System.out :: println);
		System.out.println();
		
		double avg = readMemberList.stream()
					  .mapToInt(s -> s.getAge())
					  .average()
					  .orElse(0.0);
		System.out.println("평균 나이: " + avg);
	}

}
