package Stack;

public class SinglylinkedListStack {
	private Node top;
	private int size;

	public void push(int data) {
		Node node = new Node(data, null);
		node.next = top;
		top = node;
		size++;
	}

	public int pop() {
		if (top == null) {
			System.out.print("stack is underflow" + " ");
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	public int peek(int data) {
		System.out.println("stack is empty" + " ");
		return top.data;
	}

	public boolean isempty() {
		return top == null;
	}

	public int size() {
		return size;
	}

	public void display() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}