package queue;

public class DeleteMide {
	public Node head;
	public Node tail;
	public int size;

	public void enqueue(int data) {
		addFirst(data);

	}

	public int dequeue() {
		return deleteFirst();
	}

	public void addFirst(int data) {
		Node node = new Node(data, null);
		node.next = head;
		head = node;
		size++;

	}

	public int deleteFirst() {
		int data = head.data;
		head = head.next;
		size--;
		return data;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		class Node {
			int data;
			Node next;

			public Node(int data, Node next) {
				super();
				this.data = data;
				this.next = next;
			}
		}

	}
}
