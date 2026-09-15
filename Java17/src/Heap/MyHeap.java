package Heap;

public class MyHeap {
	private int[] array;
	private int size;

	public MyHeap() {
		array = new int[10];

	}

	public void insert(int data) {
		// Check array is full
		if (size == array.length) {
			return;

		}
		array[size] = data;
		size++;
		heapifyUp(size - 1);
	}

	private void heapifyUp(int index) {
		while (index > 0 && array[index] < array[parent(index)]) {
			// do swapping
			swap(index);
			index = parent(index);

		}

	}

	private void swap(int index) {
		int temp = array[parent(index)];
		array[parent(index)] = array[index];
		array[index] = temp;

	}

// deletion 
	public void delete() {
		array[0] = array[size - 1];
		size--;
		heapifyDown(0);
	}

	private void heapifyDown(int index) {
		int smallest = index;
		int left = leftchild(index);
		int right = rightchlid(index);

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

	private int rightchlid(int i) {
		return 2 * i + 2;
	}

	private int leftchild(int i) {
		return 2 * i + 1;
	}

	private int parent(int i) {
		return (i - 1) / 2;

	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + " ");
		}
	}

}
