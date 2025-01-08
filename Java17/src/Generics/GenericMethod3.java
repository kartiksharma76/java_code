package Generics;

public class GenericMethod3 {
	// if Y is an interface , then MyArrayList must be of Y or its implementation classes
public void M3(MyArrayList<? extends Y> list ) {
	
}
public static void main(String[] args) {
	GenericMethod3 method =new GenericMethod3();
	MyArrayList<Y> list1=new MyArrayList<>();
	MyArrayList<Z> list2=new MyArrayList<>();
	MyArrayList<Q> list3=new MyArrayList<>();
	MyArrayList<P> list4=new MyArrayList<>();
	MyArrayList<X> list5=new MyArrayList<>();
	MyArrayList<R> list6=new MyArrayList<>();
	method.M3(list1);
	method.M3(list2);
	method.M3(list3);
	method.M3(list4);
//	method.M3(list5);
//	method.M3(list6);
	
	
	
}
}
