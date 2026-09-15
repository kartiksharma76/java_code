package linkedlist;

public class DeleteBYPosition {
	private Node head;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

	public void deletebyposition(int position) {
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
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

	}
}
