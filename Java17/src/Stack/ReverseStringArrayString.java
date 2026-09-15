package Stack;

import java.util.Stack;

public class ReverseStringArrayString {
	public static void main(String[] args) {
		String[] arr = { "apple", "banana", "cherry", "date" };
		Stack<String> stack = new Stack<>();

		for (String str : arr) {
			stack.push(str);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = stack.pop();
		}
		for (String str : arr) {
			System.out.println(str);
		}
	}
}
