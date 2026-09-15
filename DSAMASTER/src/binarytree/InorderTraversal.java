package binarytree;

import java.util.*;

public class InorderTraversal {

    // Recursive: Left -> Root -> Right
    public static void inorderRecursive(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inorderRecursive(root.left, result);
        result.add(root.val);
        inorderRecursive(root.right, result);
    }

    public static List<Integer> inorderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    // Iterative using a single stack
    public static List<Integer> inorderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Recursive", inorderRecursive(root));
        TreeUtil.print("Iterative", inorderIterative(root));
    }
}
