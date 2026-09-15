package binarytrees;

import java.util.*;

// Preorder Traversal (Recursive & Iterative): Root -> Left -> Right
public class PreorderTraversal {
    public List<Integer> recursive(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rec(root, res);
        return res;
    }
    private void rec(TreeNode node, List<Integer> res) {
        if (node == null) return;
        res.add(node.val);
        rec(node.left, res);
        rec(node.right, res);
    }

    public List<Integer> iterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;
    }
}
