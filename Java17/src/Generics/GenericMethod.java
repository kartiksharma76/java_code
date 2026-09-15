package Generics;

public class GenericMethod {
	// wild card Generic method 
	// this method is useful for read only operation except nun
public void m1(MyArrayList<?> list) {
	//list.add(null); valid
	//list.add("kartik");invalid
	//list.add(10);invalid
	list.printData();
	
}
public static void main(String[] args) {
	 GenericMethod method= new GenericMethod();
	 MyArrayList<String> list1= new  MyArrayList<>();
	 list1.add("kartik");
	 list1.add("twinkle");
	 
	 MyArrayList<Integer> list2= new  MyArrayList<>();
	 method.m1(list1);
	 method.m1(list2);
	 
}
}
