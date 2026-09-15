package Stack;

public class StackArrayTest {
	public static void main(String[] args) {
		MyStackUsingArray stack = new MyStackUsingArray();
		stack.push(1);
		stack.push(6);
		stack.push(100);
		stack.push(1);
		stack.push(22);
		stack.push(02);
		stack.push(25);
		System.out.print(" Stack designer :");
		stack.print();

	}
}
