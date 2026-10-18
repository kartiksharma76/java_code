package tree;

public class AvlTree {

    private Node root;

    // Main method
    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        tree.insert(30);
        tree.insert(20);
        tree.insert(10);

        System.out.println("Inorder:");
        tree.inorder();

        System.out.println("Preorder:");
        tree.traversePreorder();

        System.out.println("Postorder:");
        tree.traversePostorder();

        System.out.println("Height: " + tree.getHeight());
        System.out.println("Balance Factor: " + tree.getBalanceFactor());
    }

    // Get height
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node node) {
        return node == null ? 0 : node.height;
    }

    // Get balance factor
    public int getBalanceFactor() {
        return getBalanceFactor(root);
    }

    private int getBalanceFactor(Node node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    // Left Rotation
    private Node doLeftRotation(Node y) {
        Node x = y.right;
        Node t = x.left;

        x.left = y;
        y.right = t;

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;

        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    // Right Rotation
    private Node doRightRotation(Node x) {
        Node y = x.left;
        Node t = y.right;

        y.right = x;
        x.left = t;

        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;

        return y;
    }

    // Insert
    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        } else {
            return root; // No duplicates
        }

        // Update height
        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;

        // Balance factor
        int bf = getBalanceFactor(root);

        // LL Case
        if (bf > 1 && key < root.left.key) {
            System.out.println("LL Rotation");
            return doRightRotation(root);
        }

        // RR Case
        if (bf < -1 && key > root.right.key) {
            System.out.println("RR Rotation");
            return doLeftRotation(root);
        }

        // LR Case
        if (bf > 1 && key > root.left.key) {
            System.out.println("LR Rotation");
            root.left = doLeftRotation(root.left);
            return doRightRotation(root);
        }

        // RL Case
        if (bf < -1 && key < root.right.key) {
            System.out.println("RL Rotation");
            root.right = doRightRotation(root.right);
            return doLeftRotation(root);
        }

        return root;
    }

    // Inorder: Left, Root, Right
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    // Preorder: Root, Left, Right
    public void traversePreorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left, Right, Root
    public void traversePostorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");
    }
}

// Node class
class Node {
    int key;
    int height;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.height = 1;
    }
}
