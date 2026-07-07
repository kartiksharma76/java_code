package companywisequestion;

//Question:
//Text editor me Undo Redo implement karna hai.

import java.util.Stack;

public class UndoRedo {

	public static void main(String[] args) {

		Stack<String> undo = new Stack<>();

		Stack<String> redo = new Stack<>();

		undo.push("A");
		undo.push("AB");
		undo.push("ABC");

		String state = undo.pop();

		redo.push(state);

		System.out.println("Undo -> " + undo.peek());

		String restore = redo.pop();

		undo.push(restore);

		System.out.println("Redo -> " + undo.peek());
	}
}