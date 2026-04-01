package ch07.Extends03_GameCharactorType;

public class Wizard extends Character {
	
	public Wizard(String name, int hp) {
		super(name, hp);
	}
	@Override
	public void attack() {
		System.out.println("마법으로 공격합니다");
	}

}
