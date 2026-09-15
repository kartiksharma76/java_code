package HackerRank;

public class BinaryTreeTest {
public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();
	 // Insert values
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(20);
    tree.insert(40);
    tree.insert(60);
    tree.insert(80);
    
    
    // Search test
    System.out.println("Search 40: " + tree.search(40)); // true
    System.out.println("Search 90: " + tree.search(90)); // false
    
 // Traversals
    System.out.println("\nInorder Traversal:");
    tree.inorder();

    System.out.println("\nPreorder Traversal:");
    tree.preorder();

    System.out.println("\nPostorder Traversal:");
    tree.postorder();
}
}
