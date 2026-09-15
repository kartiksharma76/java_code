package tree;

public class BinarySearchTreeTest2 {
	public static void main(String[] args) {
		BinarySearchTree2 tree = new BinarySearchTree2();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(55);
		tree.insert(54);
		tree.insert(80);
		tree.inOrder();
		System.out.println();
		tree.delete(50);
		tree.inOrder();
		System.out.println();
		System.out.println("preorder");
		tree.traversepreorder();
		System.out.println("postorder");
		tree.traversepostorder();

	}
}
