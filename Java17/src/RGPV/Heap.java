package RGPV;

public class Heap {
	private int[] arr;
	private int size;

	public Heap() {
		arr = new int[10];

	}

	public void insert(int data) {
		if (size == arr.length) {
			return; 
		}
		arr[size] = data;
		size++;
		heapifyup(size - 1);
	}

	public void heapifyup(int index) {
		while (index > 0 && arr[index] < arr[Parent(index)]) {
			swap(index);
			index = Parent(index);
		}

	}

	public void swap(int index) {
		int temp = arr[Parent(index)];
		arr[Parent(index)] = arr[index];
		arr[index] = temp;

	}

	public void delete() {
		arr[0] = arr[size - 1];
		size--;
		heapifydown(0);

	}

	public void heapifydown(int index) {
		int smallest = index;
		int left = leftchild(index);
		int right = rightchild(index);

		if (left < size && arr[smallest] > arr[left]) {
			smallest = left;
		}
		if (right < size && arr[smallest] > arr[right]) {
			smallest = right;
		}
		if (smallest != index) {
			int temp = arr[smallest];
			arr[smallest] = arr[index];
			arr[index] = temp;
			heapifydown(smallest);
		}
	}

	private int rightchild(int i) {
		return 2 * i + 2;
	}

	private int leftchild(int i) {
		return 2 * i + 1;
	}

	private int Parent(int i) {
		return (i - 2) / 2;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
