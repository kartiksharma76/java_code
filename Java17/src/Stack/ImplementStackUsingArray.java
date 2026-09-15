package StackQuestions;

import java.util.Scanner;

public class ImplementStackUsingArray {
	private int[] arr;
	private int top;
	private int capacity;

	public ImplementStackUsingArray(int size) {
		this.capacity = size;
		this.arr = new int[capacity];
		this.top = -1;
	}

	public void push(int x) {
		if (top == capacity - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		arr[++top] = x;
	}

	public int pop() {
		if (top == -1) {
			return -1;
		}
		return arr[top--];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] inputs = sc.nextLine().split(" ");
		ImplementStackUsingArray stack = new ImplementStackUsingArray(1000);

		StringBuilder output = new StringBuilder();

		for (int i = 0; i < inputs.length; i++) {
			int queryType = Integer.parseInt(inputs[i]);

			if (queryType == 1) {
				int x = Integer.parseInt(inputs[++i]);
				stack.push(x);
			} else if (queryType == 2) {
				int popped = stack.pop();
				if (output.length() > 0) {
					output.append(", ");
				}
				output.append(popped);
			}
		}

		System.out.println(output.toString());

		sc.close();
	}
}//1 2 1 3 2 1 4 2