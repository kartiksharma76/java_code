package Stack;

public class DeleteMidTest {
	public static void main(String[] args) {
		DeleteMid stack = new DeleteMid();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.deletebyposition(2);
		stack.print();
	}
}
