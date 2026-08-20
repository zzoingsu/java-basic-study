package FatigueLevel;

public class FatigueLevel {
	class Solution {
	    public int solution(int k, int[][] dungeons) {
	    	boolean[] visited = new boolean[dungeons.length]; 
	        return dfs(k, dungeons,visited, 0);
	    }
	    public int dfs(int k, int[][] dungeons, boolean[] visited, int count) {
	    	int max = count;
	    	for(int i=0; i<dungeons.length; i++) {
	    		int a = dungeons[i][0];
	    		int b = dungeons[i][1];
	    		if(visited[i]==true || k<a) {
	    			continue;
	    		}
	    		visited[i]=true;
	    		int result = dfs(k-b, dungeons, visited, count+1);
	    		visited[i]=false;
	    		max = Math.max(max, result);
	    	}
	    	return max;
	    }
	}
}