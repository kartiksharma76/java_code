package StackQuestions;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {

		String str = "JAVA";

		Stack<Character> st = new Stack<>();

		for (char ch : str.toCharArray()) {
			st.push(ch);
		}

		while (!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}
}
