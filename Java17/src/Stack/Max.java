package Stack;

import java.util.Stack;

public class Max {
public static int findMax(Stack<Integer>stack) {
	if(stack.isEmpty()) {
		return Integer.MIN_VALUE;
	}
	int max=stack.peek();
	while(!stack.isEmpty()) {
		int current=stack.pop();
		max=Math.max(max, current);
	}
	return max;
}
public static void main(String[] args) {
	Stack<Integer>stack=new Stack<Integer>();
	stack.push(1);
	stack.push(3);
	stack.push(5);
	stack.push(7);
	stack.push(9);
	stack.push(2);
	stack.push(4);
	stack.push(6);
	stack.push(8);
	int MaxValue = findMax(stack);
	System.out.println("Max value:"+MaxValue);
	
}
}