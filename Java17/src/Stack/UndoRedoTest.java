package Stack;

public class UndoRedoTest {
public static void main(String[] args) {
	UndoRedo editer=new UndoRedo();
	editer.typeword("hello");
	editer.typeword("world");
	editer.Undo();
	editer.Undo();
	editer.redo();
	editer.typeword("open Ai");
	System.out.println(editer.mainStack);
}
}
