package javaDsaPattern;

class MaxHeap1 {
	int[] heap;
	int size;
	int capacity;

	MaxHeap1(int capacity) {
		this.capacity = capacity;
		heap = new int[capacity];
		size = 0;
	}

	int parent(int i) {
		return (i - 1) / 2;
	}

	int left(int i) {
		return 2 * i + 1;
	}

	int right(int i) {
		return 2 * i + 2;
	}

	void insert(int value) {
		if (size == capacity) {
			System.out.println("Heap Overflow");
			return;
		}

		int i = size;
		heap[size++] = value;

		while (i != 0 && heap[parent(i)] < heap[i]) {
			int temp = heap[i];
			heap[i] = heap[parent(i)];
			heap[parent(i)] = temp;
			i = parent(i);
		}
	}
 
	// Heapify
	void heapify(int i) {
		int largest = i;
		int l = left(i);
		int r = right(i);

		if (l < size && heap[l] > heap[largest])
			largest = l;

		if (r < size && heap[r] > heap[largest])
			largest = r; 

		if (largest != i) {
			int temp = heap[i];
			heap[i] = heap[largest];
			heap[largest] = temp;

			heapify(largest);
		}
	}

	// Delete Root
	int delete() {
		if (size <= 0) {
			System.out.println("Heap Empty");
			return -1;
		}

		int root = heap[0];
		heap[0] = heap[size - 1];
		size--;

		heapify(0);

		return root;
	}

	// Peek
	int peek() {
		if (size == 0)
			return -1;
		return heap[0];
	}

	// Display
	void display() {
		for (int i = 0; i < size; i++)
			System.out.print(heap[i] + " ");
		System.out.println();
	}

}

public class MaxHeapTest {
	public static void main(String[] args) {
		MaxHeap1 h = new MaxHeap1(10);
		h.insert(50);
		h.insert(30);
		h.insert(20);
		h.insert(40);
		h.insert(70);

		System.out.print("Heap: ");
		h.display();

		System.out.println("Maximum: " + h.peek());

		System.out.println("Deleted: " + h.delete());

		System.out.print("After Delete: ");
		h.display();

	}
}
