package ShortestDistance;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistance {
	class Solution {
	    public int solution(int[][] maps) {
	    	return bfs(maps);
	    }
	    public static int dfs(int[][]maps, int length, int width, boolean[][] visited,int count) {
	    	int min=100000;
	    	if(length<=-1 || length>=maps.length) {
	    		return 10000;
	    	}
	    	if(width<=-1 || width>=maps[0].length) {
	    		return 10000;
	    	}
	    	if(width==maps[0].length-1 && length==maps.length-1) {
	    		return count;
	    	}
	    	if(maps[length][width] == 0 || visited[length][width] == true) {
	    		return 10000;
	    	}
	    	visited[length][width] = true;
	    	int down = dfs(maps, length+1, width, visited ,count+1);
	    	int up = dfs(maps, length-1, width, visited, count+1);
	    	int right = dfs(maps, length, width+1, visited, count+1);
	    	int left = dfs(maps, length, width-1, visited, count+1);
	    	visited[length][width] = false;
	    	int upDown = Math.min(down, up);
	    	int leftRight = Math.min(left, right);
	    	return Math.min(upDown, leftRight);
	    }
	    public static int bfs(int[][] maps) {
	    	Queue<int[]> queue = new LinkedList<>();
	    	int count = 0;
	    	queue.add(new int[] {0, 0});
	    	while(!queue.isEmpty()) {
	    		int[] location = queue.poll();
	    		int length = location[0];
	    		int width = location[1];
	    		if(location[0] == maps.length-1 && location[1] == maps[0].length-1) {
	    			return count;
	    		}
	    		if(length+1 < maps.length && maps[length+1][width] != 0) {
	    			queue.add(new int[] {length+1, width});
	    			count ++;
	    		}
	    		if(length-1>=0 && maps[length-1][width] != 0) {
	    			queue.add(new int[] {length-1, width});
	    			count ++;
	    		}
	    		if(width+1 < maps[0].length && maps[length][width+1] != 0) {
	    			queue.add(new int[] {length, width+1});
	    			count ++;
	    		}
	    		if(width > 0 && maps[length][width-1] != 0) {
	    			queue.add(new int[] {length, width-1});
	    			count ++;
	    		}
	    	}
	    	return -1;
	    }
	}
}