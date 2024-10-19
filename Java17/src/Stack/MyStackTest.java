package Stack;

public class MyStackTest {
	public static void main(String[] args) {
		Mystack stack = new Mystack();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
