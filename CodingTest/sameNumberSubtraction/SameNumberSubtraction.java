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
	
	 public int solution13(int[] citations) {
		 int maxNum = Arrays.stream(citations).max().getAsInt();
		 int max = 0;
		 int index = 0;
		 for(int i=0; i<=maxNum; i++) {
			 int count=0;
			 for(int j=0; j<citations.length; j++) {
				 if(citations[j] >= i) {
					 count+=1;
				 }
			 }
			if(count >= i) {
				index = i;
			}
		 }
	        return index; 
	    }
	
	 public String solution14(String s) {
		 LinkedList<Integer> list = new LinkedList<>();
		 String[] num = s.split(" ");
		 for(int i=0; i<num.length; i++) {
			 list.add(Integer.parseInt(num[i]));
		 }
		 list.sort(null);
	     return list.getFirst().toString() + list.getLast().toString();
	    }
	 
	 public String solution15(String s) {
		 StringBuilder result = new StringBuilder();
		 for(int i=0; i<s.length(); i++) {
			 if(i == 0 || s.charAt(i-1) == ' ') {
				 result.append(Character.toUpperCase(s.charAt(i)));
			 }else {
				 result.append(Character.toLowerCase(s.charAt(i)));
			 }
		 }
		return result.toString();
	 }
	 public int[] solution16(int n, String[] words) {
		 Set<String> set = new HashSet<>();
		 int index = 0;
		 for(int i=0; i<words.length; i++) {
			 set.add(words[i]);
			 if(i+1 == words.length) {
				 if(words[i].length() == 1 || set.size() != i+1) {
					 return new int[] {index/n, index%n};
				 }
				 continue;
			 }
			 if(words[i].length() != 1 && words[i].charAt(words[i].length()-1) == words[i+1].charAt(0) && set.size() == i+1) {
			 } else {
				 index = i;
				 return new int[] {index/n, index%n};
			 }
		 }
		 return new int[] {0, 0};
	 }
	 
	 public int solution17(int k, int[] tangerine) {
		 List<Integer> list = new LinkedList<>();
		 int count = 1;
		 int var = 0;
		 int result = 0;
		 Arrays.sort(tangerine);
		 for(int i=0; i<tangerine.length; i++) {
			 if(i+1 == tangerine.length) {
				 list.add(count);
			 }
			 if(tangerine[i] == tangerine[i+1]) {
				 count+=1;
			 }else {
				 list.add(count);
				 count = 1;
			 }
		 }
		 list.sort(Comparator.reverseOrder());
			 for(int i=0; i<list.size(); i++) {
				 var += list.get(i);
				 if(var>=k) {
					 result = i;
				 }
			 }
	        return result;
	    }
	 
	 public int solution18(String[] want, int[] number, String[] discount) {
		 Map<String, Integer> needs = new HashMap<>();
		 int result = 0;
		 for(int i=0; i<number.length; i++) {
			 needs.put(want[i], number[i]);
		 }
		 for(int i=0; i<discount.length-10; i++) {
			 Map<String, Integer> map = new HashMap<>();
			 for(int j=i; j<i+10; j++) {
				 map.put(discount[j], map.getOrDefault(discount[j], 0) +1);
			 }
			 if(needs.equals(map)) {
				 result+=1;
			 }
		 }
		 return result;
	    }
	 
	 public int solution19(int[] scoville, int K) {
		 PriorityQueue<Integer> queue = new PriorityQueue<>();
		 int result = 0;
		 for(int value : scoville) {
			 queue.add(value);
		 }
		 
		  while(!queue.isEmpty()) {
			  if(queue.size() == 1 ) {
				 if(queue.peek() < K) {
					 return -1;
				 }return result;
			 }
			 if(queue.peek() < K) {
				 queue.add(queue.poll() + queue.poll()*2);
				 result +=1;
			 }else {
				 return result;
			 }
		 }
	     return result;
	    }
	 
	 public int solution20(int[][] maps) {
		 Queue<int[]> queue = new LinkedList<>();
		 int[][] moves = {{0,1},{0,-1},{1,0},{-1,0}};
		 boolean[][] visited = new boolean[maps.length][maps[0].length];
		 queue.add(new int[] {0,0,0});
		 
		 while(!queue.isEmpty()) {
			 int[] value = queue.poll();
			 int row = value[0];
			 int colum = value[1];
			 int count = 0;
			 
			 for(int[] move : moves) {
				 int newRow = row + move[0];
				 int newColum = colum + move[1];
				 
				 if(newRow == maps.length-1 && newColum == maps[0].length-1) {
					 return count;
				 }
				 if(newRow>=0 && newRow<maps.length && newColum>=0 && newColum>=maps[0].length && !visited[newRow][newColum] && maps[newRow][newColum]!=0) {
					 queue.add(new int[] {newRow, newColum, count+=1});
					 visited[newRow][newColum] = true;
				 }
			 }
		 }
		 return -1;
	 }
}
