package RGPV;

public class StackUsingArrayTest {
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.print();
		System.out.println();
		stack.pop();
		stack.print();

	}
}
