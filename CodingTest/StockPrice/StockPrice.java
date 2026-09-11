package StockPrice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StockPrice {	
	class Solution {
	    public int[] solution(int[] prices) {
	    	List<Integer> list = new LinkedList<>();
	    	int count = 0;
	    	for(int i=prices.length-1; i>=0; i--) {
	    		if(i==prices.length-1) {
	    			list.add(0);
	    			count+=1;
	    			continue;
	    		}
	    		if(prices[i]>prices[i+1]) {
	    			list.add(1);
	    		}else{
	    			list.add(count);
	    		}
	    		count+=1;
	    	}
	        Collections.reverse(list);
	        return list.stream().mapToInt(Integer :: intValue).toArray();
	    }
	}
}