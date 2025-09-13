package javabasics;

public class StaticVariable {
public static int count = -5;
public void Variable() {
	count--;
	System.out.println(count);
}
public static void main(String[] args) {
StaticVariable v =new StaticVariable();
v.Variable();
}
}
