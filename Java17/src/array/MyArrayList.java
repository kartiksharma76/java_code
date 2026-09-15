package array;

public class MyArrayList {
	private int capacity = 10;
	private int[] arr;
	private int size;

	public MyArrayList() {
		arr = new int[capacity];
	}

	/**
	 * 1. Check array is full.(size==capacity) true: do the following a. Create a
	 * temp array by doubling the capacity. b. Copy all the elements from actual
	 * array to temp array. c. assign temp array reference to actual array
	 * reference. d.add the current element to actual array and increase the size by
	 * 1.
	 * 
	 * false: do the following a. add the element to the actual array. b. increase
	 * the size of the array by 1.
	 * 
	 */
	public void add(int data) {
		if (size == arr.length) {
			capacity = capacity * 2;
			int[] temp = new int[capacity];
			for (int i = 0; i < size; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
			arr[size] = data;
			size++;

		} else {

			arr[size] = data;
			size++;
		}
	}

	/**
	 * Assume given index is within the range.
	 * 
	 * 1. Do the shifting from right to left. 2. decrease the size by 1
	 * 
	 */
	public void deleteByIndex(int index) {
		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;

	}

	public void printData() {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int size() {
		return size;
	}

	public int get(int index) {
		if (!(size > 0)) {
			System.out.println("You fool you! Bucket is empty");
			return -1;
		}
		return arr[index];
	}
}
