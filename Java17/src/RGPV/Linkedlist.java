package RGPV;

public class Linkedlist {
	private Node head;
	private Node tail;
	private int size;

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

	public void position(int data, int position) {
		Node node = new Node(data, null);
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;

		}
		node.next = temp.next;
		temp.next = node;
		size++;

	}

	public boolean contain(int data) {
		Node temp = head;
		while (temp != null) {
			if (data == temp.data) {
				return true;
			}
			temp = temp.next;

		}
		return false;
	}

	public void deleteByPosition(int position) {
		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;

		}
		temp.next = temp.next.next;
	}

	public int size() {
		return size;

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

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
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