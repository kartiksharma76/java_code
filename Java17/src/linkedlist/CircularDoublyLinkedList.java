 package linkedlist;

public class CircularDoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public void add(int data) {
		Node node = new Node(data, null, null);
		if (head == null) {
			head = node;
			tail = head;
			head.previous = tail;
			tail.next = head;
			size++;

		} else {

		}
	}

	public int size() {
		return size;
	}

	public void print() {
		Node temp = head;
		for (int i = 0; i <= size; i++) {
			System.out.println(head.data);
			temp = head.next;
		}

	}

	public void insertatEnd(int data,Node head) {
		Node node =new Node(data,null,null);
		if (head==null) {
			node.next=node.previous=node;
			head=node;
			size++;
			
		}
		else {
			node.next=head;
			node.previous=tail;
			tail.next=node;
			head.previous=node;
			size++;
		}
		return;
	}
	class Node {
		private int data;
		private Node previous;
		private Node next;

		public Node(int data, Node previous, Node next) {
			super();
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
	}
}
