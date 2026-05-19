package ch15.sec04.exam01;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김자바", 85);
		map.put("이자바", 90);
		map.put("박자바", 80);
		map.put("이자바", 95);
		System.out.println("총 Entry개수: " + map.size());
		System.out.println();
		
		String key = "이자바";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String k = iterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		map.remove("이자바");
		System.out.println("총 Entry수: " + map.size());
		System.out.println();
	}

}
