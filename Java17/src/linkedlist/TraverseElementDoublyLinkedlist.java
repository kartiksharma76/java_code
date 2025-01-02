package linkedlist;

public class TraverseElementDoublyLinkedlist {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;

		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
			size++;
		}
	}

	public void traverese() {
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.data+" ");
			temp = temp.previous;
		}
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
public int size() {
	return size;
	
}
	class Node {
		private int data;
		private Node next;
		private Node previous;

		public Node(int data, Node next, Node previous) {
			super();
			this.data = data;
			this.next = next;
			this.previous = previous;
		}
	}
}