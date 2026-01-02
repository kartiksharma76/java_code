package Practicesheet;

public class AllOperationOfLinkedList {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public void addFirst(int data) {
		Node node = new Node(data, head);
		head = node;
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void addLast(int data) {
		insert(data);
	}

	public void addPosition(int position, int data) {
		if (position < 1 || position > size + 1) {
			throw new IndexOutOfBoundsException("Invalid Position");
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

		Node node = new Node(data, temp.next);
		temp.next = node;
		size++;
	}

	public void deleteFirst() {
		if (head == null)
			return;

		head = head.next;
		size--;

		if (head == null) {
			tail = null;
		}

	}

	public void deleteLast() {
		if (head == null)
			return;

		if (head.next == null) {
			head = tail = null;
			size--;
			return;
		}

		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}

		temp.next = null;
		tail = temp;
		size--;
	}

	public void deleteByPosition(int position) {
		if (position < 1 || position > size) {
			throw new IndexOutOfBoundsException("Invalid Position");
		}

		if (position == 1) {
			deleteFirst();
			return;
		}

		Node temp = head;
		for (int i = 1; i < position - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;
		size--;

		if (position == size + 1) {
			tail = temp;
		}
	}

	public int middleNode() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int occurrence(int data) {
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

	public void moveLastToFront() {
		if (head == null || head.next == null)
			return;

		Node secondLast = head;
		while (secondLast.next != tail) {
			secondLast = secondLast.next;
		}

		tail.next = head;
		head = tail;
		secondLast.next = null;
		tail = secondLast;
	}

	public boolean contains(int data) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == data)
				return true;
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
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
}