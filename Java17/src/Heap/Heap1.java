package Heap;

public class Heap1 {
	private int size;
	private int[] array;

	public Heap1() {
		array = new int[10];
	}

	public void insert(int data) {
		if (size == array.length) {
			return;
		}
		array[size] = data;
		size++;
		heapifyUp(size - 1);
	}

	private void heapifyUp(int i) {
		while (i > 0 && array[i] < array[parent(i)]) {
			swap(i);
			i = parent(i);
		}

	}

	private void swap(int i) {
		int temp = array[parent(i)];
		array[parent(i)] = array[i];
		array[i] = temp;

	}

	public void delete() {
		array[0] = array[size - 1];
		size--;
		heapifydown(0);
	}

	private void heapifydown(int i) {
		int smallest = i;
		int left = leftchild(i);
		int right = rightchild(i);

		if (left < size && array[smallest] > array[left]) {
			smallest = left;
		}
		if (right < size && array[smallest] > array[right]) {
			smallest = right;
		}
		if (smallest != i) {
			int temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
			heapifydown(smallest);
		}

	}

	private int rightchild(int i) {
		return 2 * i + 2;
	}

	private int leftchild(int i) {
		return 2 * i + 1;
	}

	private int parent(int i) {
		return (i - 2) / 2;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		Heap1 heap = new Heap1();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.insert(50);
		heap.display();
		System.out.println("/nafter delete");
		heap.delete();
		heap.delete();
		heap.display();
	}
}
