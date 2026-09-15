package queue;

public class QueueArray {
	private int[] array;
	private int size;
	private int front;
	private int rear;
	private int capacity = 10;

	public QueueArray() {
		array = new int[capacity];

	}

	public void enqueue(int data) {
		array[size] = data;
		size++;

	}

	public void dequeue() {
		for (int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];

		}
		size--;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + " ");
		}

	}

	public int size() {
		return size;

	}

	public boolean empty() {
		return size == 0;

	}
}
