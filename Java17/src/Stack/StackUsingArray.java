package Stack;

public class StackUsingArray {
	int top = -1;
	int size = 5;

	int arr[] = new int[size];

	void push(int data) {
		if (top == size - 1) {
			System.out.println("Stack Overflow");
			return;

		}
		top++;
		arr[top] = data;
	}

	void pop() {
		if (top == -1) {
			System.out.println("Stack underflow");
			return;
		}

		System.out.println("Removed:" + arr[top]);
		top--;
	}

	void peek() {
		if (top == -1) {
			System.out.println("Empty Stack");
			return;
		}
		System.out.println("Top:" + arr[top]);
	}

	void display() {
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		StackUsingArray st = new StackUsingArray();
		st.push(10);
		st.push(20);
		st.push(30);

		st.display();

		st.pop();

		st.peek();
	}
}
