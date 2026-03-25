package ch05.ArrayCopy01_CopyAndAdd;

public class CopyAndAdd {

	public static void main(String[] args) {
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		newArray[3] = 4;
		newArray[4] = 5;
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+ " ");
		}
	}

}
