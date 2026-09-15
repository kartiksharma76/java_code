package javapractice2026;

public class BinaryTreeTest {
	 public static void main(String[] args) {

	        BinaryTree bst = new BinaryTree();

	        // Insert elements
	        bst.insert(50);
	        bst.insert(30);
	        bst.insert(70);
	        bst.insert(20);
	        bst.insert(40);
	        bst.insert(60);
	        bst.insert(80);

	        // Traversals
	        System.out.print("Inorder Traversal  : ");
	        bst.inorder();          // Sorted output

	        System.out.print("Preorder Traversal : ");
	        bst.preorder();

	        System.out.print("Postorder Traversal: ");
	        bst.postorder();

	        // Search operation
	        int key = 40;
	        if (bst.search(key)) {
	            System.out.println(key + " found in BST");
	        } else {
	            System.out.println(key + " not found in BST");
	        }
	    }
}
