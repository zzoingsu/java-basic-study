package TargetNumber;

public class TargetNumber {
	class Solution {
	    public int solution(int[] numbers, int target) {
	        int answer = 0;
	        return answer;
	    }
	    public int recursion(int[] numbers, int target, int index, int sum) {
	    		if(index>=numbers.length) {
	    			return sum==target? 1 : 0;
	    		}
	    		
	    		return recursion(numbers, target, index+1, sum+numbers[index]) +
	    		recursion(numbers, target, index+1, sum-numbers[index]);
	    }
	}

}