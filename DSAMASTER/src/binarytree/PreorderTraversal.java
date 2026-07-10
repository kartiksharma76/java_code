package binarytree;

import java.util.*;

public class PreorderTraversal {

    // Recursive: Root -> Left -> Right
    public static void preorderRecursive(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderRecursive(root.left, result);
        preorderRecursive(root.right, result);
    }

    public static List<Integer> preorderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderRecursive(root, result);
        return result;
    }

    // Iterative using a single stack
    public static List<Integer> preorderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Recursive", preorderRecursive(root));
        TreeUtil.print("Iterative", preorderIterative(root));
    }
}
