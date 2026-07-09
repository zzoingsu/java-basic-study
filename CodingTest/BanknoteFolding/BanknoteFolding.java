package BanknoteFolding;

public class BanknoteFolding {
	class Solution {
	    public int solution(int[] wallet, int[] bill) {
	    	int count = 0;
	    	while(!comparator(wallet, bill)) {
	    		bill[findLong(bill)] /= 2;
	    		count++;
	    	}
	        return count;
	    }
	}
	
	public static boolean comparator(int[] wallet, int[] bill) {
		// 지갑에 넣을수있는 상태
		if((wallet[0]>=bill[0] && wallet[1]>=bill[1]) || (wallet[0]>=bill[1] && wallet[1]>=bill[0])) {
			return true;
		}
		return false;
	}
	public static int findLong(int[] bill) {
		if(bill[0]>bill[1]) {
			return 0;
		}
		return 1;
	}

}
