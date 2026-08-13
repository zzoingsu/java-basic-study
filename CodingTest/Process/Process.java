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
			@Override
			public String toString() {
				return priorities + "" + location;
			}
		}
	    public int solution(int[] priorities, int location) {
	    	int result;
	    	Queue<Value> queue = new LinkedList<>();
	    	for(int i=0; i<priorities.length; i++) {
	    		queue.add(new Value(priorities[i], i));
	    	}
	    	while(true) {
	    		if(queue.peek().priorities == findMax(queue) && queue.peek().location == location) {
	    			result = queue.peek().location;
	    			break;
	    		}
	    	}
	        return result;
	    }
	    public static int findMax(Queue<Value> queue) {
	    	int max = queue.stream()
	    	        .mapToInt(value -> value.priorities)
	    	        .max()
	    	        .orElse(0);
	    	return max;
	    }
	}
}