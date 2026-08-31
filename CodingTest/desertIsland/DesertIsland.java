package desertIsland;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DesertIsland {
	class Solution {
	    public int[] solution(String[] maps) {
	    	boolean[][] visited = new boolean[maps.length][maps[0].length()];
	        int[] answer = {};
	        return answer;
	    }
	    public static int bfs(String[] maps, boolean[][] visited) {
	    	Queue<int[]> queue = new LinkedList<>();
	    	Queue<int[]> island = new LinkedList<>();
	    	List<Character> number = new LinkedList<>();
	    	queue.add(new int[]{0,0,0});
	    	
	    	int[][] move = {{1,0}, {-1,0}, {0,+1}, {0,-1}};
	    	int[][] find = {{1,0}, {0,1}};
	    	
	    	while(!queue.isEmpty()) {
	    		int[] location = queue.poll();
	    		int row = location[0];
	    		int colum = location[1];
	    		int count = location[2];
	    		for(int[] moving : find) {
	    			int newRow = row + moving[0];
	    			int newColum = colum + moving[1];
	    			if(newRow>0 && newColum>0 && newRow<maps.length && newColum<maps[0].length()) {
	    				if(maps[newRow].charAt(newColum) != 'X' && !visited[newRow][newColum]) {
	    					queue.add(new int[] {newRow, newColum, count});
	    					island.add(new int[] {newRow, newColum, count});
	    					visited[newRow][newColum] = true;
	    				}
	    			}
	    		}
	    	}
	    	while(!island.isEmpty()) {
	    		int[] location = island.poll();
	    		int row = location[0];
	    		int colum = location[1];
	    		int count = location[2];
	    		for(int[] moving : move) {
	    			int newRow = row + moving[0];
	    			int newColum = colum + moving[1];
	    			if(newRow>0 && newColum>0 && newRow<maps.length && newColum<maps[0].length()) {
	    				if(!visited[newRow][newColum]) {
	    					if(maps[newRow].charAt(newColum) != 'X') {
	    						island.add(new int[] {newRow, newColum, count});
	    						visited[newRow][newColum] = true;
	    						continue;
	    					}
	    				}
	    			}
	    			++count;
	    			if(count == 4) {
	    				number.add(maps[newRow].charAt(newColum));
	    			}
	    		}
	    	}
	    	return 0;
	    }
	}
}