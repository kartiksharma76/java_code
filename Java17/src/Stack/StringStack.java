package Stack;

public class StringStack {
	private String Stack;

	public StringStack() {
		this.Stack = " ";
	}

// push element
	public void push(String ch) {
		Stack += ch;
	}

// pop element
	public char pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		char top = Stack.charAt(Stack.length() - 1);
		Stack = Stack.substring(Stack.length() - 1);
		return top;
	}

// boolean 
	public boolean isEmpty() {
		return Stack.isEmpty();
	}

// peek element
	public char peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		}
		return Stack.charAt(Stack.length() - 1);

	}

// print element
	public void print() {
		for (int i = Stack.length() - 1; i >= 0; i--) {
			System.out.print(Stack.charAt(i) + " ");
		}
	}

// print size
	public int size() {
		return Stack.length();

	}
}
