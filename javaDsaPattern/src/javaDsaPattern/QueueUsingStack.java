package javaDsaPattern;

//Implement Queue Using Stack

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void push(int x) {
		s1.push(x);
	}

	public int pop() {

		if (s2.isEmpty()) {

			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}

		return s2.pop();
	}

	public int peek() {

		if (s2.isEmpty()) {

			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}

		return s2.peek();
	}

	public static void main(String[] args) {

		QueueUsingStack queue = new QueueUsingStack();

		queue.push(1);
		queue.push(2);
		queue.push(3);

		System.out.println("Front = " + queue.peek());

		System.out.println("Removed = " + queue.pop());

		System.out.println("Front After Pop = " + queue.peek());
	}
}