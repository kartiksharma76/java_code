package Generics;

import java.util.ArrayList;
// to answer below question , ask yourself what type of object it is going to store
public class GenericPractice {
public static void main(String[] args) {
	ArrayList<?> list1 =new ArrayList<>();
    ArrayList<?> list2 =new ArrayList<String>();
    ArrayList<String> list5=new ArrayList<>();
    //list2.add(new );
	ArrayList<?> list3 =new ArrayList<Integer>();
	ArrayList<?extends B> list4 =new ArrayList<B>();
	//ArrayList<?extends B> list4 =new ArrayList<A>();Invalid
	//ArrayList<?extends Y> list4 =new ArrayList<Integer>();Invalid, Refer GenericMethod3 class
	//ArrayList<?extends Y> list4 =new ArrayList<X>();Invalid
	ArrayList<?extends Y> list6 =new ArrayList<Y>();
	ArrayList<?extends Y> list7 =new ArrayList<Z>();
	//ArrayList<?> list8 =new ArrayList<?>(); Invalid
	//ArrayList<?> list9 =new ArrayList<? extends A>(); // question ka answer question nahi hota
	
	
}
}
