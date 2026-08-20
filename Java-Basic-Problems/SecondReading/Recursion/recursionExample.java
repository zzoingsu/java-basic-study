package SecondReading.Recursion;

public class recursionExample {
	public static void main(String[] arg) {
		
	}
	public static int recursion(int n, int count) {
		if(count<n) {
			return n;
		}
		System.out.println(count);
		recursion(n, count+1);
		return 0;
	}

}
