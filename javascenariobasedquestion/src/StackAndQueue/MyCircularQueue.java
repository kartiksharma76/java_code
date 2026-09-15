package StackAndQueue;

public class MyCircularQueue {
	int[] data;
	int head, tail, size, cap;

	public MyCircularQueue(int k) {
		data = new int[k];
		cap = k;
		head = tail = size = 0;
	}

	public boolean enQueue(int val) {
		if (isFull())
			return false;
		data[tail] = val;
		tail = (tail + 1) % cap;
		size++;
		return true;
	}

	public boolean deQueue() {
		if (isEmpty())
			return false;
		head = (head + 1) % cap;
		size--;
		return true;
	}

	public int Front() {
		return isEmpty() ? -1 : data[head];
	}

	public int Rear() {
		return isEmpty() ? -1 : data[(tail - 1 + cap) % cap];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == cap;
	}

	public static void main(String[] args) {
		MyCircularQueue cq = new MyCircularQueue(3);
		System.out.println(cq.enQueue(1)); // true
		System.out.println(cq.enQueue(2)); // true
		System.out.println(cq.enQueue(3)); // true
		System.out.println(cq.enQueue(4)); // false
		System.out.println(cq.Rear()); // 3
	}
}
