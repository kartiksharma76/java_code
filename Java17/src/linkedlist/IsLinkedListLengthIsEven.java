package linkedlist;

public class IsLinkedListLengthIsEven {
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
			if (temp != temp.next) {
				return true;
			}
			temp = temp.next;

		}
		return false;
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