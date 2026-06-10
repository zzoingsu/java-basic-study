package ch18.InputOutputStream05_InputStudentsInfo;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class InputStudentsInfoExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("/Users/zzoingsu/temp/test/student.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		String name = dis.readUTF();
		int age = dis.readInt();
		double avgScore = dis.readDouble();
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("평균점수: " + avgScore);
		
		dis.close();
		fis.close();
	}

}
