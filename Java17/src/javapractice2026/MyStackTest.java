package javapractice2026;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.peek();

        stack.pop();
        stack.pop();

        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.pop();
        stack.pop(); // underflow test
	}
}
