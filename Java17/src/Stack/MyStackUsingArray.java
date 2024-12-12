package Stack;

public class MyStackUsingArray {
	private int[] array;
	private int size;
	private int top = -1;

	public MyStackUsingArray() {
		array = new int[7];

	}

	public void push(int data) {
		if (size == array.length) {
			System.out.println("stack is over flow |stack is full");
		}
		array[size] = data;
		size++;
		top++;
	}

	public void pop() {
		if (size == 0) {
			System.out.println("stack is under flow|stack is empty");
		}
		int data = array[top];
		top--;
		size--;
	}

	public int peek() {
		if (size == 0) {
			System.out.println("stack is underflow|stack is empty");
			return -1;
		}
		return array[top];
	}

	public void print() {
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

	public int size() {
		return size;
	}

	public int isEmpty() {
		return top - 1;

	}
}
