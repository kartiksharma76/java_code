package binarytree;

import java.util.*;

public class ConstructFromPreorderInorder {

    private static int preorderIndex;
    private static Map<Integer, Integer> inorderIndexMap;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    private static TreeNode build(int[] preorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) return null;
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);
        int mid = inorderIndexMap.get(rootVal);
        root.left = build(preorder, inorderStart, mid - 1);
        root.right = build(preorder, mid + 1, inorderEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 7, 5, 3, 6, 8};
        int[] inorder = {7, 4, 2, 5, 1, 3, 6, 8};
        TreeNode root = buildTree(preorder, inorder);
        TreeUtil.print("Rebuilt tree - level order", LevelOrderTraversal.levelOrder(root));
    }
}
