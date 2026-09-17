package sameNumberSubtraction;

import java.util.*;

public class SameNumberSubtraction {
	public class Solution {
	    public int[] solution(int[] arr) {
	    	List<Integer> list = new LinkedList<>();
	        for(int i=0; i<arr.length; i++) {
	        	if(i == 0 || arr[i] != arr[i+1]) {
	        		list.add(arr[i]);
	        	}
	        }
	        return list.stream().mapToInt(Integer :: intValue).toArray();
	    }
	}
	public int solution1(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<list.size(); j++) {
				if(nums[i] != list.get(j)) {
					list.add(nums[i]);
				}
			}
		}
		int variety = list.size();
		return (variety>nums.length/2) ? nums.length/2 : variety;
	}
	
	public String solution2(String[] participants, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		String result = null;
		for(String participant : participants) {
			map.put(participant, map.getOrDefault(participant, 0) +1);
		}
		for(int i=0; i<completion.length; i++) {
			if(map.containsKey(completion[i])) {
				map.put(completion[i], map.get(completion[i])-1);
			}
		}
		for(String name : map.keySet()) {
			if(map.get(name) != 0) {
				result = name;
			}
		}
		return result;
	}
	

	public int solution3(int n, int[] lost, int[] reserve) {
		Set<Integer> set = new HashSet<>();
		Arrays.sort(reserve);
		int count = 0;
		for(int student : lost) {
			set.add(student);
		}
		
		for(int i=0; i<reserve.length; i++) {
			if(set.contains(reserve[i])) {
				set.remove(reserve[i]);
                count++;
                continue;
			}
			
			if(set.contains(reserve[i]-1)) {
				set.remove(reserve[i-1]);
				count+=1;
			} else if(set.contains(reserve[i]+1)) {
				set.remove(reserve[i+1]);
				count+=1;
			}
		}
		int result = n - lost.length + count;
        return result;
    }
	
	public int[] solution4(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		
		for(int i=0; i<commands.length; i++) {
			int[] command = commands[i];
			int[] sliced = Arrays.copyOfRange(command, command[0], command[1]-1);
			Arrays.sort(sliced);
			result[i] = sliced[command[2]];
		}
        return result;
    }
	
	public boolean solution5(String s) {
		Stack<Integer> stack = new Stack<>();
		boolean result = true;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				stack.push(1);
			}else {
				if(stack.isEmpty()) {
					result = false;
				}else {
					stack.pop();
				}
			}
		}
    	return result;
    }
	
	public int solution6(int[] priorities, int location) {
		Queue<int[]> queue = new LinkedList<>();
		PriorityQueue<Integer> pq =
		        new PriorityQueue<>(Collections.reverseOrder());
		int count = 0;
		
		for(int i=0; i<priorities.length; i++) {
			queue.add(new int[]{priorities[i], i});
			pq.add(priorities[i]);
		}
		
		while(!queue.isEmpty()) {
			int[] prioritiy = queue.poll();
			if(prioritiy[0] == pq.peek()) {
				pq.poll();
				if(prioritiy[1] == location) {
					return count++;
				}
				count++;
			}else {
				queue.add(prioritiy);
			}
		}
		return count;
	}
	
	public boolean solution7(String[] phone_book) {
		Arrays.sort(phone_book);
		boolean result = true;
       
       for(int i=0; i<phone_book.length; i++) {
    	   if(i+1 == phone_book.length) {
    		   continue;
    	   }
    	   if(phone_book[i+1].startsWith(phone_book[i])) {
    		   result = false;
    	   }
       }
        return result;
    }
	
	public boolean solution8(String[] phone_book) {
		boolean result = true;
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		
		for(int i=0; i<phone_book.length; i++) {
			for(int j=0; j<phone_book[i].length(); j++) {
				if(map.containsKey(phone_book[i].substring(0, j))) {
					result =  false;
					return result;
				}
			}
		}
		
		return result;
	}
	public int solution9(int[] peoples, int limit) {
		LinkedList<Integer> list = new LinkedList<>();
		int count = 0;
		Arrays.sort(peoples);

		for(int people : peoples) {
			list.add(people);
		}		
		
		while(!list.isEmpty()) {
			if(list.size() == 1) {
				count+=1;
				continue;
			}
			if(limit-list.getLast()>=list.getFirst()) {
				list.removeFirst();
			}
			list.removeLast();
			count+=1;
		}
        return count;
    }
	
	public int[] solution10(int brown, int yellow) {
		int area = brown+yellow;
		for(int i=3; i<area; i++) {
			if(area%i == 0) {
				int j=area/i;
				
				if((i-2) * (j-2) == yellow) {
					return new int[]{i, j};
				}
			}
		}
        return new int[] {};
    }
	
	public int[] solution11(int[] array, int[][] commands) {
		int[] result = new int[] {commands.length};
		
		for(int i=0; i<commands.length; i++) {
			int[] sliced = Arrays.copyOfRange(array, commands[i][0], commands[i][1]);
			Arrays.sort(sliced);
			result[i] = sliced[commands[i][2]];
		}
		return result;
	}
	
	public boolean solution12(String[] phone_book) {
		boolean result = true;
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], i);
		}
		for(int i=0; i<phone_book.length; i++) {
			for(int j=0; j<phone_book[i].length(); j++) {
				if(map.containsKey(phone_book[i].substring(0, j))) {
					result = false;
				}
			}
		}
		return result;
	}
	
}
