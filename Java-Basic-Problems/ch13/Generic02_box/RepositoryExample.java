package ch13.Generic02_box;

public class RepositoryExample {

	public static void main(String[] args) {
		Repository <String> names = new Repository<>(3);
		
		System.out.println(names.add("Kim"));
		System.out.println(names.add("Lee"));
		System.out.println(names.add("Park"));
		System.out.println(names.add("Choi"));
		
		System.out.println(names.get(0));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		
		System.out.println(names.size());
		System.out.println(names.isFull());
	}

}
