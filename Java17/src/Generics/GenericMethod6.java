package Generics;

public class GenericMethod6 {
public <T> void m1(T t) {
	
} 
public <K> void m2(MyArrayList<K> list) {
	
}
public <T extends A> void m3(T t) {
	
}
public<T extends A & Y> void m4(T t) {
	
}
public <T extends A,U>void m5(T t,U u) {
	
}
// T type must be , who extends B and implements G and H
public<T extends B & G & H> void m6(T t) {
	
}
public static void main(String[] args) {
	GenericMethod6 method =new GenericMethod6();
	method.m1("kartik");
	method.m1(10);
	method.m3(new A());
	method.m3(new B());
	method.m3(new E());
	method.m4(new W());
	method.m5(new A(), new B());
	method.m6(new N());
	
}

}
