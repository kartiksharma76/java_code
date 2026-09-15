package array;

public class CircularLinkedList {
	private Root head;
	private Root tail;
	private int size;

	public void insert(int data) {
		Root node = new Root(data);

		if (head == null) {
			head = tail = node;
			tail.next = head;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
		size++;
	}

	public void addFirst(int data) {
		Root node = new Root(data);
		if (head == null) {
			head = tail = node;
			tail.next = head;
		} else {
			node.next = head;
			head = node;
			tail.next = head;
		}
		size++;
	}

	public void addPosition(int pos, int data) {
		if (pos < 0 || pos > size) {
			System.out.println("Invalid position");
			return;
		}
		if (pos == 0) {
			addFirst(data);
			return;
		}
		if (pos == size) {
			insert(data);
			return;
		}
		Root temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		Root node = new Root(data);
		node.next = temp.next;
		temp.next = node;

		size++;

	}

	public void deleteFirst() {
		if (head == null)
			return;

		if (head == tail) {
			head = tail = null;

		} else {
			head = head.next;
			tail.next = head;
		}
		size--;
	}

	public void deleteLast() {
		if (head == null)
			return;

		if (head == tail) {
			head = tail = null;
		} else {
			Root temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
		}
		size--;
	}

	public void deletePosition(int pos) {
		if (pos < 0 || pos >= size) {
			System.out.println("Invalid position");
			return;
		}
		if (pos == 0) {
			deleteFirst();
			return;
		}
		if (pos == size - 1) {
			deleteLast();
			return;
		}
		Root temp = head;
		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}

	public void print() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Root temp = head;
		do {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(back to head)");
	}

	public int size() {
		return size;
	}
}

class Root {
	int data;
	Root next;

	public Root(int data) {
		this.data = data;
	}
}