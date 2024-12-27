package Stack;

public class StackUsingLinkedList {
	private Node top;
	private int size;

	// Push operation: Adds an element to the stack
	public void push(int data) {
		Node node = new Node(data, null);
		node.next = top;
		top = node;
		size++;
	}

	// Pop operation: Removes and returns the top element of the stack
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow! Cannot pop from an empty stack.");
		}
		top = top.next;
		size--;
	}

	// Peek operation: Returns the top element without removing it
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty! Cannot peek.");
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public int size() {
		return size;
	}

	public void print() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}
}
