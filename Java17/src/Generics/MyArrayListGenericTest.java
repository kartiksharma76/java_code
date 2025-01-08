package Generics;

public class MyArrayListGenericTest {
public static void main(String[] args) {
	MyArrayList<String> list=new MyArrayList<>();
	list.add("twinkle");
	list.add("prince");
	list.add("kartik");
	list.add("aman");
	list.printData();
	MyArrayList<Integer> list1=new MyArrayList<>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	System.out.println("*************");
	list1.printData();
	
}
}
