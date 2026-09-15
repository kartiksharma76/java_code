package Generics;

public class GenericMethod5 {
	// if B is a class ,then MyArrayList must be B or its super type
	public void m5(MyArrayList<? super B> list) {
		list.add(null);
		list.add(new B());
		//list.add(new A());
		list.add(new C());
		//list.add(new E());
		list.add(new D());
		// Note: if B is a class , then we can add null and B type or its child classes 
	}
	public static void main(String[] args) {
		GenericMethod5 method= new GenericMethod5();
		MyArrayList<B> list1= new MyArrayList<>();
		MyArrayList<C> list2= new MyArrayList<>();
		MyArrayList<D> list3= new MyArrayList<>();
		MyArrayList<E> list4= new MyArrayList<>();
		MyArrayList<A> list5= new MyArrayList<>();
		method.m5(list1);
//		method.m5(list2);
//		method.m5(list3);
//	    method.m5(list4);
		method.m5(list5);
		
	}
}
