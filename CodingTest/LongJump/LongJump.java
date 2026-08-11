package LongJump;

public class LongJump {
	class Solution {
	    public long solution(int n) {
	    	long answer = 0;
	    	long a = 1;
	    	long b = 2;
	    	for(int i=3; i<n; i++) {
	    		Long next = a+b;
	    		a=b;
	    		b=next;
	    	}
	        return answer;
	    }
	}

}
