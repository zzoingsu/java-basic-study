package SecondReading.Day6.BufferedReaderProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("/Users/zzoingsu/temp/test/memo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader("/Users/zzoingsu/temp/test/memo.txt");
		BufferedReader br = new BufferedReader(fr);
		
		bw.write("오늘은 자바 입출력 공부");
		bw.close();
		
		String str = br.readLine();
		System.out.println(str);
		br.close();
		
		
		}

}
