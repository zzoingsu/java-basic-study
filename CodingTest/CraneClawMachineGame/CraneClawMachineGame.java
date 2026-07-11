package CraneClawMachineGame;

import java.util.ArrayList;
import java.util.List;

public class CraneClawMachineGame {
	class Solution {
	    public int solution(int[][] board, int[] moves) {
	    	List<Integer> bucket = new ArrayList<>();
	    	int popCount = 0;
	    	for(int i=0; i<moves.length; i++) {
	    		if(getProduct(board, moves[i]) != -1) {
	    			bucket.add(getProduct(board, moves[i]));
	    			bucket = pop(bucket);
	    			while(bucket.size() != i+1+popCount) {
	    				bucket = pop(bucket);
	    				popCount += 2;
	    			}
	    		}
	    	}
	        return popCount;
	    }
	    // 크레인으로 집기
	    public static int getProduct(int[][] board, int move) {
	    		for(int j=0; j<board[move].length; j++) {
	    			if(board[move-1][j]!=0) {
	    				board[move-1][j] = 0;
	    				return board[move-1][j];
	    			}
	    		}
	    	return -1;
	    }
	    // 바구니에서 중복일시 터지기
	    public static List<Integer> pop(List<Integer> bucket) {
	    	if(bucket.size()== 1) {
	    		return bucket;
	    	}
	    	for(int i=1; i<bucket.size(); i++) {
	    		if(bucket.get(i-1) == bucket.get(i)) {
	    			bucket.remove(i-1);
	    			bucket.remove(i);
	    			return bucket;
	    		}
	    	}
	    	return bucket;
	    }
	}
}