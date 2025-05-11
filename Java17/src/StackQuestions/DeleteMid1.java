package StackQuestions;

public class DeleteMid1 {
	private int size;
	private Node top;
	private Node peek;

	public void push(int data) {
		Node node = new Node(data, null);
		if (top == null) {
			top = node;
			peek = top;
		} else {
			peek.next = node;
			peek = node;
			size++;

		}
	}

	public int pop() {
		if (top == null) {
			System.out.println("stack is under flow ");
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	public int peek(int data) {
		System.out.println("stack is empty");
		return top.data;
	}

	public boolean isempty() {
		return top == null;

	}

	public void print() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	private Node deleteMid(Node temp, int tempnext) {
		if (temp == null) {
			return null;
		}
		if (tempnext == size / 2) {
			size--;
			return temp.next; // skip the middle node
		}
		temp.next = deleteMid(temp.next, tempnext + 1);
		return temp;
	}

	// Public method to delete middle
	public void deleteMid() {
		top = deleteMid(top, 0);
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

	public static void main(String[] args) {
		DeleteMid1 mid = new DeleteMid1();
		mid.push(10);
		mid.push(20);
		mid.push(30);
		mid.push(40);
		System.out.println("original stack:");
		mid.print();
		System.out.println("after delete:");
		mid.deleteMid();
		mid.print();
	}
}
