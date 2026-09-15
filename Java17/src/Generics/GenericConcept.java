package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericConcept {
public static void main(String[] args) {
	ArrayList list=new ArrayList();// here default type is Object 
	list.add(10);
	list.add("kartik");
	list.add(true);
	list.add(567.5);
	int rollno=(int) list.get(1);// we will get classCastException
	// to resolve classCastException we have to learn generic concepts
	// in other words with the help of generic concepts to resolve classCastException.
	// generic concept is introduced in java 1.5 version
	// Notation <>angular bracket
   ArrayList<Integer> list2=new ArrayList<Integer>();//java 1.5 
   ArrayList<Integer> list3=new ArrayList();//java 1.7 onwards
   list3.add(10);
   //list3.add("kartik");
 //  list3.add(true);
   //list3.add(567.5);
  //  ArrayList<Parent> list4=new ArrayList<Child>();polymorphism concept is applicable only for the base type,
    // not for parameter type.
    List<Parent> list5=new ArrayList<Parent>();// this is valid because polymorphism concepts is applicable on
    // base type.
 //   ArrayList<int> list6= new ArrayList<int>(); Parameter type must be class or interface,not primitive type.
    ArrayList<Float> list7=new ArrayList<Float>();
    long l= 50;
    int i= 10;
    short s= 20;
    byte b= 30;
    list7.add(50.5F);
//    list7.add(l);
//    list7.add(i);
//    list7.add(s);
//    list7.add(b);
    float []arr=new float [5];
    arr[0]=10.5F;
    arr[1]=l;
    arr[2]=i;
    arr[3]=s;
    arr[4]=b;
 //   arr[1]="kartik";
    
    
    
}
}
