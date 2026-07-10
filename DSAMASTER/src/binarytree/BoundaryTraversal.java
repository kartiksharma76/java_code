package binarytree;

import java.util.*;

public class BoundaryTraversal {

    private static boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private static void addLeftBoundary(TreeNode root, List<Integer> result) {
        TreeNode curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) result.add(curr.val);
            curr = (curr.left != null) ? curr.left : curr.right;
        }
    }

    private static void addLeaves(TreeNode root, List<Integer> result) {
        if (root == null) return;
        if (isLeaf(root)) {
            result.add(root.val);
            return;
        }
        addLeaves(root.left, result);
        addLeaves(root.right, result);
    }

    private static void addRightBoundary(TreeNode root, List<Integer> result) {
        TreeNode curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (!isLeaf(curr)) temp.add(curr.val);
            curr = (curr.right != null) ? curr.right : curr.left;
        }
        Collections.reverse(temp);
        result.addAll(temp);
    }

    public static List<Integer> boundaryTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        if (!isLeaf(root)) result.add(root.val);
        addLeftBoundary(root, result);
        addLeaves(root, result);
        addRightBoundary(root, result);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Boundary Traversal", boundaryTraversal(root));
    }
}
