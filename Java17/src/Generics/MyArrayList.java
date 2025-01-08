package Generics;

public class MyArrayList<E> {
	private int capacity=10;
	private Object[]arr;
	private int size;

	public MyArrayList() {
		arr=new Object [capacity];
	}
public void add(E e) {
	arr[size]=e;
	size++;
}

public void printData() {
	for (int i = 0; i < size; i++) {
		System.out.println(arr[i] );
	}
}
}
