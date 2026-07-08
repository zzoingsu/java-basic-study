package BanknoteFolding;

public class BanknoteFolding {
	class Solution {
	    public int solution(int[] wallet, int[] bill) {
	    	if(!comparator(wallet, bill)) {
	    		bill.
	    	}
	        int answer = 0;
	        return answer;
	    }
	}
	
	public static boolean comparator(int[] wallet, int[] bill) {
		// 지갑에 넣을수있는 상태
		if((wallet[0]>=bill[0] && wallet[1]>=bill[1]) || (wallet[0]>=bill[1] && wallet[1]>=bill[0])) {
			return true;
		}
		return false;
	}

}
