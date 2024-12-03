package Stack;

public class StackUsingTwoQueueTest {
	public static void main(String[] args) {
		StackUsingTwoQueue s = new StackUsingTwoQueue();
		s.push(2);
		s.push(3);
		System.out.println(s.pop() + " ");
		s.push(4);
		System.out.println(s.pop() + " ");
	}
}
