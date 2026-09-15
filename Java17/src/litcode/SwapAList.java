package litcode;

public class SwapAList {
	private Node head;
	private Node tail;
	private int size;

	public void insert(int data) {
		Node node = new Node(data, null);
		if (head == null) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public void swap(int index1, int index2) {
		if (index1 < 0 || index2 < 0 || index1 >= size || index2 >= size) {
			System.out.println("Invalid indices for swap.");
			return;
		}

		if (index1 == index2)
			return;

		Node node1 = head;
		Node node2 = head;
		for (int i = 0; i < index1; i++)
			node1 = node1.next;
		for (int i = 0; i < index2; i++)
			node2 = node2.next;

		// Swap data
		int temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Inner Node class
	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	// Main method to test
	public static void main(String[] args) {
		SwapAList list = new SwapAList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		System.out.println("Original list:");
		list.print();

		list.swap(1, 0);

		System.out.println("List after swapping index 1 and 2:");
		list.print();
	}
}
