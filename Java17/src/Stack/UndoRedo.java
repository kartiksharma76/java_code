package Stack;

import java.util.Stack;

public class UndoRedo {
Stack<String>mainStack;
private Stack <String>redoStack;

public UndoRedo() {
	mainStack=new Stack<>();
	redoStack=new Stack<>();
	
}
public void typeword(String word) {
	mainStack.push(word);
	redoStack.clear();
	

}
public void Undo() {
	if (!mainStack.isEmpty()) {
	redoStack.push(mainStack.pop());
	
}
}
public void redo() {
	if (!redoStack.isEmpty()) {
		mainStack.push(redoStack.pop());
		
	}
}
}