package javainterview;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private int size;

//================= INSERT OPERATIONS =================
// Add at beginning

	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = node;

		}
		size++;
	}

// Add at end (optimized using tail)
	public void addLast(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

// Add at specific position

	public void addAtPosition(int position, int data) {
		if (position < 1 || position > size + 1) {
			throw new RuntimeException("Invalid Position");
		}
		if (position == 1) {
			addFirst(data);
			return;
		}

		if (position == size + 1) {
			addLast(data);
			return;
		}

		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}

		Node node = new Node(data, null);
		node.next = temp.next;
		temp.next = node;
		size++;

	}
// ================= DELETE OPERATIONS =================

// Delete first node
	public void deleteFirst() {
		if (head == null)
			throw new RuntimeException("List empty");
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
	}

// Delete last node
	public void deleteLast() {
		if (head == null)
			throw new RuntimeException("List empty");
		if (size == 1) {
			head = tail = null;
		} else {
			Node temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}

			temp.next = null;
			tail = temp;
		}
		size--;
	}

// Delete by position
	public void deleteAtPosition(int position) {
		if (position < 1 || position > size) {
			throw new RuntimeException("Invalid Position");
		}

		if (position == 1) {
			deleteFirst();
			return;
		}

		if (position == size) {
			deleteLast();
			return;
		}

		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}

		Node deleteNode = temp.next;
		temp.next = deleteNode.next;
		deleteNode.next = null;
		size--;
	}

// ================= SEARCH =================

	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data)
				return true;
			temp = temp.next;
		}
		return false;
	}

// ================= UPDATE =================

	public void update(int position, int newData) {
		if (position < 1 || position > size) {
			throw new RuntimeException("Invalid Position");
		}

		Node temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}

		temp.data = newData;
	}

//================= REVERSE =================

	public void reverse() {
		Node prev = null;
		Node current = head;
		tail = head;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}
// ================= DISPLAY =================

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

//================= SIZE =================

	public int size() {
		return size;
	}

// ================= NODE CLASS =================

}

class Node {
	int data;
	Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

}