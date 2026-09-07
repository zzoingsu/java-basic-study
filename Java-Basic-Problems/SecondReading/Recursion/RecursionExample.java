package SecondReading.Recursion;

import java.util.LinkedList;
import java.util.Queue;

public class RecursionExample {
	public static void main(String[] arg) {
		recursion(5, 1);
	}
	public static void recursion(int n, int count) {
		if(count>n) {
			return;
		}
		System.out.println(count);
		recursion(n, count+1);
	}
	public static void reverse(int n, int count) {
		if(count>n) {
			return;
		}
		reverse(n,count+1);
		System.out.println(count);
	}
	public int calculate(int n, int count, int sum) {
		if(count>n) {
			return sum;
		}
		sum += count;
		return calculate(n, count+1, sum); 
	}
	public int sum(int[] numbers, int index, int sum) {
		if(index>=numbers.length) {
			return sum;
		}
		sum+=numbers[index];
		return sum(numbers, index+1, sum);
	}
	public int countTarget(int[] numbers, int index, int target, int count) {
		if(index>=numbers.length) {
			return count;
		}
		if(numbers[index] == target) {
			count++;
		}
		return countTarget(numbers, index+1, target, count);
	}
	public int stair(int n, int index, int count) {
		if(index == n) {
			return ++count;
		}
		if(index>n) {
			return count; 
		}
		count = stair(n, index+1, count);
		return stair(n,index+2, count);
	}
	public int updown(String word, int count, int index) {
		int num = word.length();
		if(count>num) {
			return 0;
		}
		if(count == num) {
			return 1;
		}
		return updown(word, count+1, index+2) +updown(word, count+1, index+1);
	}
	public int choose(int[] numbers, int target, int index, int sum) {
		if (index >= numbers.length) {
	        return sum == target ? 1 : 0;
	    }
		return choose(numbers, target, index+1, sum+numbers[index])
		+ choose(numbers, target, index+1, sum);
	}
	
	public int connected(int[][] connections, int start) {
		boolean[] visited = new boolean[connections.length];
		int count = 0;
		for(int i=0; i<connections.length; i++) {
			if(start == connections[i][0] && !visited[i]) {
				int newNod = connections[i][1];
				visited[i] = true;
				count += 1;
				count += connected(connections, newNod);
			}
			if(start == connections[i][1] && !visited[i]) {
				int newNod = connections[i][0];
				visited[i] = true;
				count += 1;
				count += connected(connections, newNod);
			}
		}
		return count;
	}
	public int dfs(int[] values, int[][] connections, int start, boolean[] visited) {
		int sum=0;
		for(int i=0; i<connections.length; i++) {
			if(start == connections[i][0] && !visited[i]) {
				int newNod = connections[i][1];
				visited[i] = true;
				sum += values[newNod];
				sum += dfs(values, connections, newNod, visited);
			}
			if(start == connections[i][1] && !visited[i]) {
				int newNod = connections[i][0];
				visited[i] = true;
				sum += values[newNod];
				sum += dfs(values, connections, newNod, visited);
			}
		}
		return sum;
	}
	public int find(int[][] maps, int row, int colum) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[maps.length][maps[0].length];
		queue.add(new int[]{row, colum});
		int[][] move = {{1,0}, {-1,0}, {0,+1}, {0,-1}};
		int count = 0;
		if(maps[row][colum] == 1) {
			count++;
			visited[row][colum] = true;
		}
		while(!queue.isEmpty()) {
			int[] location = queue.poll();
			row = location[0];
			colum = location[1];
			
			for(int[] moving : move) {
				int newRow = row + moving[0];
				int newColum = colum + moving[1];
				if(newRow>=0 && newColum>=0 && newRow<maps.length && newColum<maps[0].length) {
					if(maps[newRow][newColum] == 1 && !visited[newRow][newColum]) {
						queue.add(new int[] {newRow, newColum});
						count++;
						visited[newRow][newColum] = true;
					}
				}
			}
		}
		return count;
	}
	public int solution (int[][] maps) {
		boolean[][] visited = new boolean[maps.length][maps[0].length];
		int[][] move = {{1,0}, {-1,0}, {0,+1}, {0,-1}};
		int count = 0;
		for(int row=0; row<maps.length; row++) {
			for(int colum=0; colum<maps[0].length; colum++) {
				if(maps[row][colum] == 1 && !visited[row][colum]) {
					count = (findIsland(maps, visited, move, row, colum) != 0) ? count+=1 : count;
				}
			}
		}
		return count;
	}
	public static int findIsland(int[][] maps, boolean[][] visited, int[][] move, int row, int colum) {
		int count = 0;
		for(int[] moving : move) {
			int newRow = row + moving[0];
			int newColum = colum + moving[1];
			
			if(newRow>=0 && newColum>=0 && newRow<maps.length && newColum<maps[0].length) {
				if(maps[newRow][newColum] == 1 && !visited[newRow][newColum]) {
					visited[newRow][newColum] = true;
					count += findIsland(maps, visited, move, newRow, newColum);
				}
			}
		}
		return count;
	}
	
	public boolean maze(int[][] maps, int startRow, int startColum, int endRow, int endColum) {
		boolean[][] visited = new boolean[maps.length][maps[0].length];
		int[][] move = {{1,0}, {-1,0}, {0,+1}, {0,-1}};
		boolean result = false;
		
		for(int[] moving : move) {
			int newRow = startRow + moving[0];
			int newColum = startColum + moving[1];
			if(newRow>=0 && newColum>=0 && newRow<maps.length && newColum<maps[0].length) {
				if(maps[newRow][newColum] == 1 && !visited[newRow][newColum]) {
					if(newRow == endRow && newColum == endColum) {
						visited[newRow][newColum] = true;
						result = true;
						return result;
					}
					visited[newRow][newColum] = true;
					result = maze(maps, newRow, newColum, endRow, endColum);
					if (result) {
					    return true;
					}
				}
			}
		}
		return result;
	}
}
