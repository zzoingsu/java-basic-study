package ch16.sec05.exam01;

public class MethodReferanceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x,y) -> Computer.staticMethod(x, y));
		person.action(Computer :: staticMethod);
		
		Computer com = new Computer();
		person.action(com :: instanceMethod);
	}

}
