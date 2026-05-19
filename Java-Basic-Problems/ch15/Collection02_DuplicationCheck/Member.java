package ch15.Collection02_DuplicationCheck;

public class Member {
	private String id;
	private String name;
	private String phone;
	
	public Member(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals( Object obj) {
		if (obj instanceof Member target) {
			return target.id.equals(id);
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "회원ID: " + id + ", 이름: " + name + ", 전화번호: " + phone;
	}
}
