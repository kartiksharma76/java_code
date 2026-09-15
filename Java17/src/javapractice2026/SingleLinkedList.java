package javapractice2026;

public class SingleLinkedList {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * Create a new Node with in given data if the list is empty(head== null start
	 * with head node to tail node increment size else add the new node at the end
	 * by setting tail.next to the new node update tail to the new node then
	 * incremnet sixze
	 * 
	 */

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
			size++;
		} else {
			tail.next = node;
			tail = node;
			size++;
		}
	}

	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			size++;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}

	public void addPosition(int position, int data) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		size++;
	}

	public void deleteByPosition(int position) {
		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	public int middleNode() {
		Node node = head;
		Node temp = head;
		while (temp != null && temp.next != null) {
			node = node.next;
			temp = temp.next.next;
		}
		return node.data;
	}

	public int Occurence(int data) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;

	}

	public void deleteFirst() {
		head = head.next;
		size++;
	}

	public void deleteLast() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
	}

	public void MoveLastToFront() {
		Node node = tail;
		Node temp = head;

		while (temp.next != tail) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		node.next = head;
		head = node;

	}

	public int size() {
		return size;
	}

	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;

		}
		return false;
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