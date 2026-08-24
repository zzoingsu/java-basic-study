package ShortestDistance;

public class ShortestDistance {
	class Solution {
	    public int solution(int[][] maps) {
	        int answer = 0;
	        return answer;
	    }
	    public static int dfs(int[][]maps, int length, int width, int count) {
	    	int min=100000;
	    	if(width>=maps[0].length && length>=maps.length) {
	    		return count;
	    	}
	    	if(maps[length][width] == 0) {
	    		return 100000;
	    	}
	    	int result = dfs(maps, length+1, width, count+1)
	    	+ dfs(maps, length-1, width, count+1)
	    	+ dfs(maps, length, width+1, count+1)
	    	+ dfs(maps, length, width-1, count+1);
	    	return Math.min(result, min);
	    }
	}

}
