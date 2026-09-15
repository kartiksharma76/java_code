package TREESBINARYSEARCHTREES;

import java.util.HashMap;

public class BuildTreeFromTraversals {
	static class TreeNode {
		int val;
		TreeNode left, right;

		TreeNode(int v) {
			val = v;
		}
	}

	HashMap<Integer, Integer> inorderMap = new HashMap<>();

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		for (int i = 0; i < inorder.length; i++)
			inorderMap.put(inorder[i], i);
		return build(preorder, 0, preorder.length - 1, 0, inorder.length - 1);
	}

	private TreeNode build(int[] pre, int preL, int preR, int inL, int inR) {
		if (preL > preR)
			return null;
		int rootVal = pre[preL];
		TreeNode root = new TreeNode(rootVal);
		int inIdx = inorderMap.get(rootVal);
		int leftSize = inIdx - inL;
		root.left = build(pre, preL + 1, preL + leftSize, inL, inIdx - 1);
		root.right = build(pre, preL + leftSize + 1, preR, inIdx + 1, inR);
		return root;
	}

	public static void main(String[] args) {
		BuildTreeFromTraversals sol = new BuildTreeFromTraversals();
		sol.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
		System.out.println("Tree built successfully.");
	}
}
