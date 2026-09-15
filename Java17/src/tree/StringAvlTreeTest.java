package tree;

public class StringAvlTreeTest {

	public static void main(String[] args) {
		StringAvlTree tree = new StringAvlTree();
		tree.insert("K");
		tree.insert("A");
		tree.insert("R");
		tree.insert("T");
		tree.insert("I");
		tree.insert("K");
		tree.insert("E");
		tree.insert("Y");
		tree.insert("S");
		tree.insert("H");
		tree.insert("A");
		tree.insert("R");
		tree.insert("M");
		tree.insert("A");
		tree.inOrder();
	}
}
