package sameNumberSubtraction;

import java.util.*;

public class SameNumberSubtraction {
	public class Solution {
	    public int[] solution(int[] arr) {
	    	List<Integer> list = new LinkedList<>();
	    	int temp = 0;
	    	for (int num : arr) {
	    	    list.add(num);
	    	}
	    	list.add(arr[0]);
	        for(int i=1; i<arr.length; i++) {
	        	if(arr[i] == arr [i+1]) {
	        		list.add(arr[i]);
	        	}
	        }
	        return list.stream().mapToInt(Integer :: intValue).toArray();
	    }
	}
}
