package javainterview;

class QueueArray {
	int max = 5;
	int[] queue = new int[max];
	int front = 0;
	int rear = -1;

	// Enqueue
	public void enqueue(int value) {
		if (rear == max - 1) {
			System.out.println("Queue Overflow");
		} else {
			queue[++rear] = value;
			System.out.println(value + "inserted");
		}
	}

//Dequeue
	public void dequeue() {
		if (front > rear) {
			System.out.println("Queue Underflow");
		} else {
			System.out.println(queue[front++] + " deleted");
		}
	}

	// Peek
	public void peek() {
		if (front > rear) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Front element: " + queue[front]);

		}
	}
	// Display

	public void display() {
		if (front > rear) {
			System.out.println("Queue Empty");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.println(queue[i] + " ");
			}
			System.out.println();
		}
	}
}

public class QueueDemo {
	public static void main(String[] args) {
		QueueArray q = new QueueArray();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		q.display();

		q.dequeue();
		q.display();

		q.peek();
	}
}
