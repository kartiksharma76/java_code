package NPTL25;

import java.util.Scanner;

public class Student {
private String name ;
private int age;

public Student(String name,int age) {
	this.name = name;
	this.age= age;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name = sc.next();
	
	int age = sc.nextInt();
	
	Student  student = new Student(name, age);
	System.out.println("Name:"+student.getName() + ", Age:"+ student.getAge());
	sc.close();
}
}
