package ExpirationDateOfCollectionOfPersonalInformation;

import java.util.ArrayList;
import java.util.List;

public class ExpirationDateOfCollectionOfPersonalInformation {
	class Solution {
		public static void main(String[] args) {
			String today = "2022.05.19";
			String[] terms = {"A 6", "B 12", "C 3"};
			String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
			
			System.out.println(solution(today, terms, privacies));
			
		}
	    public static List<Integer> solution(String today, String[] terms, String[] privacies) {
	       List<Integer> expireDate = new ArrayList<>(); 
	       List<Integer> answer = new ArrayList<>();
	       dateExpireCalculator(terms, privacies, expireDate);
	       for(int i=0; i<expireDate.size(); i++) {
	    	   if(date(today)>=expireDate.get(i)) {
		    	  answer.add(i);
		       }
	       }
	        return answer;
	    }
	    
	    public static void dateExpireCalculator(String[] terms, String[] privacies, List<Integer>expireDate) {
	    	for(int i=0; i<privacies.length; i++) {
	    		for(int j=0; j<terms.length; j++) {
	    			if(privacies[i].charAt(11) == terms[j].charAt(0)) {
	    				int totalDays = date(privacies[i]);
	    				int date = terms[j].charAt(1)*28;
	    				int expireDay = totalDays + date;
		        		expireDate.add(expireDay);
		        	}
	    		}
	    	}
	    }
	    
	    public static int date(String date) {
	    	String data = date.substring(0, 10);
	    	String[] dateArray = data.split(".");
	    	int year = Integer.parseInt(dateArray[0]);
	    	int month = Integer.parseInt(dateArray[1]);
	    	int day = Integer.parseInt(dateArray[2]);
	    	return year*12*28 + month*28 + day;
	    }
	}

}
