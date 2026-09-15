package Stack;

public class StringStack1 {
	private String stack;

	public StringStack1() {
		this.stack = " ";
	}

	public void push(String ch) {
		stack += ch;
	}

	public char pop() {
		if (stack.isEmpty()) {
			System.out.println("stack is empty");
		}
		char top = stack.charAt(stack.length() - 1);
		stack = stack.substring(stack.length() - 1);
		return top;
	}

	public boolean isEmpty() {
		return stack.isEmpty();

	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		}

		return stack.charAt(stack.length() - 1);

	}

	public void print() {
		for (int i = stack.length() - 1; i >= 0; i--) {
			System.out.print(stack.charAt(i) + " ");
		}
	}

	public int size() {
		return stack.length();

	}
}
