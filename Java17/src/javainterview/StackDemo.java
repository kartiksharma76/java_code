package javainterview;

class StackArray {
	int max = 5;
	int[] stack = new int[max];
	int top = -1;

// Push
	public void push(int value) {
		if (top == max - 1) {
			System.out.println("Stack Overflow");
		} else {
			stack[++top] = value;
			System.out.println(value + "pushed");
		}
	}

	// Pop
	public void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		} else {
			System.out.println(stack[top--] + " popped");
		}
	}

	// Peek
	public void peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println("Top element: " + stack[top]);
		}
	}

	// Display
	public void display() {
		if (top == -1) {
			System.out.println("Stack Empty");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}
}

public class StackDemo {
	public static void main(String[] args) {
		StackArray s = new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);

		s.peek();
		s.display();

		s.pop();
		s.display();
	}
}
