package SplitThePowerGridInTwo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SplitThePowerGridInTwo {
	class Solution {
	    public int solution(int n, int[][] wires) {
	        int answer = -1;
	        return answer;
	    }
	    public static int spilt(int[][] wires, int n) {
	    	Queue<int[]> queue = new LinkedList<>(Arrays.asList(wires));
	    	int count = 0;
	    	while(count == n-1) {
	    		int[] grid = queue.poll();
	    		int start = grid[0];
	    		int end = grid[1];
	    		count++;
	    	}
	    	return 0;
	    }
	    public static int countNods(Queue<int[]> queue, int nod) {
	    	int count = 0;
	    	int[] wire = queue.poll();
	    	if(nod == wire[0]) {
	    		nod = wire[0];
	    		count++;
	    	}
	    	if(nod == wire[1]) {
	    		nod = wire[1];
	    		count++;
	    	}
	    	return count;
	    }
	}
}
