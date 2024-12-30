package queue;

public class AllOperationQueue {
	private Node front;
	private Node rear;
	private int size;

	/**
	 * enqueue(int data) Algorithm: Adds a new element to the rear of the queue. If
	 * the queue is empty (rear == null), set both front and rear to the new node.
	 * Otherwise, append the new node to the rear and update the rear pointer. Time
	 * Complexity: O(1), Space Complexity: O(1).
	 */
	public void enqueue(int data) {
		Node node = new Node(data, null);
		if (rear == null) {
			front = rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		size++;
	}

	/**
	 * dequeue() Algorithm: Removes the front element from the queue. If the queue
	 * is empty (front == null), return -1. Otherwise, return the data of the front
	 * node and update front to front.next. Time Complexity: O(1), Space Complexity:
	 * O(1).
	 */
	public int dequeue() {
		if (front == null) {
			System.out.println("Queue is underflow");
			return -1;
		}
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return data;
	}

	/**
	 * peek() Algorithm: Returns the front element without removing it. If the queue
	 * is empty, return -1. Otherwise, return front.data. Time Complexity: O(1),
	 * Space Complexity: O(1).
	 */
	public int peek() {
		if (front == null) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}

	/**
	 * isEmpty() Algorithm: Checks if the queue is empty by verifying if front ==
	 * null. Time Complexity: O(1), Space Complexity: O(1).
	 */
	public boolean isEmpty() {
		return front == null;
	}

	/**
	 * size() Algorithm: Returns the size of the queue. Time Complexity: O(1), Space
	 * Complexity: O(1).
	 */
	public int size() {
		return size;
	}

	/**
	 * print() Algorithm: Traverses the queue from front to rear and prints each
	 * node's data. Time Complexity: O(n), Space Complexity: O(1).
	 */
	public void print() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	/**
	 * countOccurance(int data) Algorithm: Counts occurrences of a specific data in
	 * the queue. Traverse the queue and increment a counter whenever temp.data ==
	 * data. Time Complexity: O(n), Space Complexity: O(1).
	 */
	public int countOccurance(int data) {
		int count = 0;
		Node temp = front;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	/**
	 * removeByPosition(int position) Algorithm: Removes the node at the specified
	 * position. Traverse to the node before the specified position. Update the next
	 * pointer to skip the node at position. Time Complexity: O(n), Space
	 * Complexity: O(1).
	 */
	public void removeByPosition(int position) {
		if (position < 0 || position >= size) {
			System.out.println("Invalid position");
			return;
		}

		if (position == 0) {
			dequeue();
			return;
		}

		Node temp = front;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}

	/**
	 * findMiddle() Algorithm: Finds the middle element using the slow-and-fast
	 * pointer technique. Time Complexity: O(n), Space Complexity: O(1).
	 */
	public int findMiddle() {
		Node slow = front;
		Node fast = front;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow != null ? slow.data : -1;
	}

	/**
	 * contain(int data) Algorithm: Checks if the queue contains a specific data.
	 * Traverse the queue and return true if temp.data == data. Time Complexity:
	 * O(n), Space Complexity: O(1).
	 */
	public boolean contain(int data) {
		Node temp = front;
		while (temp != null) {
			if (temp.data == data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	/**
	 * removeLast() Algorithm: Removes the last element of the queue. Traverse the
	 * queue until the second-last node, then set its next to null. Time Complexity:
	 * O(n), Space Complexity: O(1).
	 */
	public void removeLast() {
		if (front == null) {
			System.out.println("Queue is empty");
			return;
		}

		if (front.next == null) {
			front = rear = null;
		} else {
			Node temp = front;
			while (temp.next != null && temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			rear = temp;
		}
		size--;
	}

	class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
