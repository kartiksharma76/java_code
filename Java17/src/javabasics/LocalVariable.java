package javabasics;

public class LocalVariable {
public void m1() {
	int a=20;
	int b=20;
	System.out.println(a+b);
}
public static void main(String[] args) {
	LocalVariable varibal = new LocalVariable();
	varibal.m1();
	
}
}
