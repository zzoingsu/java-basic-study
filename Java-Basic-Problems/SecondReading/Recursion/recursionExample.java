package SecondReading.Recursion;

public class recursionExample {
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

}
