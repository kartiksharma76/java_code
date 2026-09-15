package binarytree;

import java.util.*;

public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.buildSampleTree();
        TreeUtil.print("Before Invert (preorder)", PreorderTraversal.preorderRecursive(root));
        invertTree(root);
        TreeUtil.print("After Invert (preorder)", PreorderTraversal.preorderRecursive(root));
    }
}
