package linkedlist;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;

//add
	public void add(int data) {
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

//add first 
	public void addFirst(int data) {
		Node node = new Node(data, null, null);
		node.next = head;
		head.previous = node;
		head = node;
		size++;
	}

	public void add(int position, int data) {
		Node node = new Node(data, null, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp;
		node.previous = temp.previous;
		temp.previous.next = node;
		temp.previous = node;
		size++;
	}

//add last 
	public void addLast(int data) {
//		Node node = new Node(data, null, null);
//		tail.next = node;
//		node.previous = tail;
//		tail = node;
//		size++;
		add(data);
	}

	public int size() {
		return size;
	}

//print
	public void print() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

// reverse print
	public void printReverse() {
		Node temp = tail;
		for (int i = 0; i < size; i++) {
			System.out.println(temp.data);
			temp = temp.previous;
		}
	}

// delete last
	public void deletelast(int data) {
		Node temp = head;
		head = temp.next;
		head.previous = null;
		temp.previous = null;
		size--;
	}

// delete all	
	public void deleteall() {
		head = null;
		tail = null;
		size = 0;

	}

	// add mid point
	public void addmid(int position, int data) {
		Node node = new Node(data, null, null);
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;

		}

		node.next = temp;
		node.previous = temp.previous;
		temp.previous = node;
		temp.previous = node;
		size++;
	}

	public boolean contain(int data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;

			}
			temp = temp.next;
			temp.previous = temp.next;

		}
		return false;
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
