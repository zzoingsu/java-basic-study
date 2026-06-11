package ch18.InputOutputStream07_MemberInfoBackupSystem;

import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return id + "\t" + name +"\t" + age;
	}
	
}
