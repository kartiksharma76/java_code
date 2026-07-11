package binarytrees;

// Children Sum Property in a Binary Tree - adjust node values so parent = sum of children
public class ChildrenSumProperty {
    public void changeTree(TreeNode root) {
        if (root == null) return;
        int childSum = 0;
        if (root.left != null) childSum += root.left.val;
        if (root.right != null) childSum += root.right.val;
        if (childSum >= root.val) root.val = childSum;
        else {
            if (root.left != null) root.left.val = root.val;
            else if (root.right != null) root.right.val = root.val;
        }
        changeTree(root.left);
        changeTree(root.right);
        int total = 0;
        if (root.left != null) total += root.left.val;
        if (root.right != null) total += root.right.val;
        if (root.left != null || root.right != null) root.val = total;
    }
}
