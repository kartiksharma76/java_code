package Polymorphism;

public class Casting {
public static void main(String[] args) {
	A a=new B();
//	a.m3();
	B b=(B)a;
	b.m3();
}
}
