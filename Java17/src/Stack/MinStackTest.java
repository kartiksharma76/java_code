package Stack;

public class MinStackTest {
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(5);
		stack.push(6);
		stack.push(3);
		stack.push(4);
		stack.push(7);
		System.out.println("minimu element in stack:" + stack.getMin());
	}
}
