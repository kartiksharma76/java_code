package javapractice2026;

public class BinaryTree {

    private Node root;

    /*
     * ALGORITHM: INSERT(key)
     * 1. If root is NULL
     *      Create new node and return it
     * 2. If key < root.key
     *      Insert key in left subtree
     * 3. Else if key > root.key
     *      Insert key in right subtree
     * 4. Return root
     */
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

    /*
     * ALGORITHM: SEARCH(key)
     */
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

    /*
     * ALGORITHM: INORDER TRAVERSAL
     */
    public void inorder() {
        inorderHelper(root);
        System.out.println();
    }

    private void inorderHelper(Node root) {
        if (root == null) return;
        inorderHelper(root.left);
        System.out.print(root.key + " ");
        inorderHelper(root.right);
    }

    /*
     * ALGORITHM: PREORDER TRAVERSAL
     */
    public void preorder() {
        preorderHelper(root);
        System.out.println();
    }

    private void preorderHelper(Node root) {
        if (root == null) return;
        System.out.print(root.key + " ");
        preorderHelper(root.left);
        preorderHelper(root.right);
    }

    /*
     * ALGORITHM: POSTORDER TRAVERSAL
     */
    public void postorder() {
        postorderHelper(root);
        System.out.println();
    }

    private void postorderHelper(Node root) {
        if (root == null) return;
        postorderHelper(root.left);
        postorderHelper(root.right);
        System.out.print(root.key + " ");
    }
}

// Node class
class Node {
    int key;
    Node left, right;

    Node(int key) {
        this.key = key;
    }
}
