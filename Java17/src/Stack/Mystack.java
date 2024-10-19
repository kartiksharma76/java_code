package Stack;

public class Mystack {
	private int[] arr;
	private int top = -1;
	private int size;

	public Mystack() {
		arr = new int[5];

	}

	/**
	 * 1. Create an array. assume size is 5 2. add the data to the array. 3.
	 * increase the size by 1 4. increase the top by 1
	 * 
	 * @param data
	 */

	public void push(int data) {
		if (size == arr.length) {
			System.out.println("stack is over full| stack is full");
			return;
		}
		arr[size] = data;
		size++;
		top++;
	}

	public void print() {
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i]);

		}

	}

	public int peek() {
		if (size == 0) {
			System.out.println("stack is under flow |stack is empty");
			return -1;
		}
		return arr[top];
	}

	public int pop() {
		if (size == 0) {
			System.out.println("stack is under flow |stack is empty");
			return -1;
		}
		int data = arr[top];
		top--;
		size--;
		return data;

	}

	public int size() {
		return size;

	}

	public boolean isEmpty() {
		return top == -1;
	}

}
