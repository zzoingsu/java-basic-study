package ProcessDelvelopment;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProcessDevelopment {
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        return develop(progresses, speeds);
	    }
	    public int[] develop(int[] progresses, int[] speeds) {
	    	Queue<Integer> queue = new LinkedList<>();
	    	List<Integer> list = new LinkedList<>();
	    	int days = 0;
	    	int index = 0;
	    	for (int progress : progresses) {
	    	    queue.add(progress);
	    	}
	    	while(!queue.isEmpty()) {
	    		int progress = queue.poll() + days*speeds[index];
	    		days += Math.ceil((100 - progress)/(float)speeds[index]);
	    		index+=1;
	    		int result = findDone(queue, days, progresses, speeds, index);
	    		index += result +1;
	    		list.add(result +1);
	    	}
	    	return list.stream().mapToInt(Integer :: intValue).toArray();
	    }
	    public int findDone(Queue<Integer> queue, int days, int[] progresses, int[] speeds, int index) {
	    	int count = 0;
	    	if(queue.isEmpty()) {
	    		return count;
	    	}
	    	if(queue.peek() + (days*speeds[index]) >=100) {
	    		queue.poll();
	    		index += 1;
	    		count+=1;
	    		count += findDone(queue, days, progresses, speeds, index);
	    	}
	    	return count;
	    }
	}
}
	