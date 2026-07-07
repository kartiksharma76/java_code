package StackAndQueue;

import java.util.Stack;

public class NextGreaterElementM2 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
		int[] res = new int[arr.length];

		Stack<Integer> st = new Stack<>();

		// Last element ka next greater nahi hota
		res[arr.length - 1] = -1;
		st.push(arr[arr.length - 1]);

		// Right se left traverse
		for (int i = arr.length - 2; i >= 0; i--) {

			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				res[i] = -1;
			} else {
				res[i] = st.peek();
			}

			st.push(arr[i]);
		}

		System.out.print("Array : ");
		for (int x : arr) {
			System.out.print(x + " ");
		}

		System.out.println();

		System.out.print("NGE   : ");
		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}