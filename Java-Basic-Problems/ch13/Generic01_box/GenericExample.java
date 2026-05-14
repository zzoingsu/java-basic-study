package ch13.Generic01_box;

public class GenericExample {

	public static void main(String[] args) {
		Box <String> stringBox = new Box<>();
		
		System.out.println(stringBox.isEmpty());
		
		stringBox.set("Java");
		System.out.println(stringBox.get());
		System.out.println(stringBox.isEmpty());
		
		stringBox.clear();
		System.out.println(stringBox.isEmpty());
		
		Box<Integer> intBox = new Box<>();
		intBox.set(100);
		System.out.println(intBox.get());
	}

}
