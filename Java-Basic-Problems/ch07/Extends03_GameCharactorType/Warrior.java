package ch07.Extends03_GameCharactorType;

public class Warrior extends Character {
	
	public Warrior(String name, int hp) {
	super(name, hp);
	}
	
	@Override
	public void attack() {
		System.out.println("검으로 공격합니다");
	}
	@Override
	public void showStatus() {
		System.out.println("전사 " + name + "의 체력은 " + hp + "입니다");
	}

}
