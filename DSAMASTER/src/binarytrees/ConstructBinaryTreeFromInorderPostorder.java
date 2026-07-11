package binarytrees;

import java.util.*;

// Construct Binary Tree from Inorder and Postorder Traversal
public class ConstructBinaryTreeFromInorderPostorder {
    private int postIdx;
    private Map<Integer, Integer> inorderIndex = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length - 1;
        inorderIndex.clear();
        for (int i = 0; i < inorder.length; i++) inorderIndex.put(inorder[i], i);
        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        int rootVal = postorder[postIdx--];
        TreeNode root = new TreeNode(rootVal);
        int mid = inorderIndex.get(rootVal);
        root.right = build(postorder, mid + 1, inEnd);
        root.left = build(postorder, inStart, mid - 1);
        return root;
    }
}
