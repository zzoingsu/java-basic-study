package CuttingArray;

import java.util.ArrayList;
import java.util.List;

public class CuttingArray {
	class Solution {
	    public List<Integer> solution(int n, long left, long right) {
	    	List<Integer> value = new ArrayList<>();
	    	int count = 0;
	    	for(int i=1; i<=n; i++) {
	    		for(int j=1; j<=n; j++) {
	    			count++;
	    			if(count>=left && count <= right) {
	    				value.add(Math.max(i, j));
	    			}
	    		}
	    	}
	    	return value;
	    }
	}

}
