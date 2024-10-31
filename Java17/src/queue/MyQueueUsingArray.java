package queue;

public class MyQueueUsingArray {
	private int[] array;
	private static int capacity = 5;
	private int size;
	private int front;
	private int rear;

	public MyQueueUsingArray() {
		array = new int[capacity];
	}

	public void enqueue(int data) {
		array[size] = data;
		size++;
	}

//delete first element always
//Time complexity: O(n)
	public void dequeue() {
		for (int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
