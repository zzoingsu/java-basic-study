package ch07.Extends01_AnimalExtends;

public class Animal {
	String name;
	
	Animal(String name) {
		this.name = name;
		}
	void introduce() {
		System.out.println("나는 동물이고 이름은 " + name + "입니다");
	}

}
