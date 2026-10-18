package tree;

public class BinarySearchTree {

    private Node root;

    // Main method
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder: ");
        bst.inorder();

        System.out.print("Preorder: ");
        bst.traversePreorder();

        System.out.print("Postorder: ");
        bst.traversePostorder();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));
    }

    // Insert a node
    public void insert(int key) {
        root = insertHelper(root, key);
    }

    private Node insertHelper(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insertHelper(root.left, key);
        } else if (key > root.key) {
            root.right = insertHelper(root.right, key);
        }

        return root;
    }

    // Search a node
    public boolean search(int key) {
        return searchHelper(root, key) != null;
    }

    private Node searchHelper(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            return searchHelper(root.left, key);
        }

        return searchHelper(root.right, key);
    }

    // Inorder: Left, Root, Right
    public void inorder() {
        traverseInorder(root);
        System.out.println();
    }

    private void traverseInorder(Node root) {
        if (root == null) {
            return;
        }

        traverseInorder(root.left);
        System.out.print(root.key + " ");
        traverseInorder(root.right);
    }

    // Preorder: Root, Left, Right
    public void traversePreorder() {
        traversePreorderHelper(root);
        System.out.println();
    }

    private void traversePreorderHelper(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        traversePreorderHelper(root.left);
        traversePreorderHelper(root.right);
    }

    // Postorder: Left, Right, Root
    public void traversePostorder() {
        traversePostorderHelper(root);
        System.out.println();
    }

    private void traversePostorderHelper(Node root) {
        if (root == null) {
            return;
        }

        traversePostorderHelper(root.left);
        traversePostorderHelper(root.right);
        System.out.print(root.key + " ");
    }

    // Node class
    private static class Node {
        private int key;
        private Node left;
        private Node right;

        public Node(int key) {
            this.key = key;
        }
    }
}
