package ch15.Collection04_Score;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ScoreExample {

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		
		scores.put("홍길동", 85);
		scores.put("김자바", 92);
		scores.put("이코딩", 77);
		scores.put("박테스트", 100);
		
		String key = "김자바";
		Integer value = scores.get(key);
		System.out.println("김자바의 점수: " + value);
		
		int sum = 0;
		int max = 0;
		String maxName = null;
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		for(Entry<String, Integer> e : entrySet) {
			String name = e.getKey();
			Integer score = e.getValue();
			System.out.println(name + ": " + score + "점");
			sum += score;
			if(max<score) {
				max = score;
				maxName = name;
			}
		}
		
		
		double avgScore = (double)sum / scores.size();
		System.out.println();
		System.out.println("평균점수: " + avgScore);
		System.out.println("최고점 : " + maxName);
	}

}
