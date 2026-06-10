package ch18.InputOutputStream02_ReadByteArray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample { 
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("/Users/zzoingsu/temp/test/data.db");
			byte[] data = new byte[100];
			int sum = 0;
			while (true) {
				int num = is.read(data);
				if(num == -1) {
					break;
				}
				String str = new String(data, 0, num);
				String[] arr = str.split(" ");
				for(String s : arr) {
					int value = Integer.parseInt(s);
					sum += value;
				}
			}
			is.close();
			System.out.println("총합: " + sum);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
