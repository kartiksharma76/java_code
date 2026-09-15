package tree;

public class StringBstTreeTest {
	public static void main(String[] args) {
		StringBstTree tree = new StringBstTree();
		tree.insert("k");
		tree.insert("a");
		tree.insert("d");
		tree.insert("c");
		tree.insert("f");
		tree.insert("e");
		tree.insert("g");
		tree.insert("l");
		tree.insert("q");
		tree.insert("s");
		tree.insert("t");
		System.out.print("inorder:" + " ");
		tree.inorder();
		System.out.println();
		System.out.print("preorder:" + " ");
		tree.traversepreorder();
		System.out.println();
		System.out.print("postorder:" + " ");
		tree.traversepostorder();
		System.out.println();

	}
}
