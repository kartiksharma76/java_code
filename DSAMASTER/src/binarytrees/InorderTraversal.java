package binarytrees;

import java.util.*;

// Inorder Traversal (Recursive & Iterative): Left -> Root -> Right
public class InorderTraversal {
    public List<Integer> recursive(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rec(root, res);
        return res;
    }
    private void rec(TreeNode node, List<Integer> res) {
        if (node == null) return;
        rec(node.left, res);
        res.add(node.val);
        rec(node.right, res);
    }

    public List<Integer> iterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
