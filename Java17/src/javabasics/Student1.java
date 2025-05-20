package javabasics;


public class Student1 {
private String name;
private int[]marks=new int[5];
public void setDetails(String name,int[]marks) {
	this.name=name;
	this.marks=marks;
	
}

public String getname() {
	return name;
}
public double calculateAverge() {
	int total=0;
	for(int marks:marks) {
		total+=marks;
	}
	return total/3.0;
}
public boolean isPassed() {
	return calculateAverge()>=40;
}
}
