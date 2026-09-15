package Inheritance;

public class Child {
 void child() {
	 System.out.println("iam child");
 }
}
class Parent extends Child{
	void parent() {
		System.out.println("i am parent");
	}
}
class Grandparent1 extends  Parent{
	void grandparent() {
		System.out.println(" i am grand parent");
	}
}