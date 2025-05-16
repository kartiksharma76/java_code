package StackQuestions;

public class AllOperationOfStack {
	private Node top;
	private Node peek;
	private int size;

	public void push(int data) {
		Node node = new Node(data, null);
		if (top == null) {
			top = node;
			peek = top;

		} else {
			peek.next = node;
			peek = node;
		}
		size++;
	}

	public int pop() {
		if (top == null) {
			System.out.println("stack is under flow");
			return -1;
		}
		int data = top.data;
		top = top.next;
		size--;

		if (top == null)
			peek = null;
		return data;
	}

	public int peek() {
		if (top == null) {
			System.out.println("stack is empty");
			return -1;
		}
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void print() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public int countOccurance(int data) {
		int count = 0;
		Node temp = top;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;

	}

	public int size() {
		return size;

	}

	public void removebyposition(int position) {
		if (position < 0 || position >= size) {
			System.out.println("Invalied position");
			return;
		}
		if (position == 0) {
			top = top.next;
			if (top == null)
				peek = null;
		} else {
			Node temp = top;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			if (temp.next == peek)
				peek = temp;
			temp.next = temp.next.next;
		}
		size--;
	}

	public int findmiddle() {
		if (top == null) {
			System.out.println("Stack is empty");
			return -1;
		}
		Node slow = top;
		Node fast = top;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public void insertAt(int data, int position) {
		if (position < 0 || position > size) {
			System.out.println("Invalid position");
			return;
		}
		Node node = new Node(data, null);
		if (position == 0) {
			node.next = top;
			top = node;
			if (size == 0)
				peek = node;
		} else {
			Node temp = top;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
			if (node.next == null)
				peek = node;
		}
		size++;
	}

	public boolean contains(int data) {
		Node temp = top;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public void removeLast() {
		if (top == null) {
			System.out.println("List is empty");
			return;
		}
		if (top.next == null) {
			top = null;
			peek = null;
		} else {
			Node temp = top;
			while (temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			peek = temp;
		}
		size--;
	}

	public void removeFirst() {
		if (top == null)
			return;
		top = top.next;
		size--;
		if (top == null)
			peek = null;
	}

	public void pushFirst(int data) {
		Node node = new Node(data, top);
		top = node;
		if (size == 0)
			peek = node;
		size++;
	}

	public void pushLast(int data) {
		Node node = new Node(data, null);
		if (top == null) {
			top = node;
			peek = node;
		} else {
			peek.next = node;
			peek = node;
		}
		size++;
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