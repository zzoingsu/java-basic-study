package CorrectParentheses;

public class CorrectParentheses {
	class Solution {
	    boolean solution(String s) {
	    	int left=0;
	        if(s.charAt(0)!='(' || s.charAt(s.length()-1)!=')') {
	        	return false;
	        }
	        for(int i=0; i<s.length(); i++) {
	        	if(s.charAt(i)=='(') {
	        		left+=1;
	        	}
	        	if(left<i+1-left) {
	        		return false;
	        	}
	        }
	        return (left != s.length()-left) ? false : true; 
	    }
	}
}