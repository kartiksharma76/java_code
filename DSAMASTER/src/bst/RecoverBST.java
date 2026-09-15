package bst;

// Recover Binary Search Tree - two nodes are swapped by mistake; fix in-place
public class RecoverBST {
    private TreeNode first, second, prev;

    public void recoverTree(TreeNode root) {
        first = second = prev = null;
        inorder(root);
        if (first != null && second != null) {
            int tmp = first.val;
            first.val = second.val;
            second.val = tmp;
        }
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null && prev.val > node.val) {
            if (first == null) first = prev;
            second = node;
        }
        prev = node;
        inorder(node.right);
    }
}
