package queue;

public class MyQueueUsingLinkedListWithoutLibrary {
	private Node head;
	private Node tail;
	private int size;

	public void enqueue(int data) {
		addLastUsingTail(data);
	}

	public int dequeue() {
		return deleleFirst();
	}

	public int size() {
		return size;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
	}

	private void addLastUsingTail(int data) {
		Node node = new Node(data, null);
		if (head == null) {// first Node
			head = node;
			tail = head;
			size++;
		} else {// Second Node onwards
			tail.next = node;
			tail = node;
			size++;
		}

	}

	private int deleleFirst() {
		int data = head.data;
		head = head.next;
		size--;
		return data;
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
