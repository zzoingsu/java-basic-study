package ch18.InputOutputStream06_MemberObjectSerializable;

import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = -2374852834L;
	
	private String id;
    private String name;
    private int age;

    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }
}
