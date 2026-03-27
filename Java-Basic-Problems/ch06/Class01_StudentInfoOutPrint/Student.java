package ch06.Class01_StudentInfoOutPrint;

public class Student {
	String name;
	int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
		void showInfo() {
			System.out.printf("이름: %s\n나이: %d\n",name, age);
				
		}
	
	}

