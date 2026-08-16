package Process;

import java.util.*;
import java.util.stream.Collectors;

public class Process {
	class Solution {
		class Value {
			private int priorities;
			private int location;
            
			public Value(int priorties, int location) {
				this.priorities = priorties;
				this.location = location;
			}
		}
	    public int solution(int[] priorities, int location) {
            int count = 0;
	    	Queue<Value> queue = new LinkedList<>();
	    	for(int i=0; i<priorities.length; i++) {
	    		queue.add(new Value(priorities[i], i));
	    	}
            while(true) {
	    		if(queue.peek().priorities == findMax(queue)) {
	    			if(queue.peek().location == location) {
	    				count++;
	    				break;
	    			}
	    			queue.poll();
                    count++;
                    continue;
	    		}
	    		Value value = queue.poll();
	    		queue.add(value);
	    	}
	        return count;
	    }
	    public static int findMax(Queue<Value> q) {
	    	int max = q.stream()
	    	        .mapToInt(value -> value.priorities)
	    	        .max()
	    	        .orElse(0);
	    	return max;
	    }
	}
}