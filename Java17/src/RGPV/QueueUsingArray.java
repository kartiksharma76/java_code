package RGPV;

public class QueueUsingArray {
	private int[] arr;
	private int size;
	private int capacity = 7;
	private int front;
	private int rear;

	public QueueUsingArray() {
		arr = new int[capacity];
	}

	public void enqueue(int data) {
		if (size == arr.length) {
			return;
		}
		arr[size] = data;
		size++;
	}

	public void dequeue() {
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}

		size--;
	}

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		return size == 0;

	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
