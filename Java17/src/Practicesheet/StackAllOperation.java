package Practicesheet;

import java.util.Scanner;

public class StackAllOperation {
	private int[] stack;
	private int top;
	private int capacity;

	public StackAllOperation(int size) {
		capacity = size;
		stack = new int[capacity];
		top = -1;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = data;
		System.out.println(data + " pushed into stack");
	}

	public void pushMultiple(int[] elements) {
		if (elements.length > (capacity - (top + 1))) {
			System.out.println("Cannot push all elements. Only " + (capacity - (top + 1)) + " space available.");
			return;
		}

		System.out.print("Pushed elements: ");
		for (int element : elements) {
			stack[++top] = element;
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int poppedValue = stack[top--];
		System.out.println(poppedValue + " popped from stack");
		return poppedValue;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return stack[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

	public int size() {
		return top + 1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Stack elements (top to bottom):");
		for (int i = top; i >= 0; i--) {
			System.out.println("[" + stack[i] + "]");
		}
		System.out.println("↑ top");
	}

	public void search(int key) {
		if (isEmpty()) {
			System.out.println("Stack is empty, cannot search");
			return;
		}

		for (int i = top; i >= 0; i--) {
			if (stack[i] == key) {
				int position = top - i + 1;
				System.out.println(key + " found at position " + position + " from top");
				return;
			}
		}
		System.out.println(key + " not found in stack");
	}

	public void clear() {
		top = -1;
		System.out.println("Stack cleared");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter stack size: ");
		int size = sc.nextInt();

		StackAllOperation stack = new StackAllOperation(size);

		while (true) {
			System.out.println("\n========== Stack Operations ==========");
			System.out.println("1. Push Single      2. Push Multiple    3. Pop");
			System.out.println("4. Peek             5. Display          6. Size");
			System.out.println("7. Search           8. Clear            9. Exit");
			System.out.print("Choose option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter value to push: ");
				stack.push(sc.nextInt());
				break;

			case 2:
				System.out.print("How many elements to push? ");
				int count = sc.nextInt();

				if (count <= 0) {
					System.out.println("Please enter a positive number.");
					break;
				}

				if (count > size) {
					System.out.println("Cannot push more than stack size (" + size + ").");
					break;
				}

				int[] elements = new int[count];
				System.out.print("Enter " + count + " elements separated by space: ");
				for (int i = 0; i < count; i++) {
					elements[i] = sc.nextInt();
				}
				stack.pushMultiple(elements);
				break;

			case 3:
				stack.pop();
				break;

			case 4:
				int topElement = stack.peek();
				if (topElement != -1)
					System.out.println("Top element: " + topElement);
				break;

			case 5:
				stack.display();
				break;

			case 6:
				System.out.println("Current stack size: " + stack.size());
				break;

			case 7:
				System.out.print("Enter element to search: ");
				stack.search(sc.nextInt());
				break;

			case 8:
				stack.clear();
				break;

			case 9:
				System.out.println("Exiting program. Goodbye!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Please enter 1-9.");
			}
		}
	}
}