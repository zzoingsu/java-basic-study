package ch18.InputOutputStream03_CopyExample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyExample {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("/Users/zzoingsu/temp/test/source.txt");	
			Writer writer = new FileWriter("/Users/zzoingsu/temp/test/target.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);
				if(num == -1) {
					break;
				}
				writer.write(data, 0, num);
			}
			reader.close();
			writer.flush();
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
