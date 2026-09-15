package Infoces;

public class Heap {
	private int[] array;
	private int size;

	public Heap() {
		array = new int[10];
		size = 0;
	}

	// Insert element into heap
	public void insert(int data) {
		if (size == array.length) {
			resize();
		}

		array[size] = data;
		size++;
		heapifyUp(size - 1);
	}

	// Remove and return minimum element (root)
	public int delete() {
		if (size == 0) {
			System.out.println("Heap is empty");
			return -1;
		}

		int root = array[0];
		array[0] = array[size - 1];
		size--;
		heapifyDown(0);

		return root;
	}

	// Return minimum element without removing
	public int peek() {
		if (size == 0) {
			System.out.println("Heap is empty");
			return -1;
		}
		return array[0];
	}

	// Heapify upwards (after insert)
	private void heapifyUp(int index) {
		while (index > 0 && array[index] < array[parent(index)]) {
			swap(index, parent(index));
			index = parent(index);
		}
	}

	// Heapify downwards (after delete)
	private void heapifyDown(int index) {
		int smallest = index;

		int left = leftChild(index);
		int right = rightChild(index);

		if (left < size && array[left] < array[smallest]) {
			smallest = left;
		}

		if (right < size && array[right] < array[smallest]) {
			smallest = right;
		}

		if (smallest != index) {
			swap(index, smallest);
			heapifyDown(smallest);
		}
	}

	// Swap helper
	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// Resize array when full
	private void resize() {
		int[] newArray = new int[array.length * 2];
		System.arraycopy(array, 0, newArray, 0, array.length);
		array = newArray;
	}

	// Index helpers
	private int parent(int index) {
		return (index - 1) / 2;
	}

	private int leftChild(int index) {
		return 2 * index + 1;
	}

	private int rightChild(int index) {
		return 2 * index + 2;
	}

	// Display heap
	public void display() {
		System.out.println("Heap Elements:");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Main method for testing
	public static void main(String[] args) {
		Heap heap = new Heap();

		heap.insert(10);
		heap.insert(5);
		heap.insert(20);
		heap.insert(2);
		heap.insert(15);

		heap.display();

		System.out.println("Min element: " + heap.peek());

		System.out.println("Deleted: " + heap.delete());
		heap.display();

		System.out.println("Deleted: " + heap.delete());
		heap.display();
	}
}