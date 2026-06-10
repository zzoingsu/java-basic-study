package ch18.InputOutputStream04_OutputStudentsInfo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class OutputStudentsInfoExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/zzoingsu/temp/test/student.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("김민수");
		dos.writeInt(23);
		dos.writeDouble(87.5);
		
		dos.flush();
		dos.close();
		
		System.out.println("저장이 완료되었습니다");
	}

}
