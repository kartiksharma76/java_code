package linkedlist;

public class LinkList {

	private Nodes head;
	private Nodes tail;
	private int size;

	// Insert at end
	public void insert(int data) {
		Nodes node = new Nodes(data, null);

		if (head == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	// Add at first
	public void addFirst(int data) {
		Nodes node = new Nodes(data, null);

		if (head == null) {
			head = tail = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	// Add at position
	public void addPosition(int position, int data) {
		if (position < 0 || position > size) {
			System.out.println("Invalid position");
			return;
		}

		if (position == 0) {
			addFirst(data);
			return;
		}

		Nodes temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}

		Nodes node = new Nodes(data, null);
		node.next = temp.next;
		temp.next = node;

		if (node.next == null) {
			tail = node;
		}

		size++;
	}
	// Add at last
	public void addLast(int data) {
	    Nodes node = new Nodes(data, null);

	    if (head == null) {
	        head = tail = node;
	    } else {
	        tail.next = node;
	        tail = node;
	    }

	    size++;
	}

	// Delete by position
	public void deleteByPosition(int position) {
		if (position < 0 || position >= size) {
			System.out.println("Invalid position");
			return;
		}

		if (position == 0) {
			deleteFirst();
			return;
		}

		Nodes temp = head;
		for (int i = 1; i < position; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;

		if (temp.next == null) {
			tail = temp;
		}

		size--;
	}

	// Delete first
	void deleteFirst() {
		if (head == null)
			return;

		head = head.next;

		if (head == null) {
			tail = null;
		}

		size--;
	}

	// Delete last
	public void deleteLast() {
		if (head == null || head.next == null) {
			head = tail = null;
			size = 0;
			return;
		}

		Nodes temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}

		temp.next = null;
		tail = temp;
		size--;
	}

	// Find middle
	public int middleNode() {
		Nodes slow = head;
		Nodes fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	// Count occurrences
	public int occurrence(int data) {
		int count = 0;
		Nodes temp = head;

		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	// Move last to front
	public void moveLastToFront() {
		if (head == null || head.next == null)
			return;

		Nodes temp = head;

		while (temp.next != tail) {
			temp = temp.next;
		}

		Nodes last = tail;
		temp.next = null;
		tail = temp;

		last.next = head;
		head = last;
	}

	// Size
	public int size() {
		return size;
	}

	// Contains
	public boolean contains(int data) {
		Nodes temp = head;

		while (temp != null) {
			if (temp.data == data)
				return true;
			temp = temp.next;
		}

		return false;
	}

	// Print list
	public void print() {
		Nodes temp = head;

		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}
}

// Nodes class
class Nodes {
	int data;
	Nodes next;

	public Nodes(int data, Nodes next) {
		this.data = data;
		this.next = next;
	}
}