package ShortestDistance;

public class ShortestDistance {
	class Solution {
	    public int solution(int[][] maps) {
	    	boolean[][] visited = new boolean[maps.length][maps[0].length];
	        return dfs(maps, 0, 0, visited, 0);
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
	}
}