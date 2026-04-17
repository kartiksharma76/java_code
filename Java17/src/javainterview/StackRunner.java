package javainterview;

class ZenStack {
	private int[] data;
	private int topIndex;
	private int capacity;

	public ZenStack(int size) {
		capacity = size;
		data = new int[capacity];
		topIndex = -1;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack Overflow ");
			return;
		}
		data[++topIndex] = value;
		System.out.println(value + " inserted");
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow ");
			return -1;
		}
		return data[topIndex--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return data[topIndex];
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}

	public boolean isFull() {
		return topIndex == capacity - 1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Nothing to show");
			return;
		}
		System.out.print("Stack Elements: ");
		for (int i = topIndex; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}

// Main class renamed
public class StackRunner {
	public static void main(String[] args) {
		ZenStack s = new ZenStack(5);

		s.push(10);
		s.push(20);
		s.push(30);

		s.display();

		System.out.println("Top element: " + s.peek());

		System.out.println("Removed: " + s.pop());

		s.display();
	}
}
