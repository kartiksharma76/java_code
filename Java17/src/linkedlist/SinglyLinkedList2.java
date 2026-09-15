package linkedlist;

public class SinglyLinkedList2 {
	private Node head;
	private Node tail;
	private int size;

	public void last(int data) {
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

		}
	}

	public void addLastUsingTail(int data) {
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

	public void addMid(int position, int data) {
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

	public void deletebyPosition(int position) {
		boolean iswithRange = cheakRange(position);
		if (iswithRange) {
			if (position == 1) {
				deleteFirst();

			} else if (position == size) {
				deleteLast();
			} else {
				Node temp = head;
				for (int i = 1; i < position - 1; i++) {
					temp = temp.next;
				}
				Node nodeatgivenPosition = temp.next;
				Node nextnode = temp.next.next;
				temp.next = nextnode;
				nodeatgivenPosition.next = null;
				size--;
			}

		}
	}

	public void deleteLast() {
		// TODO Auto-generated method stub
		Node temp = head;
		for (int i = 1; i < size - 1; i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;

	}

	public void deleteFirst() {
		// TODO Auto-generated method stub
		head = head.next;
		size--;

	}

	public boolean cheakRange(int position) {
		// TODO Auto-generated method stub
		return position > 0 && position <= size;
	}

	public int size() {
		return size;
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