package Stack;

public class DeleteMid {
	private Node head;

	public void push(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;

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
		if (position < 0 || position >= Size()) {
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

	public int Size() {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
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
