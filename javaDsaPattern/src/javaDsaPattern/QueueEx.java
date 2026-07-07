package javaDsaPattern;

class Queue {
	int data;
	Queue next;

	Queue(int data) {
		this.data = data;
		this.next = null;
	}
}

public class QueueEx {
	Queue front, rear;

	public void enqueue(int data) {
		Queue newNode = new Queue(data);

		if (rear == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		int value = front.data;
		front = front.next;

		if (front == null)
			rear = null;
		return value;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return front.data;
	}

	private boolean isEmpty() {
		return front == null;
	}

	public int Size() {
		int count = 0;
		Queue temp = front;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean search(int key) {
		Queue temp = front;

		while (temp != null) {
			if (temp.data == key)
				return true;

			temp = temp.next;
		}

		return false;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		Queue temp = front;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// Clear
	public void clear() {
		front = rear = null;
	}

	public static void main(String[] args) {
		QueueEx q = new QueueEx();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.print("Queue: ");
		q.display();

		System.out.println("Front: " + q.peek());

		System.out.println("Removed: " + q.dequeue());

		System.out.print("Queue After Dequeue: ");
		q.display();

		System.out.println("Size: " + q.Size());

		System.out.println("Search 20: " + q.search(20));

		q.clear();

		System.out.println("Is Empty: " + q.isEmpty());
	}
}
