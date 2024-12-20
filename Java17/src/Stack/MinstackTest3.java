package Stack;

public class MinstackTest3 {
	public static void main(String[] args) {
		Minstack3 stack = new Minstack3();
		stack.push(10);
		stack.push(1);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("min data:" + stack.mindata());

	}
}
