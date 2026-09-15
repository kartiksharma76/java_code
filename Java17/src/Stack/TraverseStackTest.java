package Stack;

public class TraverseStackTest {
	public static void main(String[] args) {
		TraverseStack stack = new TraverseStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		// stack.print();
		System.out.println("traverse stack:");
		stack.traverse();
	}
}