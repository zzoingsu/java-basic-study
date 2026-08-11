package Process;

import java.util.*;
import java.util.stream.Collectors;

public class Process {
	class Solution {
	    public int solution(int[] priorities, int location) {
	    	Queue<Integer> q = Arrays.stream(priorities)
	    			.boxed()
	    			.collect(Collectors.toCollection(LinkedList::new));
	    	int count=0;
	    	for(int i=0; i<q.size(); i++) {
	    		if(q.peek() == findMax(q)) {
	    			count++;
	    			q.poll();
	    		}
	    		int value = q.poll();
	    		q.add(value);
	    	}
	    	
	        return count;
	    }
	    public static int findMax(Queue<Integer> q) {
	    	int max = q.stream()
	    	        .mapToInt(Integer::intValue)
	    	        .max()
	    	        .orElse(0);
	    	return max;
	    }
	}
}
