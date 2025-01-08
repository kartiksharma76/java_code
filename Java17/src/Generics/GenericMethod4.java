package Generics;

public class GenericMethod4 {
	// if Y is an Interface, then MyArrayList must be of Y or its super type(not its implementation classes).
	public void M4(MyArrayList<? super Y> list ) {
		list.add(null);
		Y y= new Q();
		Y y1= new P();
		X x= new R();
		X x1= new P();
		X x2= new Q();
		R r= new R();
		P p=new P();
		Q q= new Q();
		Z z = new P();
		list.add(y);
		list.add(y1);
//		list.add(x);
//		list.add(x1);
//		list.add(x2);
		list.add(z);
//		list.add(r);
		list.add(p);
		list.add(q);
		// if Y is an interface then within the method we can add only implementation classes of Y 
	
	}
	public static void main(String[] args) {
		GenericMethod4 method =new GenericMethod4();
		MyArrayList<Y> list1=new MyArrayList<>();
		MyArrayList<Z> list2=new MyArrayList<>();
		MyArrayList<Q> list3=new MyArrayList<>();
		MyArrayList<P> list4=new MyArrayList<>();
		MyArrayList<X> list5=new MyArrayList<>();
		MyArrayList<R> list6=new MyArrayList<>();
		method.M4(list1);
//		method.M4(list2);
//		method.M4(list3);
//		method.M4(list4);
		method.M4(list5);
		//method.M4(list6);
}
}