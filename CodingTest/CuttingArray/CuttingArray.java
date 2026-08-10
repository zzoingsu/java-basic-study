package CuttingArray;

import java.util.ArrayList;
import java.util.List;

public class CuttingArray {
	class Solution {
	    public List<Long> solution(int n, long left, long right) {
	    	List<Long> value = new ArrayList<Long>();
	    	for(Long i= left; i<=right; i++) {
	    		Long row = i/n;
		    	Long colum = i%n;
		    	value.add(Math.max(row, colum));
	    	}
	    	return value;
	    }
	}

}
