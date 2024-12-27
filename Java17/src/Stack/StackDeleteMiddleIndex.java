package Stack;

public class StackDeleteMiddleIndex {
	private Node head;
	private int size;

	public void push(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;

	}

	public int pop() {
		if (head == null) {
			System.out.println("stack is empty");
			return -1;
		}
		int data = head.data;
		head = head.next;
		return data;

	}

	public void deletebyposition(int position) {
		if (position < 0 || position >= size()) {
			return;
		}
		if (position == 0) {
			head = head.next;
			return;
		}
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	public int size() {
		return size;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
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
