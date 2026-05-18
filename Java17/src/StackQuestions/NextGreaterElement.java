package StackQuestions;

import java.util.Stack;

public class NextGreaterElement {
	public static void main(String[] args) {

		int arr[] = { 4, 5, 2, 10 };

		Stack<Integer> st = new Stack<>();

		for (int i = arr.length - 1; i >= 0; i--) {

			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				System.out.println(arr[i] + " -> -1");
			} else {
				System.out.println(arr[i] + " -> " + st.peek());
			}

			st.push(arr[i]);
		}
	}
}
