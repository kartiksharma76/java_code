package Heap;

public class Heap {
	private int[] array;
	private int size;

	public Heap() {
		array = new int[10];
	}

	public void insert(int data) {
		if (size == array.length) {
			return;
		}
		array[size] = data;
		size++;
		heapifyup(size - 1);
	}

	public void heapifyup(int index) {
		while (index > 0 && array[index] < array[parent(index)]) {
			swap(index);
			index = parent(index);

		}
	}

	public void swap(int index) {
		int temp = array[parent(index)];
		array[parent(index)] = array[index];
		array[index] = temp;

	}

	public void delete() {
		array[0] = array[size - 1];
		size--;
		heapifyDown(0);
	}

	public void heapifyDown(int index) {
		int smallest = index;
		int left = leftchlid(index);
		int right = rightchild(index);

		if (left < size && array[smallest] > array[left]) {
			smallest = left;
		}
		if (right < size && array[smallest] > array[right]) {
			smallest = right;
		}
		if (smallest != index) {
			int temp = array[smallest];
			array[smallest] = array[index];
			array[index] = temp;
			heapifyDown(smallest);
		}
	}

	private int rightchild(int i) {
		return 2 * i + 2;
	}

	private int leftchlid(int i) {
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
}
