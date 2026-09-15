package Generics;

public class GenericMethod2 {
	// if parent is a class,then MyArrayList must be of Parent or its Child type
public void m2(MyArrayList<? extends Parent> list) {
	
}
public static void main(String[] args) {
	GenericMethod2 method= new GenericMethod2();
	MyArrayList<Parent> list1= new MyArrayList<>();
	method.m2(list1);
	MyArrayList<Child> list2= new MyArrayList<>();
	method.m2(list2);
}
}