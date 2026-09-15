package binarytree;

import java.util.*;

public class ConstructFromInorderPostorder {

    private static int postorderIndex;
    private static Map<Integer, Integer> inorderIndexMap;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex = postorder.length - 1;
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return build(postorder, 0, inorder.length - 1);
    }

    // Build root -> right -> left (reverse of postorder scan direction)
    private static TreeNode build(int[] postorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) return null;
        int rootVal = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootVal);
        int mid = inorderIndexMap.get(rootVal);
        root.right = build(postorder, mid + 1, inorderEnd);
        root.left = build(postorder, inorderStart, mid - 1);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {7, 4, 2, 5, 1, 3, 6, 8};
        int[] postorder = {7, 4, 5, 2, 8, 6, 3, 1};
        TreeNode root = buildTree(inorder, postorder);
        TreeUtil.print("Rebuilt tree - level order", LevelOrderTraversal.levelOrder(root));
    }
}
