package Generics;

public class ArrayList<E> {
	private int capacity = 10;
	private Object[] arr;
	private int size;

	public ArrayList() {
		arr = new Object[capacity];
	}

	public void add(E e) {
		arr[size] = e;
		size++;
	}

	public void delete() {
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	public void printData() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
