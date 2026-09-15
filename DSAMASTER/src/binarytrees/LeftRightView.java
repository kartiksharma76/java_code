package binarytrees;

import java.util.*;

// Left / Right View of Binary Tree
public class LeftRightView {
    public List<Integer> rightView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightRec(root, 0, res);
        return res;
    }
    private void rightRec(TreeNode node, int level, List<Integer> res) {
        if (node == null) return;
        if (level == res.size()) res.add(node.val);
        rightRec(node.right, level + 1, res);
        rightRec(node.left, level + 1, res);
    }

    public List<Integer> leftView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        leftRec(root, 0, res);
        return res;
    }
    private void leftRec(TreeNode node, int level, List<Integer> res) {
        if (node == null) return;
        if (level == res.size()) res.add(node.val);
        leftRec(node.left, level + 1, res);
        leftRec(node.right, level + 1, res);
    }
}
