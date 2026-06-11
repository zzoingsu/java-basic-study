package ch18.InputOutputStream06_MemberObjectSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MemberObjectSerializable {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/zzoingsu/temp/test/member.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member m1 = new Member("winter", "김민수", 23);
		Member m2 = new Member("summer", "이서준", 25);
		Member m3 = new Member("spring", "박지훈", 22);
		
		oos.writeObject(m1);
		oos.writeObject(m2);
		oos.writeObject(m3);
		
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("/Users/zzoingsu/temp/test/member.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		for(int i=0; i<3; i++) {
			System.out.println((Member) ois.readObject());
		}
		
		ois.close();
		
	}

}
