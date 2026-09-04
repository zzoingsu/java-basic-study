package SplitThePowerGridInTwo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SplitThePowerGridInTwo {
	class Solution {
	    public int solution(int n, int[][] wires) {
	        return cut(wires, n);
	    }
	    public static int cut(int[][] wires, int n) {
	    	List<int[]> wire = new LinkedList<>(Arrays.asList(wires));
	    	int min = 1000;
	    	for(int i=0; i<wire.size(); i++) {
	    		boolean[] visited = new boolean[wire.size()];
	    		int[] grid = wire.get(i);
	    		wire.remove(i);
	    		int start = grid[0];
	    		int startNod = dfs(wire, visited, start);
	    		
	    		int end = grid[1];
	    		int endNod = dfs(wire, visited, end);
	    		
	    		int result = Math.abs(startNod-endNod);
	    		min = Math.min(result, min);
	    		wire.add(i, grid);
	    	}
	    	return min;
	    }
	    public static int dfs(List<int[]> wire, boolean[] visited, int nod) {
	        int count = 0;
	        for (int i = 0; i < wire.size(); i++) {
	            if (nod == wire.get(i)[0] && !visited[i]) {
	                int nextNod = wire.get(i)[1];
	                visited[i] = true;
	                count += 1;
	                count += dfs(wire, visited, nextNod);
	            }
	            if (nod == wire.get(i)[1] && !visited[i]) {
	                int nextNod = wire.get(i)[0];
	                visited[i] = true;
	                count += 1;
	                count += dfs(wire, visited, nextNod);
	            }
	        }
	        return count;
	    }
	}
}
