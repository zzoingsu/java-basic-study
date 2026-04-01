package ch07.Extends03_GameCharactorType;

public class Character {
	protected String name;
	protected int hp;
	
	protected Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void showStatus() {
		System.out.println("이름: " + name + ", 체력: " + hp);
	}
	public void attack() {
		System.out.println("기본공격을 합니다");
	}
	public final void greet() {
		System.out.println("전투를 시작합니다");
	}

}
