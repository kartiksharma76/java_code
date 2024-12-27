package Stack;

public class StackStringUsingSinglyLinkedList {
	private Node top;
	private int size;

	public void push(String data) {
		Node node = new Node(data, null);
		node.next = top;
		top = node;
		size++;
	}

	public String pop() {
		if (top == null) {
			System.out.print("stack is underflow" + " ");

		}
		String data = top.data;
		top = top.next;
		return data;
	}

	public String peek() {
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
		String data;
		Node next;

		public Node(String data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}
