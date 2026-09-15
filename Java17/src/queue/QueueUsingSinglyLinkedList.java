package queue;

public class QueueUsingSinglyLinkedList {
	private Node front;
	private Node rear;
	private int size;

	// Enqueue operation: Adds an element to the rear of the queue
	public void enqueue(int data) {
		Node node = new Node(data, null);
		if (rear == null) { // If the queue is empty
			front = rear = node;
		} else {
			rear.next = node; // Link the new node at the end of the queue
			rear = node; // Update the rear to the new node
		}
		size++;
	}

	// Dequeue operation: Removes and returns the front element of the queue
	public int dequeue() {
		if (isEmpty()) {
			System.out.print("Queue is underflow" + " ");
			return -1;
		}
		int data = front.data;
		front = front.next; // Move the front pointer to the next node
		if (front == null) { // If the queue becomes empty
			rear = null;
		}
		size--;
		return data;
	}

	// Peek operation: Returns the front element without removing it
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty" + " ");
			return -1;
		}
		return front.data;
	}

	// Check if the queue is empty
	public boolean isEmpty() {
		return front == null;
	}

	// Returns the size of the queue
	public int size() {
		return size;
	}

	// Display the elements of the queue
	public void print() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return;
		}
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	class Node {
		private int data;
		private Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}