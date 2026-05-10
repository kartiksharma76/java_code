package Javaclasses;

public class MultipleAttribute {
	String fname = "Kartik";
	String lname = "Sharma";
	int age = 24;

	public static void main(String[] args) {
		MultipleAttribute myObj = new MultipleAttribute();
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Age: " + myObj.age);
	}
}
