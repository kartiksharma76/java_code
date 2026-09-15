package Stack;

public class StackIsFixedSizeTest {
	public static void main(String[] args) {
		StackInFixedSize stack = new StackInFixedSize();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		stack.print();

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
