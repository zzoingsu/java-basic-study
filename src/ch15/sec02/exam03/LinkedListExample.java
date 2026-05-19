package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8s ns \n","ArratList 걸린시간: ", (endTime - startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8s ns \n", "LinkedList 걸린시간: ",(endTime- startTime));
	}

}
