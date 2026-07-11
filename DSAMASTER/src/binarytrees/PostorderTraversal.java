package binarytrees;

import java.util.*;

// Postorder Traversal (Recursive & Iterative): Left -> Right -> Root
public class PostorderTraversal {
    public List<Integer> recursive(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rec(root, res);
        return res;
    }
    private void rec(TreeNode node, List<Integer> res) {
        if (node == null) return;
        rec(node.left, res);
        rec(node.right, res);
        res.add(node.val);
    }

    public List<Integer> iterative(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.addFirst(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return res;
    }
}
