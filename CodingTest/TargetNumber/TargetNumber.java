package TargetNumber;

public class TargetNumber {
	class Solution {
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        return answer;
	    }
	    public int dfs(int[] numbers, int target, int i) {
	    	for(i=0; i<numbers.length; i++) {
	    		dfs(numbers, target, i);
	    	}
	    	return 0;
	    }
	}

}