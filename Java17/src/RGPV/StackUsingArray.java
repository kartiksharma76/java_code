package RGPV;

public class StackUsingArray {
	private int size;
	private int[] arr;
	private int top = -1;

	public StackUsingArray() {
		arr = new int[5];
	}

	public void push(int data) {
		if (size == arr.length) {
			System.out.println("stack is overflow||stack is full");

		}
		arr[size] = data;
		size++;
		top++;
	}

	public void pop() {
		if (size == 0) {
			System.out.println("stack is undreflow||stack is empty");

		}
		int data = arr[top];
		top--;
		size--;
	}

	public int peek() {
		if (size == 0) {
			System.out.println("stack is undreflow|| stack is empty");
			return -1;

		}
		return arr[top];

	}

	public int isEmpty() {
		return top - 1;

	}

	public int size() {
		return size;

	}

	public void print() {
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}
