package tree;

public class BinarySearchTreeInPostOrderTreeTest {
	public static void main(String[] args) {
		BinarySearchTreeInPostOrderTree Tree = new BinarySearchTreeInPostOrderTree();
		Tree.inseart(50);
		Tree.inseart(30);
		Tree.inseart(70);
		Tree.inseart(20);
		Tree.inseart(40);
		Tree.inseart(60);
		Tree.inseart(80);
		Tree.postOrder();
		System.out.println();
		System.out.println(Tree.Search(90));
	}
}