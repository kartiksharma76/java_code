package companywisequestion;

public class CircularQueue {
	int[] queue;
	int front;
	int rear;
	int size;
	int capacity;

	CircularQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];

		front = 0;
		rear = -1;
		size = 0;

	}

	public void enqueue(int data) {
		if (size == capacity) {
			System.out.println("Queue Full");
			return;
		}
		rear = (rear + 1) % capacity;
		queue[rear] = data;
		size++;
	}

	public int dequeue() {

		if (size == 0) {
			return -1;
		}
		int value = queue[front];
		front = (front + 1) % capacity;
		size--;

		return value;
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);

		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);

		System.out.println(cq.dequeue());
		System.out.println(cq.dequeue());
	}
}
