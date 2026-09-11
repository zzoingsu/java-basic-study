package CorrectParentheses;

public class CorrectParentheses {
	class Solution {
	    boolean solution(String s) {
	    	int count=0;
	        if(s.charAt(0)!='(' || s.charAt(s.length()-1)!=')') {
	        	return false;
	        }
	        for(int i=0; i<s.length(); i++) {
	        	count+=(s.charAt(i)=='(') ? count++ : count--;
	        	if(count<0) {
	        		return false;
	        	}
	        }
	        return (count!=0) ? false : true; 
	    }
	}
}