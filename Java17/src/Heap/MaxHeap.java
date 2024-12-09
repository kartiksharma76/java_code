package Heap;

public class MaxHeap {
	private int[] array;
	private int size;

	public MaxHeap() {
		array = new int[10];
		size = 0;

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
		while (i > 0 && array[i] > array[parent(i)]) {
			swap(i);
			i = parent(i);
		}

	}

	private void swap(int index) {
		int temp = array[parent(index)];
		array[parent(index)] = array[index];
		array[index] = temp;
	}

	public void delete() {
		array[0] = array[size - 1];
		size--;
		heapifyDown(0);
	}

	private void heapifyDown(int index) {
		int largest = index;
		int left = leftchild(index);
		int right = rightchild(index);
		if (left < size && array[largest] < array[left]) {
			largest = left;
		}
		if (right < size && array[largest] < array[right]) {
			largest = right;
		}
		if (largest != index) {
			swap(largest);
			heapifyDown(largest);
		}
	}

	private int rightchild(int i) {
		return 2 * i + 2;
	}

	private int leftchild(int i) {

		return 2 * i + 1;
	}

	private int parent(int i) {
		// TODO Auto-generated method stub
		return (i - 1) / 2;
	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + " ");
		}
	}
}