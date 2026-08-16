package FatigueLevel;

public class FatigueLevel {
	class Solution {
	    public int solution(int k, int[][] dungeons) {
	        int answer = -1;
	        return answer;
	    }
	    public void dfs(int deep, int[][] dungeons) {
	    	if(deep == 2) {
	    		
	    	}
	    	for(int i=0; i<=dungeons.length; i++) {
	    		dfs(i, dungeons);
	    	}
	    }
	}
}