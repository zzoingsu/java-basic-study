package ch07.Extends01_AnimalExtends;

public class Dog extends Animal {
	String breed;
	
	Dog (String name, String breed) {
		super(name);
		this.breed = breed;
	}
	@Override
	void introduce () {
		System.out.println("나는 강아지이고 이름은 " + name + " 품종은 " + breed + "입니다");
	}

}
