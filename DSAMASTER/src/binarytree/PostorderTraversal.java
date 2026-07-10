package binarytree;

import java.util.*;

public class PostorderTraversal {

    // Recursive: Left -> Right -> Root
    public static void postorderRecursive(TreeNode root, List<Integer> result) {
        if (root == null) return;
        postorderRecursive(root.left, result);
        postorderRecursive(root.right, result);
        result.add(root.val);
    }

    public static List<Integer> postorderRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderRecursive(root, result);
        return result;
    }

    // Iterative using two stacks (easiest to reason about)
    public static List<Integer> postorderIterativeTwoStacks(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.addFirst(node.val); // reverse of Root -> Right -> Left
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return result;
    }

    // Iterative using a single stack
    public static List<Integer> postorderIterativeOneStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;
        TreeNode lastVisited = null;
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode peek = stack.peek();
                if (peek.right != null && lastVisited != peek.right) {
                    curr = peek.right;
                } else {
                    result.add(peek.val);
                    lastVisited = stack.pop();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Recursive", postorderRecursive(root));
        TreeUtil.print("Iterative (2 stacks)", postorderIterativeTwoStacks(root));
        TreeUtil.print("Iterative (1 stack)", postorderIterativeOneStack(root));
    }
}
