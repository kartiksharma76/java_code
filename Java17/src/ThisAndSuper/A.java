package ThisAndSuper;

public class A {
public void m1() {
	System.out.println("A m1()");
	m2();
}
public void m2() {
	System.out.println("A m2()");
	this.m3();
	//this keyword always represents current object
}
public void m3() {
	System.out.println("A m3()");
	
}
}
