package javaDsaPattern;

class Stack {
	int data;
	Stack next;

	Stack(int data) {
		this.data = data;
		this.next = null;
	}
}

class StackEx {
	private Stack top;

	// Push operation
	public void push(int data) {
		Stack newNode = new Stack(data);
		newNode.next = top;
		top = newNode;
		System.out.println(data + " pushed");
	}

	// Pop operation
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}

		int value = top.data;
		top = top.next;
		return value;
	}

	// Peek operation
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return top.data;
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return top == null;
	}

	// Display stack
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}

		Stack temp = top;
		System.out.print("Stack: ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackEx s = new StackEx();

		s.push(10);
		s.push(20);
		s.push(30);

		s.display();

		System.out.println("Top Element: " + s.peek());

		System.out.println("Popped: " + s.pop());

		s.display();
	}
}
