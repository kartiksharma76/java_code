package linkedlist;

public class IsLinkedListLengthIsEven1 {
	private Node head;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;

	}

	public boolean Contain(Node head) {
		Node temp = head;
		while (temp != null) {
			if (temp.next != null) {
			}
			Node next = temp.next.next;

		}
		return temp == null;
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
