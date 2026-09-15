package binarytree;

public class FlattenBinaryTreeToLinkedList {

    // O(1) space, Morris-traversal style: for each node with a left child,
    // find the rightmost node of the left subtree and attach the current
    // right subtree there, then move left subtree to the right.
    public static void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode rightmost = curr.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                rightmost.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        flatten(root);
        StringBuilder sb = new StringBuilder();
        TreeNode curr = root;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.right != null) sb.append(" -> ");
            curr = curr.right;
        }
        TreeUtil.print("Flattened (right-chain) order", sb.toString());
    }
}
