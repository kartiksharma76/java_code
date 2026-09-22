package DsaQuestions.Flipkart;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

    public static List<Integer> boundary(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // Root
        if (!isLeaf(root)) {
            result.add(root.val);
        }

        // Left boundary
        addLeftBoundary(root.left, result);

        // Leaf nodes
        addLeaves(root, result);

        // Right boundary
        addRightBoundary(root.right, result);

        return result;
    }

    private static boolean isLeaf(TreeNode node) {

        return node != null
                && node.left == null
                && node.right == null;
    }

    private static void addLeftBoundary(
            TreeNode node,
            List<Integer> result) {

        while (node != null) {

            if (!isLeaf(node)) {
                result.add(node.val);
            }

            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    private static void addLeaves(
            TreeNode node,
            List<Integer> result) {

        if (node == null) {
            return;
        }

        if (isLeaf(node)) {
            result.add(node.val);
            return;
        }

        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }

    private static void addRightBoundary(
            TreeNode node,
            List<Integer> result) {

        List<Integer> temp = new ArrayList<>();

        while (node != null) {

            if (!isLeaf(node)) {
                temp.add(node.val);
            }

            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }

        // Reverse right boundary
        for (int i = temp.size() - 1; i >= 0; i--) {
            result.add(temp.get(i));
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        List<Integer> result = boundary(root);

        System.out.println(
                "Boundary Traversal: " + result
        );
    }

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}