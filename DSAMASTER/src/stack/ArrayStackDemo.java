package stack;

class ArrayStackDemo {

	private int[] stack;
	private int top;
	private int capacity;

	public ArrayStackDemo(int size) {
		capacity = size;
		stack = new int[capacity];
		top = -1;
	}

	// Push element
	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = data;
	}

	// Pop element
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		return stack[top--];
	}

	// Peek element
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return stack[top];
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Check if stack is full
	public boolean isFull() {
		return top == capacity - 1;
	}

	// Display stack
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}

		System.out.print("Stack: ");
		for (int i = top; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayStackDemo st = new ArrayStackDemo(5);

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);

		st.display();

		System.out.println("Top Element: " + st.peek());

		System.out.println("Popped: " + st.pop());

		st.display();

		System.out.println("Is Empty: " + st.isEmpty());

		System.out.println("Is Full: " + st.isFull());
	}
}