package javabasics;
//static variables and blocks will get memory at class loading time.JVM is responsible to
//load the class.
/**
 * 1.static variables and blocks will get memory at class loading time.
 * JVM is responsible to load the class..
 * 
 * 2. JVM is also responsible for  initializing the static variables. static variable will
 * initialize  first with default value then get updated with the provided value
 * 
 * 3. static members (variables and block) execution order:first serve serve(FCFS)
 *
 *instance members
 * 1.instance variable and block will get memory when we create and object.
 * 
 * 2.constructor is responsible for initializing the instance variable. constructor will initialize the
 * instance variable with default value first then update with the provide value.
 *
 3.instance member(variable,block) execution order:first come first serve(variable,block) then constructor
 * 
 * 4. after static member  execution JVM will check any java statement is there or not.
 * if statement is there then execute that if not then don't do anything
 * 
 */
public class Executionorder{
	static {
		System.out.println("static block 3");
	}
	{System.out.println("instance block3");}
	
public int a=m1();
public int b;
public static int c=m3();
public static int d;
public  int m1() {

System.out.println("m1:"+a);
return 10;

	}


public int m2() {
	return 20;

	
}
public static int m3() {
System.out.println("m3:"+c );	
	return 30;
}

public static int m4() {
	return 40;
}

{
	System.out.println("instance block 1 :"+a);
	
}
{
	System.out.println("instance block2:"+b);
	
}
static {
	System.out.println("static block 1 :" +c);
}
static {
	System.out.println("static block2:"+d);
	
}

public   Executionorder() {
	System.out.println("constructor");
}
public static void main(String[]args) {
	System.out.println("main method started");
	Executionorder exe =new Executionorder();
	//Executionorder exe1 = new Executionorder();
	System.out.println("main method finished");

}
	
}
