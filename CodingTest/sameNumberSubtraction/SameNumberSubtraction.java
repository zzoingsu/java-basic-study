package sameNumberSubtraction;

import java.util.*;

public class SameNumberSubtraction {
	public class Solution {
	    public int[] solution(int[] arr) {
	    	List<Integer> list = new LinkedList<>();
	        for(int i=0; i<arr.length; i++) {
	        	if(i == 0 || arr[i] != arr[i+1]) {
	        		list.add(arr[i]);
	        	}
	        }
	        return list.stream().mapToInt(Integer :: intValue).toArray();
	    }
	}
	public int solution1(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<list.size(); j++) {
				if(nums[i] != list.get(j)) {
					list.add(nums[i]);
				}
			}
		}
		int variety = list.size();
		return (variety>nums.length/2) ? nums.length/2 : variety;
	}
	
	public String solution2(String[] participants, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		String result = null;
		for(String participant : participants) {
			map.put(participant, map.getOrDefault(participant, 0) +1);
		}
		for(int i=0; i<completion.length; i++) {
			if(map.containsKey(completion[i])) {
				map.put(completion[i], map.get(completion[i])-1);
			}
		}
		for(String name : map.keySet()) {
			if(map.get(name) != 0) {
				result = name;
			}
		}
		return result;
	}
}
